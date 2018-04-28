/**
 * 
 */
package br.com.bonus.pessoa.cliente.action_form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.pessoa.cliente.model.ClienteVO;
import br.com.bonus.telefone.telefone.model.TelefoneVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 26/11/2013 08:58:57
 * @version 1.0
 */
public final class ClienteForm extends ActionForm{

	/**
     * 
     */
    private static final long serialVersionUID = -3931842841832367204L;
    private Integer idCliente;
	private String cpf;
	private String rg;
	private String nome;
	private String email;
	private String dataNascimento;
	private TelefoneVO telefone;
	private EnderecoVO endereco;
	private ArrayList< TelefoneVO > listaTelefones = new ArrayList< TelefoneVO >();
	private	ArrayList< EnderecoVO > listaEnderecos = new ArrayList< EnderecoVO >();
	private String creci;
	private Boolean corretor;

	private ArrayList< ClienteVO > clientes = new ArrayList< ClienteVO >();

	public void limparCampos(){
		setCorretor( false );
		setCpf( "" );
		setCreci( "" );
		setDataNascimento( null );
		setEmail( "" );
		setEndereco( new EnderecoVO() );
		setIdCliente( null );
		setNome( "" );
		setRg( "" );
		setTelefone( new TelefoneVO() );
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
    public String getDataNascimento() {
    	return dataNascimento;
    }

	/**
     * Método responsável por atribuir o valor ao atributo dataNascimento.
     * @param Date dataNascimento - dataNascimento a ser atribuido(a).
     */
    public void setDataNascimento( String dataNascimento ) {
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
     * Método responsável por retornar o valor do atributo clientes.
     * @return ArrayList<ClienteVO> clientes - clientes a ser retornado(a).
     */
    public ArrayList< ClienteVO > getClientes() {
    	return clientes;
    }

	/**
     * Método responsável por atribuir o valor ao atributo clientes.
     * @param ArrayList<ClienteVO> clientes - clientes a ser atribuido(a).
     */
    public void setClientes( ArrayList< ClienteVO > clientes ) {
    	this.clientes = clientes;
    }

	/**
     * Método responsável por retornar o valor do atributo listaTelefones.
     * @return ArrayList<TelefoneVO> listaTelefones - listaTelefones a ser retornado(a).
     */
    public ArrayList< TelefoneVO > getListaTelefones() {
    	return listaTelefones;
    }

	/**
     * Método responsável por atribuir o valor ao atributo listaTelefones.
     * @param ArrayList<TelefoneVO> listaTelefones - listaTelefones a ser atribuido(a).
     */
    public void setListaTelefones( ArrayList< TelefoneVO > listaTelefones ) {
    	this.listaTelefones = listaTelefones;
    }

	/**
     * Método responsável por retornar o valor do atributo listaEnderecos.
     * @return ArrayList<EnderecoVO> listaEnderecos - listaEnderecos a ser retornado(a).
     */
    public ArrayList< EnderecoVO > getListaEnderecos() {
    	return listaEnderecos;
    }

	/**
     * Método responsável por atribuir o valor ao atributo listaEnderecos.
     * @param ArrayList<EnderecoVO> listaEnderecos - listaEnderecos a ser atribuido(a).
     */
    public void setListaEnderecos( ArrayList< EnderecoVO > listaEnderecos ) {
    	this.listaEnderecos = listaEnderecos;
    }
}
