/**
 * 
 */
package br.com.bonus.endereco.pais.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.endereco.pais.model.PaisVO;


/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 08:46:38
 * @version 1.0
 */
public final class PaisForm extends ActionForm{
	
	private String idPais;
	private String descricao;
	
	private ArrayList< PaisVO > paises = new ArrayList< PaisVO >();

	/**
     * Método responsável por retornar o valor do atributo idPais.
     * @return String idPais - idPais a ser retornado(a).
     */
    public String getIdPais() {
    	return idPais;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idPais.
     * @param String idPais - idPais a ser atribuido(a).
     */
    public void setIdPais( String idPais ) {
    	this.idPais = idPais;
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
     * Método responsável por retornar o valor do atributo paises.
     * @return ArrayList<PaisVO> paises - paises a ser retornado(a).
     */
    public ArrayList< PaisVO > getPaises() {
    	return paises;
    }

	/**
     * Método responsável por atribuir o valor ao atributo paises.
     * @param ArrayList<PaisVO> paises - paises a ser atribuido(a).
     */
    public void setPaises( ArrayList< PaisVO > paises ) {
    	this.paises = paises;
    }

}
