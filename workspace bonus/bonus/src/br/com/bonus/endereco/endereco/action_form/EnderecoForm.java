/**
 * 
 */
package br.com.bonus.endereco.endereco.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.endereco.municipio.model.MunicipioVO;
import br.com.bonus.endereco.pais.model.PaisVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 10:11:14
 * @version 1.0
 */
public final class EnderecoForm extends ActionForm{
	
	/**
     * 
     */
    private static final long serialVersionUID = -2308166772853376033L;
	private String idEndereco;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private Integer codEstado;
	private Integer codPais;
	private Integer codMunicipio;
	private String complemento;
	private PaisVO pais = new PaisVO();
	private EstadoVO estado = new EstadoVO();
	private MunicipioVO municipio = new MunicipioVO();
	
	private ArrayList< EnderecoVO > enderecos = new ArrayList< EnderecoVO >();
	private ArrayList< MunicipioVO > listaMunicipios = new ArrayList< MunicipioVO >();
	private ArrayList< EstadoVO > listaEstados = new ArrayList< EstadoVO >();
	private ArrayList< PaisVO > listaPaises = new ArrayList< PaisVO >();
	

	/**
     * Método responsável por retornar o valor do atributo codPais.
     * @return Integer codPais - codPais a ser retornado(a).
     */
    public Integer getCodPais() {
    	return codPais;
    }

	/**
     * Método responsável por atribuir o valor ao atributo codPais.
     * @param Integer codPais - codPais a ser atribuido(a).
     */
    public void setCodPais( Integer codPais ) {
    	this.codPais = codPais;
    }

	/**
     * Método responsável por retornar o valor do atributo codMunicipio.
     * @return Integer codMunicipio - codMunicipio a ser retornado(a).
     */
    public Integer getCodMunicipio() {
    	return codMunicipio;
    }

	/**
     * Método responsável por atribuir o valor ao atributo codMunicipio.
     * @param Integer codMunicipio - codMunicipio a ser atribuido(a).
     */
    public void setCodMunicipio( Integer codMunicipio ) {
    	this.codMunicipio = codMunicipio;
    }

	/**
     * Método responsável por retornar o valor do atributo codEstado.
     * @return Integer codEstado - codEstado a ser retornado(a).
     */
    public Integer getCodEstado() {
    	return codEstado;
    }

	/**
     * Método responsável por atribuir o valor ao atributo codEstado.
     * @param Integer codEstado - codEstado a ser atribuido(a).
     */
    public void setCodEstado( Integer codEstado ) {
    	this.codEstado = codEstado;
    }

	/**
     * Método responsável por retornar o valor do atributo listaEstados.
     * @return ArrayList<EstadoVO> listaEstados - listaEstados a ser retornado(a).
     */
    public ArrayList< EstadoVO > getListaEstados() {
    	return listaEstados;
    }

	/**
     * Método responsável por atribuir o valor ao atributo listaEstados.
     * @param ArrayList<EstadoVO> listaEstados - listaEstados a ser atribuido(a).
     */
    public void setListaEstados( ArrayList< EstadoVO > listaEstados ) {
    	this.listaEstados = listaEstados;
    }

	/**
     * Método responsável por retornar o valor do atributo listaPaises.
     * @return ArrayList<PaisVO> listaPaises - listaPaises a ser retornado(a).
     */
    public ArrayList< PaisVO > getListaPaises() {
    	return listaPaises;
    }

	/**
     * Método responsável por atribuir o valor ao atributo listaPaises.
     * @param ArrayList<PaisVO> listaPaises - listaPaises a ser atribuido(a).
     */
    public void setListaPaises( ArrayList< PaisVO > listaPaises ) {
    	this.listaPaises = listaPaises;
    }

	/**
     * Método responsável por retornar o valor do atributo listaMunicipios.
     * @return ArrayList<MunicipioVO> listaMunicipios - listaMunicipios a ser retornado(a).
     */
    public ArrayList< MunicipioVO > getListaMunicipios() {
    	return listaMunicipios;
    }

	/**
     * Método responsável por atribuir o valor ao atributo listaMunicipios.
     * @param ArrayList<MunicipioVO> listaMunicipios - listaMunicipios a ser atribuido(a).
     */
    public void setListaMunicipios( ArrayList< MunicipioVO > listaMunicipios ) {
    	this.listaMunicipios = listaMunicipios;
    }

	/**
     * Método responsável por retornar o valor do atributo idEndereco.
     * @return String idEndereco - idEndereco a ser retornado(a).
     */
    public String getIdEndereco() {
    	return idEndereco;
    }

	/**
     * Método responsável por atribuir o valor ao atributo idEndereco.
     * @param String idEndereco - idEndereco a ser atribuido(a).
     */
    public void setIdEndereco( String idEndereco ) {
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
     * Método responsável por retornar o valor do atributo enderecos.
     * @return ArrayList<EnderecoVO> enderecos - enderecos a ser retornado(a).
     */
    public ArrayList< EnderecoVO > getEnderecos() {
    	return enderecos;
    }

	/**
     * Método responsável por atribuir o valor ao atributo enderecos.
     * @param ArrayList<EnderecoVO> enderecos - enderecos a ser atribuido(a).
     */
    public void setEnderecos( ArrayList< EnderecoVO > enderecos ) {
    	this.enderecos = enderecos;
    }

}
