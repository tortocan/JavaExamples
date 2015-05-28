package jPKG;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class Comparacion extends Personas{
	
	public Comparacion(String nom, int eda) {
		super(nom, eda);
		// TODO Auto-generated constructor stub
	}

	/**Compares from the left side of the string 
	 * to the middle the right side to the middle
	 * and returns an boolean value*/
	private static boolean CompareString (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}		
		return bd;
	}
	/**Compares if is the same object 
	 * in memory and returns an boolean value*/
	public static boolean CompareObject (Object obj1, Object obj2)
	{
		boolean isSame = false;
		isSame = obj1.equals(obj2);
		return isSame;
	}
	
	public static void main(String[] args) {
		Personas p1 = new Personas("George", 27);
		Object p2 = p1;
		
		if (CompareString("poop"))
		{
			System.out.println("VERDADERO");
		} 
		else 
		{
			System.out.println("FALSO");
		}

		
		if(CompareObject(p1, p2))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
		
		
	}
	
	

}
