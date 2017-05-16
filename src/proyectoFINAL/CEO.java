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
public class CEO extends Empleado{
    public CEO(String nombre, String correo, String telefono){
        super(nombre, correo, telefono, "Chief Executive Officer", "Direccion", Empleado.SALARIO_MAXIMO);
    }

    @Override
    public void setSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPuesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
