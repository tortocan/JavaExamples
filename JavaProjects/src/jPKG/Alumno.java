package jPKG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Alumno extends Personas {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Alumno(String nom, int eda) {
		super(nom, eda);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, IOException  {

		Personas p = new Personas("George",27);
		Personas p2 = new Personas("George",27);
		System.out.println( p2.equals(p));

		System.out.println(p.toString());
		
		
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("media3.dat"));
		salida.writeObject(p);
		salida.close();
		
		
//		ObjectInputStream entrada =new ObjectInputStream (new FileInputStream("media3.dat"));
//		p = (Personas)entrada.read();
//		entrada.close();

	}
	

	 
}
