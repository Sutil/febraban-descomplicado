package br.febraban.descomplicado.retorno;

public abstract class ExclusaoDebitoAutomatico extends InclusaoExclusaoDebitoAutomatico{
	
	@Override
	public String codigoMovimento() {
		return "1";
	}

}
