/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.tipofinalidade.dao.TipoFinalidadeDAOService;
import br.com.bonus.imovel.tipofinalidade.dao.TipoFinalidadeDAOServiceImpl;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 09:36:09
 * @version 1.0
 */
public class TipoFinalidadeBO{

	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private TipoFinalidadeDAOService dao = new TipoFinalidadeDAOServiceImpl();

	public void inserir( TipoFinalidadeVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getDescricao() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir

	public void alterar( TipoFinalidadeVO vo ) throws AlterarException {
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

	public void excluir( TipoFinalidadeVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir

	public ArrayList< TipoFinalidadeVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< TipoFinalidadeVO > tipoFinalidades;

			tipoFinalidades = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( tipoFinalidades == null || tipoFinalidades.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoFinalidades;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< TipoFinalidadeVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< TipoFinalidadeVO > tipoFinalidades;

			tipoFinalidades = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( tipoFinalidades == null || tipoFinalidades.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoFinalidades;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
