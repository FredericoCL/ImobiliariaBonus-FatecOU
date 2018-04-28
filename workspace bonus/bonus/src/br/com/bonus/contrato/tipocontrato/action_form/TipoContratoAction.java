/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.action_form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.bonus.contrato.tipocontrato.controller.TipoContratoService;
import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 23:24:17
 * @version 1.0
 */
public final class TipoContratoAction extends DispatchAction{
	
	/**
	 * 
	 * Método responsável por abrir a tela de TipoContrato
	 * Para que este método possa ser chamado na JSP, é necessário que este tenha
	 * a estrutura abaixo:
	 * public ActionForward nome_do_metodo( ActionMapping mapping,
	 * ActionForm form,
	 * HttpServletRequest request,
	 * HttpServletResponse response){
	 * return mapping.findForward("nome da tela mapeada no struts-config");
	 * }
	 * 
	 * @param ActionMapping mapping - Responsável por localizar e abrir a tela cujo nome
	 *        foi informado como parametro ao método "findForward".
	 * @param ActionForm form - Responsável por conter todos os atributos referentes a
	 *        tela preenchidos. Isso apenas se o formulario for submetido.
	 * @param HttpServletRequest request - Responsável por possibiliar a captura de dados
	 *        do meio WEB.
	 * @param HttpServletResponse response - Responsável por possibiliar o envio de dados
	 *        ao meio WEB.
	 * @return ActionForward - Tela a ser aberta
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 28/10/2013 10:37:46
	 * @version 1.0
	 */
	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {
		
		// Pegando o ActionForm e o retransformando(Especializando) em TipoContratoForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;
		
		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );
		
		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_cadastro" );
		
	}//Fim do método abrirTela
	
	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;

		/*INÍCIO - INSERÇÃO */

		//Criando um VO para Simular a inserção
		TipoContratoVO vo = new TipoContratoVO(  Integer.parseInt (meuForm.getIdTipoContrato() ), meuForm.getDescricao() ) ;

		try {
			TipoContratoService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - INSERÇÃO */

		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_consulta" );

	}//Fim do método Inserir
	
	private void atualizarTabela( TipoContratoForm meuForm ) throws ConsultarException {
		meuForm.getTipoContratos().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< TipoContratoVO > encontrados = TipoContratoService.getInstance().consultarTodos();
		meuForm.getTipoContratos().addAll( encontrados );

	}//Fim do Método atualizarTabela
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;

		/*INÍCIO - ALTERAÇÃO */

		//Criando um VO para Simular a inserção
		TipoContratoVO vo = new TipoContratoVO( Integer.parseInt (meuForm.getIdTipoContrato() ), meuForm.getDescricao() );

		try {
			TipoContratoService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - ALTERAÇÃO */

		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_cadastro" );

	}//Fim do Método alterar
	
	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;

		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_consulta" );

	}//Fim do Método filtrar
	
	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;

		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_cadastro" );

	}//Fim do Método Limpar
	
	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		TipoContratoForm meuForm = (TipoContratoForm) form;

		/*INÍCIO - EXCLUSÃO */

		//Criando um VO para Simular a inserção
		TipoContratoVO vo = new TipoContratoVO( Integer.parseInt (meuForm.getIdTipoContrato() ), meuForm.getDescricao() );

		try {
			TipoContratoService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - EXCLUSÃO */

		//Limpando os campos
		meuForm.setIdTipoContrato( "" );
		meuForm.setDescricao( "" );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "tipo_contrato_cadastro" );

	}//Fim do Método Excluir

}
