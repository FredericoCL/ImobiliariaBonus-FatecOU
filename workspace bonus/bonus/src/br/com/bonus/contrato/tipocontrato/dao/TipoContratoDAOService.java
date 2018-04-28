/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.dao;

import java.util.ArrayList;

import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 22:30:08
 * @version 1.0
 */
public interface TipoContratoDAOService{
	
	/**
	 * 
	 * Método responsável por inserir um TipoContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo 
	 * @throws InserirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:05:50
	 * @version 1.0
	 */
	public void inserir( TipoContratoVO vo ) throws InserirException;
	
	/**
	 * 
	 * Método responsável por alterar um TipoContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws AlterarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:06:58
	 * @version 1.0
	 */
	public void alterar( TipoContratoVO vo ) throws AlterarException;
	
	/**
	 * 
	 * Método responsável por excluir um TipoContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws ExcluirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:07:59
	 * @version 1.0
	 */
	public void excluir( TipoContratoVO vo ) throws ExcluirException;
	
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
	 * @since 05/11/2013 23:15:41
	 * @version 1.0
	 */
	public ArrayList < TipoContratoVO >  consultarPorDescricao( String descricao ) throws ConsultarException;
	
	/**
	 * 
	 * Método responsável por consultar todos os tiposTelefones da base de dados.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:10:07
	 * @version 1.0
	 */
	public ArrayList< TipoContratoVO > consultarTodos() throws ConsultarException;

}
