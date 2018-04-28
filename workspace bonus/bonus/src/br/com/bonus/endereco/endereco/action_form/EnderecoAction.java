/**
 * 
 */
package br.com.bonus.endereco.endereco.action_form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.bonus.endereco.endereco.controller.EnderecoService;
import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.endereco.estado.controller.EstadoService;
import br.com.bonus.endereco.municipio.controller.MunicipioService;
import br.com.bonus.endereco.pais.controller.PaisService;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 10:17:31
 * @version 1.0
 */
public class EnderecoAction extends DispatchAction{

	/**
	 * 
	 * Método responsável por abrir a tela de Endereco
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

		// Pegando o ActionForm e o retransformando(Especializando) em EnderecoForm.
		EnderecoForm meuForm = (EnderecoForm) form;
		try {

			//Limpando os campos
			meuForm.setIdEndereco( "" );
			meuForm.setLogradouro( "" );
			meuForm.setNumero( "" );
			meuForm.setBairro( "" );
			meuForm.setCep( "" );
			meuForm.setComplemento( "" );
		
	        meuForm.setListaMunicipios( MunicipioService.getInstance().consultarTodos() );
	        meuForm.setListaEstados( EstadoService.getInstance().consultarTodos() );
	        meuForm.setListaPaises( PaisService.getInstance().consultarTodos() );
        } catch ( ConsultarException e ) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_cadastro" );

	}//Fim do método abrirTela

	public ActionForward inserir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		EnderecoForm meuForm = (EnderecoForm) form;
		
		meuForm.getEstado().setIdEstado( meuForm.getCodEstado() );
		meuForm.getPais().setIdPais( meuForm.getCodPais() );
		meuForm.getMunicipio().setIdMunicipio( meuForm.getCodMunicipio() );

		/*INÍCIO - INSERÇÃO */

		//Criando um VO para Simular a inserção
		EnderecoVO vo = new EnderecoVO( null, meuForm.getLogradouro(), meuForm.getNumero(), meuForm.getBairro(), meuForm.getCep(), meuForm.getComplemento(), meuForm.getPais(), meuForm.getEstado(), meuForm.getMunicipio() );

		try {
			EnderecoService.getInstance().inserir( vo );

			atualizarTabela( meuForm );

		} catch ( InserirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - INSERÇÃO */

		//Limpando os campos
		meuForm.setIdEndereco( "" );
		meuForm.setLogradouro( "" );
		meuForm.setNumero( "" );
		meuForm.setBairro( "" );
		meuForm.setCep( "" );
		meuForm.setComplemento( "" );
		meuForm.setPais( null );
		meuForm.setEstado( null );
		meuForm.setMunicipio( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_consulta" );

	}//Fim do método Inserir

	private void atualizarTabela( EnderecoForm meuForm ) throws ConsultarException {
		meuForm.getEnderecos().clear();
		//Preenchendo a lista de Idiomar
		ArrayList< EnderecoVO > encontrados = EnderecoService.getInstance().consultarTodos();
		meuForm.getEnderecos().addAll( encontrados );

	}//Fim do Método atualizarTabela

	public ActionForward alterar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		EnderecoForm meuForm = (EnderecoForm) form;

		/*INÍCIO - ALTERAÇÃO */
		meuForm.getEstado().setIdEstado( meuForm.getCodEstado() );
		meuForm.getPais().setIdPais( meuForm.getCodPais() );
		meuForm.getMunicipio().setIdMunicipio( meuForm.getCodMunicipio() );

		//Criando um VO para Simular a inserção
		EnderecoVO vo = new EnderecoVO( Integer.parseInt( meuForm.getIdEndereco() ), meuForm.getLogradouro(), meuForm.getNumero(), meuForm.getBairro(), meuForm.getCep(), meuForm.getComplemento(), meuForm.getPais(), meuForm.getEstado(), meuForm.getMunicipio() );

		try {
			EnderecoService.getInstance().alterar( vo );

			atualizarTabela( meuForm );

		} catch ( AlterarException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - ALTERAÇÃO */

		//Limpando os campos
		meuForm.setIdEndereco( "" );
		meuForm.setLogradouro( "" );
		meuForm.setNumero( "" );
		meuForm.setBairro( "" );
		meuForm.setCep( "" );
		meuForm.setComplemento( "" );
		meuForm.setPais( null );
		meuForm.setEstado( null );
		meuForm.setMunicipio( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_cadastro" );

	}//Fim do Método alterar

	public ActionForward filtrar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		EnderecoForm meuForm = (EnderecoForm) form;

		//Limpando os campos
		meuForm.setIdEndereco( "" );
		meuForm.setLogradouro( "" );
		meuForm.setNumero( "" );
		meuForm.setBairro( "" );
		meuForm.setCep( "" );
		meuForm.setComplemento( "" );
		meuForm.setPais( null );
		meuForm.setEstado( null );
		meuForm.setMunicipio( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_consulta" );

	}//Fim do Método filtrar

	public ActionForward limpar( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		EnderecoForm meuForm = (EnderecoForm) form;

		//Limpando os campos
		meuForm.setIdEndereco( "" );
		meuForm.setLogradouro( "" );
		meuForm.setNumero( "" );
		meuForm.setBairro( "" );
		meuForm.setCep( "" );
		meuForm.setComplemento( "" );
		meuForm.setPais( null );
		meuForm.setEstado( null );
		meuForm.setMunicipio( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_cadastro" );

	}//Fim do Método Limpar

	public ActionForward excluir( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response ) {

		// Pegando o ActionForm e o retransformando(Especializando) em IdiomaForm.
		EnderecoForm meuForm = (EnderecoForm) form;

		/*INÍCIO - EXCLUSÃO */
		meuForm.getEstado().setIdEstado( meuForm.getCodEstado() );
		meuForm.getPais().setIdPais( meuForm.getCodPais() );
		meuForm.getMunicipio().setIdMunicipio( meuForm.getCodMunicipio() );
		
		//Criando um VO para Simular a inserção
		EnderecoVO vo = new EnderecoVO( Integer.parseInt( meuForm.getIdEndereco() ), meuForm.getLogradouro(), meuForm.getNumero(), meuForm.getBairro(), meuForm.getCep(), meuForm.getComplemento(), meuForm.getPais(), meuForm.getEstado(), meuForm.getMunicipio() );

		try {
			EnderecoService.getInstance().excluir( vo );

			atualizarTabela( meuForm );

		} catch ( ExcluirException e ) {
			e.printStackTrace();
		} catch ( ConsultarException e ) {
			e.printStackTrace();
		}//Fim do TRY e CATCH

		/*TÉRMINO - EXCLUSÃO */

		//Limpando os campos
		meuForm.setIdEndereco( "" );
		meuForm.setLogradouro( "" );
		meuForm.setNumero( "" );
		meuForm.setBairro( "" );
		meuForm.setCep( "" );
		meuForm.setComplemento( "" );
		meuForm.setPais( null );
		meuForm.setEstado( null );
		meuForm.setMunicipio( null );

		// Localizando e abrindo a tela cujo apelido é o informado no parametro.
		return mapping.findForward( "endereco_cadastro" );

	}//Fim do Método Excluir

}
