/**
 * 
 */
package br.com.bonus.pessoa.cliente.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.pessoa.cliente.model.ClienteVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 22/11/2013 09:40:02
 * @version 1.0
 */
public interface ClienteDAOService{
	
	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 10:44:52
	 * @version 1.0
	 */
	public void inserir( ClienteVO vo ) throws InserirException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 10:44:56
	 * @version 1.0
	 */
	public void alterar( ClienteVO vo ) throws AlterarException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 10:45:01
	 * @version 1.0
	 */
	public void excluir( ClienteVO vo ) throws ExcluirException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param nome
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 10:45:05
	 * @version 1.0
	 */
	public ArrayList< ClienteVO > consultarPorCpf( String cpf ) throws ConsultarException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 10:45:10
	 * @version 1.0
	 */
	public ArrayList< ClienteVO > consultarTodos() throws ConsultarException;

}
