package br.febraban.descomplicado;

import static com.google.common.base.Preconditions.checkArgument;

import java.text.MessageFormat;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;

abstract class Campo {
	
	protected String nome;
	protected int posicaoInicial;
	protected int posicaoFinal;
	protected String conteudo;
	
	protected Campo(Builder builder) {
		this.nome = builder.nome;
		this.posicaoInicial = builder.posicaoInicial;
		this.posicaoFinal = builder.posicaoFinal;
		this.conteudo = builder.conteudo;
	}
	
	protected int getTamanho(){
		return posicaoFinal - posicaoInicial + 1;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("Campo", nome)
			.add("posição inicial", posicaoInicial)
			.add("posição final", posicaoFinal)
			.add("conteúdo", conteudo).toString();
	}
	
	public abstract String getConteudoFormatado();
	
	static class Builder{
		private String nome; 
		private int posicaoInicial; 
		private int posicaoFinal; 
		private String conteudo;
		
		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}
		public Builder comPosicaoInicial(int posicaoInicial) {
			this.posicaoInicial = posicaoInicial;
			return this;
		}
		public Builder comPosicaoFinal(int posicaoFinal) {
			this.posicaoFinal = posicaoFinal;
			return this;
		}
		public Builder comConteudo(String conteudo) {
			this.conteudo = conteudo;
			return this;
		}
		
		CampoNumerico buildCampoNumerico(){
			validaDados();
			return new CampoNumerico(this);
		}
		
		CampoAlfaNumerico buildCampoAlfaNumerico(){
			validaDados();
			return new CampoAlfaNumerico(this);
		}
		
		private void validaDados() {
			checkArgument(!Strings.isNullOrEmpty(nome), "Nome do campo não foi informado");
			checkArgument(posicaoFinal >= posicaoInicial, "Posição Final deve ser maior ou igual a posição inicial.");
			conteudo = conteudo != null ? conteudo : "";
			checkArgument(conteudo.length() <= posicaoFinal - posicaoInicial + 1, mensagemErro());
		}
		
		private String mensagemErro(){
			return MessageFormat.format(
					"O campo {0} suporte apenas conteúdo de tamanho {1}. Conteúdo informado: {2}", 
					nome, 
					(posicaoFinal - posicaoInicial + 1), 
					conteudo);
		}
	}

}
