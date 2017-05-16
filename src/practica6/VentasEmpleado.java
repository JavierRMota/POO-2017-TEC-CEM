
package practica6;

/*
 * Clase VentasEmpleados
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: marzo 23, 2017.
 * Práctica #6 - Arreglos
 */
public class VentasEmpleado {
    private String nombre, apellido;
    private ArregloVentas ventasMensuales;

    public VentasEmpleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventasMensuales = new ArregloVentas();
    }

    public VentasEmpleado(String nombre, String apellido, int[] ventas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventasMensuales = new ArregloVentas(ventas);
    }
    
    public double promedioVentas()
    {
        double sum=0.0;
        for(int i=0;i<12;i++)
        {
            sum+=this.ventasMensuales.getVenta(i);
        }
        return sum/12;
    }
    public String mayorVenta()
    {
        int index=0;
        for(int i=0;i<12;i++)
        {
            if(this.ventasMensuales.getVenta(i)>this.ventasMensuales.getVenta(index))
                index=i;
        }
        return getMes(index+1);
    }
    public String menorVenta()
    {
        int index=0;
        for(int i=0;i<12;i++)
        {
            if(this.ventasMensuales.getVenta(i)<this.ventasMensuales.getVenta(index))
                index=i;
        }
        return getMes(index);
    }
    private String getMes(int mes)
    {
        switch(mes)
        {
            case 0:
                return "Enero";
            case 1:
                return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Octubre";
            case 10:
                return "Noviembre";
            case 11:
                return "Diciembre";
            default:
                return "Mes invalido!";
        }
    }

    @Override
    public String toString() {
        return "\nLas ventas de " + this.nombre + ' ' + this.apellido + "son:\n" + this.ventasMensuales.toString();
    }

    public void setVenta(int pos, int dato) {
        this.ventasMensuales.setVenta(pos, dato);
    }

    public int getVenta(int pos) {
        return this.ventasMensuales.getVenta(pos);
    }
    
    
    
    
    
}
