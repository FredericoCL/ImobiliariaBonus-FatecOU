/**
 * 
 */
package br.com.bonus.telefone.telefone.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;
import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 10:30:00
 * @version 1.0
 */
@Entity
@Table( name = "telefone", schema = Constantes.SCHEMA )
public class TelefoneVO{

	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_telefone" )
	private Integer idTelefone;

	@Column( name = "ddd", nullable = true, length = 3 )
	private String ddd;

	@Column( name = "numero", nullable = true, length = 10 )
	private String numero;

	@Column( name = "ramal", nullable = true, length = 10 )
	private String ramal;

	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "id_tipo_telefone", nullable = true )
	private TipoTelefoneVO tipoTelefone;

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 04/11/2013 10:32:26
	 * @version 1.0
	 */
	public TelefoneVO(){}

	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 * 
	 * @param idTelefone
	 * @param ddd
	 * @param numero
	 * @param ramal
	 * @param tipoTelefone
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 04/11/2013 10:32:09
	 * @version 1.0
	 */
	public TelefoneVO( Integer idTelefone, String ddd, String numero, String ramal, TipoTelefoneVO tipoTelefone ){
		super();
		setIdTelefone( idTelefone );
		setDdd( ddd );
		setNumero( numero );
		setRamal( ramal );
		setTipoTelefone( tipoTelefone );
	}

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone( Integer idTelefone ) {
		this.idTelefone = idTelefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd( String ddd ) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero( String numero ) {
		this.numero = numero;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal( String ramal ) {
		this.ramal = ramal;
	}

	public TipoTelefoneVO getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone( TipoTelefoneVO tipoTelefone ) {
		this.tipoTelefone = tipoTelefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( ddd == null ) ? 0 : ddd.hashCode() );
		result = prime * result + ( ( idTelefone == null ) ? 0 : idTelefone.hashCode() );
		result = prime * result + ( ( numero == null ) ? 0 : numero.hashCode() );
		result = prime * result + ( ( ramal == null ) ? 0 : ramal.hashCode() );
		result = prime * result + ( ( tipoTelefone == null ) ? 0 : tipoTelefone.hashCode() );
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
		TelefoneVO other = (TelefoneVO) obj;
		if ( ddd == null ) {
			if ( other.ddd != null )
				return false;
		} else if ( !ddd.equals( other.ddd ) )
			return false;
		if ( idTelefone == null ) {
			if ( other.idTelefone != null )
				return false;
		} else if ( !idTelefone.equals( other.idTelefone ) )
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
		if ( tipoTelefone == null ) {
			if ( other.tipoTelefone != null )
				return false;
		} else if ( !tipoTelefone.equals( other.tipoTelefone ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TelefoneVO [getIdTelefone()=" + getIdTelefone() + ", getDdd()=" + getDdd() + ", getNumero()=" + getNumero() + ", getRamal()=" + getRamal() + ", getTipoTelefone()=" + getTipoTelefone() + ", hashCode()=" + hashCode() + "]";
	}

}
