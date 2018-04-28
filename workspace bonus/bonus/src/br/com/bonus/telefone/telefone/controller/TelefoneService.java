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
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static TelefoneService instance;

	private TelefoneService(){
		bo = new TelefoneBO();
	}

	public static TelefoneService getInstance() {
		if ( instance == null ) {
			instance = new TelefoneService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoContratoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( TelefoneVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( TelefoneVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar
	
	public void excluir(TelefoneVO vo) throws ExcluirException {
		bo.excluir( vo );
    }//Fim do Método excluir
	
	public ArrayList< TelefoneVO > consultarTodos() throws ConsultarException{
		return bo.consultarTodos();
	}//Fim do Método consultarTodos
	
	public ArrayList< TelefoneVO > consultarPorDescricao( String numero ) throws ConsultarException{
		return bo.consultarPorNumero( numero );
	}//Fim do Método consultarPorDescricao

}
