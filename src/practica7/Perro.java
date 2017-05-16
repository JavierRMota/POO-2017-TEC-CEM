/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author Javier
 */
public class Perro extends Animal {
    private String nombre, raza;
    public Perro(String nombre, String raza) {
        super("perro");
        this.nombre=nombre;
        this.raza=raza;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.nombre + " el " + this.raza ;
    }
    
    @Override
    public String sonido()
    {
        return "woof woof";
    }
    @Override
    public String comer()
    {
        return "woof woof *ricas croquetas*";
    }
    
    @Override
    public String comportamiento()
    {
        return "woof woof *lamer*";
    }
}
