/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.controller;

import java.util.ArrayList;

import br.com.bonus.contrato.tipocontrato.model.TipoContratoBO;
import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 23:02:23
 * @version 1.0
 */
public final class TipoContratoService{

	private TipoContratoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static TipoContratoService instance;

	private TipoContratoService(){
		bo = new TipoContratoBO();
	}

	public static TipoContratoService getInstance() {
		if ( instance == null ) {
			instance = new TipoContratoService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( TipoContratoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( TipoContratoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( TipoContratoVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< TipoContratoVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< TipoContratoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do M�todo consultarPorDescricao

}
