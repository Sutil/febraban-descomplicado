package br.febraban.descomplicado.tradutor.retorno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TradutorCabecalhoTest {
	private static final String LINHA = "A29999999999          NOME EMPRESA        001NOME BANCO          2016010100000104DÉBITO AUTOMÁTICO                                                    ";

	@Test
	public void extracaoLinha() {
		
		CabecalhoRetorno cabecalho = TradutorCabecalho.newInstance(LINHA).traduzir();
		assertEquals("", cabecalho.getCodigoRegistro());
		assertEquals("", cabecalho.getCodigoRemessa());
		assertEquals("", cabecalho.getCodigoConvenio());
		assertEquals("", cabecalho.getNomeDaEmpresa());
		assertEquals("", cabecalho.getCodigoBanco());
		assertEquals("", cabecalho.getNomeBanco());
		assertEquals("", cabecalho.getDataGeracao());
		assertEquals("", cabecalho.getNumeroSequencialArquivo());
		assertEquals("", cabecalho.getVersaoLayout());
		assertEquals("", cabecalho.getIdentificacaoServico());
		assertEquals("", cabecalho.getResevadoParaFuturo());

	}

}
