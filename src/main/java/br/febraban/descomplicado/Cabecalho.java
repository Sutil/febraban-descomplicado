package br.febraban.descomplicado;

import java.util.Date;

public interface Cabecalho {
	/**
	 * @return Código atribuído pelo Banco, para seu controle interno
	 * Este código será informado à Empresa, pelo Banco, antes
	da implantação do serviço de débito automático.
	 */
	String getCodigoDoConvenio();
	
	/**
	 * @return Nome da Empresa.
	 */
	String getNomeDaEmpresa();
	
	/**
	 * @return Código do Banco na Câmara de compensação.
	 * Ex: 001 - banco do brasil
	 *     341 - Itaú
	 */
	String getCodigoDoBanco(); 
	
	/**
	 * @return Nome do Banco.
	 */
	String getNomeDoBanco();
	
	/**
	 * 
	 * @return Data de geração do arquivo
	 */	
	Date getDataDeGeracao();
	
	/**
	 * @return Este número deverá evoluir de 1 em 1, para cada arquivo
	gerado, e terá uma seqüência para o Banco e outra para a
	Empresa.
	 */
	String getNumeroSequencialDoarquivo();
	
}
