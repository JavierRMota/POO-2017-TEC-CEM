
package practica8;

/*
 * Clase Gato
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 06, 2017.
 * Práctica #8 - Interfaces
 */
public class Gato extends Animal implements Mascota{
    private String nombre;
    public Gato(String nombre)
    {
        super(4);
        this.nombre=nombre;
    }
    public Gato()
    {
        this("Felix");
    }

    @Override
    public String comer() {
        return "come lasagna y atún";
    }

    @Override
    public String regresarNombre() {
        return this.nombre;
    }

    @Override
    public void cambiarNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String jugar() {
        return "juega con tus sentimientos al ignorarte mientras tú buscas su cariño";
    }

    @Override
    public String toString() {
        return "Un gato llamado " + this.nombre +' '+ super.toString() + " y "+this.jugar()+'.';
    }
    
    
}
