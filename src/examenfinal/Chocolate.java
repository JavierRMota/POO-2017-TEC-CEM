
package examenfinal;
/*
 * Clase Chocolate
 * Autor:José Javier Rodríguez Mota
 * Matrícula: A01372812
 */
 
 public class Chocolate extends Dulce implements Relleno {
 	
 	private static final double COSTO_BASE = 5.0;
 	private int tamanio;
 	private String relleno;

 	
 	// IMPLEMENTAR
 	public Chocolate(String nombre, String sabor, String marca, String presentacion, double costo, int tamanio, String relleno){
            super(nombre, sabor, marca, presentacion);
            if(tamanio >0 && tamanio <=3)
                this.tamanio=tamanio;
            else this.tamanio=0;
            if(costo>= COSTO_BASE)
                this.costo=costo;
            else this.costo=COSTO_BASE;
            setRelleno(relleno);
            setCosto();
		
 	}
 	
 
	
	// IMPLEMENTAR 		
	public String toString(){
            return this.nombre+
                    "\nSabor: "+this.sabor+
                    "\nMarca: "+this.marca+
                    "\nPresentacion: "+this.presentacion+
                    "\nCosto: "+this.costo+
                    "\nTamanio: "+this.tamanio+
                    "\nRelleno: "+this.relleno;
 	}
 	
 	
 	
 	// IMPLEMENTAR 	
         @Override
 	public void setRelleno(String relleno){
            this.relleno= Relleno.rellenoDefault;
            for(String r : Relleno.rellenos)
            {
                if(r.equalsIgnoreCase(relleno))
                {
                    this.relleno=r;
                    break;
                }
            }
            
 				
 	}
 	
 	
 	
 	// IMPLEMENTAR
         @Override
 	public void setCosto() {
            double costoRelleno = Relleno.costoDefault;

            for (int n = 0; n<Relleno.rellenos.length;n++)
            {
                if(this.relleno.equalsIgnoreCase(Relleno.rellenos[n]))
                {
                    costoRelleno=Relleno.costoRelleno[n];
                    break;
                }
            }
            
            this.costo+=costoRelleno*this.tamanio;
 	}
 
 
 
	
	
         @Override
	public String getRelleno(){
		return this.relleno;
	}
	
	public int getTamanio(){
		return this.tamanio;
	}

	public void setTamanio(int tam){
		if (tam >= 1 && tam <= 3)
 			this.tamanio = tam;
	}	

} 	
 	