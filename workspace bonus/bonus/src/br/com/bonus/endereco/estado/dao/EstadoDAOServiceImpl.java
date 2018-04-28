/**
 * 
 */
package br.com.bonus.endereco.estado.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bonus.abstractdao.AbstractDAO;
import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 22:11:32
 * @version 1.0
 */
public class EstadoDAOServiceImpl extends AbstractDAO implements EstadoDAOService{

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.estado.dao.MunicipioDAOService#inserir(br.com.bonus.endereco.estado.model.EstadoVO)
	 */
	@Override
	public void inserir( EstadoVO vo ) throws InserirException {
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
			vo.setIdEstado( (Integer) sessao.save( vo ) );

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
	 * @see br.com.bonus.endereco.estado.dao.MunicipioDAOService#alterar(br.com.bonus.endereco.estado.model.EstadoVO)
	 */
	@Override
	public void alterar( EstadoVO vo ) throws AlterarException {
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
	 * @see br.com.bonus.endereco.estado.dao.MunicipioDAOService#excluir(br.com.bonus.endereco.estado.model.EstadoVO)
	 */
	@Override
	public void excluir( EstadoVO vo ) throws ExcluirException {
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
	 * @see br.com.bonus.endereco.estado.dao.MunicipioDAOService#consultarPorDescricao(java.lang.String)
	 */
	@Override
	public ArrayList< EstadoVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			/*Criando e inicializando uma variavel responsável por buscar a nossa 
			NamedQuery criada no VO deixando-a preparada para o Hibernate executa-la.*/
			Query query = sessao.createQuery( "Select p FROM EstadoVO p where p.descricao LIKE :descricao" );
			query.setString( "descricao", "%" + descricao + "%" );

			// Executando a Query retornando o casting de seu resultado.
			return (ArrayList< EstadoVO >) query.list();

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
	 * @see br.com.bonus.endereco.estado.dao.MunicipioDAOService#consultarTodos()
	 */
	@Override
	public ArrayList< EstadoVO > consultarTodos() throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Crimando uma HQL(Hibernate Query Language) como se estivessemos criando uma NamedQuery
			final String HQL = "SELECT idio FROM EstadoVO idio ORDER BY idio.descricao ASC";

			/*Criando e inicializando uma variavel responsável por criar uma Query
			com base na nossa HQL criada acima deixando-a preparada para o 
			Hibernate executa-la.*/
			Query query = sessao.createQuery( HQL );

			return (ArrayList< EstadoVO >) query.list();

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
