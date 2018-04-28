/**
 * 
 */
package br.com.bonus.endereco.municipio.model;

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
 * @since 06/11/2013 17:28:02
 * @version 1.0
 */
@Entity
@Table( name = "municipio", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_municipio", "descricao" } ) )
public class MunicipioVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_municipio" )
	private Integer idMunicipio;
	
	@Column( name = "descricao", nullable = true, length = 50 )
	private String descricao;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 06/11/2013 17:40:31
	 * @version 1.0
	 */
	public MunicipioVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idMunicipio
     * @param descricao
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 06/11/2013 17:39:29
     * @version 1.0
     */
    public MunicipioVO( Integer idMunicipio, String descricao ){
	    super();
	    setIdMunicipio ( idMunicipio );
	    setDescricao ( descricao );
    }
    
	/**
     * Método responsável por retornar o valor do atributo idMunicipio.
     * @return Integer idMunicipio - idMunicipio a ser retornado(a).
     */
    public Integer getIdMunicipio() {
    	return idMunicipio;
    }
	/**
     * Método responsável por atribuir o valor ao atributo idMunicipio.
     * @param Integer idMunicipio - idMunicipio a ser atribuido(a).
     */
    public void setIdMunicipio( Integer idMunicipio ) {
    	this.idMunicipio = idMunicipio;
    }
	/**
     * Método responsável por retornar o valor do atributo descricao.
     * @return Integer descricao - descricao a ser retornado(a).
     */
    public String getDescricao() {
    	return descricao;
    }
	/**
     * Método responsável por atribuir o valor ao atributo descricao.
     * @param Integer descricao - descricao a ser atribuido(a).
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
	    result = prime * result + ( ( idMunicipio == null ) ? 0 : idMunicipio.hashCode() );
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
	    MunicipioVO other = (MunicipioVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idMunicipio == null ) {
		    if ( other.idMunicipio != null )
			    return false;
	    } else if ( !idMunicipio.equals( other.idMunicipio ) )
		    return false;
	    return true;
    }
	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "MunicipioVO [getIdMunicipio()=" + getIdMunicipio() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
