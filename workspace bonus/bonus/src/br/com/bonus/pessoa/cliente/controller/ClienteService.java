/**
 * 
 */
package br.com.bonus.pessoa.cliente.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.pessoa.cliente.model.ClienteBO;
import br.com.bonus.pessoa.cliente.model.ClienteVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 26/11/2013 08:56:26
 * @version 1.0
 */
public final class ClienteService{

	private ClienteBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static ClienteService instance;

	private ClienteService(){
		bo = new ClienteBO();
	}

	public static ClienteService getInstance() {
		if ( instance == null ) {
			instance = new ClienteService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo ClienteService

	/* T�RMINO DO SINGLETON */

	public void inserir( ClienteVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( ClienteVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( ClienteVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< ClienteVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< ClienteVO > consultarPorCpf( String cpf ) throws ConsultarException {
		return bo.consultarPorCpf( cpf );
	}//Fim do M�todo consultarPorCpf

}
