/**
 * 
 */
package br.com.bonus.endereco.pais.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bonus.abstractdao.AbstractDAO;
import br.com.bonus.endereco.pais.model.PaisVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 23:52:44
 * @version 1.0
 */
public class PaisDAOServiceImpl extends AbstractDAO implements PaisDAOService{

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.pais.dao.PaisDAOService#inserir(br.com.bonus.endereco.pais.model.PaisVO)
	 */
	@Override
	public void inserir( PaisVO vo ) throws InserirException {
		// Declarando uma variavel que armazenar� uma Transa��o
		Transaction transacao = null;

		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		 * hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transa��o
			transacao = sessao.beginTransaction();

			/*
			 * A��o desejada a ser executada no BD.
			 * Ap�s inserir, o m�todo 'save' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			vo.setIdPais( (Integer) sessao.save( vo ) );

			// Confirma a a��o executada e fecha a Transa��o.
			transacao.commit();

		} catch ( Exception e ) {
			e.printStackTrace();
			/*Caso ocorra algum erro no processo, se a transa��o tiver sido criada, ser�
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();
			}//Fim do IF
			throw new InserirException( "Erro ao inserir" );

		} finally {
			// Fecha a Sess�o com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo inserir

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.pais.dao.PaisDAOService#alterar(br.com.bonus.endereco.pais.model.PaisVO)
	 */
	@Override
	public void alterar( PaisVO vo ) throws AlterarException {
		// Declarando uma variavel que armazenar� uma Transa��o
		Transaction transacao = null;

		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		 * hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transa��o
			transacao = sessao.beginTransaction();

			/*
			 * A��o desejada a ser executada no BD.
			 * Ap�s alterar, o m�todo 'update' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			sessao.update( vo );

			// Confirma a a��o executada e fecha a Transa��o.
			transacao.commit();

		} catch ( Exception e ) {
			/*Caso ocorra algum erro no processo, se a transa��o tiver sido criada, ser�
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();

				throw new AlterarException( "Erro ao alterar" );
			}//Fim do IF

		} finally {
			// Fecha a Sess�o com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo alterar

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.pais.dao.PaisDAOService#excluir(br.com.bonus.endereco.pais.model.PaisVO)
	 */
	@Override
	public void excluir( PaisVO vo ) throws ExcluirException {
		// Declarando uma variavel que armazenar� uma Transa��o
		Transaction transacao = null;

		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		 * hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transa��o
			transacao = sessao.beginTransaction();

			/*
			 * A��o desejada a ser executada no BD.
			 * Ap�s excluir, o m�todo 'delete' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			sessao.delete( vo );

			// Confirma a a��o executada e fecha a Transa��o.
			transacao.commit();

		} catch ( Exception e ) {
			/*Caso ocorra algum erro no processo, se a transa��o tiver sido criada, ser�
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();
				throw new ExcluirException( "Erro ao excluir" );
			}//Fim do IF

		} finally {
			// Fecha a Sess�o com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo excluir

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.pais.dao.PaisDAOService#consultarPorDescricao(java.lang.String)
	 */
	@Override
	public ArrayList< PaisVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		  hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			/*Criando e inicializando uma variavel respons�vel por buscar a nossa 
			NamedQuery criada no VO deixando-a preparada para o Hibernate executa-la.*/
			Query query = sessao.createQuery( "Select p FROM PaisVO p where p.descricao LIKE :descricao" );
			query.setString( "descricao", "%" + descricao + "%" );

			// Executando a Query retornando o casting de seu resultado.
			return (ArrayList< PaisVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar por Descricao" );

		} finally {
			// Fecha a Sess�o com o BD. 
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo consultarPorDescricao

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.pais.dao.PaisDAOService#consultarTodos()
	 */
	@Override
	public ArrayList< PaisVO > consultarTodos() throws ConsultarException {
		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		  hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			// Crimando uma HQL(Hibernate Query Language) como se estivessemos criando uma NamedQuery
			final String HQL = "SELECT idio FROM PaisVO idio ORDER BY idio.descricao ASC";

			/*Criando e inicializando uma variavel respons�vel por criar uma Query
			com base na nossa HQL criada acima deixando-a preparada para o 
			Hibernate executa-la.*/
			Query query = sessao.createQuery( HQL );

			return (ArrayList< PaisVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar todos" );

		} finally {
			// Fecha a Sess�o com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo consultarTodos

}
