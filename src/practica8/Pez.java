/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/*
 * Clase Pez
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 06, 2017.
 * Práctica #8 - Interfaces
 */
public class Pez extends Animal implements Mascota{
    private String nombre;
    public Pez(String nombre)
    {
        super(0);
        this.nombre=nombre;
    }
    public Pez()
    {
        this("Nemo");
    }
    @Override
    public String comer() {
        return "come otros peces, sí, es caníbal"; 
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
        return "es aburrido y no juega";
    }

    @Override
    public String toString() {
        return "Un pez llamado " + this.nombre +' '+ super.toString() + " y "+this.jugar()+'.';
    }
    
}
