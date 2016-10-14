package br.febraban.descomplicado;

import java.text.SimpleDateFormat;

public class RegistroCabecalhoRetorno extends Registro{
	
	private Cabecalho cabecalho;
	
	public RegistroCabecalhoRetorno(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
		montaCampos();
	}
	
	@Override
	public String getLinhaArquivo() {
		StringBuilder builder = new StringBuilder();
		for (Campo campo : campos) 
			builder.append(campo.getConteudoFormatado());
		
		return builder.toString();
	}
	
	private void montaCampos() {
		montaCampoA1();
		montaCampoA2();
		montaCampoA3();
		montaCampoA4();
		montaCampoA5();
		montaCampoA6();
		montaCampoA7();
		montaCampoA8();
		montaCampoA9();
		montaCampoA10();
		montaCampoA11();
	}

	private void montaCampoA1() {
		CampoAlfaNumerico campo = new Campo.Builder()
			.comNome("A1")
			.comPosicaoInicial(1)
			.comPosicaoFinal(1)
			.comConteudo("A").buildCampoAlfaNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA2() {
		Campo campo = new Campo.Builder()
			.comNome("A2")
			.comPosicaoInicial(2)
			.comPosicaoFinal(2)
			.comConteudo("2").buildCampoNumerico();
		this.campos.add(campo);
	}
	private void montaCampoA3() {
		Campo campo = new Campo.Builder()
			.comNome("A3")
			.comPosicaoInicial(3)
			.comPosicaoFinal(22)
			.comConteudo(cabecalho.getCodigoDoConvenio()).buildCampoAlfaNumerico();
		this.campos.add(campo);
	}
	private void montaCampoA4() {
		Campo campo = new Campo.Builder()
			.comNome("A4")
			.comPosicaoInicial(23)
			.comPosicaoFinal(42)
			.comConteudo(cabecalho.getNomeDaEmpresa()).buildCampoAlfaNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA5() {
		Campo campo = new Campo.Builder()
			.comNome("A5")
			.comPosicaoInicial(43)
			.comPosicaoFinal(45)
			.comConteudo(cabecalho.getCodigoDoBanco()).buildCampoNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA6() {
		Campo campo = new Campo.Builder()
			.comNome("A6")
			.comPosicaoInicial(46)
			.comPosicaoFinal(65)
			.comConteudo(cabecalho.getNomeDoBanco()).buildCampoAlfaNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA7() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String conteudo = format.format(cabecalho.getDataDeGeracao());
		
		Campo campo = new Campo.Builder()
			.comNome("A7")
			.comPosicaoInicial(66)
			.comPosicaoFinal(73)
			.comConteudo(conteudo).buildCampoNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA8() {
		Campo campo = new Campo.Builder()
			.comNome("A8")
			.comPosicaoInicial(74)
			.comPosicaoFinal(79)
			.comConteudo(cabecalho.getNumeroSequencialDoarquivo()).buildCampoNumerico();
		
		this.campos.add(campo);
	}
	
	private void montaCampoA9() {
		Campo campo = new Campo.Builder()
			.comNome("A9")
			.comPosicaoInicial(80)
			.comPosicaoFinal(81)
			.comConteudo("04").buildCampoNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA10() {
		Campo campo = new Campo.Builder()
			.comNome("A10")
			.comPosicaoInicial(82)
			.comPosicaoFinal(98)
			.comConteudo("DÉBITO AUTOMÁTICO").buildCampoAlfaNumerico();
		this.campos.add(campo);
	}
	
	private void montaCampoA11() {
		Campo campo = new Campo.Builder()
			.comNome("A11")
			.comPosicaoInicial(99)
			.comPosicaoFinal(150)
			.comConteudo("").buildCampoAlfaNumerico();
		this.campos.add(campo);
	}

}
