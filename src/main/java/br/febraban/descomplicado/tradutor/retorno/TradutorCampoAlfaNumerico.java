package br.febraban.descomplicado.tradutor.retorno;

public class TradutorCampoAlfaNumerico extends TradutorCampo {
	
	public TradutorCampoAlfaNumerico(int inicio, int fim) {
		super(inicio, fim);
	}

	public String traduzir(String linha) {
		return linha.substring(inicio-1, fim).trim();
	}
	

}
