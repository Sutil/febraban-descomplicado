package br.febraban.descomplicado;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RegistroTest {
	
	public Cabecalho cabecalho;
	
	@Before
	public void setUp(){
		cabecalho = Mockito.mock(Cabecalho.class);
		Date date = new GregorianCalendar(2016 + 1900, 0, 1).getTime();
		Mockito.when(cabecalho.getCodigoDoConvenio()).thenReturn("001");
		Mockito.when(cabecalho.getNomeDaEmpresa()).thenReturn("001");
		Mockito.when(cabecalho.getCodigoDoBanco()).thenReturn("001");
		Mockito.when(cabecalho.getNomeDoBanco()).thenReturn("001");
		Mockito.when(cabecalho.getDataDeGeracao()).thenReturn(date);
		Mockito.when(cabecalho.getNumeroSequencialDoarquivo()).thenReturn("001");
	}
	
	@Test
	public void registroA(){
		new RegistroCabecalhoRetorno(cabecalho);
	}
}
