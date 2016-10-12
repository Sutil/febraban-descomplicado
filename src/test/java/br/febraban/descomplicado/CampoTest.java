package br.febraban.descomplicado;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CampoTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void campoAlfaNumericoNuloImprimeBrancos(){
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(1)
			.comConteudo(null).buildCampoAlfaNumerico();
		
		assertEquals(" ", campo.getConteudoFormatado());		
	}
	
	@Test
	public void campoAlfaNumericoNuloImprimeBrancos_3posicoes(){
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(3)
			.comConteudo(null).buildCampoAlfaNumerico();
		
		assertEquals("   ", campo.getConteudoFormatado());		
	}
	
	@Test
	public void campoAlfaNumericoVazioImprimeBrancos_3posicoes(){
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(3)
			.comConteudo("").buildCampoAlfaNumerico();
		
		assertEquals("   ", campo.getConteudoFormatado());		
	}
	
	@Test
	public void campoAlfaNumericoPreenchido_1posicao(){
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(1)
			.comConteudo("A").buildCampoAlfaNumerico();
		
		assertEquals("A", campo.getConteudoFormatado());		
	}
	
	@Test
	public void campoAlfaNumericoPreenchidoComPosicoesAMenos(){
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(3)
			.comPosicaoFinal(5)
			.comConteudo("AB").buildCampoAlfaNumerico();
		
		assertEquals("AB ", campo.getConteudoFormatado());		
	}
	
	@Test
	public void campoAlfaNumericoComCamposAMais_erro(){
		
		exception.expect(RuntimeException.class);
		exception.expectMessage("O campo A1 suporte apenas conteúdo de tamanho 1. Conteúdo informado: AB");
		
		new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(1)
			.comConteudo("AB").buildCampoAlfaNumerico();
	}
	
	

}
