/**
 * 
 */
package br.com.bonus.endereco.endereco.model;

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
import javax.persistence.UniqueConstraint;

import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.endereco.municipio.model.MunicipioVO;
import br.com.bonus.endereco.pais.model.PaisVO;
import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 09:33:34
 * @version 1.0
 */
@Entity
@Table( name = "endereco", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_endereco", "logradouro", "numero", "bairro", "cep", "complemento" } ) )
public class EnderecoVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_endereco" )
	private Integer idEndereco;
	
	@Column( name = "logradouro", nullable = true, length = 255 )
	private String logradouro;
	
	@Column( name = "numero", nullable = true, length = 25 )
	private String numero;
	
	@Column( name = "bairro", nullable = true, length = 100 )
	private String bairro;
	
	@Column( name = "cep", nullable = true, length = 10 )
	private String cep;
	
	@Column( name = "complemento", nullable = true, length = 100 )
	private String complemento;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_pais", nullable = true )
	private PaisVO pais;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_estado", nullable = true )
	private EstadoVO estado;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_municipio", nullable = true )
	private MunicipioVO municipio;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 07/11/2013 09:37:50
	 * @version 1.0
	 */
	public EnderecoVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idEndereco
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cep
     * @param complemento
     * @param pais
     * @param estado
     * @param municipio
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 07/11/2013 09:37:24
     * @version 1.0
     */
    public EnderecoVO( Integer idEndereco, String logradouro, String numero, String bairro, String cep, String complemento, PaisVO pais, EstadoVO estado, MunicipioVO municipio ){
	    super();
	    setIdEndereco ( idEndereco );
	    setLogradouro ( logradouro );
	    setNumero ( numero );
	    setBairro ( bairro );
	    setCep ( cep );
	    setComplemento ( complemento );
	    setPais ( pais );
	    setEstado ( estado );
	    setMunicipio ( municipio );
    }

	/**
     * Método responsável por retornar o valor do atributo idEndereco.
     * @return Integer idEndereco - idEndereco a ser retornado(a).
     */
    public Integer getIdEndereco() {
    	return idEndereco;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idEndereco.
     * @param Integer idEndereco - idEndereco a ser atribuido(a).
     */
    public void setIdEndereco( Integer idEndereco ) {
    	this.idEndereco = idEndereco;
    }

	/**
     * Método responsável por retornar o valor do atributo logradouro.
     * @return String logradouro - logradouro a ser retornado(a).
     */
    public String getLogradouro() {
    	return logradouro;
    }

	/**
     * Método responsável por atribuir o valor ao atributo logradouro.
     * @param String logradouro - logradouro a ser atribuido(a).
     */
    public void setLogradouro( String logradouro ) {
    	this.logradouro = logradouro;
    }

	/**
     * Método responsável por retornar o valor do atributo numero.
     * @return String numero - numero a ser retornado(a).
     */
    public String getNumero() {
    	return numero;
    }

	/**
     * Método responsável por atribuir o valor ao atributo numero.
     * @param String numero - numero a ser atribuido(a).
     */
    public void setNumero( String numero ) {
    	this.numero = numero;
    }

	/**
     * Método responsável por retornar o valor do atributo bairro.
     * @return String bairro - bairro a ser retornado(a).
     */
    public String getBairro() {
    	return bairro;
    }

	/**
     * Método responsável por atribuir o valor ao atributo bairro.
     * @param String bairro - bairro a ser atribuido(a).
     */
    public void setBairro( String bairro ) {
    	this.bairro = bairro;
    }

	/**
     * Método responsável por retornar o valor do atributo cep.
     * @return String cep - cep a ser retornado(a).
     */
    public String getCep() {
    	return cep;
    }

	/**
     * Método responsável por atribuir o valor ao atributo cep.
     * @param String cep - cep a ser atribuido(a).
     */
    public void setCep( String cep ) {
    	this.cep = cep;
    }

	/**
     * Método responsável por retornar o valor do atributo complemento.
     * @return String complemento - complemento a ser retornado(a).
     */
    public String getComplemento() {
    	return complemento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo complemento.
     * @param String complemento - complemento a ser atribuido(a).
     */
    public void setComplemento( String complemento ) {
    	this.complemento = complemento;
    }

	/**
     * Método responsável por retornar o valor do atributo pais.
     * @return PaisVO pais - pais a ser retornado(a).
     */
    public PaisVO getPais() {
    	return pais;
    }

	/**
     * Método responsável por atribuir o valor ao atributo pais.
     * @param PaisVO pais - pais a ser atribuido(a).
     */
    public void setPais( PaisVO pais ) {
    	this.pais = pais;
    }

	/**
     * Método responsável por retornar o valor do atributo estado.
     * @return EstadoVO estado - estado a ser retornado(a).
     */
    public EstadoVO getEstado() {
    	return estado;
    }

	/**
     * Método responsável por atribuir o valor ao atributo estado.
     * @param EstadoVO estado - estado a ser atribuido(a).
     */
    public void setEstado( EstadoVO estado ) {
    	this.estado = estado;
    }

	/**
     * Método responsável por retornar o valor do atributo municipio.
     * @return MunicipioVO municipio - municipio a ser retornado(a).
     */
    public MunicipioVO getMunicipio() {
    	return municipio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo municipio.
     * @param MunicipioVO municipio - municipio a ser atribuido(a).
     */
    public void setMunicipio( MunicipioVO municipio ) {
    	this.municipio = municipio;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( bairro == null ) ? 0 : bairro.hashCode() );
	    result = prime * result + ( ( cep == null ) ? 0 : cep.hashCode() );
	    result = prime * result + ( ( complemento == null ) ? 0 : complemento.hashCode() );
	    result = prime * result + ( ( estado == null ) ? 0 : estado.hashCode() );
	    result = prime * result + ( ( idEndereco == null ) ? 0 : idEndereco.hashCode() );
	    result = prime * result + ( ( logradouro == null ) ? 0 : logradouro.hashCode() );
	    result = prime * result + ( ( municipio == null ) ? 0 : municipio.hashCode() );
	    result = prime * result + ( ( numero == null ) ? 0 : numero.hashCode() );
	    result = prime * result + ( ( pais == null ) ? 0 : pais.hashCode() );
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
	    EnderecoVO other = (EnderecoVO) obj;
	    if ( bairro == null ) {
		    if ( other.bairro != null )
			    return false;
	    } else if ( !bairro.equals( other.bairro ) )
		    return false;
	    if ( cep == null ) {
		    if ( other.cep != null )
			    return false;
	    } else if ( !cep.equals( other.cep ) )
		    return false;
	    if ( complemento == null ) {
		    if ( other.complemento != null )
			    return false;
	    } else if ( !complemento.equals( other.complemento ) )
		    return false;
	    if ( estado == null ) {
		    if ( other.estado != null )
			    return false;
	    } else if ( !estado.equals( other.estado ) )
		    return false;
	    if ( idEndereco == null ) {
		    if ( other.idEndereco != null )
			    return false;
	    } else if ( !idEndereco.equals( other.idEndereco ) )
		    return false;
	    if ( logradouro == null ) {
		    if ( other.logradouro != null )
			    return false;
	    } else if ( !logradouro.equals( other.logradouro ) )
		    return false;
	    if ( municipio == null ) {
		    if ( other.municipio != null )
			    return false;
	    } else if ( !municipio.equals( other.municipio ) )
		    return false;
	    if ( numero == null ) {
		    if ( other.numero != null )
			    return false;
	    } else if ( !numero.equals( other.numero ) )
		    return false;
	    if ( pais == null ) {
		    if ( other.pais != null )
			    return false;
	    } else if ( !pais.equals( other.pais ) )
		    return false;
	    return true;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "EnderecoVO [getIdEndereco()=" + getIdEndereco() + ", getLogradouro()=" + getLogradouro() + ", getNumero()=" + getNumero() + ", getBairro()=" + getBairro() + ", getCep()=" + getCep() + ", getComplemento()=" + getComplemento() + ", getPais()=" + getPais() + ", getEstado()=" + getEstado() + ", getMunicipio()=" + getMunicipio() + ", hashCode()=" + hashCode() + "]";
    }

}
