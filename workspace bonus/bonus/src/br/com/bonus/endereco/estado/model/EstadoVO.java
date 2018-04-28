/**
 * 
 */
package br.com.bonus.endereco.estado.model;

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
 * @since 06/11/2013 17:24:09
 * @version 1.0
 */
@Entity
@Table( name = "estado", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_estado", "descricao" } ) )
public class EstadoVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_estado" )
	private Integer idEstado;
	
	@Column( name = "descricao", nullable = true, length = 50 )
	private String descricao;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 06/11/2013 17:38:16
	 * @version 1.0
	 */
	public EstadoVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idEstado
     * @param descricao
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 06/11/2013 17:37:49
     * @version 1.0
     */
    public EstadoVO( Integer idEstado, String descricao ){
	    super();
	    setIdEstado ( idEstado );
	    setDescricao ( descricao );
    }

	/**
     * Método responsável por retornar o valor do atributo idEstado.
     * @return Integer idEstado - idEstado a ser retornado(a).
     */
    public Integer getIdEstado() {
    	return idEstado;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idEstado.
     * @param Integer idEstado - idEstado a ser atribuido(a).
     */
    public void setIdEstado( Integer idEstado ) {
    	this.idEstado = idEstado;
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
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
	    result = prime * result + ( ( idEstado == null ) ? 0 : idEstado.hashCode() );
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
	    EstadoVO other = (EstadoVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idEstado == null ) {
		    if ( other.idEstado != null )
			    return false;
	    } else if ( !idEstado.equals( other.idEstado ) )
		    return false;
	    return true;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "EstadoVO [getIdEstado()=" + getIdEstado() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
