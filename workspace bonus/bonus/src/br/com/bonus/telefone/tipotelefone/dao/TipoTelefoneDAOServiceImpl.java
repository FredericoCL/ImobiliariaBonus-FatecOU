/**
 * 
 */
package br.com.bonus.telefone.tipotelefone.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bonus.abstractdao.AbstractDAO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 10:39:25
 * @version 1.0
 */
public class TipoTelefoneDAOServiceImpl extends AbstractDAO implements TipoTelefoneDAOService{

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService#inserir(br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO)
	 */
	public void inserir( TipoTelefoneVO vo ) throws InserirException {
		// Declarando uma variavel que armazenará uma Transação
		Transaction transacao = null;

		/*Declarando uma variavél que armazenará uma Sessão do 
		 * hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transação
			transacao = sessao.beginTransaction();

			/*
			 * Ação desejada a ser executada no BD.
			 * Após inserir, o método 'save' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			vo.setIdTipoTelefone( (Integer) sessao.save( vo ) );

			// Confirma a ação executada e fecha a Transação.
			transacao.commit();

		} catch ( Exception e ) {
			e.printStackTrace();
			/*Caso ocorra algum erro no processo, se a transação tiver sido criada, será
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();
			}//Fim do IF
			throw new InserirException( "Erro ao inserir" );

		} finally {
			// Fecha a Sessão com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método inserir

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService#alterar(br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO)
	 */
	public void alterar( TipoTelefoneVO vo ) throws AlterarException {
		// Declarando uma variavel que armazenará uma Transação
		Transaction transacao = null;

		/*Declarando uma variavél que armazenará uma Sessão do 
		 * hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transação
			transacao = sessao.beginTransaction();

			/*
			 * Ação desejada a ser executada no BD.
			 * Após alterar, o método 'update' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			sessao.update( vo );

			// Confirma a ação executada e fecha a Transação.
			transacao.commit();

		} catch ( Exception e ) {
			/*Caso ocorra algum erro no processo, se a transação tiver sido criada, será
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();

				throw new AlterarException( "Erro ao alterar" );
			}//Fim do IF

		} finally {
			// Fecha a Sessão com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método alterar

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService#excluir(br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO)
	 */
	public void excluir( TipoTelefoneVO vo ) throws ExcluirException {
		// Declarando uma variavel que armazenará uma Transação
		Transaction transacao = null;

		/*Declarando uma variavél que armazenará uma Sessão do 
		 * hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Iniciando uma bloco de transação
			transacao = sessao.beginTransaction();

			/*
			 * Ação desejada a ser executada no BD.
			 * Após excluir, o método 'delete' retorna o id no qual o objeto 
			 * foi inserido.
			 */
			sessao.delete( vo );

			// Confirma a ação executada e fecha a Transação.
			transacao.commit();

		} catch ( Exception e ) {
			/*Caso ocorra algum erro no processo, se a transação tiver sido criada, será
			efetuado um Rollback na mesma.*/
			if ( transacao != null ) {
				transacao.rollback();
				throw new ExcluirException( "Erro ao excluir" );
			}//Fim do IF

		} finally {
			// Fecha a Sessão com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método excluir

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService#consultarPorDescricao(java.lang.String)
	 */
	public ArrayList< TipoTelefoneVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			/*Criando e inicializando uma variavel responsável por buscar a nossa 
			NamedQuery criada no VO deixando-a preparada para o Hibernate executa-la.*/
			Query query = sessao.createQuery( "Select p FROM TipoTelefoneVO p where p.descricao LIKE :descricao" );
			query.setString( "descricao", "%" + descricao + "%" );

			// Executando a Query retornando o casting de seu resultado.
			return (ArrayList< TipoTelefoneVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar por Descricao" );

		} finally {
			// Fecha a Sessão com o BD. 
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método consultarPorDescricao

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.telefone.tipotelefone.dao.TipoTelefoneDAOService#consultarTodos()
	 */
	public ArrayList< TipoTelefoneVO > consultarTodos() throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Crimando uma HQL(Hibernate Query Language) como se estivessemos criando uma NamedQuery
			final String HQL = "SELECT idio FROM TipoTelefoneVO idio ORDER BY idio.descricao ASC";

			/*Criando e inicializando uma variavel responsável por criar uma Query
			com base na nossa HQL criada acima deixando-a preparada para o 
			Hibernate executa-la.*/
			Query query = sessao.createQuery( HQL );

			return (ArrayList< TipoTelefoneVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar todos" );

		} finally {
			// Fecha a Sessão com o BD.	
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método consultarTodos

}
