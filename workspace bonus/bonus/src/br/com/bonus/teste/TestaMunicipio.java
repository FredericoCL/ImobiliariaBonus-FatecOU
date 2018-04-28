/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.endereco.municipio.dao.MunicipioDAOServiceImpl;
import br.com.bonus.endereco.municipio.model.MunicipioVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 00:20:05
 * @version 1.0
 */
public class TestaMunicipio{
	
	@Test
	public void testarInserir() throws InserirException {
		MunicipioVO vo = new MunicipioVO( null, "Ourinhos" );

		MunicipioDAOServiceImpl dao = new MunicipioDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do Método testarInserir

	
	public void testarAlterar() throws AlterarException {
		// Criando o Idioma a ser inserido.
		MunicipioVO vo = new MunicipioVO( 4, "Bauru" );

		// Instanciando nosso DAO
		MunicipioDAOServiceImpl dao = new MunicipioDAOServiceImpl();
		dao.alterar( vo );

	}//Fim do Método testarAlterar

	
	public void testarConsultarTodos() throws ConsultarException {
		// Instanciando nosso DAO
		MunicipioDAOServiceImpl dao = new MunicipioDAOServiceImpl();
		System.out.println( dao.consultarTodos() );
		
	}//Fim do Método testarConsultarTodos

	
	public void testarConsultarPorDescricao() throws ConsultarException {
		// Instanciando nosso DAO
		MunicipioDAOServiceImpl dao = new MunicipioDAOServiceImpl();
		System.out.println( dao.consultarPorDescricao( "Ourinhos" ) );

	}//Fim do Método testarConsultarPorDescricao

	
	public void testarExcluir() throws ExcluirException {
		// Criando o Idioma a ser inserido.
		MunicipioVO vo = new MunicipioVO( 4, " " );

		// Instanciando nosso DAO
		MunicipioDAOServiceImpl dao = new MunicipioDAOServiceImpl();
		dao.excluir( vo );

	}//Fim do Método testarExcluir

}
