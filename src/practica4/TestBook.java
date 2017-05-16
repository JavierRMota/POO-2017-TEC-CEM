
package practica4;

/*
 * Clase Prueba Book
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #4 - Composición
 */
public class TestBook {
     public static void main(String [] args){
        
        //Definimos dos autores 
        Author brown = new Author("Dan Brown", "dan_brown.inferno@yahoo.com", 'h');
        Author ana = new Author ("Ana Garcia Bergua", "ana_bergua1378@hotmail.com", 'm');

        //Primer libro
        Book inferno = new Book ("Inferno", brown, 500.0, 400);
        System.out.println("\n***** Inferno *****");
        //Datos
        System.out.println (inferno.toString());
        //Actualización de nombre
        inferno.setName("Inferno segunda edición");
        System.out.println("\nActualizando nombre\n"+inferno.toString());
        
        //Segundo libro
        Book dialogos = new Book("Dialogos", new Author("Platon", "plato_filosofo@gmail.com", 'h'), 45.80);
        System.out.println("\n***** Dialogos *****");
        //Datos
        System.out.println(dialogos.toString());
        //Actualización de precio
        dialogos.setPrice(50.40);
        System.out.println("\nActualizando precio\n"+dialogos.toString());
        
        //Tercer libro
        Book anillos = new Book("El señor de los anillos", new Author("J.R.R Tolkien", "tolkien_bolson@yahoo.com", 'h'), 450.75);
        System.out.println("\n***** Señor de los anillos *****");
        //Datos
        System.out.println(anillos.toString());
        //Actualización de cantidad
        anillos.setQtyInStock(15);
        System.out.println("\nActualizando cantidad\n"+anillos.toString());
    
        //Cuarto libro
        Book tormenta = new Book("Tormenta hindu y otras historias", ana, 175.25, 350);
        System.out.println("\n***** Tormenta hindu y otras historias*****");
        //Datos
        System.out.println("\nDatos Generales\n"+tormenta.toString());
        //Nombre del autor
        System.out.println("\nNombre del autor\n"+tormenta.getAuthorName());
        //Email del autor
        System.out.println("\nEmail del autor\n"+tormenta.getAuthorEmail());
        //Género del autor
        System.out.println("\nGénero del autor\n"+tormenta.getAuthorGender());
        
    }
    
}
