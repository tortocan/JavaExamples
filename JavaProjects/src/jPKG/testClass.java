package jPKG;

import java.io.FileNotFoundException;
import java.io.IOException;


public class testClass extends FileRW {

	private static FileRW f;

	public testClass(String pathString) throws FileNotFoundException,
			IOException {
		super(pathString);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		f = new FileRW("EJERCICIOS_REPASO.txt");
		String[] array = f.fileToArray();

//		for (String cadena : array)
//		{
//			System.out.println(cadena);
//		}		
		f.arrToFile(array,"test","csv");
		f.arrToFile(array,"test","txt");
		f.arrToFile(array,"test2","doc");
		f.arrToFile(array,"test3","xls");
	}
}
