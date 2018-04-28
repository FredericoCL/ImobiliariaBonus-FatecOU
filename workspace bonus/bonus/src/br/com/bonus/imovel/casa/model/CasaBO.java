/**
 * 
 */
package br.com.bonus.imovel.casa.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.casa.dao.CasaDAOService;
import br.com.bonus.imovel.casa.dao.CasaDAOServiceImpl;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 09:01:03
 * @version 1.0
 */
public class CasaBO{

	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private CasaDAOService dao = new CasaDAOServiceImpl();

	public void inserir( CasaVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getAreaTotal() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir

	public void alterar( CasaVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getAreaTotal() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na alteração!" );
		}

	}//Fim do Método Alterar

	public void excluir( CasaVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir

	public ArrayList< CasaVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< CasaVO > casas;

			casas = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( casas == null || casas.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return casas;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< CasaVO > consultarPorAreaTotal( String areaTotal ) throws ConsultarException {
		try {

			ArrayList< CasaVO > casas;

			casas = dao.consultarPorAreaTotal( areaTotal );

			//Verificando a existencia de dados
			if ( casas == null || casas.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return casas;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por areaTotal" );
		}

	}//Fim do Metodo consultarPorAreaTotal

}
