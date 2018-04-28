/**
 * 
 */
package br.com.bonus.endereco.estado.model;

import java.util.ArrayList;

import br.com.bonus.endereco.estado.dao.EstadoDAOService;
import br.com.bonus.endereco.estado.dao.EstadoDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 22:20:46
 * @version 1.0
 */
public class EstadoBO{
	
	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private EstadoDAOService dao = new EstadoDAOServiceImpl();
	
	public void inserir( EstadoVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( vo.getDescricao() == null) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inser��o!" );
		}

	}//Fim do M�todo Inserir
	
	public void alterar( EstadoVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( vo.getDescricao() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na altera��o!" );
		}

	}//Fim do M�todo Alterar
	
	public void excluir( EstadoVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir
	
	public ArrayList< EstadoVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< EstadoVO > estados;

			estados = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( estados == null || estados.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return estados;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos
	
	public ArrayList< EstadoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< EstadoVO > estados;

			estados = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( estados == null || estados.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return estados;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
