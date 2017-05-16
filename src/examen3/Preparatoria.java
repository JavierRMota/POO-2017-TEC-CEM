package examen3;

/*
 * Examen Tercer Parcial 
 * Programacion Orientada a Objetos
 * 201711
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */


public class Preparatoria extends Alumno implements Deportes {
    
    private static final double BECA1 = 2000.0;
    private static final double BECA2 = 4000.0;
    private static final double PROMEDIO_MINIMO = 85.0;
    
    private String deporte;
 
    Preparatoria(String nombre, String apellido, int matricula, double promedio, String deporte) {
    	super(nombre,apellido,matricula,promedio);
        setDeporte(deporte);
        setBeca();
    }
   
   
   
    // IMPLEMENTAR
    @Override
    public void setBeca() {
        boolean estado=false;
        //Revisamos primero promedio que es el mismo para ambas becas
        if(this.promedio>=Preparatoria.PROMEDIO_MINIMO)
        {
            //Revisamos si tiene el deporte adecuado
            for(String dato:Deportes.deportes)
            {
                if(this.deporte.equalsIgnoreCase(dato))
                {
                    this.beca=Preparatoria.BECA2;
                    //este es para evitar el otro promedio de entrar
                    estado=true;
                    break;
                }
                
            }
            //Si no hizo nada arriba...
            if(estado== false)
            {
                this.beca=Preparatoria.BECA1;
            }
        }
        //Si no tiene promedio...
        else
        {
            this.beca=0.0;
        }
    }
 
   
   
    	
    @Override
    public void setDeporte(String d) {
   		this.deporte = d;
    }
   	
    @Override
    public String getDeporte() {
		return this.deporte;
    }
    
    @Override
    public String toString() {
    	return "\nAlumno preparatoria: " + super.toString() + "\tDeporte: " + this.deporte;
    }
}
