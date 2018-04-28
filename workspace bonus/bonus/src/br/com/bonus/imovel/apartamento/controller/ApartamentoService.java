/**
 * 
 */
package br.com.bonus.imovel.apartamento.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.apartamento.model.ApartamentoBO;
import br.com.bonus.imovel.apartamento.model.ApartamentoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 17:00:50
 * @version 1.0
 */
public class ApartamentoService{

	private ApartamentoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static ApartamentoService instance;

	private ApartamentoService(){
		bo = new ApartamentoBO();
	}

	public static ApartamentoService getInstance() {
		if ( instance == null ) {
			instance = new ApartamentoService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoContratoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( ApartamentoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( ApartamentoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar

	public void excluir( ApartamentoVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do Método excluir

	public ArrayList< ApartamentoVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do Método consultarTodos

	public ArrayList< ApartamentoVO > consultarPorTipoApartamento( String tipoApartamento ) throws ConsultarException {
		return bo.consultarPorTipoApartamento( tipoApartamento );
	}//Fim do Método consultarPorTipoApartamento

}
