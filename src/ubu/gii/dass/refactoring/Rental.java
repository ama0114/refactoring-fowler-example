package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */
public class Rental {
	private MovieType _movie;
	private int _daysRented;
	private double amount;

	public Rental(MovieType movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public MovieType getMovie() {
		return _movie;
	}
	
	public double getCharge() {
		double thisAmount = 0;
		// determine amounts for each line
		switch (getMovie().getPriceCode()) {
		case MovieType.REGULAR:
			thisAmount += 2;
			if (getDaysRented() > 2)
				thisAmount += (getDaysRented() - 2) * 1.5;
			break;
		case MovieType.NEW_RELEASE:
			thisAmount += getDaysRented() * 3;
			break;
		case MovieType.CHILDRENS:
			thisAmount += 1.5;
			if (getDaysRented() > 3)
				thisAmount += (getDaysRented() - 3) * 1.5;
			break;
		}
		
		return thisAmount;
	}

	public int getFrequentRenterPoints() {
		int frequentRenterPoints=0;
		
		// add frequent renter points
		frequentRenterPoints++;
		
		// add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == MovieType.NEW_RELEASE)
				&& getDaysRented() > 1)
			frequentRenterPoints++;
		// show figures for this rental
		return frequentRenterPoints;
	}
}
