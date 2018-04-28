/**
 * 
 */
package br.com.bonus.telefone.telefone.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.telefone.dao.TelefoneDAOService;
import br.com.bonus.telefone.telefone.dao.TelefoneDAOServiceImpl;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 19:19:25
 * @version 1.0
 */
public final class TelefoneBO{
	
	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private TelefoneDAOService dao = new TelefoneDAOServiceImpl();

	public void inserir( TelefoneVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getNumero() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir

	public void alterar( TelefoneVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getNumero() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na alteração!" );
		}

	}//Fim do Método Alterar

	public void excluir( TelefoneVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir

	public ArrayList< TelefoneVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< TelefoneVO > telefones;

			telefones = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( telefones == null || telefones.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return telefones;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< TelefoneVO > consultarPorNumero( String numero ) throws ConsultarException {
		try {

			ArrayList< TelefoneVO > telefones;

			telefones = dao.consultarPorNumero( numero );

			//Verificando a existencia de dados
			if ( telefones == null || telefones.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return telefones;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por numero" );
		}

	}//Fim do Metodo consultarPorNumero

}
