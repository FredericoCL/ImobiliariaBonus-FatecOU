/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.exceptions.InserirException;
import br.com.bonus.telefone.telefone.dao.TelefoneDAOServiceImpl;
import br.com.bonus.telefone.telefone.model.TelefoneVO;
import br.com.bonus.telefone.tipotelefone.model.TipoTelefoneVO;

/**
 * Classe que representa
 *
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 04/11/2013 20:28:13
 * @version 1.0
 */
public class TestaTelefone{
	
	@Test
	 public void testarInserir() throws InserirException {
	  TipoTelefoneVO tipoTelefoneVO = new TipoTelefoneVO();
	  tipoTelefoneVO.setIdTipoTelefone( 1 );
	  
	  TelefoneVO vo = new TelefoneVO( null, "014", "99608-2826", "Sem Ramal", tipoTelefoneVO );

	  TelefoneDAOServiceImpl dao = new TelefoneDAOServiceImpl();
	  dao.inserir( vo );

	 }//Fim do Método testarInserir

}
