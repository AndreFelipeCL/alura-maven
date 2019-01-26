package br.com.andre.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	private static final String SET_NOME_BALA_JUQUINHA = "Bala Juquinha";
	private static final String NOME_JUQUINHA = "juquinha";

	@Test
	public void testVerificaPrecoPorImposto(){
		Produto bala = new Produto(NOME_JUQUINHA, 0.10);
		
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
	
	@Test
	public void testGetNome(){
		Produto bala = new Produto(NOME_JUQUINHA, 0.10);
		assertEquals(NOME_JUQUINHA, bala.getNome());
	}
	
	@Test
	public void testSetNome(){
		Produto bala = new Produto(NOME_JUQUINHA, 0.10);
		bala.setNome(SET_NOME_BALA_JUQUINHA);
		assertEquals(SET_NOME_BALA_JUQUINHA, bala.getNome());
	}
	
}
