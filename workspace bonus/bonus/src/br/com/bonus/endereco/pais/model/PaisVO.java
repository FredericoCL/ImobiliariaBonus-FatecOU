/**
 * 
 */
package br.com.bonus.endereco.pais.model;

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
 * @since 05/11/2013 23:44:02
 * @version 1.0
 */
@Entity
@Table( name = "pais", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_pais", "descricao" } ) )
public class PaisVO{
	
	@Id
	/** Informa que o atributo referencia um campo que � primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo ser� auto-incrementavel */
	@Column( name = "id_pais" )
	private Integer idPais;
	
	@Column( name = "descricao", nullable = true, length = 90 )
	private String descricao;
	
	/**
	 * 
	 * M�todo construtor respos�vel por inicializar os atributos e/ou
	 * executar qualquer a��o no momento da cria��o da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 05/11/2013 23:45:18
	 * @version 1.0
	 */
	public PaisVO(){}
	
	/**
     * M�todo construtor respos�vel por inicializar os atributos e/ou
     * executar qualquer a��o no momento da cria��o da classe.
     *
     * @param idPais
     * @param descricao
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 05/11/2013 23:44:58
     * @version 1.0
     */
    public PaisVO( Integer idPais, String descricao ){
	    super();
	    setIdPais ( idPais );
	    setDescricao ( descricao );
    }

	/**
     * M�todo respons�vel por retornar o valor do atributo idPais.
     * @return Integer idPais - idPais a ser retornado(a).
     */
    public Integer getIdPais() {
    	return idPais;
    }

	/**
     * M�todo respons�vel por atribuir o valor ao atributo idPais.
     * @param Integer idPais - idPais a ser atribuido(a).
     */
    public void setIdPais( Integer idPais ) {
    	this.idPais = idPais;
    }

	/**
     * M�todo respons�vel por retornar o valor do atributo descricao.
     * @return String descricao - descricao a ser retornado(a).
     */
    public String getDescricao() {
    	return descricao;
    }

	/**
     * M�todo respons�vel por atribuir o valor ao atributo descricao.
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
	    result = prime * result + ( ( idPais == null ) ? 0 : idPais.hashCode() );
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
	    PaisVO other = (PaisVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idPais == null ) {
		    if ( other.idPais != null )
			    return false;
	    } else if ( !idPais.equals( other.idPais ) )
		    return false;
	    return true;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "PaisVO [getIdPais()=" + getIdPais() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
