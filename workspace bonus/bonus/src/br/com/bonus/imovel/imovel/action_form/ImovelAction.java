/**
 * 
 */
package br.com.bonus.imovel.imovel.action_form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.imovel.controller.ImovelService;
import br.com.bonus.imovel.imovel.model.ImovelVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:48:31
 * @version 1.0
 */
public class ImovelAction extends DispatchAction{

	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_cadastro" );

	}//Fim do método abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		/*INÍCIO - INSERÇÃO */

		//Criando um VO para Simular a inserção
		ImovelVO vo = new ImovelVO( null, meuForm.getValor(), Integer.parseInt( meuForm.getDormitorio() ), Integer.parseInt( meuForm.getSuite() ), Integer.parseInt( meuForm.getVagaGaragem() ), meuForm.getDescricao(), meuForm.getAreaConstruida(), meuForm.getCasa(), meuForm.getApartamento(), meuForm.getTipoNegociacao(), meuForm.getTipoFinalidade() );

		try {
			ImovelService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - INSERÇÃO */

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_consulta" );

	}//Fim do método Inserir

	private void atualizarTabela( ImovelForm meuForm ) throws ConsultarException {
		meuForm.getImoveis().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< ImovelVO > encontrados = ImovelService.getInstance().consultarTodos();
		meuForm.getImoveis().addAll( encontrados );

	}//Fim do Método atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		/*INÍCIO - ALTERAÇÃO */

		//Criando um VO para Simular a inserção
		ImovelVO vo = new ImovelVO( Integer.parseInt( meuForm.getIdImovel() ), meuForm.getValor(), Integer.parseInt( meuForm.getDormitorio() ), Integer.parseInt( meuForm.getSuite() ), Integer.parseInt( meuForm.getVagaGaragem() ), meuForm.getDescricao(), meuForm.getAreaConstruida(), meuForm.getCasa(), meuForm.getApartamento(), meuForm.getTipoNegociacao(), meuForm.getTipoFinalidade()  );

		try {
			ImovelService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - ALTERAÇÃO */

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_cadastro" );

	}//Fim do Método alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_consulta" );

	}//Fim do Método filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_cadastro" );

	}//Fim do Método Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ImovelForm.
		ImovelForm meuForm = (ImovelForm) form;

		/*INÍCIO - EXCLUSÃO */

		//Criando um VO para Simular a inserção
		ImovelVO vo = new ImovelVO( Integer.parseInt( meuForm.getIdImovel() ), meuForm.getValor(), Integer.parseInt( meuForm.getDormitorio() ), Integer.parseInt( meuForm.getSuite() ), Integer.parseInt( meuForm.getVagaGaragem() ), meuForm.getDescricao(), meuForm.getAreaConstruida(), meuForm.getCasa(), meuForm.getApartamento(), meuForm.getTipoNegociacao(), meuForm.getTipoFinalidade()  );

		try {
			ImovelService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - EXCLUSÃO */

		//Limpando os campos
		meuForm.setIdImovel( "" );
		meuForm.setValor( "" );
		meuForm.setDormitorio( "" );
		meuForm.setSuite( "" );
		meuForm.setVagaGaragem( "" );
		meuForm.setCasa( null );
		meuForm.setApartamento( null );
		meuForm.setTipoNegociacao( null );
		meuForm.setTipoFinalidade( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "imovel_cadastro" );

	}//Fim do Método Excluir

}
