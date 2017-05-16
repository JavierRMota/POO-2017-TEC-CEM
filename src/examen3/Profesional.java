package examen3;

/*
 * Examen Tercer Parcial 
 * Programacion Orientada a Objetos
 * 201711
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */



public class Profesional extends Alumno implements Asociaciones {
    
    private static final double BECA1 = 3000.0;
    private static final double BECA2 = 5000.0;
    private static final double BECA3 = 8000.0;
    private static final double PROMEDIO_EXCELENCIA = 90.0;
    private static final double PROMEDIO_MINIMO = 85.0;
    
    protected String carrera;
    private String asociacion;
    
    
    Profesional(String nombre, String apellido, int matricula, double promedio, String carrera, String asociacion) {
    	super(nombre,apellido,matricula,promedio);
        this.carrera = carrera;
    	setAsociacion(asociacion);
        setBeca();
    }
    
    
    // IMPLEMENTAR
    @Override
    public void setBeca() {
        boolean estado=false;
        //Asignamos la beca default (podría hacerse con un if al final pero son más líneas de código...
        this.beca=Profesional.BECA1;
        //Este revisa que el promedio sea mayor o igual que el de excelencia
        if(this.promedio>=Profesional.PROMEDIO_EXCELENCIA){
            //Por cada dato revisa si la asociacion es de tipo A
            for(String dato: Asociaciones.asociacionA)
            {
                if(this.asociacion.equalsIgnoreCase(dato))
                {
                    this.beca=Profesional.BECA3;
                    estado=true;
                    //Para no revisar todos si se puede...
                    break;
                }
            }
        }
        //Si no puso el estado en true entra a este ciclo (si no es asociación A) y revisamos promedio
        if(estado==false && this.promedio>=Profesional.PROMEDIO_MINIMO){
            for(String dato : Asociaciones.asociacionB)
            {
                if(this.asociacion.equalsIgnoreCase(dato))
                {
                    this.beca=Profesional.BECA2;
                    estado=true;
                    break;
                }
            }
        }
      
    }
    
    
    
    
    
    @Override
    public String getAsociacion() {
    	return this.asociacion;	
    }
    
    @Override
    public void setAsociacion(String asociacion) {
    	this.asociacion = asociacion;
    }

    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    @Override
    public String toString() {
    	return "\nAlumno profesional: " + super.toString() + "\tCarrera: " + this.carrera + "\tAsociacion: " + this.asociacion;
    }
    
}
