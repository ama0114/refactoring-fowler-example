package ubu.gii.dass.refactoring;
public class VideoClubAplicacion {

	public static void main(String[] arg) {
		MovieType m1 = new MovieType("Sky Captain", 1);
		MovieType m3 = new MovieType("Accion Mutante", 0);
		MovieType m4 = new MovieType("Hermano Oso", 2);

		Customer c1 = new Customer("Manuel");

		Rental r1 = new Rental(m1, 5);
		Rental r2 = new Rental(m3, 1);
		Rental r3 = new Rental(m4, 10);

		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);

		System.out.println(c1.statement());

	}

}