/**
 * 
 */
package br.com.bonus.imovel.imovel.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.imovel.model.ImovelBO;
import br.com.bonus.imovel.imovel.model.ImovelVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:44:45
 * @version 1.0
 */
public class ImovelService{

	private ImovelBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static ImovelService instance;

	private ImovelService(){
		bo = new ImovelBO();
	}

	public static ImovelService getInstance() {
		if ( instance == null ) {
			instance = new ImovelService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoContratoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( ImovelVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( ImovelVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar

	public void excluir( ImovelVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do Método excluir

	public ArrayList< ImovelVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do Método consultarTodos

	public ArrayList< ImovelVO > consultarPorDormitorio( String dormitorio ) throws ConsultarException {
		return bo.consultarPorDormitorio( dormitorio );
	}//Fim do Método consultarPorDormitorio

}
