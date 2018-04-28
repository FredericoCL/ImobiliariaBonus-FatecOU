/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 12:41:36
 * @version 1.0
 */
public final class TipoFinalidadeForm extends ActionForm{
	
	private String idTipoFinalidade;
	private String descricao;
	
	private ArrayList< TipoFinalidadeVO > tipoFinalidades = new ArrayList< TipoFinalidadeVO >();

	/**
     * Método responsável por retornar o valor do atributo idTipoFinalidade.
     * @return String idTipoFinalidade - idTipoFinalidade a ser retornado(a).
     */
    public String getIdTipoFinalidade() {
    	return idTipoFinalidade;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idTipoFinalidade.
     * @param String idTipoFinalidade - idTipoFinalidade a ser atribuido(a).
     */
    public void setIdTipoFinalidade( String idTipoFinalidade ) {
    	this.idTipoFinalidade = idTipoFinalidade;
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
     * Método responsável por retornar o valor do atributo tipoFinalidades.
     * @return ArrayList<TipoFinalidadeVO> tipoFinalidades - tipoFinalidades a ser retornado(a).
     */
    public ArrayList< TipoFinalidadeVO > getTipoFinalidades() {
    	return tipoFinalidades;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoFinalidades.
     * @param ArrayList<TipoFinalidadeVO> tipoFinalidades - tipoFinalidades a ser atribuido(a).
     */
    public void setTipoFinalidades( ArrayList< TipoFinalidadeVO > tipoFinalidades ) {
    	this.tipoFinalidades = tipoFinalidades;
    }

}
