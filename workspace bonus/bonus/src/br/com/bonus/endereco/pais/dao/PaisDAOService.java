/**
 * 
 */
package br.com.bonus.endereco.pais.dao;

import java.util.ArrayList;

import br.com.bonus.endereco.pais.model.PaisVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 23:48:24
 * @version 1.0
 */
public interface PaisDAOService{

	/**
	 * 
	 * Método responsável por inserir um PaisVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:50:50
	 * @version 1.0
	 */
	public void inserir( PaisVO vo ) throws InserirException;

	/**
	 * 
	 * Método responsável por alterar um PaisVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:51:58
	 * @version 1.0
	 */
	public void alterar( PaisVO vo ) throws AlterarException;

	/**
	 * 
	 * Método responsável por excluir um PaisVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:52:59
	 * @version 1.0
	 */
	public void excluir( PaisVO vo ) throws ExcluirException;

	/**
	 * 
	 * Método responsável por consultar um pais da base de dados com base em sua descrição.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 * 
	 * @param descricao
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:53:41
	 * @version 1.0
	 */
	public ArrayList< PaisVO > consultarPorDescricao( String descricao ) throws ConsultarException;

	/**
	 * 
	 * Método responsável por consultar todos os tiposTelefones da base de dados.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:54:07
	 * @version 1.0
	 */
	public ArrayList< PaisVO > consultarTodos() throws ConsultarException;

}
