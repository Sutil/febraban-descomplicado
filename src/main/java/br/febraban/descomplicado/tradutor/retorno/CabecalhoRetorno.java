package br.febraban.descomplicado.tradutor.retorno;

class CabecalhoRetorno {

	private String codigoRegistro;
	private String codigoRemessa;
	private String codigoConvenio;
	private String nomeDaEmpresa;
	private String codigoBanco;
	private String nomeBanco;
	private String dataGeracao;
	private String numeroSequencialArquivo;
	private String versaoLayout;
	private String identificacaoServico;
	private String resevadoParaFuturo;

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public String getCodigoRemessa() {
		return codigoRemessa;
	}

	public String getCodigoConvenio() {
		return codigoConvenio;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public String getDataGeracao() {
		return dataGeracao;
	}

	public String getNumeroSequencialArquivo() {
		return numeroSequencialArquivo;
	}

	public String getVersaoLayout() {
		return versaoLayout;
	}

	public String getIdentificacaoServico() {
		return identificacaoServico;
	}

	public String getResevadoParaFuturo() {
		return resevadoParaFuturo;
	}

}
