/**
 * 
 */
package br.com.bonus.endereco.estado.controller;

import java.util.ArrayList;

import br.com.bonus.endereco.estado.model.EstadoBO;
import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 22:27:10
 * @version 1.0
 */
public final class EstadoService{
	
	private EstadoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static EstadoService instance;

	private EstadoService(){
		bo = new EstadoBO();
	}

	public static EstadoService getInstance() {
		if ( instance == null ) {
			instance = new EstadoService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( EstadoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( EstadoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( EstadoVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< EstadoVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< EstadoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do M�todo consultarPorDescricao

}
