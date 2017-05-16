
package examenfinal;
/*
 * Clase abstracta Dulce
 * Autor:José Javier Rodríguez Mota
 * Matrícula: A01372812
 */
 
 public abstract class Dulce {
 	
 	protected String nombre;
 	protected String sabor;
 	protected String marca;
 	protected String presentacion;
 	protected double costo;
 	
 	
 	// IMPLEMENTAR
 	public Dulce(String nombre, String sabor, String marca, String presentacion){
            this.nombre=nombre;
            this.sabor=sabor;
            this.marca=marca;
            this.presentacion=presentacion;
 		
 	}
 	
 	
 	// IMPLEMENTAR
 	public boolean equals(Object o){
            if(o != null && o instanceof Dulce)
            {
                final Dulce d = (Dulce) o;
                if(d.nombre.equalsIgnoreCase(this.nombre)
                        && d.sabor.equalsIgnoreCase(this.sabor)
                        && d.marca.equalsIgnoreCase(this.marca)
                        && d.presentacion.equalsIgnoreCase(this.presentacion)) 
                    return true;
            }
            return false;
	}
 
 
 
 	public abstract void setCosto();
        
 	public String getNombre(){
 		return this.nombre;
 	}
 	
 	public String getMarca(){
 		return this.marca;
 	}
 	
 	public String getSabor(){
 		return this.sabor;
 	}
 	
 	public String getPresentacion(){
 		return this.presentacion;
 	}
 	
 	public double getCosto(){
 		return this.costo;
 	}
 	
 	
 	public String toString(){
 		return "\n\n" + this.nombre + "\nSabor: " + this.sabor + "\nMarca: " + this.marca + "\nPresentacion: " + this.presentacion + "\nCosto: " + this.costo;
 	}


 	
 }