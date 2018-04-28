/**
 * 
 */
package br.com.bonus.imovel.casa.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.casa.model.CasaVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 08:54:09
 * @version 1.0
 */
public interface CasaDAOService{

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:44:52
	 * @version 1.0
	 */
	public void inserir( CasaVO vo ) throws InserirException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:44:56
	 * @version 1.0
	 */
	public void alterar( CasaVO vo ) throws AlterarException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:01
	 * @version 1.0
	 */
	public void excluir( CasaVO vo ) throws ExcluirException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @param areaTotal
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:05
	 * @version 1.0
	 */
	public ArrayList< CasaVO > consultarPorAreaTotal( String areaTotal ) throws ConsultarException;

	/**
	 * 
	 * M�todo respons�vel por
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:10
	 * @version 1.0
	 */
	public ArrayList< CasaVO > consultarTodos() throws ConsultarException;

}
