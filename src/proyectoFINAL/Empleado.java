/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL;

/**
 *
 * @author Javier
 */
public abstract class Empleado extends Persona {
    protected String puesto, area;
    protected double sueldo;
    public final static double SALARIO_MAXIMO=0.0 ,SALARIO_MINIMO=0.0;
    public Empleado(String nombre, String correo, String telefono, String puesto, String area)
    {
        super(nombre,correo,telefono);
        this.sueldo=Empleado.SALARIO_MINIMO;
        this.puesto=puesto;
        this.area=area;
    }
    public Empleado(String nombre, String correo, String telefono, String puesto, String area, double sueldo)
    {
        super(nombre,correo,telefono);
        
        if(sueldo>Empleado.SALARIO_MINIMO && sueldo<Empleado.SALARIO_MAXIMO) this.sueldo=sueldo;
        else this.sueldo=Empleado.SALARIO_MINIMO;
        
        this.puesto=puesto;
        this.area=area;
    }
    
    public double getSueldo()
    {
        return this.sueldo;
    }
    
    public abstract void setSueldo();
    
    public String getPuesto()
    {
        return this.puesto;
    }
    
    public abstract void setPuesto();
    
    public String getArea()
    {
        return this.area;
    }
    public abstract void setArea();
}
