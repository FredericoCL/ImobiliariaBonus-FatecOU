/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 05/11/2013 23:07:22
 * @version 1.0
 */
public class TipoContratoForm extends ActionForm{
	
	private String idTipoContrato;
	private String descricao;
	
	private ArrayList< TipoContratoVO > tipoContratos = new ArrayList< TipoContratoVO >();
	
	/**
     * M�todo respons�vel por retornar o valor do atributo idTipoContrato.
     * @return String idTipoContrato - idTipoContrato a ser retornado(a).
     */
    public String getIdTipoContrato() {
    	return idTipoContrato;
    }
	/**
     * M�todo respons�vel por atribuir o valor ao atributo idTipoContrato.
     * @param String idTipoContrato - idTipoContrato a ser atribuido(a).
     */
    public void setIdTipoContrato( String idTipoContrato ) {
    	this.idTipoContrato = idTipoContrato;
    }
	/**
     * M�todo respons�vel por retornar o valor do atributo descricao.
     * @return String descricao - descricao a ser retornado(a).
     */
    public String getDescricao() {
    	return descricao;
    }
	/**
     * M�todo respons�vel por atribuir o valor ao atributo descricao.
     * @param String descricao - descricao a ser atribuido(a).
     */
    public void setDescricao( String descricao ) {
    	this.descricao = descricao;
    }
    
    /**
     * 
     * M�todo respons�vel por retornar o valor do atributo tipoContratos
     *
     * @return
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 28/10/2013 10:29:58
     * @version 1.0
     */
    public final ArrayList< TipoContratoVO > getTipoContratos() {
		return tipoContratos;
	}
    
    /**
     * 
     * M�todo respons�vel por atribuir o valor ao atributo tipoContratos
     *
     * @param tipoContratos
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 28/10/2013 10:31:31
     * @version 1.0
     */
    public final void setTipoContratos( ArrayList< TipoContratoVO > tipoContratos ) {
		this.tipoContratos = tipoContratos;
	}

}
