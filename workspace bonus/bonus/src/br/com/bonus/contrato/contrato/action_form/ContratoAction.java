/**
 * 
 */
package br.com.bonus.contrato.contrato.action_form;

import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.bonus.contrato.contrato.controller.ContratoService;
import br.com.bonus.contrato.contrato.model.ContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.utilidades.Utilidades;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 10:22:47
 * @version 1.0
 */
public class ContratoAction extends DispatchAction{
	
	/**
	 * 
	 * M�todo respons�vel por abrir a tela de TipoTelefone
	 * Para que este m�todo possa ser chamado na JSP, � necess�rio que este tenha
	 * a estrutura abaixo:
	 * public ActionForward nome_do_metodo( ActionMapping mapping,
	 * ActionForm form,
	 * HttpServletRequest request,
	 * HttpServletResponse response){
	 * return mapping.findForward("nome da tela mapeada no struts-config");
	 * }
	 * 
	 * @param ActionMapping mapping - Respons�vel por localizar e abrir a tela cujo nome
	 *        foi informado como parametro ao m�todo "findForward".
	 * @param ActionForm form - Respons�vel por conter todos os atributos referentes a
	 *        tela preenchidos. Isso apenas se o formulario for submetido.
	 * @param HttpServletRequest request - Respons�vel por possibiliar a captura de dados
	 *        do meio WEB.
	 * @param HttpServletResponse response - Respons�vel por possibiliar o envio de dados
	 *        ao meio WEB.
	 * @return ActionForward - Tela a ser aberta
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 28/10/2013 10:37:46
	 * @version 1.0
	 */
	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {
		
		// Pegando o ActionForm e o retransformando(Especializando) em ContratoForm.
		ContratoForm meuForm = (ContratoForm) form;
		
		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );
		
		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_cadastro" );
		
	}//Fim do m�todo abrirTela
	
	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		ContratoForm meuForm = (ContratoForm) form;

		/*IN�CIO - INSER��O */

		//Criando um VO para Simular a inser��o
		ContratoVO vo;
        try {
	        vo = new ContratoVO(  null, Utilidades.formatarDataStringParaDataDate( meuForm.getDataInicio()), Utilidades.formatarDataStringParaDataDate( meuForm.getDataFim()), meuForm.getTipoContrato(),
	        		 meuForm.getCliente(), meuForm.getImovel());
		
			ContratoService.getInstance().inserir( vo );

			atualizarTabela( meuForm );
		} catch ( ParseException e1 ) {
	        e1.printStackTrace();
		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - INSER��O */

		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_consulta" );

	}//Fim do m�todo Inserir
	
	private void atualizarTabela( ContratoForm meuForm ) throws ConsultarException {
		meuForm.getContratos().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< ContratoVO > encontrados = ContratoService.getInstance().consultarTodos();
		meuForm.getContratos().addAll( encontrados );

	}//Fim do M�todo atualizarTabela
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		ContratoForm meuForm = (ContratoForm) form;

		/*IN�CIO - ALTERA��O */

		//Criando um VO para Simular a inser��o
		
		ContratoVO vo;
	try{
			vo = new ContratoVO( Integer.valueOf( meuForm.getIdContrato() ), Utilidades.formatarDataStringParaDataDate( meuForm.getDataInicio()), Utilidades.formatarDataStringParaDataDate( meuForm.getDataFim()), meuForm.getTipoContrato(),
        		meuForm.getCliente(), meuForm.getImovel());
		
		ContratoService.getInstance().alterar( vo );

		atualizarTabela( meuForm );
	} catch ( ParseException e1 ) {
        e1.printStackTrace();
	} catch ( AlterarException e ) {
		e.printStackTrace();
	} catch ( ConsultarException e ) {
		e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - ALTERA��O */

		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_cadastro" );

	}//Fim do M�todo alterar
	
	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		ContratoForm meuForm = (ContratoForm) form;

		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_consulta" );

	}//Fim do M�todo filtrar
	
	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		ContratoForm meuForm = (ContratoForm) form;

		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_cadastro" );

	}//Fim do M�todo Limpar
	
	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		ContratoForm meuForm = (ContratoForm) form;

		/*IN�CIO - EXCLUS�O */

		//Criando um VO para Simular a inser��o
		ContratoVO vo;
	try{
		vo = new ContratoVO();
		vo.setIdContrato( Integer.valueOf( meuForm.getIdContrato() ));
		
		ContratoService.getInstance().excluir( vo );

		atualizarTabela( meuForm );
	} catch ( ExcluirException e ) {
		e.printStackTrace();
	} catch ( ConsultarException e ) {
		e.printStackTrace();
		}//Fim do TRY e CATCH

		/*T�RMINO - EXCLUS�O */

		//Limpando os campos
		meuForm.setIdContrato( "" );
		meuForm.setDataInicio( "" );
		meuForm.setDataFim( "" );

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "contrato_cadastro" );
		
	}//Fim do M�todo Excluir

}
