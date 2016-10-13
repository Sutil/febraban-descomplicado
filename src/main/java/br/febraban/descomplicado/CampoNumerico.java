package br.febraban.descomplicado;

class CampoNumerico extends Campo{
	
	CampoNumerico(Builder builder) {
		super(builder);
	}

	@Override
	public String getConteudoFormatado() {
		return String.format("%s%s", getZeros(), conteudo);
	}

	private String getZeros() {
		int quantidadeZeros = getTamanho() - conteudo.length();
		if(quantidadeZeros > 0)
			return String.format("%0"+quantidadeZeros+"d", 0);
		
		return "";
	}
	
	

}
