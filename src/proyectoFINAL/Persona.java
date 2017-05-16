/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL;

/**
 *
 * @author Javier
 */
public abstract class Persona {
    protected String nombre, correo, telefono;
    public Persona(String nombre, String correo, String telefono)
    {
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
    }
}
