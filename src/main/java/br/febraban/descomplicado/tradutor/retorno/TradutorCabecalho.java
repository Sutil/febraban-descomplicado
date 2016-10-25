package br.febraban.descomplicado.tradutor.retorno;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import br.febraban.descomplicado.tradutor.TradutorRegistro;
import br.febraban.descomplicado.tradutor.retorno.CabecalhoRetorno.Builder;

class TradutorCabecalho implements TradutorRegistro {

	private String registroCabecalho;

	private TradutorCampo codigoRegistro = new TradutorCampoAlfaNumerico(1, 1);
	private TradutorCampo codigoRemessa = new TradutorCampoNumerico(2, 2);
	private TradutorCampo codigoConvenio = new TradutorCampoAlfaNumerico(3, 22);
	private TradutorCampo nomeDaEmpresa = new TradutorCampoAlfaNumerico(23, 42);
	private TradutorCampo codigoBanco = new TradutorCampoAlfaNumerico(43, 45);
	private TradutorCampo nomeBanco = new TradutorCampoAlfaNumerico(46, 65);
	private TradutorCampo dataGeracao = new TradutorCampoAlfaNumerico(66, 73);
	private TradutorCampo numeroSequencialArquivo = new TradutorCampoNumerico(74, 79);
	private TradutorCampo versaoLayout = new TradutorCampoNumerico(80, 81);
	private TradutorCampo identificacaoServico = new TradutorCampoAlfaNumerico(82, 98);
	private TradutorCampo resevadoParaFuturo = new TradutorCampoAlfaNumerico(99, 150);

	private TradutorCabecalho(String cabecalho) {
		this.registroCabecalho = cabecalho;
	}

	static TradutorCabecalho newInstance(String cabecalho) {
		checkArgument(!isNullOrEmpty(cabecalho), "Registro de cabeçalho não informado. Impossível traduzir.");
		checkArgument(cabecalho.length() == 150, String
				.format("Cabeçalho possui %d posições. Deveria possuir 150. Impossível traduzir.", cabecalho.length()));
		checkArgument("A".equals(cabecalho.substring(0, 1)), "Não é um registro de cabeçalho.");
		return new TradutorCabecalho(cabecalho);
	}

	public CabecalhoRetorno traduzir() {
		Builder builder = new CabecalhoRetorno.Builder();
		builder.withCodigoRegistro(codigoRegistro.traduzir(registroCabecalho));
		builder.withCodigoRemessa(codigoRemessa.traduzir(registroCabecalho));
		builder.withCodigoConvenio(codigoConvenio.traduzir(registroCabecalho));
		builder.withNomeDaEmpresa(nomeDaEmpresa.traduzir(registroCabecalho));
		builder.withCodigoBanco(codigoBanco.traduzir(registroCabecalho));
		builder.withNomeBanco(nomeBanco.traduzir(registroCabecalho));
		builder.withDataGeracao(dataGeracao.traduzir(registroCabecalho));
		builder.withNumeroSequencialArquivo(numeroSequencialArquivo.traduzir(registroCabecalho));
		builder.withVersaoLayout(versaoLayout.traduzir(registroCabecalho));
		builder.withIdentificacaoServico(identificacaoServico.traduzir(registroCabecalho));
		builder.withResevadoParaFuturo(resevadoParaFuturo.traduzir(registroCabecalho));
		return builder.build();
	}

}
