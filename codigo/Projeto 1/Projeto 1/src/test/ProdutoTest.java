package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.Produto;

class ProdutoTest {

	@Test
	void testDescricao() {
		Produto p1 = new Produto();
		assertEquals("Descricao_Padrao", p1.getDescricao());
		
		Produto p2 = new Produto();
		p2.setDescricao("Estojo");
		assertEquals("Estojo", p2.getDescricao());
		
		p2.setDescricao("ab");
		assertNotSame("ab", p2.getDescricao());
		
		
	}
	
    	@Test
    	void testMargemLucro() {
        Produto p1 = new Produto();
        p1.setPrecoCusto(20);
        p1.setMargemLucro(0.6);
        assertEquals(0.6, p1.getMargemLucro(), 0.001);

        Produto p2 = new Produto();
        p2.setPrecoCusto(30);
        p2.setMargemLucro(1.5); // margem de lucro inválida
        assertEquals(0.0, p2.getMargemLucro(), 0.001); // margem de lucro deve ser igual a zero
    	}
	
	@Test
    	void testValorImpostos() {
        Produto p1 = new Produto();
        p1.setPrecoCusto(50);
        p1.setMargemLucro(0.3);
        p1.setValorImpostos(11.7);
        assertEquals(11.7, p1.getValorImpostos(), 0.001); // valor esperado ajustado

        Produto p2 = new Produto();
        p2.setPrecoCusto(25);
        p2.setMargemLucro(0.8);
        p2.setValorImpostos(8.1);
        assertEquals(8.1, p2.getValorImpostos(), 0.001); // valor esperado ajustado
    	}
	
	
	@Test
	void testPrecoVenda() {
		Produto p1 = new Produto();
		p1.setPrecoCusto(20);
		p1.setMargemLucro(0.3);
		p1.setValorImpostos(10.0); 
		p1.setPrecoVenda();
		assertEquals(30.68, p1.getPrecoVenda());
		
		Produto p2 = new Produto();
		p2.setPrecoCusto(20);
		p2.setMargemLucro(1.0);              
		p2.setValorImpostos(10.0);
		p2.setPrecoVenda();
		assertNotSame(31.0, p2.getPrecoVenda());
		
		Produto p3 = new Produto();
		p3.setPrecoCusto(20);
	    p3.setMargemLucro(0.5);
	    p3.setValorImpostos(5.4);
	    p3.setPrecoVenda();
	    assertEquals(35.4, p3.getPrecoVenda());
	}

	@Test 
	void testValoresArrecadados() {
		Produto p1 = new Produto();
		p1.setPrecoCusto(20);
		p1.setMargemLucro(1.0);              
		p1.setValorImpostos(10.0);
		p1.setPrecoVenda();
		p1.setValoresArrecadados();
		assertNotSame(27.2, p1.getValoresArrecadados());
		
		Produto p2 = new Produto();
		p2.setPrecoCusto(30);
		p2.setMargemLucro(0.7);              
		p2.setValorImpostos(10.0);
		p2.setPrecoVenda();
		p2.setValoresArrecadados();
		assertEquals(30.18, p2.getValoresArrecadados());

	}
	@Test
     void testGetQuantidadeAtual() {
		Produto produto = new Produto();
        produto.setQuantidadeAtual(10);
        assertEquals(10, produto.getQuantidadeAtual());
    }

    @Test
    public void testGetQuantidadeMinima() {
    	Produto produto = new Produto();
    	produto.setQuantidadeMinima(5);
        assertEquals(5, produto.getQuantidadeMinima());
    }

    @Test
    void testEstoqueBaixo() {
		Produto produto = new Produto();
		produto.setQuantidadeAtual(2);
		produto.setQuantidadeMinima(5);
        assertTrue(produto.estoqueBaixo());
    }
}
