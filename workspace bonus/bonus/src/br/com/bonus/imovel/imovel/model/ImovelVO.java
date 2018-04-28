/**
 * 
 */
package br.com.bonus.imovel.imovel.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.bonus.imovel.apartamento.model.ApartamentoVO;
import br.com.bonus.imovel.casa.model.CasaVO;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;
import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoVO;
import br.com.bonus.utilidades.Constantes;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:11:37
 * @version 1.0
 */
@Entity
@Table(name="imovel", schema = Constantes.SCHEMA )
public class ImovelVO{
	
	@Id
	/** Informa que o atributo referencia um campo que é primary key no banco de dados */
	@GeneratedValue( strategy = GenerationType.AUTO )
	/** Informa que a coluna deste campo será auto-incrementavel */
	@Column( name = "id_imovel" )
	private Integer idImovel;
	
	@Column(name="valor", nullable=true)
	private String valor;
	
	@Column(name="dormitorio")
	private Integer dormitorio;
	
	@Column(name="suite")
	private Integer suite;
	
	@Column(name="vaga_garagem")
	private Integer vagaGaragem;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="area_construida")
	private String areaConstruida;
	
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="id_casa", nullable=true)
	private CasaVO casa;
	
	@OneToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="id_apartamento", nullable=true)
	private ApartamentoVO apartamento;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_tipo_negociacao", nullable = true )
	private TipoNegociacaoVO tipoNegociacao;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.REFRESH )
	@JoinColumn( name = "id_tipo_finalidade", nullable = true )
	private TipoFinalidadeVO tipoFinalidade;
	
	/**
	 * 
	 * Método construtor resposável por inicializar os atributos e/ou
	 * executar qualquer ação no momento da criação da classe.
	 *
	 *
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 30/11/2013 09:15:36
	 * @version 1.0
	 */
	public ImovelVO(){}

	/**
     * Método construtor resposável por inicializar os atributos e/ou
     * executar qualquer ação no momento da criação da classe.
     *
     * @param valor
     * @param dormitorio
     * @param suite
     * @param vagaGaragem
     * @param descricao
     * @param areaConstruida
     * @param casa
     * @param apartamento
     * @param tipoNegociacao
     * @param tipoFinalidade
     *
     * @author Frederico Lessa <fred.lessa@gmail.com>
     * @since 30/11/2013 09:16:30
     * @version 1.0
     */
    public ImovelVO( Integer idImovel, String valor, Integer dormitorio, Integer suite, Integer vagaGaragem, String descricao, String areaConstruida, CasaVO casa, ApartamentoVO apartamento, TipoNegociacaoVO tipoNegociacao, TipoFinalidadeVO tipoFinalidade ){
	    super();
	    setIdImovel ( idImovel );
	    setValor ( valor );
	    setDormitorio ( dormitorio );
	    setSuite ( suite );
	    setVagaGaragem ( vagaGaragem );
	    setDescricao ( descricao );
	    setAreaConstruida ( areaConstruida );
	    setCasa ( casa );
	    setApartamento ( apartamento );
	    setTipoNegociacao ( tipoNegociacao );
	    setTipoFinalidade ( tipoFinalidade );
    }
    
    /**
     * Método responsável por retornar o valor do atributo valor.
     * @return String valor - valor a ser retornado(a).
     */
    public Integer getIdImovel() {
    	return idImovel;
    }

	/**
     * Método responsável por atribuir o valor ao atributo valor.
     * @param String valor - valor a ser atribuido(a).
     */
    public void setIdImovel( Integer idImovel ) {
    	this.idImovel = idImovel;
    }

	/**
     * Método responsável por retornar o valor do atributo valor.
     * @return String valor - valor a ser retornado(a).
     */
    public String getValor() {
    	return valor;
    }

	/**
     * Método responsável por atribuir o valor ao atributo valor.
     * @param String valor - valor a ser atribuido(a).
     */
    public void setValor( String valor ) {
    	this.valor = valor;
    }

	/**
     * Método responsável por retornar o valor do atributo dormitorio.
     * @return Integer dormitorio - dormitorio a ser retornado(a).
     */
    public Integer getDormitorio() {
    	return dormitorio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dormitorio.
     * @param Integer dormitorio - dormitorio a ser atribuido(a).
     */
    public void setDormitorio( Integer dormitorio ) {
    	this.dormitorio = dormitorio;
    }

	/**
     * Método responsável por retornar o valor do atributo suite.
     * @return Integer suite - suite a ser retornado(a).
     */
    public Integer getSuite() {
    	return suite;
    }

	/**
     * Método responsável por atribuir o valor ao atributo suite.
     * @param Integer suite - suite a ser atribuido(a).
     */
    public void setSuite( Integer suite ) {
    	this.suite = suite;
    }

	/**
     * Método responsável por retornar o valor do atributo vagaGaragem.
     * @return Integer vagaGaragem - vagaGaragem a ser retornado(a).
     */
    public Integer getVagaGaragem() {
    	return vagaGaragem;
    }

	/**
     * Método responsável por atribuir o valor ao atributo vagaGaragem.
     * @param Integer vagaGaragem - vagaGaragem a ser atribuido(a).
     */
    public void setVagaGaragem( Integer vagaGaragem ) {
    	this.vagaGaragem = vagaGaragem;
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
     * Método responsável por retornar o valor do atributo areaConstruida.
     * @return String areaConstruida - areaConstruida a ser retornado(a).
     */
    public String getAreaConstruida() {
    	return areaConstruida;
    }

	/**
     * Método responsável por atribuir o valor ao atributo areaConstruida.
     * @param String areaConstruida - areaConstruida a ser atribuido(a).
     */
    public void setAreaConstruida( String areaConstruida ) {
    	this.areaConstruida = areaConstruida;
    }

	/**
     * Método responsável por retornar o valor do atributo casa.
     * @return CasaVO casa - casa a ser retornado(a).
     */
    public CasaVO getCasa() {
    	return casa;
    }

	/**
     * Método responsável por atribuir o valor ao atributo casa.
     * @param CasaVO casa - casa a ser atribuido(a).
     */
    public void setCasa( CasaVO casa ) {
    	this.casa = casa;
    }

	/**
     * Método responsável por retornar o valor do atributo apartamento.
     * @return ApartamentoVO apartamento - apartamento a ser retornado(a).
     */
    public ApartamentoVO getApartamento() {
    	return apartamento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo apartamento.
     * @param ApartamentoVO apartamento - apartamento a ser atribuido(a).
     */
    public void setApartamento( ApartamentoVO apartamento ) {
    	this.apartamento = apartamento;
    }

	/**
     * Método responsável por retornar o valor do atributo tipoNegociacao.
     * @return TipoNegociacaoVO tipoNegociacao - tipoNegociacao a ser retornado(a).
     */
    public TipoNegociacaoVO getTipoNegociacao() {
    	return tipoNegociacao;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoNegociacao.
     * @param TipoNegociacaoVO tipoNegociacao - tipoNegociacao a ser atribuido(a).
     */
    public void setTipoNegociacao( TipoNegociacaoVO tipoNegociacao ) {
    	this.tipoNegociacao = tipoNegociacao;
    }

	/**
     * Método responsável por retornar o valor do atributo tipoFinalidade.
     * @return TipoFinalidadeVO tipoFinalidade - tipoFinalidade a ser retornado(a).
     */
    public TipoFinalidadeVO getTipoFinalidade() {
    	return tipoFinalidade;
    }

	/**
     * Método responsável por atribuir o valor ao atributo tipoFinalidade.
     * @param TipoFinalidadeVO tipoFinalidade - tipoFinalidade a ser atribuido(a).
     */
    public void setTipoFinalidade( TipoFinalidadeVO tipoFinalidade ) {
    	this.tipoFinalidade = tipoFinalidade;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ( ( apartamento == null ) ? 0 : apartamento.hashCode() );
	    result = prime * result + ( ( areaConstruida == null ) ? 0 : areaConstruida.hashCode() );
	    result = prime * result + ( ( casa == null ) ? 0 : casa.hashCode() );
	    result = prime * result + ( ( descricao == null ) ? 0 : descricao.hashCode() );
	    result = prime * result + ( ( dormitorio == null ) ? 0 : dormitorio.hashCode() );
	    result = prime * result + ( ( idImovel == null ) ? 0 : idImovel.hashCode() );
	    result = prime * result + ( ( suite == null ) ? 0 : suite.hashCode() );
	    result = prime * result + ( ( tipoFinalidade == null ) ? 0 : tipoFinalidade.hashCode() );
	    result = prime * result + ( ( tipoNegociacao == null ) ? 0 : tipoNegociacao.hashCode() );
	    result = prime * result + ( ( vagaGaragem == null ) ? 0 : vagaGaragem.hashCode() );
	    result = prime * result + ( ( valor == null ) ? 0 : valor.hashCode() );
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
	    ImovelVO other = (ImovelVO) obj;
	    if ( apartamento == null ) {
		    if ( other.apartamento != null )
			    return false;
	    } else if ( !apartamento.equals( other.apartamento ) )
		    return false;
	    if ( areaConstruida == null ) {
		    if ( other.areaConstruida != null )
			    return false;
	    } else if ( !areaConstruida.equals( other.areaConstruida ) )
		    return false;
	    if ( casa == null ) {
		    if ( other.casa != null )
			    return false;
	    } else if ( !casa.equals( other.casa ) )
		    return false;
	    if ( descricao == null ) {
		    if ( other.descricao != null )
			    return false;
	    } else if ( !descricao.equals( other.descricao ) )
		    return false;
	    if ( dormitorio == null ) {
		    if ( other.dormitorio != null )
			    return false;
	    } else if ( !dormitorio.equals( other.dormitorio ) )
		    return false;
	    if ( idImovel == null ) {
		    if ( other.idImovel != null )
			    return false;
	    } else if ( !idImovel.equals( other.idImovel ) )
		    return false;
	    if ( suite == null ) {
		    if ( other.suite != null )
			    return false;
	    } else if ( !suite.equals( other.suite ) )
		    return false;
	    if ( tipoFinalidade == null ) {
		    if ( other.tipoFinalidade != null )
			    return false;
	    } else if ( !tipoFinalidade.equals( other.tipoFinalidade ) )
		    return false;
	    if ( tipoNegociacao == null ) {
		    if ( other.tipoNegociacao != null )
			    return false;
	    } else if ( !tipoNegociacao.equals( other.tipoNegociacao ) )
		    return false;
	    if ( vagaGaragem == null ) {
		    if ( other.vagaGaragem != null )
			    return false;
	    } else if ( !vagaGaragem.equals( other.vagaGaragem ) )
		    return false;
	    if ( valor == null ) {
		    if ( other.valor != null )
			    return false;
	    } else if ( !valor.equals( other.valor ) )
		    return false;
	    return true;
    }

	/**
     * Polimorfico
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	    return "ImovelVO [getIdImovel()=" + getIdImovel() + ", getValor()=" + getValor() + ", getDormitorio()=" + getDormitorio() + ", getSuite()=" + getSuite() + ", getVagaGaragem()=" + getVagaGaragem() + ", getDescricao()=" + getDescricao() + ", getAreaConstruida()=" + getAreaConstruida() + ", getCasa()=" + getCasa() + ", getApartamento()=" + getApartamento() + ", getTipoNegociacao()=" + getTipoNegociacao() + ", getTipoFinalidade()=" + getTipoFinalidade() + ", hashCode()=" + hashCode() + "]";
    }

}
