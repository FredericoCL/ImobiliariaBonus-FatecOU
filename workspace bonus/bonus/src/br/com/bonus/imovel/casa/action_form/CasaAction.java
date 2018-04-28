/**
 * 
 */
package br.com.bonus.imovel.casa.action_form;

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
import br.com.bonus.imovel.casa.controller.CasaService;
import br.com.bonus.imovel.casa.model.CasaVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 09:12:31
 * @version 1.0
 */
public class CasaAction extends DispatchAction{

	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_cadastro" );

	}//Fim do método abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		/*INÍCIO - INSERÇÃO */

		//Criando um VO para Simular a inserção
		CasaVO vo = new CasaVO( Integer.parseInt( meuForm.getIdCasa() ), Integer.parseInt( meuForm.getPavimentos() ), meuForm.getAreaTotal() );

		try {
			CasaService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - INSERÇÃO */

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_consulta" );

	}//Fim do método Inserir

	private void atualizarTabela( CasaForm meuForm ) throws ConsultarException {
		meuForm.getCasas().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< CasaVO > encontrados = CasaService.getInstance().consultarTodos();
		meuForm.getCasas().addAll( encontrados );

	}//Fim do Método atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		/*INÍCIO - ALTERAÇÃO */

		//Criando um VO para Simular a inserção
		CasaVO vo = new CasaVO( Integer.parseInt( meuForm.getIdCasa() ), Integer.parseInt( meuForm.getPavimentos() ), meuForm.getAreaTotal() );

		try {
			CasaService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - ALTERAÇÃO */

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_cadastro" );

	}//Fim do Método alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_consulta" );

	}//Fim do Método filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_cadastro" );

	}//Fim do Método Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em CasaForm.
		CasaForm meuForm = (CasaForm) form;

		/*INÍCIO - EXCLUSÃO */

		//Criando um VO para Simular a inserção
		CasaVO vo = new CasaVO( Integer.parseInt( meuForm.getIdCasa() ), Integer.parseInt( meuForm.getPavimentos() ), meuForm.getAreaTotal() );

		try {
			CasaService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - EXCLUSÃO */

		//Limpando os campos
		meuForm.setIdCasa( "" );
		meuForm.setPavimentos( "" );
		meuForm.setAreaTotal( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "casa_cadastro" );

	}//Fim do Método Excluir

}
