
package practica3;

/*
 * Clase ADT Alumno
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #3 - ADT Alumno
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private double promedio;
    private double beca;
    private static final double MAXIMO_BECA = 85.0;
    private static final double MINIMO_BECA = 15.0;
    
    //Constructores
    public Alumno(String nombre,String apellido,String matricula, double promedio)
    {
       this.nombre=nombre;
       this.apellido=apellido;
       this.matricula=matricula;
       if(0<=promedio && promedio<=100)
           this.promedio=promedio;
       else
           this.promedio=0;
       becaPorPromedio();
    }
    
    //Métodos de acceso
    public String getNombre()
    {
        return this.nombre;
    }
    public String getApellido()
    {
        return this.apellido;
    }
    public String getMatricula()
    {
        return this.matricula;
    }
    public double getPromedio()
    {
        return this.promedio;
    }
    public double getBeca()
    {
        return this.beca;
    }
    
    //Métodos de cambio
    public void setPromedio(double promedio)
    {
        if(0<=promedio && promedio<=100)
        {
        this.promedio=promedio;
        becaPorPromedio();
        }
    }
    
    //To string

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", promedio=" + promedio + ", beca=" + beca + '}';
    }
    
    
    //Método privado beca
    private void becaPorPromedio()
    {
        if(this.promedio<70.0)
            this.beca=0.0;
        if(70.0<=this.promedio && this.promedio<80.0)
            this.beca=Alumno.MINIMO_BECA;
        if(80.0<=this.promedio && this.promedio<85.0)
            this.beca=40.0;
        if(85.0<=this.promedio && this.promedio<90.0)
            this.beca=60.0;
        if(90.0<=this.promedio && this.promedio<95.0)
            this.beca=80.0;
        if(95.0<=this.promedio && this.promedio<=100.0)
            this.beca=Alumno.MAXIMO_BECA;
    }
}
