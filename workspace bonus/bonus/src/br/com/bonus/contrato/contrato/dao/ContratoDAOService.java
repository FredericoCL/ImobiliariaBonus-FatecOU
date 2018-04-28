/**
 * 
 */
package br.com.bonus.contrato.contrato.dao;

import java.util.ArrayList;
import java.util.Date;

import br.com.bonus.contrato.contrato.model.ContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 09:36:59
 * @version 1.0
 */
public interface ContratoDAOService{

	/**
	 * 
	 * Método responsável por inserir um ContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:46:24
	 * @version 1.0
	 */
	public void inserir( ContratoVO vo ) throws InserirException;

	/**
	 * 
	 * Método responsável por alterar um ContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:46:48
	 * @version 1.0
	 */
	public void alterar( ContratoVO vo ) throws AlterarException;

	/**
	 * 
	 * Método responsável por excluir um ContratoVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:03
	 * @version 1.0
	 */
	public void excluir( ContratoVO vo ) throws ExcluirException;

	/**
	 * 
	 * Método responsável por consultar um endereco da base de dados com base em sua descrição.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 * 
	 * @param dataFim
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:18
	 * @version 1.0
	 */
	public ArrayList< ContratoVO > consultarPorDataFim( Date dataFim ) throws ConsultarException;

	/**
	 * 
	 * Método responsável por consultar todos os enderecos da base de dados.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:34
	 * @version 1.0
	 */
	public ArrayList< ContratoVO > consultarTodos() throws ConsultarException;

}
