
package practica9;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Clase Función F
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 20, 2017.
 * Práctica #8 - Excepciones
 */
public class FuncionF {
    public static double f (double x) throws ArithmeticException{
            if(1>x) throw new ArithmeticException("f():"+x);
            return Math.sqrt(Math.pow(x,3)-1);
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x=0;
        while(true){
            try{
                System.out.println("Dame un número:");
                x = entrada.nextDouble();
                System.out.println("El resultado es: "+f(x));
            }
            
            catch(ArithmeticException e)
            {
                System.out.println("El valor " + x + " es menor a 1 y es inválido.");
                System.err.println(e);
            }
            catch(InputMismatchException e){
                System.out.println("Finalizando ejecución...");
                System.err.println(e);
                entrada.close();
                break;
            }
        }
    }
}
