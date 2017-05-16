/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/*
 * Clase Araña
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: abril 06, 2017.
 * Práctica #8 - Interfaces
 */
public class Arana extends Animal {
    public Arana()
    {
        super(8);
    }

    @Override
    public String comer() {
        return "come el miedo de los niños pequeños"; 
    }

    @Override
    public String toString() {
        return "Una araña "+super.toString()+'.';
    }
    
    
}
