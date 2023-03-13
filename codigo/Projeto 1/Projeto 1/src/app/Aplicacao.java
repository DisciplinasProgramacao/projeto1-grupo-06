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
	      System.out.println("6 - Sair");

	      int opcao = scanner.nextInt();
	      if (opcao == 1) {
            System.out.println("Digite o nome do produto a ser vendido:");
            String nome = scanner.next();
            System.out.println("Digite a quantidade a ser vendida:");
            int quantidade = scanner.nextInt();
            estoque.retirarDoEstoque(nome, quantidade);
            }
		    
		else if (opcao == 6) {
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
