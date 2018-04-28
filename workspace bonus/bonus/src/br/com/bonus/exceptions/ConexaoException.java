package br.com.bonus.exceptions;

import java.sql.SQLException;

/**
 * 
 * Classe que representa o erro ocorrido no ato da 
 * obtenção de uma conexão.
 *
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 02/10/2013 23:04:03
 * @version 1.0
 */
public final class ConexaoException extends SQLException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConexaoException(String message) {
		super(message);
	}

	public ConexaoException(String message, Throwable cause) {
		super(message, cause);
	}
}
