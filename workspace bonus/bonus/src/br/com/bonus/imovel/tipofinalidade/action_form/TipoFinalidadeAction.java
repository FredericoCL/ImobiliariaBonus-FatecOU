/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.action_form;

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
import br.com.bonus.imovel.tipofinalidade.controller.TipoFinalidadeService;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 12:47:59
 * @version 1.0
 */
public final class TipoFinalidadeAction extends DispatchAction{

	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em TipoFinalidadeForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_cadastro" );

	}//Fim do m�todo abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		/*IN�CIO - INSER��O */

		//Criando um VO para Simular a inser��o
		TipoFinalidadeVO vo = new TipoFinalidadeVO( Integer.parseInt( meuForm.getIdTipoFinalidade() ), meuForm.getDescricao() );

		try {
			TipoFinalidadeService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - INSER��O */

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_consulta" );

	}//Fim do m�todo Inserir

	private void atualizarTabela( TipoFinalidadeForm meuForm ) throws ConsultarException {
		meuForm.getTipoFinalidades().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< TipoFinalidadeVO > encontrados = TipoFinalidadeService.getInstance().consultarTodos();
		meuForm.getTipoFinalidades().addAll( encontrados );

	}//Fim do M�todo atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		/*IN�CIO - ALTERA��O */

		//Criando um VO para Simular a inser��o
		TipoFinalidadeVO vo = new TipoFinalidadeVO( Integer.parseInt( meuForm.getIdTipoFinalidade() ), meuForm.getDescricao() );

		try {
			TipoFinalidadeService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - ALTERA��O */

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_cadastro" );

	}//Fim do M�todo alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_consulta" );

	}//Fim do M�todo filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_cadastro" );

	}//Fim do M�todo Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoFinalidadeForm meuForm = (TipoFinalidadeForm) form;

		/*IN�CIO - EXCLUS�O */

		//Criando um VO para Simular a inser��o
		TipoFinalidadeVO vo = new TipoFinalidadeVO( Integer.parseInt( meuForm.getIdTipoFinalidade() ), meuForm.getDescricao() );

		try {
			TipoFinalidadeService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - EXCLUS�O */

		//Limpando os campos
		meuForm.setIdTipoFinalidade( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "tipo_finalidade_cadastro" );

	}//Fim do M�todo Excluir

}
