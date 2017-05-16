/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;


/**
 *
 * @author Javier
 */
public class OperacionesMatematicas 
{
    public static void main(String[] args)
    {
      int opcion;
      double c,d;
      int a,b;
      System.out.println("Elige:\n1. Fórmula Chicharronero \n2. Suma \n3. División \n0. Salir");
      Scanner entrada = new Scanner(System.in);
      opcion= entrada.nextInt();
      while (opcion!=0){
      switch (opcion)
      {
          case 1:
              System.out.println("a=");
              a=entrada.nextInt();
              System.out.println("b=");
              b=entrada.nextInt();
              System.out.println("c=");
              c=entrada.nextDouble();
              System.out.println(formulaChicharronero(a,b,c));
              break;
          case 2:
              System.out.println("num1=");
              c=entrada.nextDouble();
              System.out.println("num2=");
              d=entrada.nextDouble();
              System.out.println("La suma de "+c+" + "+d+" es "+(suma(c,d)));
              break;
          case 3:
              System.out.println("num1=");
              c=entrada.nextDouble();
              System.out.println("num2=");
              d=entrada.nextDouble();
              System.out.println("La división de "+c+" / "+d+" es "+division(c,d));
              break;
          default:
              System.out.println("Escribe lo que quieras, de todos modos no te voy a hacer caso.");
      }
      System.out.println("Elige:\n1. Fórmula Chicharronero \n2. Suma \n3. División \n0. Salir");
      opcion= entrada.nextInt();
      }
    }
    
    public static String formulaChicharronero(int a, int b, double c)
    {
      double x1, x2;
      x1=((b * -1)+ Math.sqrt(Math.pow(b,2)- 4 * a * c))/(2 * a);
      x2=((b * -1)- Math.sqrt(Math.pow(b,2)- 4 * a * c))/(2 * a);
      String result = "Primer resultado"+x1+"\nSegundo resultado:"+x2;
      
      return result;
    }
    public static double suma(double x, double y)
    {
        double result = x+y;
           
        return result;
   
    }
    public static double division(double x, double y)
    {
        try
        {
           double result = x/y;
           
           return result;
        }
        catch(Exception e)
        {
            System.out.println("División entre cero");
            return 0;
        } 

    }
}
