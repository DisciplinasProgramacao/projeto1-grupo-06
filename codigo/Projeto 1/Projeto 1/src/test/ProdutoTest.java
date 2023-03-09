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
	void testPrecoVenda() {
		//Ainda nao implementei o teste porque tenho que esperar outro integrante implementar margem de lucro e valor dos impostos
	}

}
