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
	

}
