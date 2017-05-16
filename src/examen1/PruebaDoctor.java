/*
 * POO - Clase de prueba Examen 1
 */
package examen1;

/**
 *
 * @author Angeles Junco
 */
 
public class PruebaDoctor {
    
    public static void main(String[] args) {
        
        Doctor angelica = new Doctor("Angelica", "Chavez", "A23B2", 23000.0, 2);
        Doctor marco = new Doctor("Marco", "Gutierrez", "G316C", 25000.0, 5);
        Doctor mary = new Doctor("Mary", "Blanco", "B987D", 15000.0, 4);
        Doctor ernesto = new Doctor("Ernesto", "Anaya", "E776M", 2000.0, 1);
        
        System.out.println("\n*** ANGELICA ***");
        System.out.println("\n" + angelica.toString());
        System.out.println("\n" + angelica.evaluaDoctor());
        System.out.println("Su sueldo integrado es: " + angelica.getSueldoIntegrado());
        
        System.out.println("\n\n*** MARCO ***");
        System.out.println("\n" + marco.toString());
        System.out.println("\n" + marco.evaluaDoctor());
        System.out.println("Su sueldo integrado es: " + marco.getSueldoIntegrado());
        
        System.out.println("\n\n*** MARY ***");
        System.out.println("\n" + mary.toString());
        System.out.println("\n" + mary.evaluaDoctor());
        System.out.println("Su sueldo integrado es: " + mary.getSueldoIntegrado());
        mary.setSueldo(18000.0);
        System.out.println("Su sueldo integrado despues de actualizar el sueldo es: " + mary.getSueldoIntegrado());
        
         
        System.out.println("\n\n*** ERNESTO ***");
        System.out.println("\n" + ernesto.toString());
        System.out.println("\n" + ernesto.evaluaDoctor());
        System.out.println("Su sueldo integrado es: " + ernesto.getSueldoIntegrado());
        ernesto.setTotal_asociaciones(3);
        System.out.println("\nActualizando el total de asociaciones de Ernesto: \n" + ernesto.toString());
        System.out.println("\n" + ernesto.evaluaDoctor());
        System.out.println("Su sueldo integrado es: " + ernesto.getSueldoIntegrado());
        
        System.out.println("\n\n");
       
    }
    
}
