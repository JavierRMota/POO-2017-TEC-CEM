
package practica4;

/*
 * Clase Prueba Author
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #4 - Composición
 */
public class TestAuthor {
    public static void main(String [] args) {
        
        //Definimos un nuevo autor
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com",'m');
        
        //Imprimimos sus datos
        System.out.println(anAuthor.toString());
        
        //Cambiamos el mail
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println("\nActualizando correo de autor0\n"+anAuthor.toString());
 
    }
        
    
}
