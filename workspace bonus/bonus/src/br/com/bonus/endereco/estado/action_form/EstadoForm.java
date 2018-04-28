/**
 * 
 */
package br.com.bonus.endereco.estado.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.endereco.estado.model.EstadoVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 06/11/2013 23:10:25
 * @version 1.0
 */
public final class EstadoForm extends ActionForm{

	private String idEstado;
	private String descricao;

	private ArrayList< EstadoVO > estados = new ArrayList< EstadoVO >();

	/**
	 * M�todo respons�vel por retornar o valor do atributo idEstado.
	 * 
	 * @return String idEstado - idEstado a ser retornado(a).
	 */
	public String getIdEstado() {
		return idEstado;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo idEstado.
	 * 
	 * @param String idEstado - idEstado a ser atribuido(a).
	 */
	public void setIdEstado( String idEstado ) {
		this.idEstado = idEstado;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo descricao.
	 * 
	 * @return String descricao - descricao a ser retornado(a).
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo descricao.
	 * 
	 * @param String descricao - descricao a ser atribuido(a).
	 */
	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	/**
	 * M�todo respons�vel por retornar o valor do atributo estados.
	 * 
	 * @return ArrayList<EstadoVO> estados - estados a ser retornado(a).
	 */
	public ArrayList< EstadoVO > getEstados() {
		return estados;
	}

	/**
	 * M�todo respons�vel por atribuir o valor ao atributo estados.
	 * 
	 * @param ArrayList<EstadoVO> estados - estados a ser atribuido(a).
	 */
	public void setEstados( ArrayList< EstadoVO > estados ) {
		this.estados = estados;
	}

}
