package br.febraban.descomplicado.tradutor.retorno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TradutorCampoNumericoTest {
	
	private static final String LINHA = "A29999999999          NOME EMPRESA        001NOME BANCO          2016010100000104DÉBITO AUTOMÁTICO                                                    ";
	
	@Test
	public void extracaoCodigoRemessa(){
		String campo = new TradutorCampoNumerico(2, 2).traduzir(LINHA);
		assertEquals("2", campo);
	}
	
	@Test
	public void extracaoCodigoBanco(){
		String campo = new TradutorCampoNumerico(43, 45).traduzir(LINHA);
		assertEquals("1", campo);
	}
	
	@Test
	public void extracaoDataGeracaoArquivo(){
		String campo = new TradutorCampoNumerico(66, 73).traduzir(LINHA);
		assertEquals("20160101", campo);
	}

	@Test
	public void extracaoSequencialArquivo(){
		String campo = new TradutorCampoNumerico(74, 79).traduzir(LINHA);
		assertEquals("1", campo);
	}
	
	@Test
	public void extracaoVersaoLayout(){
		String campo = new TradutorCampoNumerico(80, 81).traduzir(LINHA);
		assertEquals("4", campo);
	}
	
}
