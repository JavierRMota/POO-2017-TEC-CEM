
package practica5;

/*
 * Clase Profesor
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 22, 2017.
 * Práctica #5 - Composición y herencia
 */

public class Profesor extends Persona{
    
    //Variables de instancia
    private String carrera, grado, materias[];
    private int nomina;
    private double sueldo;
    
    //Constantes de clase
    private static final double MAXIMO_SUELDO=50000.0, MINIMO_SUELDO=25000.0;
    
    //Constructores
    public Profesor(String nombre, String apellido, Fecha fechaNacimiento, String carrera, String grado, int nomina, double sueldo, String[] materias) {
        super(nombre, apellido, fechaNacimiento);
        
        if(nomina > 0)
            this.nomina = nomina;
        else
            this.nomina = 0;
        
        if(sueldo >= Profesor.MINIMO_SUELDO && sueldo <= Profesor.MAXIMO_SUELDO)
            this.sueldo = sueldo;
        else
            this.sueldo = Profesor.MINIMO_SUELDO;
        
        this.carrera = carrera;
        this.grado = grado;
        this.materias = new String[materias.length];
        for(int i=0 ; i<materias.length ; i++)
        {
            this.materias[i] = materias[i];
        }
        
    }
    
    //Setters
    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setMaterias(String[] materias) {
        this.materias = new String[materias.length];
        for(int i=0 ; i<materias.length ; i++)
        {
            this.materias[i] = materias[i];
        }
    }

    public void setSueldo(double sueldo) {
        if(sueldo >= Profesor.MINIMO_SUELDO && sueldo <= Profesor.MAXIMO_SUELDO && sueldo > this.sueldo)
            this.sueldo = sueldo;
    }
    
    //Getters
    public String getCarrera() {
        return this.carrera;
    }

    public String getGrado() {
        return this.grado;
    }

    public String[] getMaterias() {
        return this.materias;
    }

    public int getNomina() {
        return this.nomina;
    }

    public double getSueldo() {
        return this.sueldo;
    }
    
    //Cadena materias
    private String cadenaMaterias(){
        String materia[],informacion="";
        for (String materia1 : this.materias) {
            materia = materia1.split(" ");
            informacion+="\n\nNombre materia : " + materia[0]+"\nClave materia : " + materia[1] + "\nSemestre materia : " + materia[2];
        }
    return informacion;
    }
    
    //toString
    @Override
    public String toString() {
        return " *** Profesor ***" + "\nNombre : " + super.nombre + "\nApellido : " + super.apellido + "\nFecha nacimiento : " + super.fechaNacimiento.toString() + "\nCarrera : " + this.carrera + "\nGrado : " + this.grado + "\nNomina : " + this.nomina + "\nSueldo : " + this.sueldo + "\nMaterias : \n" + this.cadenaMaterias();
    }
    
}
