/**
 * 
 */
package br.com.bonus.imovel.tiponegociacao.model;

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
 * @since 16/11/2013 01:13:38
 * @version 1.0
 */
@Entity
@Table( name = "tipo_negociacao", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_tipo_negociacao", "descricao" } ) )
public class TipoNegociacaoVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_tipo_negociacao" )
	private Integer idTipoNegociacao;
	
	@Column( name = "descricao", nullable = true, length = 50 )
	private String descricao;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 01:15:54
	 * @version 1.0
	 */
	public TipoNegociacaoVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idTipoNegociacao
     * @param descricao
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 16/11/2013 01:14:56
     * @version 1.0
     */
    public TipoNegociacaoVO( Integer idTipoNegociacao, String descricao ){
	    super();
	    setIdTipoNegociacao ( idTipoNegociacao );
	    setDescricao ( descricao );
    }
    
    
	/**
     * Método responsável por retornar o valor do atributo idTipoNegociacao.
     * @return Integer idTipoNegociacao - idTipoNegociacao a ser retornado(a).
     */
    public Integer getIdTipoNegociacao() {
    	return idTipoNegociacao;
    }
	/**
     * Método responsável por atribuir o valor ao atributo idTipoNegociacao.
     * @param Integer idTipoNegociacao - idTipoNegociacao a ser atribuido(a).
     */
    public void setIdTipoNegociacao( Integer idTipoNegociacao ) {
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
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
	    result = prime * result + ( ( idTipoNegociacao == null ) ? 0 : idTipoNegociacao.hashCode() );
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
	    TipoNegociacaoVO other = (TipoNegociacaoVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idTipoNegociacao == null ) {
		    if ( other.idTipoNegociacao != null )
			    return false;
	    } else if ( !idTipoNegociacao.equals( other.idTipoNegociacao ) )
		    return false;
	    return true;
    }
	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "TipoNegociacaoVO [getIdTipoNegociacao()=" + getIdTipoNegociacao() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
