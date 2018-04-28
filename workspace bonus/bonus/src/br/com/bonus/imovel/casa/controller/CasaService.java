/**
 * 
 */
package br.com.bonus.imovel.casa.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.casa.model.CasaBO;
import br.com.bonus.imovel.casa.model.CasaVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 09:04:28
 * @version 1.0
 */
public class CasaService{

	private CasaBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static CasaService instance;

	private CasaService(){
		bo = new CasaBO();
	}

	public static CasaService getInstance() {
		if ( instance == null ) {
			instance = new CasaService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoContratoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( CasaVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( CasaVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar

	public void excluir( CasaVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do Método excluir

	public ArrayList< CasaVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do Método consultarTodos

	public ArrayList< CasaVO > consultarPorAreaTotal( String areaTotal ) throws ConsultarException {
		return bo.consultarPorAreaTotal( areaTotal );
	}//Fim do Método consultarPorAreaTotal

}
