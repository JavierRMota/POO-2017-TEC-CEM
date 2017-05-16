
package practica8;

/*
 * Clase Animal
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 06, 2017.
 * Práctica #8 - Interfaces
 */
public abstract class Animal {
    protected int patas;
    public Animal(int patas)
    {
        this.patas=patas;
    }
    public String caminar()
    {
        return "camina con "+this.patas+" patas";
    }
    public abstract String comer();

    @Override
    public String toString() {
        return this.caminar()+" y "+ this.comer();
    }
    
}
