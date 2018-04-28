/**
 * 
 */
package br.com.bonus.imovel.casa.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.casa.model.CasaBO;
import br.com.bonus.imovel.casa.model.CasaVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 27/11/2013 09:04:28
 * @version 1.0
 */
public class CasaService{

	private CasaBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static CasaService instance;

	private CasaService(){
		bo = new CasaBO();
	}

	public static CasaService getInstance() {
		if ( instance == null ) {
			instance = new CasaService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( CasaVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( CasaVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( CasaVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< CasaVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< CasaVO > consultarPorAreaTotal( String areaTotal ) throws ConsultarException {
		return bo.consultarPorAreaTotal( areaTotal );
	}//Fim do M�todo consultarPorAreaTotal

}
