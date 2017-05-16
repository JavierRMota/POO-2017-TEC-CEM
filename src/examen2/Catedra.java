package examen2;
/*
 * Clase Catedra
 *
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */
 
public class Catedra extends Profesor {
    
    private int tot_alumnos;
    private int tot_clases;
    private Posgrado posgrado;
    private static final double ALUMNOS_PARA_BONO = 25.0;
    private static final double BONO_POSGRADO1 = 500.0;
    private static final double BONO_POSGRADO2 = 1000.0;
    private static final double BONO_POSGRADO3 = 1500.0;
    private static final double BONO_ALUMNO = 10.0;
    
    
    // IMPLEMENTAR
    public Catedra(String nombre, String apellido, double sueldo, String nomina, int tot_alumnos, int tot_clases, Posgrado posgrado){
        super(nombre,apellido,sueldo,nomina);
        this.posgrado = new Posgrado(posgrado);
        if(tot_clases>=0)
            this.tot_clases=tot_clases;
        else
            this.tot_clases=0;
        if(tot_alumnos>=0)
            this.tot_alumnos=tot_alumnos;
        else
            this.tot_alumnos=0;
        actualizaSueldo();
        switch(revisaPosgrado())
        {
            case 3:
                super.sueldo+=Catedra.BONO_POSGRADO3;
                break;
            case 2:
                super.sueldo+=Catedra.BONO_POSGRADO2;
                break;
            case 1:
                super.sueldo+=Catedra.BONO_POSGRADO1;
                break;   
        }
    }
    


	// IMPLEMENTAR
    private void actualizaSueldo(){
        if((double)this.tot_alumnos/this.tot_clases>=Catedra.ALUMNOS_PARA_BONO)
            super.sueldo+=this.tot_alumnos*Catedra.BONO_ALUMNO;  
    }
    
     
     
    // IMPLEMENTAR
    public void setTot_alumnos(int tot_alumnos) {
       if(tot_alumnos>=0){
            this.tot_alumnos=tot_alumnos;
            actualizaSueldo();
       }
       
    }
    
    
    
    // IMPLEMENTAR 
    public void setTot_clases(int tot_clases) {
        if(tot_clases>=0){
            this.tot_clases=tot_clases;
            actualizaSueldo();
        }
        
    }
    
    
    // IMPLEMENTAR
    private int revisaPosgrado(){
        switch(this.posgrado.getPosgrado())
        {
            case "doctorado en ingenieria":
            case "posdoctorado":
                return 3;
            case "doctorado en humanidades":
            case "maestria en ingenieria":
                return 2;
            case "maestria en humanidades":
                return 1;
            default:
                return 0;
        }
    }


 	
 	// IMPLEMENTAR
    @Override
    public String toString() {
        return "Catedra {"+super.toString()+
                ", tot_alumnos="+this.tot_alumnos+
                ", tot_clases="+this.tot_clases+
                ", posgrado="+this.posgrado.toString()+"}";
    }

}

    