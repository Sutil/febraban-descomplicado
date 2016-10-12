package br.febraban.descomplicado;

class CampoAlfaNumerico extends Campo {

	CampoAlfaNumerico(Builder builder) {
		super(builder);
	}

	@Override
	public String getConteudoFormatado() {
		return String.format("%-"+getTamanho()+"s", conteudo);
	}
	
	

}
