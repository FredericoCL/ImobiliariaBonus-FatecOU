/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.contrato.tipocontrato.dao.TipoContratoDAOServiceImpl;
import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 09:20:24
 * @version 1.0
 */
public class TestaTipoContrato{
	
	
	public void testarInserir() throws InserirException {
		TipoContratoVO vo = new TipoContratoVO( null, "Renova��o" );

		TipoContratoDAOServiceImpl dao = new TipoContratoDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do M�todo testarInserir

	
	public void testarAlterar() throws AlterarException {
		// Criando o Idioma a ser inserido.
		TipoContratoVO vo = new TipoContratoVO( 4, "Finalizado" );

		// Instanciando nosso DAO
		TipoContratoDAOServiceImpl dao = new TipoContratoDAOServiceImpl();
		dao.alterar( vo );

	}//Fim do M�todo testarAlterar

	
	public void testarConsultarTodos() throws ConsultarException {
		// Instanciando nosso DAO
		TipoContratoDAOServiceImpl dao = new TipoContratoDAOServiceImpl();
		System.out.println( dao.consultarTodos() );
		
	}//Fim do M�todo testarConsultarTodos

	
	public void testarConsultarPorDescricao() throws ConsultarException {
		// Instanciando nosso DAO
		TipoContratoDAOServiceImpl dao = new TipoContratoDAOServiceImpl();
		System.out.println( dao.consultarPorDescricao( "Loca��o" ) );

	}//Fim do M�todo testarConsultarPorDescricao

	@Test
	public void testarExcluir() throws ExcluirException {
		// Criando o Idioma a ser inserido.
		TipoContratoVO vo = new TipoContratoVO( 4, " " );

		// Instanciando nosso DAO
		TipoContratoDAOServiceImpl dao = new TipoContratoDAOServiceImpl();
		dao.excluir( vo );

	}//Fim do M�todo testarExcluir

}
