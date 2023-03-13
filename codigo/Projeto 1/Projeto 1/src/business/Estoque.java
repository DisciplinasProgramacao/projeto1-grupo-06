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

	
}
