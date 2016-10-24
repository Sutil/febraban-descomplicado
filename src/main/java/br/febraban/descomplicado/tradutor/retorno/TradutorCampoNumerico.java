package br.febraban.descomplicado.tradutor.retorno;

public class TradutorCampoNumerico extends TradutorCampo{
	
	public TradutorCampoNumerico(int inicio, int fim) {
		super(inicio, fim);
	}

	public String traduzir(String linha) {
		return linha.substring(inicio-1, fim).replaceFirst("^0+(?!$)", "");
	}

}
