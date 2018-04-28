/**
 * 
 */
package br.com.bonus.endereco.pais.model;

import java.util.ArrayList;

import br.com.bonus.endereco.pais.dao.PaisDAOService;
import br.com.bonus.endereco.pais.dao.PaisDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 08:42:18
 * @version 1.0
 */
public class PaisBO{
	
	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private PaisDAOService dao = new PaisDAOServiceImpl();
	
	public void inserir( PaisVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getDescricao() == null) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir
	
	public void alterar( PaisVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getDescricao() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na alteração!" );
		}

	}//Fim do Método Alterar
	
	public void excluir( PaisVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir
	
	public ArrayList< PaisVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< PaisVO > paises;

			paises = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( paises == null || paises.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return paises;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos
	
	public ArrayList< PaisVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< PaisVO > paises;

			paises = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( paises == null || paises.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return paises;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
