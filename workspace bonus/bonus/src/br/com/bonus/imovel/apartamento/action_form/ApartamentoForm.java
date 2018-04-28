/**
 * 
 */
package br.com.bonus.imovel.apartamento.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.imovel.apartamento.model.ApartamentoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 29/11/2013 20:38:19
 * @version 1.0
 */
public class ApartamentoForm extends ActionForm{

	private String idApartamento;
	private String andar;
	private String tipoApartamento;

	private ArrayList< ApartamentoVO > apartamentos = new ArrayList< ApartamentoVO >();

	/**
     * Método responsável por retornar o valor do atributo idApartamento.
     * @return String idApartamento - idApartamento a ser retornado(a).
     */
    public String getIdApartamento() {
    	return idApartamento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idApartamento.
     * @param String idApartamento - idApartamento a ser atribuido(a).
     */
    public void setIdApartamento( String idApartamento ) {
    	this.idApartamento = idApartamento;
    }

	/**
     * Método responsável por retornar o valor do atributo andar.
     * @return String andar - andar a ser retornado(a).
     */
    public String getAndar() {
    	return andar;
    }

	/**
     * Método responsável por atribuir o valor ao atributo andar.
     * @param String andar - andar a ser atribuido(a).
     */
    public void setAndar( String andar ) {
    	this.andar = andar;
    }

	/**
     * Método responsável por retornar o valor do atributo tipoApartamento.
     * @return String tipoApartamento - tipoApartamento a ser retornado(a).
     */
    public String getTipoApartamento() {
    	return tipoApartamento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoApartamento.
     * @param String tipoApartamento - tipoApartamento a ser atribuido(a).
     */
    public void setTipoApartamento( String tipoApartamento ) {
    	this.tipoApartamento = tipoApartamento;
    }

	/**
     * Método responsável por retornar o valor do atributo apartamentos.
     * @return ArrayList<ApartamentoVO> apartamentos - apartamentos a ser retornado(a).
     */
    public ArrayList< ApartamentoVO > getApartamentos() {
    	return apartamentos;
    }

	/**
     * Método responsável por atribuir o valor ao atributo apartamentos.
     * @param ArrayList<ApartamentoVO> apartamentos - apartamentos a ser atribuido(a).
     */
    public void setApartamentos( ArrayList< ApartamentoVO > apartamentos ) {
    	this.apartamentos = apartamentos;
    }

}
