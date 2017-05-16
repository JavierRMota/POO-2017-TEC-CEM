package ejercicio1;
/**
 *
 * @author Javier
 */
public class FormulaChicharronera 
{
  public static void main(String[] args)
  {
      int b = 25, a = 4;
      double c = 4.92, x1, x2;
      
      x1=((b * -1)+ Math.sqrt(Math.pow(b,2)- 4 * a * c))/(2 * a);
      x2=((b * -1)- Math.sqrt(Math.pow(b,2)- 4 * a * c))/(2 * a);
      System.out.println("Primer resultado:"+x1);
      System.out.println("Segundo resultado:"+x2);
  }
}
