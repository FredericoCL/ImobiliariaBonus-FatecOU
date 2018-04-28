/**
 * 
 */
package br.com.bonus.imovel.apartamento.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.apartamento.model.ApartamentoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 16:49:19
 * @version 1.0
 */
public interface ApartamentoDAOService{

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:44:52
	 * @version 1.0
	 */
	public void inserir( ApartamentoVO vo ) throws InserirException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:44:56
	 * @version 1.0
	 */
	public void alterar( ApartamentoVO vo ) throws AlterarException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:01
	 * @version 1.0
	 */
	public void excluir( ApartamentoVO vo ) throws ExcluirException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @param tipoApartamento
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:05
	 * @version 1.0
	 */
	public ArrayList< ApartamentoVO > consultarPorTipoApartamento( String tipoApartamento ) throws ConsultarException;

	/**
	 * 
	 * Método responsável por
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 10:45:10
	 * @version 1.0
	 */
	public ArrayList< ApartamentoVO > consultarTodos() throws ConsultarException;

}
