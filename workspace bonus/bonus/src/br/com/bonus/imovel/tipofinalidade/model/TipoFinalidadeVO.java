/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.model;

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
 * @since 16/11/2013 09:18:15
 * @version 1.0
 */
@Entity
@Table( name = "tipo_finalidade", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_tipo_finalidade", "descricao" } ) )
public class TipoFinalidadeVO{

	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_tipo_finalidade" )
	private Integer idTipoFinalidade;
	
	@Column( name = "descricao", nullable = true, length = 50 )
	private String descricao;

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:20:11
	 * @version 1.0
	 */
	public TipoFinalidadeVO(){}

	/**
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * @param idTipoFinalidade
	 * @param descricao
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 16/11/2013 09:19:17
	 * @version 1.0
	 */
	public TipoFinalidadeVO( Integer idTipoFinalidade, String descricao ){
		super();
		setIdTipoFinalidade ( idTipoFinalidade );
		setDescricao ( descricao );
	}

	/**
	 * Método responsável por retornar o valor do atributo idTipoFinalidade.
	 * 
	 * @return Integer idTipoFinalidade - idTipoFinalidade a ser retornado(a).
	 */
	public Integer getIdTipoFinalidade() {
		return idTipoFinalidade;
	}

	/**
	 * Método responsável por atribuir o valor ao atributo idTipoFinalidade.
	 * 
	 * @param Integer idTipoFinalidade - idTipoFinalidade a ser atribuido(a).
	 */
	public void setIdTipoFinalidade( Integer idTipoFinalidade ) {
		this.idTipoFinalidade = idTipoFinalidade;
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
	 * Polimorfico
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
		result = prime * result + ( ( idTipoFinalidade == null ) ? 0 : idTipoFinalidade.hashCode() );
		return result;
	}

	/**
	 * Polimorfico
	 * 
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
		TipoFinalidadeVO other = (TipoFinalidadeVO) obj;
		if ( descricao == null ) {
			if ( other.descricao != null )
				return false;
		} else if ( !descricao.equals( other.descricao ) )
			return false;
		if ( idTipoFinalidade == null ) {
			if ( other.idTipoFinalidade != null )
				return false;
		} else if ( !idTipoFinalidade.equals( other.idTipoFinalidade ) )
			return false;
		return true;
	}

	/**
	 * Polimorfico
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoFinalidadeVO [getIdTipoFinalidade()=" + getIdTipoFinalidade() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
	}

}
