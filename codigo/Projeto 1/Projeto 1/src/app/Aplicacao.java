package app;
import java.util.Scanner;

import business.Estoque;
import business.Produto;

public class Aplicacao {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Estoque estoque = new Estoque();

	    while (true) {
	      System.out.println("Selecione uma opção:");
	      System.out.println("1 - Vender produto");
	      System.out.println("2 - Fazer pedido de reposição de produto");
	      System.out.println("3 - Consultar dados de um produto");
	      System.out.println("4 - Consultar dados do estoque");
	      System.out.println("5 - Calcular e exibir o balanço da empresa");
	      System.out.println("6 - Cadastrar produto");
	      System.out.println("7 - Sair");

	      int opcao = scanner.nextInt();

	      if (opcao == 1) {
	        System.out.println("Digite o nome do produto a ser vendido:");
	        String nome = scanner.next();
	        System.out.println("Digite a quantidade a ser vendida:");
	        int quantidade = scanner.nextInt();
	        estoque.retirarDoEstoque(nome, quantidade);
	        }	         
	      
	      else if (opcao == 2) {
	        System.out.println("Digite o nome do produto a ser reposto:");
	        String nome = scanner.next();
	        System.out.println("Digite a quantidade a ser pedida:");
	        int quantidade = scanner.nextInt();
	        estoque.reporEstoque(estoque.buscarProduto(nome), quantidade);
	        System.out.println("Pedido de reposição realizado com sucesso!");
	      } 
	      
	      else if (opcao == 3) {
	        System.out.println("Digite o nome do produto a ser consultado:");
	        String nome = scanner.next();
	        Produto produto = estoque.buscarProduto(nome);
	        if (produto != null) {
	          System.out.println("Produto Encontrado");
	          System.out.println("O nome do produto é: " + produto.getDescricao());
	          System.out.println("O preço de custo do produto é: " + produto.getPrecoCusto());
	          System.out.println("O valor dos impostos é: " + produto.getValorImpostos());
	          System.out.println("A margem de lucro é: " + produto.getMargemLucro());
	          
	        } else {
	          System.out.println("Produto não encontrado.");
	        }
	      } 
	      
	      else if (opcao == 4) {
	        System.out.println("A quantidade de produtos que constam no estoque é: " + estoque.totalEmEstoque());
	        System.out.println("O valor total do estoque atual é (preço de custo): "+estoque.valorEmEstoque()); 
	      } 
	      
	      else if (opcao == 5) {
	        double valorEstoque = estoque.valorEmEstoque();
	        double valorVendido = estoque.calcularValorVendido();
	        System.out.println("Valor do estoque atual: R$" + valorEstoque);
	        System.out.println("Valor vendido: R$" + valorVendido);
	        System.out.println("Valor gasto em pedidos de reposição: R$" + estoque.valorGastoReposicao);
	      } 
	      
	      else if (opcao == 6) {
	        estoque.add(new Produto("Leite", 10, 0.5, 0.6));
	        System.out.println("Produto Cadastrado");
	      } 
	      
	      else if (opcao == 7) {
		        break;
		  } 
	      else {
	        System.out.println("Opção inválida. Tente novamente.");
	      }

	      System.out.println();
	    }

	    scanner.close();
	  }

}
