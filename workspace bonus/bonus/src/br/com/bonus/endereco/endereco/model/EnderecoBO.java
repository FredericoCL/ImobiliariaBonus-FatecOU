/**
 * 
 */
package br.com.bonus.endereco.endereco.model;

import java.util.ArrayList;

import br.com.bonus.endereco.endereco.dao.EnderecoDAOService;
import br.com.bonus.endereco.endereco.dao.EnderecoDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 10:03:29
 * @version 1.0
 */
public class EnderecoBO{

	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private EnderecoDAOService dao;
	
	public EnderecoBO(){
		dao =  new EnderecoDAOServiceImpl();
	}

	public void inserir( EnderecoVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( ( vo.getLogradouro() == null ) && ( vo.getNumero() == null ) ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inser��o!" );
		}

	}//Fim do M�todo Inserir

	public void alterar( EnderecoVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( ( vo.getLogradouro() == null ) && ( vo.getNumero() == null ) ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na altera��o!" );
		}

	}//Fim do M�todo Alterar

	public void excluir( EnderecoVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir

	public ArrayList< EnderecoVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< EnderecoVO > enderecos;

			enderecos = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( enderecos == null || enderecos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return enderecos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< EnderecoVO > consultarPorLogradouro( String logradouro ) throws ConsultarException {
		try {

			ArrayList< EnderecoVO > enderecos;

			enderecos = dao.consultarPorLogradouro( logradouro );

			//Verificando a existencia de dados
			if ( enderecos == null || enderecos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return enderecos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por numero" );
		}

	}//Fim do Metodo consultarPorNumero

}
