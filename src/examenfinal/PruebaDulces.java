
package examenfinal;
/*
 * Programacion Orientada a Objetos
 * 2017-11  Examen final
 * Autor:José Javier Rodríguez Mota
 * Matrícula: A01372812
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PruebaDulces {
	
	public static void main (String args[]) {
    
    	Chocolate cho[] = new Chocolate[8];
      	Palanqueta pal[] = new Palanqueta[4];
      
 		Scanner scan = null;
		String nombre, sabor, marca, presentacion, relleno;
		int tamanio, i = 0, j = 0;
		double costo;
		
		try {
                    // IMPLEMENTAR AQUI LA LECTURA DEL ARCHIVO Y EL LLENADO DE ARREGLOS
                    scan = new Scanner (new FileReader("Dulces.txt"));
                    scan.useDelimiter("[\t\n\r]+");
                    while(scan.hasNextLine()){
                        nombre=scan.next();
                        sabor=scan.next();
                        marca=scan.next();
                        presentacion=scan.next();
                        costo=scan.nextDouble();
                        System.out.println(nombre+sabor+marca+presentacion+costo);
                        if(nombre.equalsIgnoreCase("Chocolate"))
                        {
                            tamanio=scan.nextInt();
                            relleno=scan.next();
                            cho[i++]= new Chocolate (nombre, sabor, marca, presentacion,costo,tamanio, relleno);
                        }
                        else
                        {
                            pal[j++]= new Palanqueta(nombre,sabor,marca,presentacion,costo);
                        }
                    }
		} 
		catch (FileNotFoundException e) {
			System.err.println(e);
			System.out.println("\nError de apertura de archivo");
		} 
		catch (InputMismatchException e) {
			System.err.println(e); 
			System.out.println("\nError de tipo de datos");
		} 
		catch (java.util.NoSuchElementException e){
			System.err.println(e);
			System.out.println("\nError! Faltan datos");
		}
		finally {
			scan.close();
      	}
         
         
         
         
      	System.out.println("\n\n*** CHOCOLATES ***");
 		for(Chocolate c : cho)
                {
                    System.out.print(c);
                    System.out.println("\n\n");
                }
			 
	  	System.out.println("\n\n*** PALANQUETAS ***");
	  	for(Palanqueta p : pal)
                {
                    System.out.print(p);
                    System.out.println("\n\n");
                    
                }
	  	 	
	  	 	
	  	System.out.println("\n\n*** PRUEBAS POLIMORFICAS ***");		
		// IMPLEMENTAR
                System.out.println("Costo del dulce :"+ getCosto(cho[3]));
                System.out.println("Costo del dulce :"+ getCosto(pal[2]));
                System.out.println("Costo del dulce :"+ getCosto(cho[0]));
                System.out.println("Costo del dulce :"+ getCosto(pal[0]));
	  	System.out.println(setTamanio(cho[0],3));
                System.out.println(setTamanio(cho[1],2));
                System.out.println(setTamanio(pal[0],3));
                System.out.println(setTamanio(cho[2],5));
	  	
	  	
	  	
	  	
	  	
	  	System.out.println("\n\n*** CHOCOLATE CON RELLENO DE NUTELLA MAS CARO ***");
		System.out.println(mayorCosto(cho, "Nutella"));
	
	  	System.out.println("\n\n*** CHOCOLATE CON RELLENO DE FRESA MAS CARO ***");
		System.out.println(mayorCosto(cho, "Fresa"));

		
		System.out.println("\n\n");
	}
	


 	// IMPLEMENTAR	
	public static Chocolate mayorCosto(Chocolate []c, String relleno){
            Chocolate mayor=null;
            for(Chocolate ch : c)
            {
                if(relleno.equalsIgnoreCase(ch.getRelleno()))
                {
                    if(mayor==null)
                    {
                        mayor=ch;
              
                    } 
                    else
                        if(mayor.getCosto()<ch.getCosto()) mayor=ch;
                }
            }
            return mayor;
        }
        public static double getCosto(Dulce d)
        {
            return d.getCosto();
        }
        public static String setTamanio(Dulce d, int tam)
        {
            if(d!= null && d instanceof Chocolate)
            {
                Chocolate c = (Chocolate) d;
                c.setTamanio(tam);
                return "Nuevo tamanio del chocolate "+c.getTamanio();
            }
            else return "NO SE PUEDE ASIGNAR TAMANIO";
        }

	// IMPLEMENTAR AQUI TUS DOS METODOS CON PRUEBAS POLIMORFICAS
	// USANDO LA CLASE ABSTRACTA DULCE Y LA INTERFAZ RELLENO
	// RECUERDA INCLUIR LA PRUEBA DE AMBOS M�TODOS EN EL MAIN EN 
	// DONDE DICE: *** PRUEBAS POLIMORFICAS ***
}
    
