
package practica9;

import java.util.Scanner;
/*
 * Clase Promedio Exception
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 20, 2017.
 * Práctica #8 - Excepciones
 */
public class PromedioException {
    
    public static double promedio (int n){
        int suma=0,numero;
        Scanner entrada2 = new Scanner(System.in);
        for (int x=0;x<n;x++){
        
            
            System.out.println("Dato " + (x+1) + ":");
            numero=entrada2.nextInt();
            suma+=numero;
        }
        entrada2.close();
        return (double)suma/n;
    }
    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Ingresa el número de datos que deseas promediar:");
            n= entrada.nextInt();
            if(n<0) throw new IllegalArgumentException("main():"+n);
            System.out.println("El promedio es "+promedio(n));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("El dato debe ser positivo");
            System.err.println(e);
            
        }
        finally{
            entrada.close();
        }
    }
}
