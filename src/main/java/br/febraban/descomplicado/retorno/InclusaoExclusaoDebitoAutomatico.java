package br.febraban.descomplicado.retorno;

import java.util.Date;

abstract class InclusaoExclusaoDebitoAutomatico {
	public String codigoRegistro(){
		return "B";
	}
	public abstract String identificacaoDoClienteNaEmpresa();
	public abstract String agenciaParaDebito();
	public abstract String contaParaDebito();
	public abstract Date inclusao();
	public abstract String codigoMovimento();
}
