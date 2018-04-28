/**
 * 
 */
package br.com.bonus.teste;

import org.junit.Test;

import br.com.bonus.endereco.endereco.dao.EnderecoDAOServiceImpl;
import br.com.bonus.endereco.endereco.model.EnderecoVO;
import br.com.bonus.endereco.estado.model.EstadoVO;
import br.com.bonus.endereco.municipio.model.MunicipioVO;
import br.com.bonus.endereco.pais.model.PaisVO;
import br.com.bonus.exceptions.InserirException;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 07/11/2013 15:03:21
 * @version 1.0
 */
public class TestaEndereco{

	@Test
	public void testarInserir() throws InserirException {
		PaisVO paisVO = new PaisVO();
		paisVO.setIdPais( 1 );

		EstadoVO estadoVO = new EstadoVO();
		estadoVO.setIdEstado( 1 );

		MunicipioVO municipioVO = new MunicipioVO();
		municipioVO.setIdMunicipio( 1 );

		EnderecoVO vo = new EnderecoVO( null, "Dra Nilza Lemes de Oliviera", "350", "Vila Soares", "19960-020", "Casa 100", paisVO, estadoVO, municipioVO );

		EnderecoDAOServiceImpl dao = new EnderecoDAOServiceImpl();
		dao.inserir( vo );

	}//Fim do Método testarInserir

}
