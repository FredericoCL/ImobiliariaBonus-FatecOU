/**
 * 
 */
package br.com.bonus.endereco.municipio.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.endereco.municipio.model.MunicipioVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 23:13:00
 * @version 1.0
 */
public final class MunicipioForm extends ActionForm{

	private String idMunicipio;
	private String descricao;

	private ArrayList< MunicipioVO > municipios = new ArrayList< MunicipioVO >();

	/**
	 * Método responsável por retornar o valor do atributo idMunicipio.
	 * 
	 * @return String idMunicipio - idMunicipio a ser retornado(a).
	 */
	public String getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo idMunicipio.
	 * 
	 * @param String idMunicipio - idMunicipio a ser atribuido(a).
	 */
	public void setIdMunicipio( String idMunicipio ) {
		this.idMunicipio = idMunicipio;
	}

	/**
	 * Método responsável por retornar o valor do atributo descricao.
	 * 
	 * @return String descricao - descricao a ser retornado(a).
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo descricao.
	 * 
	 * @param String descricao - descricao a ser atribuido(a).
	 */
	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	/**
	 * Método responsável por retornar o valor do atributo municipios.
	 * 
	 * @return ArrayList<MunicipioVO> municipios - municipios a ser retornado(a).
	 */
	public ArrayList< MunicipioVO > getMunicipios() {
		return municipios;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo municipios.
	 * 
	 * @param ArrayList<MunicipioVO> municipios - municipios a ser atribuido(a).
	 */
	public void setMunicipios( ArrayList< MunicipioVO > municipios ) {
		this.municipios = municipios;
	}

}
