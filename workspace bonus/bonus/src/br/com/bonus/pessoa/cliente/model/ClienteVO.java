/**
 * 
 */
package br.com.bonus.pessoa.cliente.model;

import java.util.Date;

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

import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.telefone.telefone.model.TelefoneVO;
import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 22/11/2013 09:35:27
 * @version 1.0
 */
@Entity
@Table( name = "cliente", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_cliente", "cpf", "rg" } ) )
public class ClienteVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_cliente" )
	private Integer idCliente;
	
	@Column( name = "cpf", nullable = true, length = 255 )
	private String cpf;
	
	@Column( name = "rg", nullable = true, length = 255 )
	private String rg;
	
	@Column( name = "nome", nullable = true, length = 255 )
	private String nome;
	
	@Column( name = "email", nullable = true, length = 255 )
	private String email;
	
	@Column( name = "data_nascimento", nullable = true, length = 255 )
	private Date dataNascimento;
	
	@ManyToOne( fetch = FetchType.EAGER )
	@JoinColumn( name = "id_telefone", nullable = true )
	private TelefoneVO telefone;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_endereco", nullable = true )
	private EnderecoVO endereco;
	
	@Column( name = "creci", nullable = true, length = 255 )
	private String creci;
	
	@Column(name="corretor")
	private Boolean corretor;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 22/11/2013 09:38:15
	 * @version 1.0
	 */
	public ClienteVO(){}

	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idCliente
     * @param cpf
     * @param rg
     * @param nome
     * @param email
     * @param dataNascimento
     * @param telefone
     * @param endereco
     * @param creci
     * @param corretor
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 05/12/2013 02:57:43
     * @version 1.0
     */
    public ClienteVO( Integer idCliente, String cpf, String rg, String nome, String email, Date dataNascimento, TelefoneVO telefone, EnderecoVO endereco, String creci, Boolean corretor ){
	    super();
	    setIdCliente( idCliente );
	    setCpf( cpf );
	    setRg( rg );
	    setNome( nome );
	    setEmail( email );
	    setDataNascimento( dataNascimento );
	    setTelefone( telefone );
	    setEndereco( endereco );
	    setCreci( creci );
	    setCorretor( corretor );
    }


	/**
     * Método responsável por retornar o valor do atributo idCliente.
     * @return Integer idCliente - idCliente a ser retornado(a).
     */
    public Integer getIdCliente() {
    	return idCliente;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idCliente.
     * @param Integer idCliente - idCliente a ser atribuido(a).
     */
    public void setIdCliente( Integer idCliente ) {
    	this.idCliente = idCliente;
    }

	/**
     * Método responsável por retornar o valor do atributo cpf.
     * @return String cpf - cpf a ser retornado(a).
     */
    public String getCpf() {
    	return cpf;
    }

	/**
     * Método responsável por atribuir o valor ao atributo cpf.
     * @param String cpf - cpf a ser atribuido(a).
     */
    public void setCpf( String cpf ) {
    	this.cpf = cpf;
    }

	/**
     * Método responsável por retornar o valor do atributo rg.
     * @return String rg - rg a ser retornado(a).
     */
    public String getRg() {
    	return rg;
    }

	/**
     * Método responsável por atribuir o valor ao atributo rg.
     * @param String rg - rg a ser atribuido(a).
     */
    public void setRg( String rg ) {
    	this.rg = rg;
    }

	/**
     * Método responsável por retornar o valor do atributo nome.
     * @return String nome - nome a ser retornado(a).
     */
    public String getNome() {
    	return nome;
    }

	/**
     * Método responsável por atribuir o valor ao atributo nome.
     * @param String nome - nome a ser atribuido(a).
     */
    public void setNome( String nome ) {
    	this.nome = nome;
    }

	/**
     * Método responsável por retornar o valor do atributo email.
     * @return String email - email a ser retornado(a).
     */
    public String getEmail() {
    	return email;
    }

	/**
     * Método responsável por atribuir o valor ao atributo email.
     * @param String email - email a ser atribuido(a).
     */
    public void setEmail( String email ) {
    	this.email = email;
    }

	/**
     * Método responsável por retornar o valor do atributo dataNascimento.
     * @return Date dataNascimento - dataNascimento a ser retornado(a).
     */
    public Date getDataNascimento() {
    	return dataNascimento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataNascimento.
     * @param Date dataNascimento - dataNascimento a ser atribuido(a).
     */
    public void setDataNascimento( Date dataNascimento ) {
    	this.dataNascimento = dataNascimento;
    }

	/**
     * Método responsável por retornar o valor do atributo telefone.
     * @return TelefoneVO telefone - telefone a ser retornado(a).
     */
    public TelefoneVO getTelefone() {
    	return telefone;
    }

	/**
     * Método responsável por atribuir o valor ao atributo telefone.
     * @param TelefoneVO telefone - telefone a ser atribuido(a).
     */
    public void setTelefone( TelefoneVO telefone ) {
    	this.telefone = telefone;
    }

	/**
     * Método responsável por retornar o valor do atributo endereco.
     * @return EnderecoVO endereco - endereco a ser retornado(a).
     */
    public EnderecoVO getEndereco() {
    	return endereco;
    }

	/**
     * Método responsável por atribuir o valor ao atributo endereco.
     * @param EnderecoVO endereco - endereco a ser atribuido(a).
     */
    public void setEndereco( EnderecoVO endereco ) {
    	this.endereco = endereco;
    }

	/**
     * Método responsável por retornar o valor do atributo creci.
     * @return String creci - creci a ser retornado(a).
     */
    public String getCreci() {
    	return creci;
    }

	/**
     * Método responsável por atribuir o valor ao atributo creci.
     * @param String creci - creci a ser atribuido(a).
     */
    public void setCreci( String creci ) {
    	this.creci = creci;
    }

	/**
     * Método responsável por retornar o valor do atributo corretor.
     * @return Boolean corretor - corretor a ser retornado(a).
     */
    public Boolean getCorretor() {
    	return corretor;
    }

	/**
     * Método responsável por atribuir o valor ao atributo corretor.
     * @param Boolean corretor - corretor a ser atribuido(a).
     */
    public void setCorretor( Boolean corretor ) {
    	this.corretor = corretor;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "ClienteVO [idCliente=" + idCliente + ", cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", email=" + email + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", endereco=" + endereco + ", creci=" + creci + ", corretor=" + corretor + "]";
    }

	/**
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( corretor == null ) ? 0 : corretor.hashCode() );
	    result = prime * result + ( ( cpf == null ) ? 0 : cpf.hashCode() );
	    result = prime * result + ( ( creci == null ) ? 0 : creci.hashCode() );
	    result = prime * result + ( ( dataNascimento == null ) ? 0 : dataNascimento.hashCode() );
	    result = prime * result + ( ( email == null ) ? 0 : email.hashCode() );
	    result = prime * result + ( ( endereco == null ) ? 0 : endereco.hashCode() );
	    result = prime * result + ( ( idCliente == null ) ? 0 : idCliente.hashCode() );
	    result = prime * result + ( ( nome == null ) ? 0 : nome.hashCode() );
	    result = prime * result + ( ( rg == null ) ? 0 : rg.hashCode() );
	    result = prime * result + ( ( telefone == null ) ? 0 : telefone.hashCode() );
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
	    ClienteVO other = (ClienteVO) obj;
	    if ( corretor == null ) {
		    if ( other.corretor != null )
			    return false;
	    } else if ( !corretor.equals( other.corretor ) )
		    return false;
	    if ( cpf == null ) {
		    if ( other.cpf != null )
			    return false;
	    } else if ( !cpf.equals( other.cpf ) )
		    return false;
	    if ( creci == null ) {
		    if ( other.creci != null )
			    return false;
	    } else if ( !creci.equals( other.creci ) )
		    return false;
	    if ( dataNascimento == null ) {
		    if ( other.dataNascimento != null )
			    return false;
	    } else if ( !dataNascimento.equals( other.dataNascimento ) )
		    return false;
	    if ( email == null ) {
		    if ( other.email != null )
			    return false;
	    } else if ( !email.equals( other.email ) )
		    return false;
	    if ( endereco == null ) {
		    if ( other.endereco != null )
			    return false;
	    } else if ( !endereco.equals( other.endereco ) )
		    return false;
	    if ( idCliente == null ) {
		    if ( other.idCliente != null )
			    return false;
	    } else if ( !idCliente.equals( other.idCliente ) )
		    return false;
	    if ( nome == null ) {
		    if ( other.nome != null )
			    return false;
	    } else if ( !nome.equals( other.nome ) )
		    return false;
	    if ( rg == null ) {
		    if ( other.rg != null )
			    return false;
	    } else if ( !rg.equals( other.rg ) )
		    return false;
	    if ( telefone == null ) {
		    if ( other.telefone != null )
			    return false;
	    } else if ( !telefone.equals( other.telefone ) )
		    return false;
	    return true;
    }
    
}
