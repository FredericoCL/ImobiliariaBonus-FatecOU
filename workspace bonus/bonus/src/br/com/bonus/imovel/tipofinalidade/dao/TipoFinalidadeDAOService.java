/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 09:28:51
 * @version 1.0
 */
public interface TipoFinalidadeDAOService{

	/**
	 * 
	 * Método responsável por inserir um TipoFinalidadeVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws InserirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:27:50
	 * @version 1.0
	 */
	public void inserir( TipoFinalidadeVO vo ) throws InserirException;

	/**
	 * 
	 * Método responsável por alterar um TipoFinalidadeVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws AlterarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:27:58
	 * @version 1.0
	 */
	public void alterar( TipoFinalidadeVO vo ) throws AlterarException;

	/**
	 * 
	 * Método responsável por excluir um TipoFinalidadeVO na base de dados com o auxílio
	 * da framework Hibernate.
	 * 
	 * @param vo
	 * @throws ExcluirException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:28:59
	 * @version 1.0
	 */
	public void excluir( TipoFinalidadeVO vo ) throws ExcluirException;

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
	 * @since 16/11/2013 09:29:41
	 * @version 1.0
	 */
	public ArrayList< TipoFinalidadeVO > consultarPorDescricao( String descricao ) throws ConsultarException;

	/**
	 * 
	 * Método responsável por consultar todos os tiposTelefones da base de dados.
	 * Este método de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 * 
	 * @return
	 * @throws ConsultarException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:30:07
	 * @version 1.0
	 */
	public ArrayList< TipoFinalidadeVO > consultarTodos() throws ConsultarException;

}
