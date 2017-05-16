
package practica7;
/*
 * Clase PruebaAnimal.java
 * Objetivo: Probar la jerarqu�a de clases de la Pr�ctica #7. 
 * 		 Clases Abstractas y Polimorfismo.
 * Autor:
 * Matricula:
 */
	
public class PruebaAnimal {
	
	public static void main (String[] args){
			
		Perro miPerro = new Perro ("Murphy", "Poodle");
		Gato miGato = new Gato ("Debbie","Siamese");
		
		System.out.println(miPerro);
		System.out.println(miGato);
		
		System.out.println(PruebaAnimal.anuncia(miPerro));
		System.out.println(PruebaAnimal.anuncia(miGato));
		
		PruebaAnimal.cambiaNombre(miPerro, "Lassie");
		PruebaAnimal.cambiaNombre(miGato, "Garfield");
		
		System.out.println(miPerro);
		System.out.println(miGato);
		
		System.out.println("\n\n");
	}
	
	public static String anuncia (Animal a){
            return a.toString()+" dice "+a.sonido();
	
	}
	
	public static void cambiaNombre(Animal a, String nombre){
            if (a !=null)
            {
                if(a instanceof Gato)
                {
                    Gato g = (Gato) a;
                    g.setNombre(nombre);
                }
                else
                if(a instanceof Perro)
                {
                    Perro p = (Perro) a;
                    p.setNombre(nombre);
                }
            }

	}
}
