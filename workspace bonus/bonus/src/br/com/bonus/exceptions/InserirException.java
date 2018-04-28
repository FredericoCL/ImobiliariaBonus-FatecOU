package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da
 * insersão de dados na base.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:03:14
 * @version 1.0
 */
public final class InserirException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InserirException( String message ){
		super( message );
	}

	public InserirException( String message, Throwable cause ){
		super( message, cause );
	}
}
