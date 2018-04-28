/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.endereco.estado.dao.EstadoDAOServiceImpl;
import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 23:58:04
 * @version 1.0
 */
public class TestaEstado{
	
	@Test
	public void testarInserir() throws InserirException {
		EstadoVO vo = new EstadoVO( null, "São Paulo" );

		EstadoDAOServiceImpl dao = new EstadoDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do Método testarInserir

	
	public void testarAlterar() throws AlterarException {
		// Criando o Idioma a ser inserido.
		EstadoVO vo = new EstadoVO( 2, "São Paulo" );

		// Instanciando nosso DAO
		EstadoDAOServiceImpl dao = new EstadoDAOServiceImpl();
		dao.alterar( vo );

	}//Fim do Método testarAlterar

	
	public void testarConsultarTodos() throws ConsultarException {
		// Instanciando nosso DAO
		EstadoDAOServiceImpl dao = new EstadoDAOServiceImpl();
		System.out.println( dao.consultarTodos() );
		
	}//Fim do Método testarConsultarTodos

	
	public void testarConsultarPorDescricao() throws ConsultarException {
		// Instanciando nosso DAO
		EstadoDAOServiceImpl dao = new EstadoDAOServiceImpl();
		System.out.println( dao.consultarPorDescricao( "Paraná" ) );

	}//Fim do Método testarConsultarPorDescricao

	
	public void testarExcluir() throws ExcluirException {
		// Criando o Idioma a ser inserido.
		EstadoVO vo = new EstadoVO( 2, " " );

		// Instanciando nosso DAO
		EstadoDAOServiceImpl dao = new EstadoDAOServiceImpl();
		dao.excluir( vo );

	}//Fim do Método testarExcluir

}
