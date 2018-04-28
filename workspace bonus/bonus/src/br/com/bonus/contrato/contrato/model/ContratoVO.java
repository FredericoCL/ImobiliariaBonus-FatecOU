/**
 * 
 */
package br.com.bonus.contrato.contrato.model;

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

import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.imovel.imovel.model.ImovelVO;
import br.com.bonus.pessoa.cliente.model.ClienteVO;
import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 09:28:10
 * @version 1.0
 */
@Entity
@Table( name = "contrato", schema = Constantes.SCHEMA, uniqueConstraints = @UniqueConstraint( columnNames = { "id_contrato", "data_inicio", "data_fim"} ) )
public class ContratoVO{

	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_contrato" )
	private Integer idContrato;
	
	@Column( name = "data_inicio", nullable = true, length = 255 )
	private Date dataInicio;
	
	@Column( name = "data_fim", nullable = true, length = 255 )
	private Date dataFim;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_tipo_contrato", nullable = true )
	private TipoContratoVO tipoContrato;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_cliente", nullable = true )
	private ClienteVO cliente;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_imovel", nullable = true )
	private ImovelVO imovel;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 03/12/2013 09:30:39
	 * @version 1.0
	 */
	public ContratoVO(){}
	
	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param idContrato
     * @param dataInicio
     * @param dataFim
     * @param tipoContrato
     * @param corretor
     * @param cliente
     * @param imovel
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 03/12/2013 09:30:23
     * @version 1.0
     */
    public ContratoVO( Integer idContrato, Date dataInicio, Date dataFim, TipoContratoVO tipoContrato, ClienteVO cliente, ImovelVO imovel ){
	    super();
	    setIdContrato ( idContrato );
	    setDataInicio ( dataInicio );
	    setDataFim ( dataFim );
	    setTipoContrato ( tipoContrato );
	    setCliente ( cliente );
	    setImovel ( imovel );
    }

	/**
     * Método responsável por retornar o valor do atributo idContrato.
     * @return Integer idContrato - idContrato a ser retornado(a).
     */
    public Integer getIdContrato() {
    	return idContrato;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idContrato.
     * @param Integer idContrato - idContrato a ser atribuido(a).
     */
    public void setIdContrato( Integer idContrato ) {
    	this.idContrato = idContrato;
    }

	/**
     * Método responsável por retornar o valor do atributo dataInicio.
     * @return Date dataInicio - dataInicio a ser retornado(a).
     */
    public Date getDataInicio() {
    	return dataInicio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataInicio.
     * @param Date dataInicio - dataInicio a ser atribuido(a).
     */
    public void setDataInicio( Date dataInicio ) {
    	this.dataInicio = dataInicio;
    }

	/**
     * Método responsável por retornar o valor do atributo dataFim.
     * @return Date dataFim - dataFim a ser retornado(a).
     */
    public Date getDataFim() {
    	return dataFim;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataFim.
     * @param Date dataFim - dataFim a ser atribuido(a).
     */
    public void setDataFim( Date dataFim ) {
    	this.dataFim = dataFim;
    }

	/**
     * Método responsável por retornar o valor do atributo tipoContrato.
     * @return TipoContratoVO tipoContrato - tipoContrato a ser retornado(a).
     */
    public TipoContratoVO getTipoContrato() {
    	return tipoContrato;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoContrato.
     * @param TipoContratoVO tipoContrato - tipoContrato a ser atribuido(a).
     */
    public void setTipoContrato( TipoContratoVO tipoContrato ) {
    	this.tipoContrato = tipoContrato;
    }

	/**
     * Método responsável por retornar o valor do atributo cliente.
     * @return ClienteVO cliente - cliente a ser retornado(a).
     */
    public ClienteVO getCliente() {
    	return cliente;
    }

	/**
     * Método responsável por atribuir o valor ao atributo cliente.
     * @param ClienteVO cliente - cliente a ser atribuido(a).
     */
    public void setCliente( ClienteVO cliente ) {
    	this.cliente = cliente;
    }

	/**
     * Método responsável por retornar o valor do atributo imovel.
     * @return ImovelVO imovel - imovel a ser retornado(a).
     */
    public ImovelVO getImovel() {
    	return imovel;
    }

	/**
     * Método responsável por atribuir o valor ao atributo imovel.
     * @param ImovelVO imovel - imovel a ser atribuido(a).
     */
    public void setImovel( ImovelVO imovel ) {
    	this.imovel = imovel;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "ContratoVO [idContrato=" + idContrato + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", tipoContrato=" + tipoContrato + ", cliente=" + cliente + ", imovel=" + imovel + "]";
    }

	/**
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( cliente == null ) ? 0 : cliente.hashCode() );
	    result = prime * result + ( ( dataFim == null ) ? 0 : dataFim.hashCode() );
	    result = prime * result + ( ( dataInicio == null ) ? 0 : dataInicio.hashCode() );
	    result = prime * result + ( ( idContrato == null ) ? 0 : idContrato.hashCode() );
	    result = prime * result + ( ( imovel == null ) ? 0 : imovel.hashCode() );
	    result = prime * result + ( ( tipoContrato == null ) ? 0 : tipoContrato.hashCode() );
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
	    ContratoVO other = (ContratoVO) obj;
	    if ( cliente == null ) {
		    if ( other.cliente != null )
			    return false;
	    } else if ( !cliente.equals( other.cliente ) )
		    return false;
	    if ( dataFim == null ) {
		    if ( other.dataFim != null )
			    return false;
	    } else if ( !dataFim.equals( other.dataFim ) )
		    return false;
	    if ( dataInicio == null ) {
		    if ( other.dataInicio != null )
			    return false;
	    } else if ( !dataInicio.equals( other.dataInicio ) )
		    return false;
	    if ( idContrato == null ) {
		    if ( other.idContrato != null )
			    return false;
	    } else if ( !idContrato.equals( other.idContrato ) )
		    return false;
	    if ( imovel == null ) {
		    if ( other.imovel != null )
			    return false;
	    } else if ( !imovel.equals( other.imovel ) )
		    return false;
	    if ( tipoContrato == null ) {
		    if ( other.tipoContrato != null )
			    return false;
	    } else if ( !tipoContrato.equals( other.tipoContrato ) )
		    return false;
	    return true;
    }

}
