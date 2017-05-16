package examen2;
/*
 * Clase Posgrado
 *
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */
 
public class Posgrado {
    private String nombrePosgrado;
    private int anioObtencion;
    private int vigencia;
    private static final int ANIO_LIMITE = 1960;
    private static final int ANIO_ACTUAL = 2015;
    
    
    //IMPLEMENTAR
    public Posgrado(String posgrado, int anioObtencion, int vigencia){
        this.nombrePosgrado=posgrado;
        if(Posgrado.ANIO_LIMITE<=anioObtencion&& anioObtencion<=Posgrado.ANIO_ACTUAL)
            this.anioObtencion = anioObtencion;
        else
            this.anioObtencion = Posgrado.ANIO_LIMITE;
        if(vigencia>0)
            this.vigencia = vigencia;
        else
            this.vigencia = 1;
    }
    
    
    
    //IMPLEMENTAR
    public Posgrado(Posgrado posgrado){
        this.nombrePosgrado=posgrado.nombrePosgrado;
        if(Posgrado.ANIO_LIMITE<=posgrado.anioObtencion&& posgrado.anioObtencion<=Posgrado.ANIO_ACTUAL)
            this.anioObtencion = posgrado.anioObtencion;
        else
            this.anioObtencion = Posgrado.ANIO_LIMITE;
        if(posgrado.vigencia>0)
            this.vigencia = posgrado.vigencia;
        else
            this.vigencia = 1;  
    }



 	//IMPLEMENTAR
	@Override
    public String toString() {
        String strvigencia;
        if(this.anioObtencion+this.vigencia>=Posgrado.ANIO_ACTUAL)
            strvigencia = "Valida"; 
        else
            strvigencia = "Vencida"; 
       return"Posgrado{posgrado="+this.nombrePosgrado+", anioObtencion="+this.anioObtencion+", vigencia="+strvigencia+"}";
    }

    
    
    public String getPosgrado() {
        return this.nombrePosgrado;
    }

    public int getAnioObtencion() {
        return this.anioObtencion;
    }

    public int getVigencia() {
        return this.vigencia;
    }

    public void setPosgrado(String posgrado) {
        this.nombrePosgrado = posgrado;
    }

    public void setAnioObtencion(int anioObtencion) {
        if (anioObtencion >= Posgrado.ANIO_LIMITE){
            this.anioObtencion = anioObtencion;
        }
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }
    
}

