/**
 * 
 */
package br.com.bonus.imovel.apartamento.model;

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
 * @since 27/11/2013 09:20:24
 * @version 1.0
 */
@Entity
@Table( name = "apartamento", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_apartamento", "andar", "tipo_apartamento" } ) )
public class ApartamentoVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_apartamento" )
	private Integer idApartamento;
	
	@Column( name = "andar", nullable = true, length = 2 )
	private Integer andar;
	
	@Column( name = "tipo_apartamento", nullable = true, length = 255 )
	private String tipoApartamento;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 27/11/2013 09:22:34
	 * @version 1.0
	 */
	public ApartamentoVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idApartamento
     * @param andar
     * @param tipoApartamento
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 27/11/2013 09:21:21
     * @version 1.0
     */
    public ApartamentoVO( Integer idApartamento, Integer andar, String tipoApartamento ){
	    super();
	    setIdApartamento ( idApartamento );
	    setAndar ( andar );
	    setTipoApartamento ( tipoApartamento );
    }
	/**
     * Método responsável por retornar o valor do atributo idApartamento.
     * @return Integer idApartamento - idApartamento a ser retornado(a).
     */
    public Integer getIdApartamento() {
    	return idApartamento;
    }
	/**
     * Método responsável por atribuir o valor ao atributo idApartamento.
     * @param Integer idApartamento - idApartamento a ser atribuido(a).
     */
    public void setIdApartamento( Integer idApartamento ) {
    	this.idApartamento = idApartamento;
    }
	/**
     * Método responsável por retornar o valor do atributo andar.
     * @return Integer andar - andar a ser retornado(a).
     */
    public Integer getAndar() {
    	return andar;
    }
	/**
     * Método responsável por atribuir o valor ao atributo andar.
     * @param Integer andar - andar a ser atribuido(a).
     */
    public void setAndar( Integer andar ) {
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
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( andar == null ) ? 0 : andar.hashCode() );
	    result = prime * result + ( ( idApartamento == null ) ? 0 : idApartamento.hashCode() );
	    result = prime * result + ( ( tipoApartamento == null ) ? 0 : tipoApartamento.hashCode() );
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
	    ApartamentoVO other = (ApartamentoVO) obj;
	    if ( andar == null ) {
		    if ( other.andar != null )
			    return false;
	    } else if ( !andar.equals( other.andar ) )
		    return false;
	    if ( idApartamento == null ) {
		    if ( other.idApartamento != null )
			    return false;
	    } else if ( !idApartamento.equals( other.idApartamento ) )
		    return false;
	    if ( tipoApartamento == null ) {
		    if ( other.tipoApartamento != null )
			    return false;
	    } else if ( !tipoApartamento.equals( other.tipoApartamento ) )
		    return false;
	    return true;
    }
	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "ApartamentoVO [getIdApartamento()=" + getIdApartamento() + ", getAndar()=" + getAndar() + ", getTipoApartamento()=" + getTipoApartamento() + ", hashCode()=" + hashCode() + "]";
    }

}
