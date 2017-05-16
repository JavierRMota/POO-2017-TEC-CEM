/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class AbrirArchivo {
    Scanner entrada = null;
    public void abrirArchivoClientes()
    {
        try {
		entrada = new Scanner(new FileReader("grades.txt"));
		entrada.useDelimiter("[\t\n\r]+");
		while ( entrada.hasNextLine() ) {
                    linea = entrada.nextLine();
                    nombre = linea.substring(0,linea.indexOf('\t'));
                    materia = linea.substring(linea.indexOf('\t')+1, linea.lastIndexOf('\t'));
                    puntos = linea.substring(linea.lastIndexOf('\t')+1);
                    System.out.println(nombre + "->" + materia + " -> " + Integer.parseInt(puntos) );
		}				 
        }		
        catch (FileNotFoundException e) 
        {
            System.err.println(e);
            System.out.println("Archivo NO encontrado!!");
        } 
        catch (InputMismatchException e)
        {
            System.err.println(e);
            System.out.println("Error en el tipo de datos!!");
        }
        catch (NoSuchElementException e) 
        {
            System.err.println(e);
            System.out.println("Error durante la lectura, faltan datos!!");
        }
        finally 
        {
            scan.close();
        }
    }
    
    
}
