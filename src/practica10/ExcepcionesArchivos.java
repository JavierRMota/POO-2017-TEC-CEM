package practica10;

/*
 * Excepciones para el manejo de archivos
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExcepcionesArchivos {
	
    public static void main (String args[]) {
    
    	Scanner scan = null;
		
		try {
		
// aqui colocar�as el c�digo para procesar los datos previamente leidos				 
				 
		}		
		catch (FileNotFoundException e) {
			System.err.println(e);
			System.out.println("Archivo NO encontrado!!");
		} 
		catch (InputMismatchException e){
			System.err.println(e);
			System.out.println("Error en el tipo de datos!!");
		} 
		catch (NoSuchElementException e) {
			System.err.println(e);
			System.out.println("Error durante la lectura, faltan datos!!");
		}
		finally {
			scan.close();
      }
   } 
}
