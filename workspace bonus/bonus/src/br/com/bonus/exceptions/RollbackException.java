package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da
 * concelamento dos processos realizados na conexão.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:02:57
 * @version 1.0
 */
public final class RollbackException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RollbackException( String message ){
		super( message );
	}

	public RollbackException( String message, Throwable cause ){
		super( message, cause );
	}
}
