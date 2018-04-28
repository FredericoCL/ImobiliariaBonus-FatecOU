/**
 * 
 */
package br.com.bonus.contrato.contrato.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.contrato.contrato.model.ContratoVO;
import br.com.bonus.contrato.tipocontrato.model.TipoContratoVO;
import br.com.bonus.imovel.imovel.model.ImovelVO;
import br.com.bonus.pessoa.cliente.model.ClienteVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 10:18:17
 * @version 1.0
 */
public class ContratoForm extends ActionForm{
	
	/**
     * 
     */
    private static final long serialVersionUID = -3857761463721135213L;
	private String idContrato;
	private String dataInicio;
	private String dataFim;
	private TipoContratoVO tipoContrato;
	private ClienteVO cliente;
	private ImovelVO imovel;

	private ArrayList< ContratoVO > contratos = new ArrayList< ContratoVO >();

	/**
     * Método responsável por retornar o valor do atributo idContrato.
     * @return String idContrato - idContrato a ser retornado(a).
     */
    public String getIdContrato() {
    	return idContrato;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idContrato.
     * @param String idContrato - idContrato a ser atribuido(a).
     */
    public void setIdContrato( String idContrato ) {
    	this.idContrato = idContrato;
    }

	/**
     * Método responsável por retornar o valor do atributo dataInicio.
     * @return String dataInicio - dataInicio a ser retornado(a).
     */
    public String getDataInicio() {
    	return dataInicio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataInicio.
     * @param String dataInicio - dataInicio a ser atribuido(a).
     */
    public void setDataInicio( String dataInicio ) {
    	this.dataInicio = dataInicio;
    }

	/**
     * Método responsável por retornar o valor do atributo dataFim.
     * @return String dataFim - dataFim a ser retornado(a).
     */
    public String getDataFim() {
    	return dataFim;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataFim.
     * @param String dataFim - dataFim a ser atribuido(a).
     */
    public void setDataFim( String dataFim ) {
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
     * Método responsável por retornar o valor do atributo contratos.
     * @return ArrayList<ContratoVO> contratos - contratos a ser retornado(a).
     */
    public ArrayList< ContratoVO > getContratos() {
    	return contratos;
    }

	/**
     * Método responsável por atribuir o valor ao atributo contratos.
     * @param ArrayList<ContratoVO> contratos - contratos a ser atribuido(a).
     */
    public void setContratos( ArrayList< ContratoVO > contratos ) {
    	this.contratos = contratos;
    }

}
