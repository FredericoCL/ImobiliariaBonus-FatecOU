/**
 * 
 */
package br.com.bonus.imovel.imovel.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.imovel.model.ImovelVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:24:03
 * @version 1.0
 */
public interface ImovelDAOService{

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 09:23:52
	 * @version 1.0
	 */
	public void inserir( ImovelVO vo ) throws InserirException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 09:23:56
	 * @version 1.0
	 */
	public void alterar( ImovelVO vo ) throws AlterarException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 10:45:01
	 * @version 1.0
	 */
	public void excluir( ImovelVO vo ) throws ExcluirException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param areaTotal
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 10:45:05
	 * @version 1.0
	 */
	public ArrayList< ImovelVO > consultarPorDormitorio( String dormitorio ) throws ConsultarException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 10:45:10
	 * @version 1.0
	 */
	public ArrayList< ImovelVO > consultarTodos() throws ConsultarException;

}
