package jPKG;

public class Alumno extends Personas {


	public Alumno(String nom, int eda) {
		super(nom, eda);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Personas p = new Personas("George",27);
		Personas p2 = new Personas("George",27);
		System.out.println( p2.equals(p));
		
		System.out.println(p.toString());
		
	}
	
	 
}
