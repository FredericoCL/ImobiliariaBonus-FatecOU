/**
 * 
 */
package br.com.bonus.utilidades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe que representa
 * 
 * 
 * @author Frederico Lessa <fred.lessa@gmail.com>
 * @since 01/10/2013 22:55:09
 * @version 1.0
 */
public abstract class Utilidades{

	private static Pattern pattern;
	private static Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * 
	 * Converte uma String para um objeto Date. Caso a String seja vazia ou nula,
	 * retorna null - para facilitar em casos onde formulários permitam campos
	 * de datas vazios.
	 * 
	 * @param data String no formato dd/MM/yyyy a ser formatada
	 *        d - Dia do mês.
	 *        M - Mês do ano.
	 *        y - Ano.
	 * @return Date Objeto Date ou null caso receba uma String vazia ou nula.
	 * @throws ParseException
	 * 
	 * @param String dataString - Data no formato texto que será convertida em Date
	 * @return Date - Data criada com o formato dd/MM/aaaa -> Ex: 02/09/2012.
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 01/10/2013 22:56:48
	 * @version 1.0
	 */
	public static Date formatarDataStringParaDataDate( String dataString ) throws ParseException {
		if ( dataString == null || dataString.length() != 10 ) {
			throw new IllegalArgumentException( "Data informada encontra-se inválida." );
		}

		// Variavel onde será guardada a data transformada.
		Date dataConvertida;

		// Criando o conversor de String para Date.
		DateFormat conversor = new SimpleDateFormat( "dd/MM/yyyy" );

		// Forçando o conversor a não criar datas inválidas
		conversor.setLenient( false );

		// Convertendo
		dataConvertida = conversor.parse( dataString );

		return dataConvertida;

	}

	/**
	 * 
	 * Método responsável por retornar uma data no formato String.
	 * Ex : Date - 1986-01-05 00:00:00.0
	 * String - 05/01/1986
	 * 
	 * @param Date dataDate - Data a ser formatada.
	 * @return String dataConvertida - Data convertida para String.
	 * @throws IllegalArgumentException
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 01/10/2013 22:57:55
	 * @version 1.0
	 */
	public static String formatarDataDateParaDataString( Date dataDate ) throws IllegalArgumentException {
		if ( dataDate == null ) {
			throw new IllegalArgumentException( "Data informada encontra-se nula" );
		}

		String dataConvertida;

		// Informando o formato(mascara) em que a data deverá ser convertida.
		DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );

		// Convertendo
		dataConvertida = formatter.format( dataDate );

		return dataConvertida;

	}

	/**
	 * 
	 * Método responsável por carregar dinamicamente um arquivo properties.
	 * Com este método, independemente do local onde estiver o .jar,
	 * ele vai conseguir identificar o .properties.
	 * 
	 * @param Object obj = Objeto que sejá usado como referencia de localidade.
	 * @return Properties - Arquivo Properties carregado.
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 01/10/2013 22:58:34
	 * @version 1.0
	 */
	public static Properties getProperties( Object obj ) {
		InputStream inputStream;
		Properties properties = new Properties();

		try {
			// Localiza e Lê o arquivo properties informado
			inputStream = obj.getClass().getClassLoader().getResourceAsStream( "properties/jdbc_settings.properties" );

			if ( inputStream == null ) {
				properties.load( new FileReader( "properties/jdbc_settings.properties" ) );
			} else {
				properties.load( inputStream );
			}
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		return properties;

	}

	/**
	 * 
	 * Validate hex with regular expression
	 * 
	 * @param hex
	 *        hex for validation
	 * @return true valid hex, false invalid hex
	 * 
	 * @author Frederico Lessa <fred.lessa@gmail.com>
	 * @since 01/10/2013 22:59:10
	 * @version 1.0
	 */
	public static boolean validate( final String hex ) {
		pattern = Pattern.compile( EMAIL_PATTERN );
		matcher = pattern.matcher( hex );
		return matcher.matches();

	}

}
