package br.febraban.descomplicado.tradutor.retorno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TradutorCabecalhoTest {
	private static final String LINHA = "A29999999999          NOME EMPRESA        001NOME BANCO          2016010100000104DÉBITO AUTOMÁTICO                                                    ";

	@Test
	public void extracaoLinha() {
		
		CabecalhoRetorno cabecalho = TradutorCabecalho.newInstance(LINHA).traduzir();
		assertEquals("A", cabecalho.getCodigoRegistro());
		assertEquals("2", cabecalho.getCodigoRemessa());
		assertEquals("9999999999", cabecalho.getCodigoConvenio());
		assertEquals("NOME EMPRESA", cabecalho.getNomeDaEmpresa());
		assertEquals("001", cabecalho.getCodigoBanco());
		assertEquals("NOME BANCO", cabecalho.getNomeBanco());
		assertEquals("20160101", cabecalho.getDataGeracao());
		assertEquals("1", cabecalho.getNumeroSequencialArquivo());
		assertEquals("4", cabecalho.getVersaoLayout());
		assertEquals("DÉBITO AUTOMÁTICO", cabecalho.getIdentificacaoServico());
		assertEquals("", cabecalho.getResevadoParaFuturo());

	}

}
