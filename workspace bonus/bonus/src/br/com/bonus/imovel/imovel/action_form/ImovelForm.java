/**
 * 
 */
package br.com.bonus.imovel.imovel.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.imovel.apartamento.model.ApartamentoVO;
import br.com.bonus.imovel.casa.model.CasaVO;
import br.com.bonus.imovel.imovel.model.ImovelVO;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;
import br.com.bonus.imovel.tiponegociacao.model.TipoNegociacaoVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:20:39
 * @version 1.0
 */
public class ImovelForm extends ActionForm{
	
	private String idImovel;
	private String valor;
	private String dormitorio;
	private String suite;
	private String vagaGaragem;
	private String descricao;
	private String areaConstruida;
	private CasaVO casa;
	private ApartamentoVO apartamento;
	private TipoNegociacaoVO tipoNegociacao;
	private TipoFinalidadeVO tipoFinalidade;
	
	private ArrayList< ImovelVO > imoveis = new ArrayList< ImovelVO >();

	/**
     * Método responsável por retornar o valor do atributo idImovel.
     * @return String idImovel - idImovel a ser retornado(a).
     */
    public String getIdImovel() {
    	return idImovel;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idImovel.
     * @param String idImovel - idImovel a ser atribuido(a).
     */
    public void setIdImovel( String idImovel ) {
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
     * @return String dormitorio - dormitorio a ser retornado(a).
     */
    public String getDormitorio() {
    	return dormitorio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dormitorio.
     * @param String dormitorio - dormitorio a ser atribuido(a).
     */
    public void setDormitorio( String dormitorio ) {
    	this.dormitorio = dormitorio;
    }

	/**
     * Método responsável por retornar o valor do atributo suite.
     * @return String suite - suite a ser retornado(a).
     */
    public String getSuite() {
    	return suite;
    }

	/**
     * Método responsável por atribuir o valor ao atributo suite.
     * @param String suite - suite a ser atribuido(a).
     */
    public void setSuite( String suite ) {
    	this.suite = suite;
    }

	/**
     * Método responsável por retornar o valor do atributo vagaGaragem.
     * @return String vagaGaragem - vagaGaragem a ser retornado(a).
     */
    public String getVagaGaragem() {
    	return vagaGaragem;
    }

	/**
     * Método responsável por atribuir o valor ao atributo vagaGaragem.
     * @param String vagaGaragem - vagaGaragem a ser atribuido(a).
     */
    public void setVagaGaragem( String vagaGaragem ) {
    	this.vagaGaragem = vagaGaragem;
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
     * Método responsável por retornar o valor do atributo imoveis.
     * @return ArrayList<ImovelVO> imoveis - imoveis a ser retornado(a).
     */
    public ArrayList< ImovelVO > getImoveis() {
    	return imoveis;
    }

	/**
     * Método responsável por atribuir o valor ao atributo imoveis.
     * @param ArrayList<ImovelVO> imoveis - imoveis a ser atribuido(a).
     */
    public void setImoveis( ArrayList< ImovelVO > imoveis ) {
    	this.imoveis = imoveis;
    }

}
