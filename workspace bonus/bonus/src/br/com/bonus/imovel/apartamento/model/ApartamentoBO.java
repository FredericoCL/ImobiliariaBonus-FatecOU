/**
 * 
 */
package br.com.bonus.imovel.apartamento.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService;
import br.com.bonus.imovel.apartamento.dao.ApartamentoDAOServiceImpl;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 16:56:39
 * @version 1.0
 */
public class ApartamentoBO{

	/**
	 * Atributo responsável pela comunicação segura com a Camada DAO.
	 */
	private ApartamentoDAOService dao = new ApartamentoDAOServiceImpl();

	public void inserir( ApartamentoVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getTipoApartamento() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inserção!" );
		}

	}//Fim do Método Inserir

	public void alterar( ApartamentoVO vo ) throws AlterarException {
		try {

			//Verificado  se todos os atributos obrigatórios estão preenchidos
			if ( vo.getTipoApartamento() == null ) {
				throw new AlterarException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.alterar( vo );

		} catch ( AlterarException e ) {
			throw new AlterarException( "Erro na alteração!" );
		}

	}//Fim do Método Alterar

	public void excluir( ApartamentoVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclusão!" );
		}

	}//Fim do Método Excluir

	public ArrayList< ApartamentoVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< ApartamentoVO > apartamentos;

			apartamentos = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( apartamentos == null || apartamentos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return apartamentos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< ApartamentoVO > consultarPorTipoApartamento( String tipoApartamento ) throws ConsultarException {
		try {

			ArrayList< ApartamentoVO > apartamentos;

			apartamentos = dao.consultarPorTipoApartamento( tipoApartamento );

			//Verificando a existencia de dados
			if ( apartamentos == null || apartamentos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return apartamentos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por areaTotal" );
		}

	}//Fim do Metodo consultarPorAreaTotal

}
