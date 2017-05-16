package examen3;

/*
 * Examen Tercer Parcial 
 * Programacion Orientada a Objetos
 * 201711
 * Autor: Angeles Junco
 */


public abstract class Alumno {
    protected String nombre;
    protected String apellido;
    protected int matricula;
    protected double promedio;
    protected double beca;
    
    Alumno(String nombre, String apellido, int matricula, double promedio) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.matricula = matricula;
        this.setPromedio(promedio);
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    
    public String getApellido() {
    	return this.apellido;
    }
    
    public int getMatricula() {
    	return this.matricula;
    }
    
    public double getPromedio() {
    	return this.promedio;
    }
    
    public void setPromedio(double promedio) {
    	 if (promedio >= 0 && promedio <= 100)
            this.promedio = promedio;
    }
    
    @Override
    public String toString() {
    	return this.nombre + " " + this.apellido + "\nMatricula: " + this.matricula + "\tPromedio: " + this.promedio + "\tBeca: " + this.beca;
    }
    
    public double getBeca() {
    	return this.beca;
    }
    
    public abstract void setBeca();
    
}
