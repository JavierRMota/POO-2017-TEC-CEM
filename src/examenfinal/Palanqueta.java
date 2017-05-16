
package examenfinal;
/*
 * Clase Palanqueta
* Autor:José Javier Rodríguez Mota
 * Matrícula: A01372812
 */
 
 public class Palanqueta extends Dulce {
 	
 	private static final double COSTO_BASE = 3.0;
	private static final double costoTableta[] = {5.0, 6.0};
	private static final String presentacionTableta[] = {"TabletaSuave", "TabletaDura"};

 
  	// IMPLEMENTAR	
 	public Palanqueta(String nombre, String sabor, String marca, String presentacion, double costo){
            super(nombre,sabor,marca,presentacion);
            if(costo>=COSTO_BASE)
                this.costo=costo;
            else this.costo=COSTO_BASE;
            setCosto();
 	}
 
 
 
  	// IMPLEMENTAR	
         @Override
 	public String toString(){
            return this.nombre+
                    "\nSabor: "+this.sabor+
                    "\nMarca: "+this.marca+
                    "\nPresentacion: "+this.presentacion+
                    "\nCosto: "+this.costo;
 
 	}
 	
 	
 	
 	// IMPLEMENTAR 	
         @Override
 	public void setCosto() {
            for (int x=0;x<Palanqueta.presentacionTableta.length;x++)
            {
                if(this.presentacion.equalsIgnoreCase(Palanqueta.presentacionTableta[x]))
                {
                    this.costo+=Palanqueta.costoTableta[x];
                    break;
                }
            }
 
 	}
 
 	
 
} 	
