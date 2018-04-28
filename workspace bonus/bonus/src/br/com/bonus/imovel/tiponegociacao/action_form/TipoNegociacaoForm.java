/**
 * 
 */
package br.com.bonus.imovel.tiponegociacao.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 08:54:59
 * @version 1.0
 */
public final class TipoNegociacaoForm extends ActionForm{
	
	private String idTipoNegociacao;
	private String descricao;
	
	private ArrayList< TipoNegociacaoVO > tipoNegociacoes = new ArrayList< TipoNegociacaoVO >();

	/**
     * Método responsável por retornar o valor do atributo idTipoNegociacao.
     * @return String idTipoNegociacao - idTipoNegociacao a ser retornado(a).
     */
    public String getIdTipoNegociacao() {
    	return idTipoNegociacao;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idTipoNegociacao.
     * @param String idTipoNegociacao - idTipoNegociacao a ser atribuido(a).
     */
    public void setIdTipoNegociacao( String idTipoNegociacao ) {
    	this.idTipoNegociacao = idTipoNegociacao;
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
     * Método responsável por retornar o valor do atributo tipoTelefones.
     * @return ArrayList<TipoNegociacaoVO> tipoTelefones - tipoTelefones a ser retornado(a).
     */
    public ArrayList< TipoNegociacaoVO > getTipoNegociacoes() {
    	return tipoNegociacoes;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoTelefones.
     * @param ArrayList<TipoNegociacaoVO> tipoTelefones - tipoTelefones a ser atribuido(a).
     */
    public void setTipoTelefones( ArrayList< TipoNegociacaoVO > tipoNegociacoes ) {
    	this.tipoNegociacoes = tipoNegociacoes;
    }

}
