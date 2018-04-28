/**
 * 
 */
package br.com.bonus.telefone.telefone.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.telefone.model.TelefoneBO;
import br.com.bonus.telefone.telefone.model.TelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 19:20:56
 * @version 1.0
 */
public final class TelefoneService{
	
	private TelefoneBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static TelefoneService instance;

	private TelefoneService(){
		bo = new TelefoneBO();
	}

	public static TelefoneService getInstance() {
		if ( instance == null ) {
			instance = new TelefoneService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( TelefoneVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( TelefoneVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar
	
	public void excluir(TelefoneVO vo) throws ExcluirException {
		bo.excluir( vo );
    }//Fim do M�todo excluir
	
	public ArrayList< TelefoneVO > consultarTodos() throws ConsultarException{
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos
	
	public ArrayList< TelefoneVO > consultarPorDescricao( String numero ) throws ConsultarException{
		return bo.consultarPorNumero( numero );
	}//Fim do M�todo consultarPorDescricao

}
