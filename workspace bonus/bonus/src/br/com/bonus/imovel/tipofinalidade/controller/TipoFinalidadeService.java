/**
 * 
 */
package br.com.bonus.imovel.tipofinalidade.controller;

import java.util.ArrayList;

import br.com.bonus.exceptions.AlterarException;
import br.com.bonus.exceptions.ConsultarException;
import br.com.bonus.exceptions.ExcluirException;
import br.com.bonus.exceptions.InserirException;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeBO;
import br.com.bonus.imovel.tipofinalidade.model.TipoFinalidadeVO;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 16/11/2013 12:39:34
 * @version 1.0
 */
public final class TipoFinalidadeService{

	private TipoFinalidadeBO bo = null;

	/**
	 * Aplicando o singleton na classe Service.
	 * Com isso ela n�o poder� ser instanciada por mais ningu�m al�m dela mesma
	 */

	/* IN�CIO DO SINGLETON */
	private static TipoFinalidadeService instance;

	private TipoFinalidadeService(){
		bo = new TipoFinalidadeBO();
	}

	public static TipoFinalidadeService getInstance() {
		if ( instance == null ) {
			instance = new TipoFinalidadeService();
		}//Fim do IF

		return instance;
	}//Fim do M�todo TipoFinalidadeService

	/* T�RMINO DO SINGLETON */

	public void inserir( TipoFinalidadeVO vo ) throws InserirException {
		bo.inserir( vo );
	}//Fim do M�todo inserir

	public void alterar( TipoFinalidadeVO vo ) throws AlterarException {
		bo.alterar( vo );
	}//Fim do M�todo alterar

	public void excluir( TipoFinalidadeVO vo ) throws ExcluirException {
		bo.excluir( vo );
	}//Fim do M�todo excluir

	public ArrayList< TipoFinalidadeVO > consultarTodos() throws ConsultarException {
		return bo.consultarTodos();
	}//Fim do M�todo consultarTodos

	public ArrayList< TipoFinalidadeVO > consultarPorDescricao( String descricao ) throws ConsultarException {
		return bo.consultarPorDescricao( descricao );
	}//Fim do M�todo consultarPorDescricao

}
