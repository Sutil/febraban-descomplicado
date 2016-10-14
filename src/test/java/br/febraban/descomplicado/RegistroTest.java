package br.febraban.descomplicado;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RegistroTest {
	
	public Cabecalho cabecalho;
	
	@Before
	public void setUp(){
		cabecalho = Mockito.mock(Cabecalho.class);
		Date date = new GregorianCalendar(2016, 0, 1).getTime();
		Mockito.when(cabecalho.getCodigoDoConvenio()).thenReturn("9999999999");
		Mockito.when(cabecalho.getNomeDaEmpresa()).thenReturn("NOME EMPRESA");
		Mockito.when(cabecalho.getCodigoDoBanco()).thenReturn("001");
		Mockito.when(cabecalho.getNomeDoBanco()).thenReturn("NOME BANCO");
		Mockito.when(cabecalho.getDataDeGeracao()).thenReturn(date);
		Mockito.when(cabecalho.getNumeroSequencialDoarquivo()).thenReturn("1");
	}
	
	@Test
	public void registroA(){
		String linha = "A29999999999          NOME EMPRESA        001NOME BANCO          2016010100000104DÉBITO AUTOMÁTICO                                                    ";
		
		Assert.assertEquals(linha, new RegistroCabecalhoRetorno(cabecalho).getLinhaArquivo());
	}
}
