package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da
 * confirmação dos processos realizados na conexão.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:04:21
 * @version 1.0
 */
public final class CommitException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommitException( String message ){
		super( message );
	}

	public CommitException( String message, Throwable cause ){
		super( message, cause );
	}
}
