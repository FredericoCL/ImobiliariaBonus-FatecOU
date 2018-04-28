/**
 * 
 */
package br.com.bonus.imovel.imovel.model;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.imovel.dao.ImovelDAOService;
import br.com.bonus.imovel.imovel.dao.ImovelDAOServiceImpl;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:40:37
 * @version 1.0
 */
public class ImovelBO{

	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private ImovelDAOService dao = new ImovelDAOServiceImpl();

	public void inserir( ImovelVO vo ) throws InserirException {
		try {

			//Verificado  se todos os atributos obrigat�rios est�o preenchidos
			if ( vo.getDescricao() == null ) {
				throw new InserirException( "Preencher todos os campos!" );
			}//Fim do IF

			dao.inserir( vo );

		} catch ( InserirException e ) {
			e.printStackTrace();
			throw new InserirException( "Erro na inser��o!" );
		}

	}//Fim do M�todo Inserir

	public void alterar( ImovelVO vo ) throws AlterarException {
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

	public void excluir( ImovelVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir

	public ArrayList< ImovelVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< ImovelVO > imoveis;

			imoveis = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( imoveis == null || imoveis.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return imoveis;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos

	public ArrayList< ImovelVO > consultarPorDormitorio( String dormitorio ) throws ConsultarException {
		try {

			ArrayList< ImovelVO > imoveis;

			imoveis = dao.consultarPorDormitorio( dormitorio );

			//Verificando a existencia de dados
			if ( imoveis == null || imoveis.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return imoveis;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por dormitorio" );
		}

	}//Fim do Metodo consultarPorDormitorio

}
