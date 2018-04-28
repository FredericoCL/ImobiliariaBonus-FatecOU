/**
 * 
 */
package br.com.bonus.telefone.tipotelefone.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService;
import br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOServiceImpl;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 10:34:04
 * @version 1.0
 */
public class TipoTelefoneBO{
	
	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private TipoTelefoneDAOService dao = new TipoTelefoneDAOServiceImpl();
	
	public void inserir( TipoTelefoneVO vo ) throws InserirException {
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
	
	public void alterar( TipoTelefoneVO vo ) throws AlterarException {
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
	
	public void excluir( TipoTelefoneVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir
	
	public ArrayList< TipoTelefoneVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< TipoTelefoneVO > tipoTelefones;

			tipoTelefones = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( tipoTelefones == null || tipoTelefones.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoTelefones;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos
	
	public ArrayList< TipoTelefoneVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< TipoTelefoneVO > tipoTelefones;

			tipoTelefones = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( tipoTelefones == null || tipoTelefones.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoTelefones;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
