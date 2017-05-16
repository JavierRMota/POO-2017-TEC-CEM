
package practica5;

/*
 * Clase Prueba Personas
 * Autor principal: Ángeles Junco
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #5 - Composición y herencia
 */
 
public class PruebaPersonas {
 	
 	public static void main(String[] args) {
 		
 		Fecha fecha1 = new Fecha(12, 2, 1963);
 		Fecha fecha2 = new Fecha(3, 8, 1966);
 		Fecha fecha3 = new Fecha(16, 10, 1985);
 		Fecha fecha4 = new Fecha(1, 8, 1966);
 		Fecha fecha5 = new Fecha(16, 12, 1970);
 		String[] mat1 = new String[3];
 		String[] mat2 = new String[2];
 		String mat3[] = new String[3];
 		
 		mat1[0] = "Programacion TC1005 2";
 		mat1[1] = "ProyectoDesarrollo TC2012 6";
 		mat1[2] = "SistemasInteligentes TC2011 7";
 		mat2[0] = "AnalisisAlgoritmos TC1007 4";
 		mat2[1] = "Multiagentes TC3015 9";
 		mat3[0] = "Programacion TC1005 2";
 		mat3[1] = "Interaccion TI2004 4";
 		mat3[2] = "SistemasOperativos TC2313 6";
 		
 		Estudiante marco = new Estudiante("Marco", "Arellano", fecha3, "IIS", 1234, 98.5, 40.0);
 		Estudiante maricela = new Estudiante("Maricela", "Quintana", fecha2, "ISC", 9876);
 		Estudiante miguel = new Estudiante("Miguel", "Reyes", fecha5, "INT", 7777, 85.0, 70.0);
 		Profesor adriana = new Profesor ("Adriana", "Garcia", fecha2, "ISC", "Doctora", 3456, 45000.0, mat1);
 		Profesor gerardo = new Profesor ("Gerardo", "Ortiz", fecha4, "IME", "Maestro", 1234, 33000.0, mat2);
 		Profesor gabriela = new Profesor ("Gabriela", "Jimenez", fecha3, "ISC", "Maestra", 9876, 20000.0, mat3);
 		
 		Persona arturo = new Persona ("Arturo", "Rosas", fecha1);
 		
 		System.out.println("\n\n" + arturo.toString());
 		
 		
 		System.out.println("\n" + marco.toString());
 		System.out.println("\n" + maricela.toString());
 		System.out.println("\n" + miguel.toString());
 		System.out.println("\n\n" + adriana.toString());
 		System.out.println("\n\n" + gerardo.toString());
 		System.out.println("\n\n" + gabriela.toString());
 		
 		 		
 		System.out.println("\n\n **  Actualizando sueldo de los profesores  **");
 		gabriela.setSueldo(37000.0);
 		adriana.setSueldo(45000.0);
 		gerardo.setSueldo(55000.0);
 		System.out.println("\n" + gabriela.toString());
 		System.out.println("\n" + adriana.toString());
 		System.out.println("\n" + gerardo.toString());
 		
 		System.out.println("\n\n **  Actualizando becas de los estudiantes  **");
 		marco.setBeca(60.0);
 		maricela.setBeca(80.0);
 		miguel.setBeca(95.0);
 		System.out.println("\n" + marco.toString());
 		System.out.println("\n" + maricela.toString());
 		System.out.println("\n" + miguel.toString());
 			
 			
 		if (PruebaPersonas.menorEdad(adriana, gerardo))
 			System.out.println("\n\nAdriana es mas joven que Gerardo");
 		else
 			System.out.println("\n\nAdriana es mayor que Gerardo");
	
		if (PruebaPersonas.menorEdad(miguel, gabriela))
 			System.out.println("\n\nMiguel es mas joven que Gabriela");
 		else
 			System.out.println("\n\nMiguel es mayor que Gabriela");
 			
 		if (PruebaPersonas.comparaSueldos(adriana, gerardo))
 			System.out.println("\n\nAdriana tiene mejor sueldo que Gerardo");
 		else
 			System.out.println("\n\nAdriana tiene menor sueldo que Gerardo");
	
		if (PruebaPersonas.comparaSueldos(gerardo, gabriela))
 			System.out.println("\n\nGerardo tiene mejor sueldo que Gabriela");
 		else
 			System.out.println("\n\nGerardo tiene menor sueldo que Gabriela");
 		
 		System.out.println("\n\n\n");
                
                if(gerardo.equals(gabriela))
                    System.out.println("Son iguales");
                else
                    System.out.println("Son diferentes");
                if(gerardo.equals(gerardo))
                    System.out.println("Son iguales");
                else
                    System.out.println("Son diferentes");
                if(marco.equals(marco))
                    System.out.println("Son iguales");
                else
                    System.out.println("Son diferentes");
                if(marco.equals(maricela))
                    System.out.println("Son iguales");
                else
                    System.out.println("Son diferentes");
 		
 	}
        
        //Métodos faltantes
 	public static boolean comparaSueldos(Profesor p1, Profesor p2)
        {
             return p1.getSueldo()>= p2.getSueldo();
        }
        
        public static boolean menorEdad(Persona p1, Persona p2)
        {
            return p1.getFechaDeNacimiento().esMenorQue(p2.getFechaDeNacimiento());
        }
        
 }