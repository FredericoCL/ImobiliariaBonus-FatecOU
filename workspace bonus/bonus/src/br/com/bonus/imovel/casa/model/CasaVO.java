/**
 * 
 */
package br.com.bonus.imovel.casa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 08:48:54
 * @version 1.0
 */
@Entity
@Table( name = "casa", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_casa", "pavimentos", "area_total" } ) )
public class CasaVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_casa" )
	private Integer idCasa;
	
	@Column( name = "pavimentos", nullable = true, length = 2 )
	private Integer pavimentos;
	
	@Column( name = "area_total", nullable = true, length = 255 )
	private String areaTotal;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 09:06:58
	 * @version 1.0
	 */
	public CasaVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idCasa
     * @param pavimentos
     * @param areaTotal
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 27/11/2013 08:50:37
     * @version 1.0
     */
    public CasaVO( Integer idCasa, Integer pavimentos, String areaTotal ){
	    super();
	    setIdCasa ( idCasa );
	    setPavimentos ( pavimentos );
	    setAreaTotal ( areaTotal );
    }
	/**
     * Método responsável por retornar o valor do atributo idCasa.
     * @return Integer idCasa - idCasa a ser retornado(a).
     */
    public Integer getIdCasa() {
    	return idCasa;
    }
	/**
     * Método responsável por atribuir o valor ao atributo idCasa.
     * @param Integer idCasa - idCasa a ser atribuido(a).
     */
    public void setIdCasa( Integer idCasa ) {
    	this.idCasa = idCasa;
    }
	/**
     * Método responsável por retornar o valor do atributo pavimentos.
     * @return Integer pavimentos - pavimentos a ser retornado(a).
     */
    public Integer getPavimentos() {
    	return pavimentos;
    }
	/**
     * Método responsável por atribuir o valor ao atributo pavimentos.
     * @param Integer pavimentos - pavimentos a ser atribuido(a).
     */
    public void setPavimentos( Integer pavimentos ) {
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
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( areaTotal == null ) ? 0 : areaTotal.hashCode() );
	    result = prime * result + ( ( idCasa == null ) ? 0 : idCasa.hashCode() );
	    result = prime * result + ( ( pavimentos == null ) ? 0 : pavimentos.hashCode() );
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
	    CasaVO other = (CasaVO) obj;
	    if ( areaTotal == null ) {
		    if ( other.areaTotal != null )
			    return false;
	    } else if ( !areaTotal.equals( other.areaTotal ) )
		    return false;
	    if ( idCasa == null ) {
		    if ( other.idCasa != null )
			    return false;
	    } else if ( !idCasa.equals( other.idCasa ) )
		    return false;
	    if ( pavimentos == null ) {
		    if ( other.pavimentos != null )
			    return false;
	    } else if ( !pavimentos.equals( other.pavimentos ) )
		    return false;
	    return true;
    }
	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "CasaVO [getIdCasa()=" + getIdCasa() + ", getPavimentos()=" + getPavimentos() + ", getAreaTotal()=" + getAreaTotal() + ", hashCode()=" + hashCode() + "]";
    }

}
