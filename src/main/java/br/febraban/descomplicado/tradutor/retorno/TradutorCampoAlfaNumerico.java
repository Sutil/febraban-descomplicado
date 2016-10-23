package br.febraban.descomplicado.tradutor.retorno;

public class TradutorCampoAlfaNumerico {
	
	private int inicio;
	private int fim;
	
	public TradutorCampoAlfaNumerico(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public String traduzir(String linha) {
		return linha.substring(inicio-1, fim).trim();
	}
	

}
