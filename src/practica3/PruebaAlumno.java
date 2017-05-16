package practica3;
/*
 * Clase de prueba para Alumno
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #3 - ADT Alumno
 */
 
 public class PruebaAlumno {
 	
 	public static void main(String [] args) {
 		
 		Alumno ivan = new Alumno("Ivan", "Garcia", "231212", 87.5);
 		Alumno marco = new Alumno("Marco", "Arellano", "123246", 98.5);
 		Alumno arturo = new Alumno("Arturo", "Rosas", "987656", 90.5);
 		Alumno pilar = new Alumno("Pilar", "Mercado", "675374", 75.5);
 		Alumno araceli = new Alumno("Araceli", "Robledo", "876767", 83.0);
 		Alumno isabel = new Alumno("Isabel", "Suarez", "987654", 83.0);
 		Alumno sergio = new Alumno("Sergio", "Parrodi", "567894", 65.4);	
 		
 		
 		System.out.println("\nLista de alumnos\n");
 		
 		System.out.println("\n" + ivan.toString());
 		System.out.println("\n" + marco.toString());
 		System.out.println("\n" + arturo.toString());
 		System.out.println("\n" + pilar.toString());
 		System.out.println("\n" + araceli.toString());
 		System.out.println("\n" + isabel.toString());
 		System.out.println("\n" + sergio.toString());
 		
 	 	// AQU� MODIFICA EL PROMEDIO DE SERGIO A 95.0 E IMPRIME 
                sergio.setPromedio(95.0);
           
 		//LOS NUEVOS VALORES DE LOS ATRIBUTOS DEL OBJETO SERGIO
 		System.out.println("\nActualizando el promedio de Sergio\n"+sergio.toString());

 		// AQU� MODIFICA EL PROMEDIO DE ARACELI A 50.0 E IMPRIME 
                araceli.setPromedio(50.0);
 		//LOS NUEVOS VALORES DE LOS ATRIBUTOS DEL OBJETO ARACELI
                System.out.println("\nActualizando el promedio de Araceli\n"+araceli.toString());
 	 	
 		
 		
 			
 	}
 }
