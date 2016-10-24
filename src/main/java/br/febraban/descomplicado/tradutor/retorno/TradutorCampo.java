package br.febraban.descomplicado.tradutor.retorno;

public abstract class TradutorCampo {

	protected int inicio;
	protected int fim;
	
	public TradutorCampo(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	abstract String traduzir(String linha);
	
}
