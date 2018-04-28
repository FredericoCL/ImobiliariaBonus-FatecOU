/**
 * 
 */
package br.com.bonus.contrato.contrato.dao;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bonus.abstractdao.AbstractDAO;
import br.com.bonus.contrato.contrato.model.ContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 09:42:04
 * @version 1.0
 */
public class ContratoDAOServiceImpl extends AbstractDAO implements ContratoDAOService{

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.endereco.dao.ContratoDAOService#inserir(br.com.bonus.endereco.endereco.model.ContratoVO)
	 */
	@Override
	public void inserir( ContratoVO vo ) throws InserirException {
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
			vo.setIdContrato( (Integer) sessao.save( vo ) );

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
	 * @see br.com.bonus.endereco.endereco.dao.ContratoDAOService#alterar(br.com.bonus.endereco.endereco.model.ContratoVO)
	 */
	@Override
	public void alterar( ContratoVO vo ) throws AlterarException {
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
	 * @see br.com.bonus.endereco.endereco.dao.ContratoDAOService#excluir(br.com.bonus.endereco.endereco.model.ContratoVO)
	 */
	@Override
	public void excluir( ContratoVO vo ) throws ExcluirException {
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
	 * @see br.com.bonus.endereco.endereco.dao.ContratoDAOService#consultarPorDataFim(java.lang.Date)
	 */
	@Override
	public ArrayList< ContratoVO > consultarPorDataFim( Date dataFim ) throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			/*Criando e inicializando uma variavel responsável por buscar a nossa 
			NamedQuery criada no VO deixando-a preparada para o Hibernate executa-la.*/
			Query query = sessao.createQuery( "Select p FROM ContratoVO p where p.dataFim LIKE :dataFim" );
			query.setString( "dataFim", "%" + dataFim + "%" );

			// Executando a Query retornando o casting de seu resultado.
			return (ArrayList< ContratoVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar por Logradouro" );

		} finally {
			// Fecha a Sessão com o BD. 
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do Método consultarPorDataFim

	/**
	 * Polimorfico
	 * @see br.com.bonus.endereco.endereco.dao.ContratoDAOService#consultarTodos()
	 */
	@Override
	public ArrayList< ContratoVO > consultarTodos() throws ConsultarException {
		/*Declarando uma variavél que armazenará uma Sessão do 
		  hibernate contendo uma conexão aberta e válida.*/
		Session sessao = null;

		try {
			//Pega uma Sessão aberta com o Hibernate
			sessao = getSessaoAberta();

			// Crimando uma HQL(Hibernate Query Language) como se estivessemos criando uma NamedQuery
			final String HQL = "SELECT idio FROM ContratoVO idio ORDER BY idio.numero ASC";

			/*Criando e inicializando uma variavel responsável por criar uma Query
			com base na nossa HQL criada acima deixando-a preparada para o 
			Hibernate executa-la.*/
			Query query = sessao.createQuery( HQL );

			return (ArrayList< ContratoVO >) query.list();

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
