/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.model;

import java.util.ArrayList;

import br.com.bonus.contrato.tipocontrato.dao.TipoContratoDAOService;
import br.com.bonus.contrato.tipocontrato.dao.TipoContratoDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 22:58:25
 * @version 1.0
 */
public class TipoContratoBO{
	
	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private TipoContratoDAOService dao = new TipoContratoDAOServiceImpl();
	
	public void inserir( TipoContratoVO vo ) throws InserirException {
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
	
	public void alterar( TipoContratoVO vo ) throws AlterarException {
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
	
	public void excluir( TipoContratoVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir
	
	public ArrayList< TipoContratoVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< TipoContratoVO > tipoContratos;

			tipoContratos = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( tipoContratos == null || tipoContratos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoContratos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos
	
	public ArrayList< TipoContratoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< TipoContratoVO > tipoContratos;

			tipoContratos = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( tipoContratos == null || tipoContratos.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return tipoContratos;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
