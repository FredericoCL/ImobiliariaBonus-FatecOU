package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da
 * exclusão de dados na base.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:03:33
 * @version 1.0
 */
public final class ExcluirException extends SQLException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcluirException( String message ){
		super( message );
	}

	public ExcluirException( String message, Throwable cause ){
		super( message, cause );
	}
}
