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
public class Gato extends Animal{

    private String nombre, raza;
    public Gato(String nombre, String raza) {
        super("gato");
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
        return "meow meow";
    }
    
    @Override
    public String comer()
    {
        return "meow meow *rico atún*";
    }
    
    @Override
    public String comportamiento()
    {
        return "brrrrr";
    }
}
