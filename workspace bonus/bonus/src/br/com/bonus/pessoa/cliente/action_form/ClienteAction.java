/**
 * 
 */
package br.com.bonus.pessoa.cliente.action_form;

import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.bonus.endereco.endereco.controller.EnderecoService;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.pessoa.cliente.controller.ClienteService;
import br.com.bonus.pessoa.cliente.model.ClienteVO;
import br.com.bonus.telefone.telefone.controller.TelefoneService;
import br.com.bonus.utilidades.Utilidades;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 26/11/2013 09:04:41
 * @version 1.0
 */
public final class ClienteAction extends DispatchAction{
	
	public ActionForward abrirTela( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;
		
		try {
	        meuForm.setListaEnderecos( EnderecoService.getInstance().consultarTodos() );
	        meuForm.setListaTelefones( TelefoneService.getInstance().consultarTodos() );
        } catch ( ConsultarException e ) {
	        e.printStackTrace();
        }
		
		//Limpando os campos
		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_cadastro" );

	}//Fim do m�todo abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;

		/*IN�CIO - INSER��O */

		//Criando um VO para Simular a inser��o
		ClienteVO vo;
		try {
	        vo = new ClienteVO( null, meuForm.getCpf(), meuForm.getRg(), meuForm.getNome(), meuForm.getEmail(), Utilidades.formatarDataStringParaDataDate( meuForm.getDataNascimento()), meuForm.getTelefone(), meuForm.getEndereco(), meuForm.getCreci(), meuForm.getCorretor() );
			ClienteService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}catch ( ParseException e1 ) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
        }
		/*T�RMINO - INSER��O */

		//Limpando os campos
		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_consulta" );

	}//Fim do m�todo Inserir

	private void atualizarTabela( ClienteForm meuForm ) throws ConsultarException {
		meuForm.getClientes().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< ClienteVO > encontrados = ClienteService.getInstance().consultarTodos();
		meuForm.getClientes().addAll( encontrados );

	}//Fim do M�todo atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;

		/*IN�CIO - ALTERA��O */

		//Criando um VO para Simular a inser��o
		ClienteVO vo;
		try {
	        vo = new ClienteVO( meuForm.getIdCliente(), meuForm.getCpf(), meuForm.getRg(), meuForm.getNome(), meuForm.getEmail(), Utilidades.formatarDataStringParaDataDate( meuForm.getDataNascimento()), meuForm.getTelefone(), meuForm.getEndereco(), meuForm.getCreci(), meuForm.getCorretor() );
			ClienteService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}catch ( ParseException e1 ) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
        }

		/*T�RMINO - ALTERA��O */

		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_cadastro" );

	}//Fim do M�todo alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;

		//Limpando os campos
		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_consulta" );

	}//Fim do M�todo filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;

		//Limpando os campos
		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_cadastro" );

	}//Fim do M�todo Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em ClienteForm.
		ClienteForm meuForm = (ClienteForm) form;

		/*IN�CIO - EXCLUS�O */

		//Criando um VO para Simular a exclus�o
		ClienteVO vo;
		try {
	        vo = new ClienteVO( meuForm.getIdCliente(), meuForm.getCpf(), meuForm.getRg(), meuForm.getNome(), meuForm.getEmail(), Utilidades.formatarDataStringParaDataDate( meuForm.getDataNascimento()), meuForm.getTelefone(), meuForm.getEndereco(), meuForm.getCreci(), meuForm.getCorretor() );

			ClienteService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		} catch ( ParseException e1 ) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
        }

		/*T�RMINO - EXCLUS�O */

		meuForm.limparCampos();

		// Localizando e abrindo a tela cujo apelido � o informado no parametro.
		return mapping.findForward( "cliente_cadastro" );

	}//Fim do M�todo Excluir

}
