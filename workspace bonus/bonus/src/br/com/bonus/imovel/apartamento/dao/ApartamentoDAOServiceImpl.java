/**
 * 
 */
package br.com.bonus.imovel.apartamento.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.bonus.abstractdao.AbstractDAO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.apartamento.model.ApartamentoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 16:53:41
 * @version 1.0
 */
public class ApartamentoDAOServiceImpl extends AbstractDAO implements ApartamentoDAOService{

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService#inserir(br.com.bonus.imovel.apartamento.model.ApartamentoVO)
	 */
	@Override
	public void inserir( ApartamentoVO vo ) throws InserirException {
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
			vo.setIdApartamento( (Integer) sessao.save( vo ) );

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
	 * 
	 * @see br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService#alterar(br.com.bonus.imovel.apartamento.model.ApartamentoVO)
	 */
	@Override
	public void alterar( ApartamentoVO vo ) throws AlterarException {
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
	 * 
	 * @see br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService#excluir(br.com.bonus.imovel.apartamento.model.ApartamentoVO)
	 */
	@Override
	public void excluir( ApartamentoVO vo ) throws ExcluirException {
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
	 * 
	 * @see br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService#consultarPorTipoApartamento(java.lang.String)
	 */
	@Override
	public ArrayList< ApartamentoVO > consultarPorTipoApartamento( String tipoApartamento ) throws ConsultarException {
		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		  hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			/*Criando e inicializando uma variavel respons�vel por buscar a nossa 
			NamedQuery criada no VO deixando-a preparada para o Hibernate executa-la.*/
			Query query = sessao.createQuery( "Select p FROM ApartamentoVO p where p.tipoApartamento LIKE :tipoApartamento" );
			query.setString( "tipoApartamento", "%" + tipoApartamento + "%" );

			// Executando a Query retornando o casting de seu resultado.
			return (ArrayList< ApartamentoVO >) query.list();

		} catch ( Exception e ) {
			e.printStackTrace();
			throw new ConsultarException( "Erro ao consultar por Logradouro" );

		} finally {
			// Fecha a Sess�o com o BD. 
			if ( sessao != null ) {
				sessao.close();
			}//Fim do IF

		}//Fim do TRY, CATCH e FINALLY

	}//Fim do M�todo consultarPorNome

	/**
	 * Polimorfico
	 * 
	 * @see br.com.bonus.imovel.apartamento.dao.ApartamentoDAOService#consultarTodos()
	 */
	@Override
	public ArrayList< ApartamentoVO > consultarTodos() throws ConsultarException {
		/*Declarando uma variav�l que armazenar� uma Sess�o do 
		  hibernate contendo uma conex�o aberta e v�lida.*/
		Session sessao = null;

		try {
			//Pega uma Sess�o aberta com o Hibernate
			sessao = getSessaoAberta();

			// Crimando uma HQL(Hibernate Query Language) como se estivessemos criando uma NamedQuery
			final String HQL = "SELECT idio FROM ApartamentoVO idio ORDER BY idio.tipoApartamento ASC";

			/*Criando e inicializando uma variavel respons�vel por criar uma Query
			com base na nossa HQL criada acima deixando-a preparada para o 
			Hibernate executa-la.*/
			Query query = sessao.createQuery( HQL );

			return (ArrayList< ApartamentoVO >) query.list();

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
