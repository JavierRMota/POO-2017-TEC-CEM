package practica11;
/*
 * Clase Archivo Cadenas
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 4, 2017.
 * Práctica #11 - Cadenas
 */

import java.util.Random;
import java.util.Scanner;

public class Oraciones {

	public static void imprimeOraciones(int total){
            String[] articulo={"el","la","ningun","algun","un","una"};
            String[] nombre={"hombre","perro","ninio","doctor","auto"};
            String[] verbo={"manejo","salto","corrio","camino","brinco"};
            String[] preposicion={"a","desde","sobre","con","en","de","hacia"};
            String resCadena= "";
            Random rnd = new Random();	
            // Ciclo for que genera articulos, nombres, verbos y preposiciones de manera aleatoria y las concatena en un string.
            for (int i = 0; i < total; i++){
                int posArt = rnd.nextInt(articulo.length);
                int posNom = rnd.nextInt(nombre.length);
                int posVer = rnd.nextInt(verbo.length);
                int posPre = rnd.nextInt(preposicion.length);
		
                resCadena += articulo[posArt] + " ";
                resCadena += nombre[posNom] + " ";           
                resCadena += verbo[posVer] + " ";
                resCadena += preposicion[posPre] + " ";
                posArt = rnd.nextInt(articulo.length);
                resCadena += articulo[posArt] + " ";
                posNom = rnd.nextInt(nombre.length);
                resCadena += nombre[posNom] + ".";
                System.out.println(resCadena + "\n");
                resCadena = "";
            }                       
	}
	
	
	
	
	public static String cambiaCadena(String str, String pal1, String pal2) {
            
            // Variables de instancia.
            StringBuilder sb = new StringBuilder (str.length());
            int pre = 0;
            int pos = str.indexOf(pal1);
            // Condicional que pregunta que si el indice pos es -1 (no encuentra palabra) regresa el string que le mandaron.
            if (pos == -1){
                return str;    
            }
            // Ciclo while que continuara hasta que el indice pos sea -1 (no encuentre la palabra a cambiar).
            while (pos != -1){
                // Al StringBuilder se le concatena el substring del indice pre hasta el indice pos-1.
                sb.append(str.substring(pre, pos-1));
                // Al StringBuilder se le concatena un espacio en blanco y la palabra por la que se iba cambiar del string original.
                sb.append(" ").append(pal2);
                pre = pos + pal1.length();
                pos = str.indexOf(pal1, pre);
            }
            // Se regresa el StringBuilder que se va a imprimir.
            return sb.toString();
	}

	public static String eliminaPalabra(String str, String pal1) {
            // Se declaran variables un arreglo y una cadena vacia.
            String strRes = "";
            String [] arr = str.split(" ");    
            // Se pone un ciclo for que recorre el arreglo y despues un condicional que si la palabra no coincide la agrega al arreglo en caso contrario la omite.
            for (int i = 0; i < arr.length; i++ ){
                if (!arr[i].equalsIgnoreCase(pal1) && !arr[i].equalsIgnoreCase(pal1 + ",") && !arr[i].equalsIgnoreCase(pal1 + ".")){
                    strRes += arr[i] + " ";
                }                
            }
            // Se regresa el string resultante de la concatenacion dependiendo del condicional del ciclo for
            return strRes;            
	}
	

		
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		String pal, pal2;
		char letra;
		
// Probando la generaci�n aleatoria de oraciones
		
		System.out.println("\n\n***  Generando 5 oraciones aleatorias  *** \n");
 		
		imprimeOraciones(5);


// Probando la sustituci�n de una palabra por otra
		
		System.out.println("\n\n***  Probando la sustitucion de una palabra por otra  *** \n");

		String str2 = "Hola mundo como esta el mundo de bien o mal del mundo";
		
		System.out.println("\nLa oracion es: " + str2);
		
		System.out.print("\nLa palabra a cambiar es: mundo ");
					
		System.out.print("\nLa palabra por la cual va a cambiar es: auto");
		
		
		System.out.println("\nLa cadena modificada es: " + cambiaCadena(str2, "mundo", "auto"));	
			

		System.out.println("\n\n***  Probando la sustitucion de una palabra (que NO existe) por otra  *** \n");

		str2 = "Hola mundo como esta el mundo de bien o mal del mundo";
		
		System.out.println("\nLa oracion es: " + str2);
		
		System.out.print("\nLa palabra a cambiar es: luna ");
					
		System.out.print("\nLa palabra por la cual va a cambiar es: marte");
		
		
		System.out.println("\nLa cadena modificada es: " + cambiaCadena(str2, "luna", "marte"));	
		
		
// Probando la eliminaci�n de todas las ocurrencias de una palabra

		System.out.println("\n\n***  Probando la eliminacion de TODAS las ocurrencias de una palabra  *** \n");

		str2 = "Hola mundo como esta todo el mundo, como vemos el dia de hoy en el mundo";
		
		System.out.println("\nLa oracion es: " + str2);
		
		System.out.print("\nLa palabra a eliminar es: mundo ");
							
		System.out.println("\nLa cadena modificada es: " + eliminaPalabra(str2, "mundo"));	
			

		System.out.println("\n\n***  Probando la eliminacion de TODAS las ocurrencias de una palabra (que NO existe) *** \n");

		str2 = "Hola mundo como esta todo el mundo, como vemos el dia de hoy en el mundo";
		
		System.out.println("\nLa oracion es: " + str2);
		
		System.out.print("\nLa palabra a cambiar es: luna ");		
		
		System.out.println("\nLa cadena modificada es: " + eliminaPalabra(str2, "luna"));	
		
					
	
		System.out.println("\n\n");
	}
}
