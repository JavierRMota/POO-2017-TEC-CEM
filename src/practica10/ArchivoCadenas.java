/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/*
 * Clase Archivo Cadenas
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 4, 2017.
 * Práctica #10 - Archivos
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArchivoCadenas {
    public static void main (String args[]) {
        String palabra, lexmax,lexmin;
        double promedio=0,promedioD=0, doble,mayorD,menorD;
        int entero, x,mayor,menor,countJ=0;
    	Scanner scan = null;
		
		try {
                    scan= new Scanner(new FileReader("Entrada.txt"));
                    scan.useDelimiter("[\t\n\r]+");
                    
                    //Inicializamos todas las variables
                    palabra=scan.next();
                    entero= scan.nextInt();
                    doble= scan.nextDouble();
                    x=1;
                    lexmax=palabra;
                    lexmin=palabra;
                    mayorD=doble;
                    menorD=doble;
                    mayor=entero;
                    menor=entero;
                    promedioD+=doble;
                    promedio+=entero;
                    if(palabra.equalsIgnoreCase("java"))countJ++;
                    //Imprimimos la primera línea
                    System.out.println(palabra + "\t" + entero + "\t" + doble );
                    
                    //While para acabar de imprimir y ver todos los elementos
                    while ( scan.hasNextLine() ) {
                        x++;
                        palabra=scan.next();
                        entero= scan.nextInt();
                        doble= scan.nextDouble();
                        if(lexmax.compareToIgnoreCase(palabra)<0)lexmax=palabra;
                        if(lexmin.compareToIgnoreCase(palabra)>0)lexmin=palabra;
                        if(mayor<entero)mayor=entero;
                        if(menor>entero)menor=entero;
                        if(mayorD<doble)mayorD=doble;
                        if(menorD>doble)menorD=doble;
                        promedioD+=doble;
                        promedio+=entero;
                        if(palabra.equalsIgnoreCase("java"))countJ++;
			System.out.println(palabra + "\t" + entero + "\t" + doble );
			}
                        promedio/=x;
                        promedioD/=x;
                        System.out.println("El menor de los datos enteros es: "+menor);
                        System.out.println("El mayor de los datos enteros es: "+mayor);
                        System.out.println("El menor de los datos doubles es: "+menorD);
                        System.out.println("El mayor de los datos doubles es: "+mayorD);
                        System.out.println("El promedio de los datos enteros es: "+promedio);
                        System.out.println("El promedio de los datos doubles es: "+promedioD);
                        System.out.println("La cadena lexicográficamente mayor es: "+lexmax);
                        System.out.println("La cadena lexicográficamente menor es: "+lexmin);
                        System.out.println("La palabra Java se encontró "+countJ+" veces en el archivo.");
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
