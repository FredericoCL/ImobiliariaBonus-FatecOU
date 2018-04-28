/**
 * 
 */
package br.com.bonus.endereco.municipio.model;

import java.util.ArrayList;

import br.com.bonus.endereco.municipio.dao.MunicipioDAOService;
import br.com.bonus.endereco.municipio.dao.MunicipioDAOServiceImpl;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 22:40:49
 * @version 1.0
 */
public class MunicipioBO{
	
	/**
	 * Atributo respons�vel pela comunica��o segura com a Camada DAO.
	 */
	private MunicipioDAOService dao = new MunicipioDAOServiceImpl();
	
	public void inserir( MunicipioVO vo ) throws InserirException {
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
	
	public void alterar( MunicipioVO vo ) throws AlterarException {
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
	
	public void excluir( MunicipioVO vo ) throws ExcluirException {
		try {

			dao.excluir( vo );

		} catch ( ExcluirException e ) {
			throw new ExcluirException( "Erro na exclus�o!" );
		}

	}//Fim do M�todo Excluir
	
	public ArrayList< MunicipioVO > consultarTodos() throws ConsultarException {
		try {

			ArrayList< MunicipioVO > municipios;

			municipios = dao.consultarTodos();

			//Verificando a existencia de dados
			if ( municipios == null || municipios.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return municipios;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar todos" );
		}

	}//Fim do Metodo consultarTodos
	
	public ArrayList< MunicipioVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		try {

			ArrayList< MunicipioVO > municipios;

			municipios = dao.consultarPorDescricao( descricao );

			//Verificando a existencia de dados
			if ( municipios == null || municipios.size() < 0 ) {
				throw new ConsultarException( "Nenhum registro encontrado" );
			}

			return municipios;

		} catch ( ConsultarException e ) {
			throw new ConsultarException( "Erro ao consultar por descricao" );
		}

	}//Fim do Metodo consultarPorDescricao

}
