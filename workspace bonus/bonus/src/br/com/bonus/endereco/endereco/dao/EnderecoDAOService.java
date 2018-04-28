/**
 * 
 */
package br.com.bonus.endereco.endereco.dao;

import java.util.ArrayList;

import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 09:44:53
 * @version 1.0
 */
public interface EnderecoDAOService{
	
	/**
	 * 
	 * M�todo respons�vel por inserir um EnderecoVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws InserirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:46:24
	 * @version 1.0
	 */
	public void inserir( EnderecoVO vo ) throws InserirException;
	
	/**
	 * 
	 * M�todo respons�vel por alterar um EnderecoVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws AlterarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:46:48
	 * @version 1.0
	 */
	public void alterar( EnderecoVO vo ) throws AlterarException;
	
	/**
	 * 
	 * M�todo respons�vel por excluir um EnderecoVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws ExcluirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:03
	 * @version 1.0
	 */
	public void excluir( EnderecoVO vo ) throws ExcluirException;
	
	/**
	 * 
	 * M�todo respons�vel por consultar um endereco da base de dados com base em sua descri��o.
	 * Este m�todo de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @param logradouro
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:18
	 * @version 1.0
	 */
	public ArrayList < EnderecoVO >  consultarPorLogradouro( String logradouro ) throws ConsultarException;
	
	/**
	 * 
	 * M�todo respons�vel por consultar todos os enderecos da base de dados.
	 * Este m�todo de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:47:34
	 * @version 1.0
	 */
	public ArrayList< EnderecoVO > consultarTodos() throws ConsultarException;

}
