package jPKG;
//Model for creating classes in Java
//package 
//import 

public class Personas {
	private int edad;
	private String nombre;
	
	public int getEdad()
	{
		return this.edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/** Crear nueva persona*/
	public Personas(String nom, int eda){
		this.nombre = nom;
		this.edad = eda;		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre + ", Edad: " + this.edad ;
	}
}

