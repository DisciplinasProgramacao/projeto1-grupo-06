package business;

public class Estoque {

	private static final int MAX_PRODUTOS = 1000000;
	private Produto[] produtos;
	private int numProdutos;
	
	public Estoque() {
		produtos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
		
	}
}
