/**
 * 
 */
package br.com.bonus.imovel.tiponegociacao.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 01:23:29
 * @version 1.0
 */
public interface TipoNegociacaoDAOService{
	

	/**
	 * 
	 * Método responsável por inserir um TipoNegociacaoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo 
	 * @throws InserirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:05:50
	 * @version 1.0
	 */
	public void inserir( TipoNegociacaoVO vo ) throws InserirException;
	
	/**
	 * 
	 * Método responsável por alterar um TipoNegociacaoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws AlterarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:06:58
	 * @version 1.0
	 */
	public void alterar( TipoNegociacaoVO vo ) throws AlterarException;
	
	/**
	 * 
	 * Método responsável por excluir um TipoNegociacaoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws ExcluirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:07:59
	 * @version 1.0
	 */
	public void excluir( TipoNegociacaoVO vo ) throws ExcluirException;
	
	/**
	 * 
	 * Método responsável por consultar um tipoTelefone da base de dados com base em sua descrição.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @param descricao
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:15:41
	 * @version 1.0
	 */
	public ArrayList < TipoNegociacaoVO >  consultarPorDescricao( String descricao ) throws ConsultarException;
	
	/**
	 * 
	 * Método responsável por consultar todos os tiposTelefones da base de dados.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:10:07
	 * @version 1.0
	 */
	public ArrayList< TipoNegociacaoVO > consultarTodos() throws ConsultarException;

}
