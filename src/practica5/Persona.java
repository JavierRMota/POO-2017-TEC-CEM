
package practica5;

import java.util.Objects;

/*
 * Clase  Persona
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 22, 2017.
 * Práctica #5 - Composición y herencia
 */
public class Persona {
    
    //Variables de instancia
    protected String nombre,apellido;
    protected Fecha fechaNacimiento;

    //Constructores
    public Persona(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = new Fecha(fechaNacimiento);
    }

    
    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Fecha getFechaDeNacimiento() {
        return this.fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre:" + this.nombre + "\nApellido:" + this.apellido + "\nFecha Nacimiento:" + this.fechaNacimiento.toString() + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
