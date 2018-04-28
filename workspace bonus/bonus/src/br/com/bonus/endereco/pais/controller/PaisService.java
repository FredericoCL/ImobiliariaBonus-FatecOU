/**
 * 
 */
package br.com.bonus.endereco.pais.controller;

import java.util.ArrayList;

import br.com.bonus.endereco.pais.model.PaisBO;
import br.com.bonus.endereco.pais.model.PaisVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 08:38:46
 * @version 1.0
 */
public class PaisService{

	private PaisBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static PaisService instance;

	private PaisService(){
		bo = new PaisBO();
	}

	public static PaisService getInstance() {
		if ( instance == null ) {
			instance = new PaisService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( PaisVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( PaisVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( PaisVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< PaisVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< PaisVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do M�todo consultarPorDescricao

}
