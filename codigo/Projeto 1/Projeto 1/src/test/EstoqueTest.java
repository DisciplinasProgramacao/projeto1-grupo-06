package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Estoque;

class EstoqueTest {

Estoque estoque;
	
	@BeforeEach
	void setUp() throws Exception {
		estoque = new Estoque();
	}

	@Test
	void testTotalEmEstoque() {
		
		assertEquals(0, estoque.totalEmEstoque(), "Testa se estoque começa vazio.");
		
		
	}
	
	@Test
	void testValorTotalEmEstoque() {
		assertEquals(0.0F, estoque.valorEmEstoque(), 0.001F, "Testa se valor em estoque começa zero.");
		
	

	}
	

	@Test
    	public void testProdutosComEstoqueBaixo() {
        Estoque estoque = new Estoque();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        estoque.reporEstoque(p1, 4);
        estoque.reporEstoque(p2, 9);
        estoque.produtosComEstoqueBaixo();
        p2.setQuantidadeAtual(8);
        estoque.produtosComEstoqueBaixo();
    	}
	
}
