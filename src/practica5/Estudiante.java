
package practica5;

/*
 * Clase Estudiante
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 22, 2017.
 * Práctica #5 - Composición y herencia
 */

public class Estudiante extends Persona{
    
    //Variables de instancia
    private String carrera;
    private double promedio, beca;
    private int matricula;
    
    //Constante de clase
    private static final double MAXIMO_BECA = 90.0;

    //Constructores
    public Estudiante(String nombre, String apellido, Fecha fechaNacimiento, String carrera, int matricula, double promedio, double beca) {
        super(nombre, apellido, fechaNacimiento);
        this.carrera = carrera;
        
        if(beca >= 0.0 && beca <= Estudiante.MAXIMO_BECA)
            this.beca = beca;
        else
            this.beca = 0.0;
        if(promedio > 0.0)
            this.promedio = promedio;
        else
            this.promedio = 0.0;
        if(matricula > 0)
            this.matricula = matricula;
        else
            this.matricula = 0;
    }
    
    public Estudiante(String nombre, String apellido, Fecha fechaNacimiento, String carrera, int matricula) {
        super(nombre, apellido, fechaNacimiento);
        this.carrera = carrera;
        if(matricula > 0)
            this.matricula = matricula;
        else
            this.matricula = 0;
        this.beca=0.0;
        this.promedio=0.0;
    }

    //Setters
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setBeca(double beca) {
        this.beca = beca;
    }
    
    //Getters
    public String getCarrera() {
        return this.carrera;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public double getBeca() {
        return this.beca;
    }

    public int getMatricula() {
        return this.matricula;
    }
    
    //toString
    @Override
    public String toString() {
        return " *** Estudiante ***" +"\nNombre : "+super.nombre+"\nApellido : "+super.apellido+"\nFecha nacimiento : "+super.fechaNacimiento.toString()+ "\nCarrera : " + this.carrera + "\nMatricula : " + this.matricula + "\nBeca : " + this.beca + "\nPromedio : " + this.promedio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Estudiante other = (Estudiante) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
    
    
   
}
