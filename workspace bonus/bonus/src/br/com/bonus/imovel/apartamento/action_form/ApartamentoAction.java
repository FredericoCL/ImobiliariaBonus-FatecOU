/**
 * 
 */
package br.com.bonus.imovel.apartamento.action_form;

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
import br.com.bonus.imovel.apartamento.controller.ApartamentoService;
import br.com.bonus.imovel.apartamento.model.ApartamentoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 20:54:23
 * @version 1.0
 */
public class ApartamentoAction extends DispatchAction{

	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_cadastro" );

	}//Fim do m�todo abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		/*IN�CIO - INSER��O */

		//Criando um VO para Simular a inser��o
		ApartamentoVO vo = new ApartamentoVO( Integer.parseInt( meuForm.getIdApartamento() ), Integer.parseInt( meuForm.getAndar() ), meuForm.getTipoApartamento() );

		try {
			ApartamentoService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - INSER��O */

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_consulta" );

	}//Fim do m�todo Inserir

	private void atualizarTabela( ApartamentoForm meuForm ) throws ConsultarException {
		meuForm.getApartamentos().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< ApartamentoVO > encontrados = ApartamentoService.getInstance().consultarTodos();
		meuForm.getApartamentos().addAll( encontrados );

	}//Fim do M�todo atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		/*IN�CIO - ALTERA��O */

		//Criando um VO para Simular a inser��o
		ApartamentoVO vo = new ApartamentoVO( Integer.parseInt( meuForm.getIdApartamento() ), Integer.parseInt( meuForm.getAndar() ), meuForm.getTipoApartamento() );

		try {
			ApartamentoService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - ALTERA��O */

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_cadastro" );

	}//Fim do M�todo alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_consulta" );

	}//Fim do M�todo filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_cadastro" );

	}//Fim do M�todo Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ApartamentoForm.
		ApartamentoForm meuForm = (ApartamentoForm) form;

		/*IN�CIO - EXCLUS�O */

		//Criando um VO para Simular a inser��o
		ApartamentoVO vo = new ApartamentoVO( Integer.parseInt( meuForm.getIdApartamento() ), Integer.parseInt( meuForm.getAndar() ), meuForm.getTipoApartamento() );

		try {
			ApartamentoService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - EXCLUS�O */

		//Limpando os campos
		meuForm.setIdApartamento( "" );
		meuForm.setAndar( "" );
		meuForm.setTipoApartamento( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "apartamento_cadastro" );

	}//Fim do M�todo Excluir

}
