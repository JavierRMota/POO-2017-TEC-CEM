
package practica8;

/*
 * Clase PruebaAnimales
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 06, 2017.
 * Práctica #8 - Interfaces
 */
public class PruebaAnimales {
    public static void main(String[] args) {
        Gato g = new Gato("Garfield");
        Gato g2 = new Gato();
        Arana a = new Arana();
        Arana a2 = new Arana();
        Pez p = new Pez("Blue");
        Pez p2 = new Pez();
        
        System.out.println("Animales:");
        System.out.println(g);
        System.out.println(g2);
        System.out.println(a);
        System.out.println(a2);
        System.out.println(p);
        System.out.println(p2);
        
        System.out.println("\nCambiamos el nombre de Felix y Nemo");
        PruebaAnimales.cambiarNombre(g2,"Silvestre");
        PruebaAnimales.cambiarNombre(p2, "Flanders");
        System.out.println(g);
        System.out.println(g2);
        System.out.println(a);
        System.out.println(a2);
        System.out.println(p);
        System.out.println(p2);
        
        System.out.println("\nMascotas:");
        PruebaAnimales.imprimirMascota(g);
        PruebaAnimales.imprimirMascota(g2);
        PruebaAnimales.imprimirMascota(p);
        PruebaAnimales.imprimirMascota(p2);
        
        System.out.println("\nPolimorfismo de las clases padre:");
        PruebaAnimales.imprimirAnimal(g);
        PruebaAnimales.imprimirAnimal(g2);
        PruebaAnimales.imprimirAnimal(a);
        PruebaAnimales.imprimirAnimal(a2);
        PruebaAnimales.imprimirAnimal(p);
        PruebaAnimales.imprimirAnimal(p2);
        
        
        
    }
    public static void cambiarNombre(Mascota m, String nombre)
    {
        m.cambiarNombre(nombre);
    }
    public static void imprimirMascota(Mascota m)
    {
        System.out.println(m.regresarNombre() + ' ' + m.jugar()+ '.');
    }
    public static void imprimirAnimal(Animal a)
    {
        System.out.println(a.toString());
    }
}
