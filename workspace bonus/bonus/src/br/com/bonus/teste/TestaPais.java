/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.endereco.pais.dao.PaisDAOServiceImpl;
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
 * @since 06/11/2013 08:57:25
 * @version 1.0
 */
public class TestaPais{
	
	@Test
	public void testarInserir() throws InserirException {
		PaisVO vo = new PaisVO( null, "Brasil" );

		PaisDAOServiceImpl dao = new PaisDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do Método testarInserir

	
	public void testarAlterar() throws AlterarException {
		// Criando o Idioma a ser inserido.
		PaisVO vo = new PaisVO( 1, "Brasil" );

		// Instanciando nosso DAO
		PaisDAOServiceImpl dao = new PaisDAOServiceImpl();
		dao.alterar( vo );

	}//Fim do Método testarAlterar

	
	public void testarConsultarTodos() throws ConsultarException {
		// Instanciando nosso DAO
		PaisDAOServiceImpl dao = new PaisDAOServiceImpl();
		System.out.println( dao.consultarTodos() );
		
	}//Fim do Método testarConsultarTodos

	
	public void testarConsultarPorDescricao() throws ConsultarException {
		// Instanciando nosso DAO
		PaisDAOServiceImpl dao = new PaisDAOServiceImpl();
		System.out.println( dao.consultarPorDescricao( "Brasil" ) );

	}//Fim do Método testarConsultarPorDescricao

	
	public void testarExcluir() throws ExcluirException {
		// Criando o Idioma a ser inserido.
		PaisVO vo = new PaisVO( 3, " " );

		// Instanciando nosso DAO
		PaisDAOServiceImpl dao = new PaisDAOServiceImpl();
		dao.excluir( vo );

	}//Fim do Método testarExcluir

}
