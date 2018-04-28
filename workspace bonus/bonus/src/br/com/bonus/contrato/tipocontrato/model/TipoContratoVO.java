/**
 * 
 */
package br.com.bonus.contrato.tipocontrato.model;

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
 * @since 05/11/2013 22:24:19
 * @version 1.0
 */
@Entity
@Table( name = "tipo_contrato", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_tipo_contrato", "descricao" } ) )
public class TipoContratoVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_tipo_contrato" )
	private Integer idTipoContrato;
	
	@Column( name = "descricao", nullable = true, length = 50 )
	private String descricao;

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 04/11/2013 10:28:04
	 * @version 1.0
	 */
	public TipoContratoVO(){}

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * @param idTipoContrato
	 * @param descricao
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 04/11/2013 10:27:38
	 * @version 1.0
	 */
	public TipoContratoVO( Integer idTipoContrato, String descricao ){
		super();
		setIdTipoContrato ( idTipoContrato );
		setDescricao ( descricao );
	}

	public Integer getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato( Integer idTipoContrato ) {
		this.idTipoContrato = idTipoContrato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
	    result = prime * result + ( ( idTipoContrato == null ) ? 0 : idTipoContrato.hashCode() );
	    return result;
    }

	@Override
    public boolean equals( Object obj ) {
	    if ( this == obj )
		    return true;
	    if ( obj == null )
		    return false;
	    if ( getClass() != obj.getClass() )
		    return false;
	    TipoContratoVO other = (TipoContratoVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idTipoContrato == null ) {
		    if ( other.idTipoContrato != null )
			    return false;
	    } else if ( !idTipoContrato.equals( other.idTipoContrato ) )
		    return false;
	    return true;
    }

	@Override
    public String toString() {
	    return "TipoContratoVO [getIdTipoContrato()=" + getIdTipoContrato() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
