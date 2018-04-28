/**
 * 
 */
package br.com.bonus.imovel.tiponegociacao.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoBO;
import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 08:53:02
 * @version 1.0
 */
public final class TipoNegociacaoService{
	
	private TipoNegociacaoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela não poderá ser instanciada por mais ninguém além dela mesma
	 */

	/* INÍCIO DO SINGLETON */
	private static TipoNegociacaoService instance;

	private TipoNegociacaoService(){
		bo = new TipoNegociacaoBO();
	}

	public static TipoNegociacaoService getInstance() {
		if ( instance == null ) {
			instance = new TipoNegociacaoService();
		}//Fim do IF

		return instance;
	}//Fim do Método TipoNegociacaoService

	/* TÈRMINO DO SINGLETON */

	public void inserir( TipoNegociacaoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do Método inserir

	public void alterar( TipoNegociacaoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do Método alterar

	public void excluir( TipoNegociacaoVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do Método excluir

	public ArrayList< TipoNegociacaoVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do Método consultarTodos

	public ArrayList< TipoNegociacaoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do Método consultarPorDescricao

}
