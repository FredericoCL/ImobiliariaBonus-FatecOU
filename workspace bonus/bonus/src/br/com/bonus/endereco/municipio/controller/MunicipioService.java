/**
 * 
 */
package br.com.bonus.endereco.municipio.controller;

import java.util.ArrayList;

import br.com.bonus.endereco.municipio.model.MunicipioBO;
import br.com.bonus.endereco.municipio.model.MunicipioVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 22:46:25
 * @version 1.0
 */
public final class MunicipioService{
	
	private MunicipioBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static MunicipioService instance;

	private MunicipioService(){
		bo = new MunicipioBO();
	}

	public static MunicipioService getInstance() {
		if ( instance == null ) {
			instance = new MunicipioService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoContratoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( MunicipioVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( MunicipioVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar

	public void excluir( MunicipioVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do Método excluir

	public ArrayList< MunicipioVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do Método consultarTodos

	public ArrayList< MunicipioVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do Método consultarPorDescricao

}
