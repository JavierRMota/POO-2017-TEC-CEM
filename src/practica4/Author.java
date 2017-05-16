
package practica4;

/*
 * Clase ADT Author
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #4 - Composición
 */
public class Author {
    
    //Variables de instancia
    private String name,email;
    private char gender;

    //Constructores
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public Author(Author a) {
        this.name = a.name;
        this.email = a.email;
        this.gender = a.gender;
    }
    
    //Métodos get
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }
    
    //Métodos set
    public void setEmail(String email) {
        this.email = email;
    }

    //toString
    @Override
    public String toString() {
        return "Autor{" + "nombre=" + this.name + ", email=" + this.email + ", género=" + this.gender + '}';
    }
    
    
    
    
    
    
}
