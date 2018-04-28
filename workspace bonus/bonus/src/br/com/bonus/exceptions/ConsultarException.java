package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da 
 * consulta de dados na base.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:03:48
 * @version 1.0
 */
public final class ConsultarException extends SQLException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConsultarException(String message) {
		super(message);
	}

	public ConsultarException(String message, Throwable cause) {
		super(message, cause);
	}
}
