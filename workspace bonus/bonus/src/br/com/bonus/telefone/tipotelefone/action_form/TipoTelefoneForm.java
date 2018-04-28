/**
 * 
 */
package br.com.bonus.telefone.tipotelefone.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 15:33:31
 * @version 1.0
 */
public final class TipoTelefoneForm extends ActionForm{
	
	private String idTipoTelefone;
	private String descricao;
	
	private ArrayList< TipoTelefoneVO > tipoTelefones = new ArrayList< TipoTelefoneVO >();
	
	/**
     * Método responsável por retornar o valor do atributo idTipoTelefone.
     * @return String idTipoTelefone - idTipoTelefone a ser retornado(a).
     */
    public String getIdTipoTelefone() {
    	return idTipoTelefone;
    }
	/**
     * Método responsável por atribuir o valor ao atributo idTipoTelefone.
     * @param String idTipoTelefone - idTipoTelefone a ser atribuido(a).
     */
    public void setIdTipoTelefone( String idTipoTelefone ) {
    	this.idTipoTelefone = idTipoTelefone;
    }
	/**
     * Método responsável por retornar o valor do atributo descricao.
     * @return String descricao - descricao a ser retornado(a).
     */
    public String getDescricao() {
    	return descricao;
    }
	/**
     * Método responsável por atribuir o valor ao atributo descricao.
     * @param String descricao - descricao a ser atribuido(a).
     */
    public void setDescricao( String descricao ) {
    	this.descricao = descricao;
    }
    
    /**
     * 
     * Método responsável por retornar o valor do atributo tipoTelefones
     *
     * @return
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 28/10/2013 10:29:58
     * @version 1.0
     */
    public final ArrayList< TipoTelefoneVO > getTipoTelefones() {
		return tipoTelefones;
	}
    
    /**
     * 
     * Método responsável por atribuir o valor ao atributo tipoTelefones
     *
     * @param tipoTelefones
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 28/10/2013 10:31:31
     * @version 1.0
     */
    public final void setTipoTelefones( ArrayList< TipoTelefoneVO > tipoTelefones ) {
		this.tipoTelefones = tipoTelefones;
	}

}
