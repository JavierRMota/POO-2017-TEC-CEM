/**
 *
 * Autor: José Javier Rodríguez Mota
 * Matriula: A01372812
 *
 */
package examen1;

public class Doctor {
    
    //Inicializamos variables
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private int total_asociaciones;
    private int nivel;
    private static final double MINIMO_SUELDO = 5000.0;
    private static final double MAXIMO_SUELDO = 25000.0;
    private static final double BONO_POR_ASOCIACION = 3000.0;
    
    
    //Constructores
    public Doctor(String nombre, String apellido, String cedula, double sueldo, int total_asociaciones) {
       
       //Revisamos que sea mayor o igual a 0 
       if(total_asociaciones>=0)
       {
           this.total_asociaciones=total_asociaciones;
       }
       //En caso contrario asignamos un 0
       else
       {
           this.total_asociaciones=0;
       }
       
       //Revisamos que se encuentre entre el máximo y mínimo sueldo
       if(Doctor.MINIMO_SUELDO<= sueldo && sueldo <= Doctor.MAXIMO_SUELDO)
       {
           this.sueldo=sueldo;
       }
       //En caso contrario asignamos el mínimo sueldo
       else
       {
           this.sueldo= Doctor.MINIMO_SUELDO;
       }
       
       //Calculamos nivel ya que está total_asociaciones definido
       calculaNivel();
       //Asignamos las cadenas correspondientes
       this.nombre=nombre;
       this.apellido=apellido;
       this.cedula=cedula;
    }

    //Métodos de regreso (únicamente devolvemos el valor de la variable)
    public String getNombre() {
        return this.nombre;
    }


    public String getApellido() {
        return this.apellido;      
    }


    public String getCedula() {
        return this.cedula;
    }


    public double getSueldo() {
        return this.sueldo;
    }
    
    
    public double getSueldoIntegrado() {
    	return this.sueldo+this.total_asociaciones*Doctor.BONO_POR_ASOCIACION;
    }


    public int getTotal_asociaciones() {
        return this.total_asociaciones;       
    }
    

    public int getNivel() {
        return this.nivel;
    }
    
    //Métodos de cambio (cambiamos valores de las variables)
    public void setSueldo(double sueldo) {
      //Revisamos que esté en el rango  
      if(Doctor.MINIMO_SUELDO<= sueldo && sueldo <=Doctor.MAXIMO_SUELDO)
       {
           //Modificamos si es el caso
           this.sueldo=sueldo;
       }  
    }


    public void setTotal_asociaciones(int total_asociaciones) {
        //Revisamos que esté en el rango
        if(total_asociaciones>=0)
        {   
            //Modificamos si es el caso
            this.total_asociaciones=total_asociaciones;
            //Volvemos a calcular el nivel
            calculaNivel();
        }
    }

    //Calcular nivel
    private void calculaNivel() {
        
        //Nivel depende de total_asociaciones
        switch(this.total_asociaciones)
        {
            case 0: 
                this.nivel=0;
                break;
            case 1: 
            case 2: 
                this.nivel=1;
                break;
            case 3:
            case 4: 
                this.nivel=2;
                break;
            //Al pasar por todos los casos anteriores asumimos que tiene más de 4    
            default: this.nivel=3;
        }
    }

    //Quitamos las variables que no se requieren
    @Override
    public String toString() {
        return "Doctor{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", sueldo=" + sueldo + ", total_asociaciones=" + total_asociaciones + ", nivel=" + nivel + '}';
    }



    //Evaluar Doctor
    public String evaluaDoctor() {
        String cadena;
        
        //Depende de nivel
        switch(this.nivel){
            case 0:
                cadena="Nivel muy bajo: se sugiere integrarse a equipos de trabajo";
                break;
            case 1:
                cadena="Primer nivel: se sugiere capacitarse en diversos temas";
                break;
            case 2:
                cadena="Segundo nivel: se sugiere publicar trabajos";
                break;
            //Asumimos que es nivel 3 si pasó por todos los casos anteriores
            default:
                cadena="Tercer nivel: Felicidades";
        }
        return cadena;
    }
    
    
}
