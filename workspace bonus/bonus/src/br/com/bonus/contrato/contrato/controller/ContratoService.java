/**
 * 
 */
package br.com.bonus.contrato.contrato.controller;

import java.util.ArrayList;
import java.util.Date;

import br.com.bonus.contrato.contrato.model.ContratoBO;
import br.com.bonus.contrato.contrato.model.ContratoVO;
import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 03/12/2013 10:06:51
 * @version 1.0
 */
public class ContratoService{

	private ContratoBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static ContratoService instance;

	private ContratoService(){
		bo = new ContratoBO();
	}

	public static ContratoService getInstance() {
		if ( instance == null ) {
			instance = new ContratoService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( ContratoVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( ContratoVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( ContratoVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< ContratoVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< ContratoVO > consultarPorDataFim( Date dataFim ) throws ConsultarException {
		return bo.consultarPorDataFim( dataFim );
	}//Fim do M�todo consultarPorDataFim

}
