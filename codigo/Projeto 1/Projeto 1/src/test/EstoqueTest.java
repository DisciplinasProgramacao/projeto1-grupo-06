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
	
	

    	@Test
    	public void testReporEstoque() {
        Produto p1 = new Produto();
        p1.setDescricao("Produto 1");
        p1.setQuantidadeAtual(5);
        p1.setQuantidadeMinima(10);
        assertEquals(5, p1.getQuantidadeAtual());

        estoque.reporEstoque(p1, 5);
        p1.setQuantidadeAtual(10);
        assertEquals(10, p1.getQuantidadeAtual());

        estoque.reporEstoque(p1, 1);
        p1.setQuantidadeAtual(11);
        assertEquals(11, p1.getQuantidadeAtual());

        estoque.reporEstoque(p1, 0);
        p1.setQuantidadeAtual(11);
        assertEquals(11, p1.getQuantidadeAtual());

        estoque.reporEstoque(p1, -1);
        p1.setQuantidadeAtual(11);
        assertEquals(11, p1.getQuantidadeAtual());
    	}

	@Test
    	public void testRetirarDoEstoque() {
        Estoque estoque = new Estoque();
        Produto p1 = new Produto();
        p1.setDescricao("Produto 1");
        p1.setQuantidadeAtual(5);
        estoque.reporEstoque(p1, 5);

        estoque.retirarDoEstoque("Produto 2", 5);
        assertEquals(5, p1.getQuantidadeAtual());

        estoque.retirarDoEstoque("Produto 1", 0);
        assertEquals(5, p1.getQuantidadeAtual());

        estoque.retirarDoEstoque("Produto 1", -1);
        assertEquals(5, p1.getQuantidadeAtual());

        estoque.retirarDoEstoque("Produto 1", 6);
        assertEquals(5, p1.getQuantidadeAtual());

        estoque.retirarDoEstoque(null, 0);
	}
	
}
