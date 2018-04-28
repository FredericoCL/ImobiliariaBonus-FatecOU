package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da
 * alteração de dados na base.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:04:35
 * @version 1.0
 */
public final class AlterarException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlterarException( String message ){
		super( message );
	}

	public AlterarException( String message, Throwable cause ){
		super( message, cause );
	}
}
