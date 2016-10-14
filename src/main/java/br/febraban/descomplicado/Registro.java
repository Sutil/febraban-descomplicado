package br.febraban.descomplicado;

import java.util.ArrayList;

abstract class Registro {
	
	protected final ArrayList<Campo> campos = new ArrayList<Campo>();
	
	public abstract String getLinhaArquivo();
	
	

}
