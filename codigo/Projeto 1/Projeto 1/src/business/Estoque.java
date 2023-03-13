package business;

public class Estoque {

	private static final int MAX_PRODUTOS = 1000000;
	private Produto[] produtos;
	private int numProdutos;
	
	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numProdutos; i++)
			total += produtos[i].getQuantidadeAtual();
		return total;
	}
	
	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numProdutos; i++)
			valor += produtos[i].getQuantidadeAtual() * produtos[i].getPrecoCusto();
		return valor;
	}
	
	
	public Estoque() {
		produtos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
		
	}
	
		
	//método que verifica se o estoque atual dos produtos é maior que a quantidade mínima
	public void produtosComEstoqueBaixo() {
	    for (int i = 0; i < numProdutos; i++) {
	        Produto produto = produtos[i];
	        if (produto.getQuantidadeAtual() < produto.getQuantidadeMinima()) {
	            System.out.println("Produto com estoque abaixo do mínimo: " + produto.getDescricao());
	        }
	    }
	}

	//método para repor estoque, considerando limite mínimo e máximo e se o produto está cadastrado
	public void reporEstoque(Produto produto, double quantidade) {
	    //encontra a posição do produto no array
	    int posicao = -1;
	    for (int i = 0; i < numProdutos; i++) {
	        if (produtos[i] == produto) {
	            posicao = i;
	            break;
	        }
	    }

	    //verifica se o produto está cadastrado
	    if (posicao == -1) {
	        System.out.println("Produto não encontrado!");
	        return;
	    }

	    //atualiza a quantidade atual do produto
	    double quantidadeAtual = produto.getQuantidadeAtual();
	    quantidadeAtual += quantidade;
	    produto.setQuantidadeAtual(quantidadeAtual);


	    //verifica se o estoque está abaixo do mínimo
	    if (produto.isEstoqueBaixo()) {
	        System.out.println("O estoque está abaixo do mínimo!");
	        produto.setEstoqueBaixo(true);
	    }

	    System.out.println("O estoque foi atualizado com sucesso!");
	}

}
