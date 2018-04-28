/**
 * 
 */
package br.com.bonus.telefone.telefone.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.sun.org.apache.bcel.internal.generic.NEW;

import br.com.bonus.telefone.telefone.model.TelefoneVO;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 19:22:21
 * @version 1.0
 */
public final class TelefoneForm extends ActionForm{
	
	private String IdTelefone;
	private String ddd;
	private String numero;
	private String ramal;
	private TipoTelefoneVO tipoTelefone;
	
	private ArrayList< TelefoneVO > telefones = new ArrayList< TelefoneVO >();

	/**
     * Método responsável por retornar o valor do atributo idTelefone.
     * @return String IdTelefone - IdTelefone a ser retornado(a).
     */
    public String getIdTelefone() {
    	return IdTelefone;
    }

	/**
     * Método responsável por atribuir o valor ao atributo IdTipoTelefone.
     * @param String IdTelefone - IdTelefone a ser atribuido(a).
     */
    public void setIdTelefone( String idTelefone ) {
    	IdTelefone = idTelefone;
    }

	/**
     * Método responsável por retornar o valor do atributo ddd.
     * @return String ddd - ddd a ser retornado(a).
     */
    public String getDdd() {
    	return ddd;
    }

	/**
     * Método responsável por atribuir o valor ao atributo ddd.
     * @param String ddd - ddd a ser atribuido(a).
     */
    public void setDdd( String ddd ) {
    	this.ddd = ddd;
    }

	/**
     * Método responsável por retornar o valor do atributo numero.
     * @return String numero - numero a ser retornado(a).
     */
    public String getNumero() {
    	return numero;
    }

	/**
     * Método responsável por atribuir o valor ao atributo numero.
     * @param String numero - numero a ser atribuido(a).
     */
    public void setNumero( String numero ) {
    	this.numero = numero;
    }

	/**
     * Método responsável por retornar o valor do atributo ramal.
     * @return String ramal - ramal a ser retornado(a).
     */
    public String getRamal() {
    	return ramal;
    }

	/**
     * Método responsável por atribuir o valor ao atributo ramal.
     * @param String ramal - ramal a ser atribuido(a).
     */
    public void setRamal( String ramal ) {
    	this.ramal = ramal;
    }

	/**
     * Método responsável por retornar o valor do atributo tipoTelefone.
     * @return TipoTelefoneVO tipoTelefone - tipoTelefone a ser retornado(a).
     */
    public TipoTelefoneVO getTipoTelefone() {
    	return tipoTelefone;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoTelefone.
     * @param TipoTelefoneVO tipoTelefone - tipoTelefone a ser atribuido(a).
     */
    public void setTipoTelefone( TipoTelefoneVO tipoTelefone ) {
    	this.tipoTelefone = tipoTelefone;
    }

	/**
     * Método responsável por retornar o valor do atributo telefones.
     * @return ArrayList<TelefoneVO> telefones - telefones a ser retornado(a).
     */
    public ArrayList< TelefoneVO > getTelefones() {
    	return telefones;
    }

	/**
     * Método responsável por atribuir o valor ao atributo telefones.
     * @param ArrayList<TelefoneVO> telefones - telefones a ser atribuido(a).
     */
    public void setTelefones( ArrayList< TelefoneVO > telefones ) {
    	this.telefones = telefones;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( IdTelefone == null ) ? 0 : IdTelefone.hashCode() );
	    result = prime * result + ( ( ddd == null ) ? 0 : ddd.hashCode() );
	    result = prime * result + ( ( numero == null ) ? 0 : numero.hashCode() );
	    result = prime * result + ( ( ramal == null ) ? 0 : ramal.hashCode() );
	    result = prime * result + ( ( telefones == null ) ? 0 : telefones.hashCode() );
	    result = prime * result + ( ( tipoTelefone == null ) ? 0 : tipoTelefone.hashCode() );
	    return result;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals( Object obj ) {
	    if ( this == obj )
		    return true;
	    if ( obj == null )
		    return false;
	    if ( getClass() != obj.getClass() )
		    return false;
	    TelefoneForm other = (TelefoneForm) obj;
	    if ( IdTelefone == null ) {
		    if ( other.IdTelefone != null )
			    return false;
	    } else if ( !IdTelefone.equals( other.IdTelefone ) )
		    return false;
	    if ( ddd == null ) {
		    if ( other.ddd != null )
			    return false;
	    } else if ( !ddd.equals( other.ddd ) )
		    return false;
	    if ( numero == null ) {
		    if ( other.numero != null )
			    return false;
	    } else if ( !numero.equals( other.numero ) )
		    return false;
	    if ( ramal == null ) {
		    if ( other.ramal != null )
			    return false;
	    } else if ( !ramal.equals( other.ramal ) )
		    return false;
	    if ( telefones == null ) {
		    if ( other.telefones != null )
			    return false;
	    } else if ( !telefones.equals( other.telefones ) )
		    return false;
	    if ( tipoTelefone == null ) {
		    if ( other.tipoTelefone != null )
			    return false;
	    } else if ( !tipoTelefone.equals( other.tipoTelefone ) )
		    return false;
	    return true;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "TelefoneForm [getIdTelefone()=" + getIdTelefone() + ", getDdd()=" + getDdd() + ", getNumero()=" + getNumero() + ", getRamal()=" + getRamal() + ", getTipoTelefone()=" + getTipoTelefone() + ", getTelefones()=" + getTelefones() + ", hashCode()=" + hashCode() + "]";
    }

}
