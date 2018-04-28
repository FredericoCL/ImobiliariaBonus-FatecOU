/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOServiceImpl;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 15:36:03
 * @version 1.0
 */
public class TestaTipoTelefone{
	
	@Test
	public void testarInserir() throws InserirException {
		TipoTelefoneVO vo = new TipoTelefoneVO( null, "Residencial" );

		TipoTelefoneDAOServiceImpl dao = new TipoTelefoneDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do Método testarInserir

	
	public void testarAlterar() throws AlterarException {
		// Criando o Idioma a ser inserido.
		TipoTelefoneVO vo = new TipoTelefoneVO( 3, "Residencial" );

		// Instanciando nosso DAO
		TipoTelefoneDAOServiceImpl dao = new TipoTelefoneDAOServiceImpl();
		dao.alterar( vo );

	}//Fim do Método testarAlterar

	
	public void testarConsultarTodos() throws ConsultarException {
		// Instanciando nosso DAO
		TipoTelefoneDAOServiceImpl dao = new TipoTelefoneDAOServiceImpl();
		System.out.println( dao.consultarTodos() );
		
	}//Fim do Método testarConsultarTodos

	
	public void testarConsultarPorDescricao() throws ConsultarException {
		// Instanciando nosso DAO
		TipoTelefoneDAOServiceImpl dao = new TipoTelefoneDAOServiceImpl();
		System.out.println( dao.consultarPorDescricao( "Celular" ) );

	}//Fim do Método testarConsultarPorDescricao

	
	public void testarExcluir() throws ExcluirException {
		// Criando o Idioma a ser inserido.
		TipoTelefoneVO vo = new TipoTelefoneVO( 1, "Celular" );

		// Instanciando nosso DAO
		TipoTelefoneDAOServiceImpl dao = new TipoTelefoneDAOServiceImpl();
		dao.excluir( vo );

	}//Fim do Método testarExcluir

}
