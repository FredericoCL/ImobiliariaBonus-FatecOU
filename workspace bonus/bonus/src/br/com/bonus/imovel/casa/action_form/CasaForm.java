/**
 * 
 */
package br.com.bonus.imovel.casa.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.imovel.casa.model.CasaVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 09:08:07
 * @version 1.0
 */
public class CasaForm extends ActionForm{
	
	private String idCasa;
	private String pavimentos;
	private String areaTotal;
	
	private ArrayList< CasaVO > casas = new ArrayList< CasaVO >();

	/**
     * Método responsável por retornar o valor do atributo idCasa.
     * @return String idCasa - idCasa a ser retornado(a).
     */
    public String getIdCasa() {
    	return idCasa;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idCasa.
     * @param String idCasa - idCasa a ser atribuido(a).
     */
    public void setIdCasa( String idCasa ) {
    	this.idCasa = idCasa;
    }

	/**
     * Método responsável por retornar o valor do atributo pavimentos.
     * @return String pavimentos - pavimentos a ser retornado(a).
     */
    public String getPavimentos() {
    	return pavimentos;
    }

	/**
     * Método responsável por atribuir o valor ao atributo pavimentos.
     * @param String pavimentos - pavimentos a ser atribuido(a).
     */
    public void setPavimentos( String pavimentos ) {
    	this.pavimentos = pavimentos;
    }

	/**
     * Método responsável por retornar o valor do atributo areaTotal.
     * @return String areaTotal - areaTotal a ser retornado(a).
     */
    public String getAreaTotal() {
    	return areaTotal;
    }

	/**
     * Método responsável por atribuir o valor ao atributo areaTotal.
     * @param String areaTotal - areaTotal a ser atribuido(a).
     */
    public void setAreaTotal( String areaTotal ) {
    	this.areaTotal = areaTotal;
    }

	/**
     * Método responsável por retornar o valor do atributo casas.
     * @return ArrayList<CasaVO> casas - casas a ser retornado(a).
     */
    public ArrayList< CasaVO > getCasas() {
    	return casas;
    }

	/**
     * Método responsável por atribuir o valor ao atributo casas.
     * @param ArrayList<CasaVO> casas - casas a ser atribuido(a).
     */
    public void setCasas( ArrayList< CasaVO > casas ) {
    	this.casas = casas;
    }

}
