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
	
	@Test
	public void campoNumericoNulo(){
		CampoNumerico campo = new Campo.Builder()
		.comNome("A1")
		.comPosicaoInicial(1)
		.comPosicaoFinal(2)
		.comConteudo(null).buildCampoNumerico();
		
		assertEquals("00", campo.getConteudoFormatado());
	}
	
	@Test
	public void campoNumericoComTamanho17(){
		CampoNumerico campo = new Campo.Builder()
		.comNome("A1")
		.comPosicaoInicial(1)
		.comPosicaoFinal(17)
		.comConteudo("13245678901234567").buildCampoNumerico();
		
		assertEquals("13245678901234567", campo.getConteudoFormatado());
	}
	
	@Test
	public void campoNumericoComTamanhoCompletaZerosAEsquerda(){
		CampoNumerico campo = new Campo.Builder()
		.comNome("A1")
		.comPosicaoInicial(1)
		.comPosicaoFinal(17)
		.comConteudo("13245").buildCampoNumerico();
		
		assertEquals("00000000000013245", campo.getConteudoFormatado());
	}
	
	@Test
	public void campoNumericoConteudoInvalido(){
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("O campo A1 é do tipo númerico e não pode receber o conteúdo ABC.");
		
		new Campo.Builder()
		.comNome("A1")
		.comPosicaoInicial(1)
		.comPosicaoFinal(17)
		.comConteudo("ABC").buildCampoNumerico();
		
	}
	
	

}
