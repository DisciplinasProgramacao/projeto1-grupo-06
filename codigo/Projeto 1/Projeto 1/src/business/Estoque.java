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
	
	
	public Estoque() {
		produtos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
		
	}
}
