/**
 * 
 */
package br.com.bonus.telefone.telefone.dao;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.telefone.model.TelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 19:14:22
 * @version 1.0
 */
public interface TelefoneDAOService{
	
	/**
	 * 
	 * M�todo respons�vel por inserir um TipoTelefoneVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo 
	 * @throws InserirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 02/10/2013 23:05:50
	 * @version 1.0
	 */
	public void inserir( TelefoneVO vo ) throws InserirException;
	
	/**
	 * 
	 * M�todo respons�vel por alterar um TipoTelefoneVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws AlterarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 02/10/2013 23:06:58
	 * @version 1.0
	 */
	public void alterar( TelefoneVO vo ) throws AlterarException;
	
	/**
	 * 
	 * M�todo respons�vel por excluir um TipoTelefoneVO na base de dados com o aux�lio
	 * da framework Hibernate.
	 *
	 * @param vo
	 * @throws ExcluirException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 02/10/2013 23:07:59
	 * @version 1.0
	 */
	public void excluir( TelefoneVO vo ) throws ExcluirException;
	
	/**
	 * 
	 * M�todo respons�vel por consultar um tipoTelefone da base de dados com base em sua descri��o.
	 * Este m�todo de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @param descricao
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 02/10/2013 23:15:41
	 * @version 1.0
	 */
	public ArrayList < TelefoneVO >  consultarPorNumero( String numero ) throws ConsultarException;
	
	/**
	 * 
	 * M�todo respons�vel por consultar todos os tiposTelefones da base de dados.
	 * Este m�todo de consulta utilizou uma HQL feita no ato para seu funcionamento.
	 *
	 * @return
	 * @throws ConsultarException
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 02/10/2013 23:10:07
	 * @version 1.0
	 */
	public ArrayList< TelefoneVO > consultarTodos() throws ConsultarException;

}
