package br.febraban.descomplicado.tradutor.retorno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TradutorCampoAlfaNumericoTest {
	
	private static final String LINHA = "A29999999999          NOME EMPRESA        001NOME BANCO          2016010100000104DÉBITO AUTOMÁTICO                                                    ";
	
	@Test
	public void extracaoCodigoRegistro(){
		String codigoRegistro = new TradutorCampoAlfaNumerico(1, 1).traduzir(LINHA);
		assertEquals("A", codigoRegistro);
	}
	
	@Test
	public void extracaoCodigoConvernio(){
		String codigoRegistro = new TradutorCampoAlfaNumerico(3, 22).traduzir(LINHA);
		assertEquals("9999999999", codigoRegistro);
	}
	
	@Test
	public void extracaoNomeEmpresa(){
		String codigoRegistro = new TradutorCampoAlfaNumerico(23, 42).traduzir(LINHA);
		assertEquals("NOME EMPRESA", codigoRegistro);
	}
	
	@Test
	public void extracaoIdentificacaoServico(){
		String codigoRegistro = new TradutorCampoAlfaNumerico(82, 98).traduzir(LINHA);
		assertEquals("DÉBITO AUTOMÁTICO", codigoRegistro);
	}
	
	@Test
	public void extracaoBrancos(){
		String codigoRegistro = new TradutorCampoAlfaNumerico(99, 150).traduzir(LINHA);
		assertEquals("", codigoRegistro);
	}

}
