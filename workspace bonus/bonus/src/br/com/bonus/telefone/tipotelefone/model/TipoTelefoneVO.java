/**
 * 
 */
package br.com.bonus.telefone.tipotelefone.model;

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
 * @since 04/11/2013 10:25:31
 * @version 1.0
 */
@Entity
@Table( name = "tipo_telefone", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_tipo_telefone", "descricao" } ) )
public class TipoTelefoneVO{

	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_tipo_telefone" )
	private Integer idTipoTelefone;
	
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
	public TipoTelefoneVO(){}

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * @param idTipoTelefone
	 * @param descricao
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 04/11/2013 10:27:38
	 * @version 1.0
	 */
	public TipoTelefoneVO( Integer idTipoTelefone, String descricao ){
		super();
		setIdTipoTelefone ( idTipoTelefone );
		setDescricao ( descricao );
	}

	public Integer getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone( Integer idTipoTelefone ) {
		this.idTipoTelefone = idTipoTelefone;
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
	    result = prime * result + ( ( idTipoTelefone == null ) ? 0 : idTipoTelefone.hashCode() );
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
	    TipoTelefoneVO other = (TipoTelefoneVO) obj;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( idTipoTelefone == null ) {
		    if ( other.idTipoTelefone != null )
			    return false;
	    } else if ( !idTipoTelefone.equals( other.idTipoTelefone ) )
		    return false;
	    return true;
    }

	@Override
    public String toString() {
	    return "TipoTelefoneVO [getIdTipoTelefone()=" + getIdTipoTelefone() + ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + "]";
    }

}
