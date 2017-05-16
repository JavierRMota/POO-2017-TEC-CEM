package examen2;
/*
 * Clase Profesor
 *
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */
 
 public class Profesor extends Persona {

    protected double sueldo;
    protected String nomina;
    private static final double SUELDO_BASE = 2500.0;


    // IMPLEMENTAR
    public Profesor(String nombre, String apellido, double sueldo, String nomina){
        super(nombre,apellido);
        this.nomina=nomina;
        if(sueldo>=Profesor.SUELDO_BASE)
            this.sueldo=sueldo;
        else
            this.sueldo=Profesor.SUELDO_BASE;
    
    }



	// IMPLEMENTAR
    public Profesor(String nombre, String apellido, String nomina){
         super(nombre,apellido);
         this.nomina=nomina;
         this.sueldo=Profesor.SUELDO_BASE;
       
    }
    
	

	// IMPLEMENTAR    
    @Override
    public String toString() {
       return "Profesor{nombre="+super.nombre+", apellido="+super.apellido+", sueldo="+this.sueldo+", nomina="+this.nomina+"}";
    }
    
    
    
    
    
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= Profesor.SUELDO_BASE)
            this.sueldo = sueldo;
    }
    
    public String getNomina() {
        return this.nomina;
    }

 }	
 	