/**
 * 
 */
package br.com.bonus.telefone.tipotelefone.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneBO;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 15:26:26
 * @version 1.0
 */
public final class TipoTelefoneService{

	private TipoTelefoneBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static TipoTelefoneService instance;

	private TipoTelefoneService(){
		bo = new TipoTelefoneBO();
	}

	public static TipoTelefoneService getInstance() {
		if ( instance == null ) {
			instance = new TipoTelefoneService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( TipoTelefoneVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( TipoTelefoneVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( TipoTelefoneVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< TipoTelefoneVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< TipoTelefoneVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do M�todo consultarPorDescricao

}
