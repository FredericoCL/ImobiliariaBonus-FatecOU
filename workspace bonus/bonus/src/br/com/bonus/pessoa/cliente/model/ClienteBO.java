/**
 * 
 */
package br.com.bonus.pessoa.cliente.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.pessoa.cliente.dao.ClienteDAOService;
import br.com.bonus.pessoa.cliente.dao.ClienteDAOServiceImpl;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 22/11/2013 09:51:30
 * @version 1.0
 */
public class ClienteBO{

	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private ClienteDAOService dao = new ClienteDAOServiceImpl();

	public void inserir( ClienteVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( vo.getCpf() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inser��o!" );
		}

	}//Fim do M�todo Inserir

	public void alterar( ClienteVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( vo.getCpf() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na altera��o!" );
		}

	}//Fim do M�todo Alterar

	public void excluir( ClienteVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir

	public ArrayList< ClienteVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< ClienteVO > clientes;

			clientes = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( clientes == null || clientes.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return clientes;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< ClienteVO > consultarPorCpf( String cpf ) throws ConsultarException {
		try {

			ArrayList< ClienteVO > clientes;

			clientes = dao.consultarPorCpf( cpf );

			//Verificando a existencia de dados
			if ( clientes == null || clientes.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return clientes;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por nome" );
		}

	}//Fim do Metodo consultarPorCPF

}
