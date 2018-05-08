package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie extends MovieType {
	
	private String _title;
	private MovieType _type;

	public Movie(String title, int priceCode) {
		_title = title;
		_type = MovieType.createMovieType(priceCode);
	}

	public int getPriceCode() {
		return _type.getPriceCode();
	}


	public String getTitle() {
		return _title;
	}
}
