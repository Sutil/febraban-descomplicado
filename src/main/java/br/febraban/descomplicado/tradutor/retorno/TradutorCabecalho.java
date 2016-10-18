package br.febraban.descomplicado.tradutor.retorno;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Strings.isNullOrEmpty;

import br.febraban.descomplicado.tradutor.TradutorRegistro;

class TradutorCabecalho implements TradutorRegistro{
	
	private String registroCabecalho;
	
	private TradutorCabecalho(String cabecalho){
		this.registroCabecalho = cabecalho;
	}
	
	static TradutorCabecalho newInstance(String cabecalho){
		checkArgument(!isNullOrEmpty(cabecalho), "Registro de cabeçalho não informado. Impossível traduzir.");
		checkArgument(cabecalho.length() == 150, String.format("Cabeçalho possui %d posições. Deveria possuir 150. Impossível traduzir.", cabecalho.length()));
		checkArgument("A".equals(cabecalho.substring(0, 1)), "Não é um registro de cabeçalho.");
		return new TradutorCabecalho(cabecalho);
	}
	
	public CabecalhoRetorno getCabebecalhoRetorno(){
		return null;
	}

}
