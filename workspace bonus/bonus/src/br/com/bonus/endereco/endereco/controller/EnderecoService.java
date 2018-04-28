/**
 * 
 */
package br.com.bonus.endereco.endereco.controller;

import java.util.ArrayList;

import br.com.bonus.endereco.endereco.model.EnderecoBO;
import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 10:08:46
 * @version 1.0
 */
public class EnderecoService{
	
	private EnderecoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static EnderecoService instance;

	private EnderecoService(){
		bo = new EnderecoBO();
	}

	public static EnderecoService getInstance() {
		if ( instance == null ) {
			instance = new EnderecoService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( EnderecoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( EnderecoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar
	
	public void excluir(EnderecoVO vo) throws ExcluirException {
		bo.excluir( vo );
    }//Fim do M�todo excluir
	
	public ArrayList< EnderecoVO > consultarTodos() throws ConsultarException{
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos
	
	public ArrayList< EnderecoVO > consultarPorLogradouro( String logradouro ) throws ConsultarException{
		return bo.consultarPorLogradouro( logradouro );
	}//Fim do M�todo consultarPorLogradouro

}
