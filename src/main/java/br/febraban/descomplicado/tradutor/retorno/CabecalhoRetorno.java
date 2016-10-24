package br.febraban.descomplicado.tradutor.retorno;

import static com.google.common.base.Preconditions.checkState;
import static com.google.common.base.Strings.isNullOrEmpty;

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
	private String reservadoParaFuturo;

	public CabecalhoRetorno(Builder builder) {
		this.codigoRegistro = builder.codigoRegistro;
		this.codigoRemessa = builder.codigoRemessa;
		this.codigoConvenio = builder.codigoConvenio;
		this.nomeDaEmpresa = builder.nomeDaEmpresa;
		this.codigoBanco = builder.codigoBanco;
		this.nomeBanco = builder.nomeBanco;
		this.dataGeracao = builder.dataGeracao;
		this.numeroSequencialArquivo = builder.numeroSequencialArquivo;
		this.versaoLayout = builder.versaoLayout;
		this.identificacaoServico = builder.identificacaoServico;
		this.reservadoParaFuturo = builder.reservadoParaFuturo;
	}

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
		return this.reservadoParaFuturo;
	}

	static class Builder {
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
		private String reservadoParaFuturo;

		public Builder withCodigoRegistro(String codigoRegistro) {
			this.codigoRegistro = codigoRegistro;
			return this;
		}

		public Builder withCodigoRemessa(String codigoRemessa) {
			this.codigoRemessa = codigoRemessa;
			return this;
		}

		public Builder withCodigoConvenio(String codigoConvenio) {
			this.codigoConvenio = codigoConvenio;
			return this;
		}

		public Builder withNomeDaEmpresa(String nomeDaEmpresa) {
			this.nomeDaEmpresa = nomeDaEmpresa;
			return this;
		}

		public Builder withCodigoBanco(String codigoBanco) {
			this.codigoBanco = codigoBanco;
			return this;
		}

		public Builder withNomeBanco(String nomeBanco) {
			this.nomeBanco = nomeBanco;
			return this;
		}

		public Builder withDataGeracao(String dataGeracao) {
			this.dataGeracao = dataGeracao;
			return this;
		}

		public Builder withNumeroSequencialArquivo(String numeroSequencialArquivo) {
			this.numeroSequencialArquivo = numeroSequencialArquivo;
			return this;
		}

		public Builder withVersaoLayout(String versaoLayout) {
			this.versaoLayout = versaoLayout;
			return this;
		}

		public Builder withIdentificacaoServico(String identificacaoServico) {
			this.identificacaoServico = identificacaoServico;
			return this;
		}

		public Builder withResevadoParaFuturo(String resevadoParaFuturo) {
			this.reservadoParaFuturo = resevadoParaFuturo;
			return this;
		}

		private void check() {
			checkState(!isNullOrEmpty(codigoRegistro));
			checkState(!isNullOrEmpty(codigoRemessa));
			checkState(!isNullOrEmpty(codigoConvenio));
			checkState(!isNullOrEmpty(nomeDaEmpresa));
			checkState(!isNullOrEmpty(codigoBanco));
			checkState(!isNullOrEmpty(nomeBanco));
			checkState(!isNullOrEmpty(dataGeracao));
			checkState(!isNullOrEmpty(numeroSequencialArquivo));
			checkState(!isNullOrEmpty(versaoLayout));
			checkState(!isNullOrEmpty(identificacaoServico));
			checkState(reservadoParaFuturo != null && reservadoParaFuturo.isEmpty());
		}

		public CabecalhoRetorno build() {
			check();
			return new CabecalhoRetorno(this);
		}

	}

}
