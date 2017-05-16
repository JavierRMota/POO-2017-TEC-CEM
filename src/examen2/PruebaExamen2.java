
package examen2;

/**
 *
 * @author Angeles Junco
 */
 
public class PruebaExamen2 {
    
    public static void main(String[] args){
        Profesor p1 = new Profesor("Albert", "Einstein", 670.0, "123");
        Profesor p2 = new Profesor("Marie", "Curie", 13200.0, "456");
        Profesor p3 = new Profesor("Carl", "Sagan", 15450.0, "789");
        
        Posgrado esp1 = new Posgrado("doctorado en ingenieria", 2010, 5);
        Posgrado esp2 = new Posgrado("posdoctorado", 1945, 2);
        Posgrado esp3 = new Posgrado("maestria en ingenieria", 2005, 10);
        Posgrado esp4 = new Posgrado("maestria en humanidades", 2000, 5);
        Posgrado esp5 = new Posgrado("doctorado en humanidades", 2014, 15);
        
        Catedra c1 = new Catedra("Amelia", "Earhart", 23500.0, "111", 80, 3, esp1);
        Catedra c2 = new Catedra("Steve", "Jobs", 8450.0, "222", 90, 5, esp5);
        Catedra c3 = new Catedra("Rosalind", "Franklin", 15700.0, "333", 120, 3, esp3);
        Catedra c4 = new Catedra("Lise", "Meitner", 3500.0, "444", 50, 2, esp4);
        Catedra c5 = new Catedra("Alan", "Turing", 1500.0, "555", 80, 4, esp2);
        
        System.out.println(p1 + "\n");
        System.out.println(p2 + "\n");
        System.out.println(p3 + "\n");
        
        System.out.println(c1 + "\n");
        System.out.println(c2 + "\n");
        System.out.println(c3 + "\n");
        System.out.println(c4 + "\n");
        System.out.println(c5 + "\n");
        
        
        c2.setTot_alumnos(160);
        System.out.println("\nCambiando el total de alumnos de Steve\n");
        System.out.println(c2 + "\n");
    }
}
