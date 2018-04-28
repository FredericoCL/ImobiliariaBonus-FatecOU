/**
 * 
 */
package br.com.bonus.imovel.imovel.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.imovel.model.ImovelBO;
import br.com.bonus.imovel.imovel.model.ImovelVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 30/11/2013 09:44:45
 * @version 1.0
 */
public class ImovelService{

	private ImovelBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static ImovelService instance;

	private ImovelService(){
		bo = new ImovelBO();
	}

	public static ImovelService getInstance() {
		if ( instance == null ) {
			instance = new ImovelService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoContratoService

	/* T�RMINO DO SINGLETON */

	public void inserir( ImovelVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( ImovelVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( ImovelVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< ImovelVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< ImovelVO > consultarPorDormitorio( String dormitorio ) throws ConsultarException {
		return bo.consultarPorDormitorio( dormitorio );
	}//Fim do M�todo consultarPorDormitorio

}
