/**
 * 
 */
package br.com.bonus.contrato.contrato.model;

import java.util.ArrayList;
import java.util.Date;

import br.com.bonus.contrato.contrato.dao.ContratoDAOService;
import br.com.bonus.contrato.contrato.dao.ContratoDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 09:46:02
 * @version 1.0
 */
public class ContratoBO{

	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private ContratoDAOService dao = new ContratoDAOServiceImpl();

	public void inserir( ContratoVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( ( vo.getDataInicio() == null ) && ( vo.getDataFim() == null ) ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir

	public void alterar( ContratoVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( ( vo.getDataInicio() == null ) && ( vo.getDataFim() == null ) ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na alteração!" );
		}

	}//Fim do Método Alterar

	public void excluir( ContratoVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir

	public ArrayList< ContratoVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< ContratoVO > contratos;

			contratos = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( contratos == null || contratos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return contratos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< ContratoVO > consultarPorDataFim( Date dataFim ) throws ConsultarException {
		try {

			ArrayList< ContratoVO > contratos;

			contratos = dao.consultarPorDataFim( dataFim );

			//Verificando a existencia de dados
			if ( contratos == null || contratos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return contratos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por numero" );
		}

	}//Fim do Metodo consultarPorNumero
}
