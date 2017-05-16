
package practica2;
/* 
 *  Clase de prueba de la clase que define al ADT Racional
 *
 *	Autor: Angeles Junco
 */


public class PruebaRacional {

	public static void main(String[] args) {
		
		// creamos 6 objetos (instancias) tipo Racional,
		// utilizando los diferentes constructores
		
		Racional a = new Racional();
		Racional b = new Racional(2, 4);
		Racional c = new Racional(2, 6);
		Racional f = new Racional(2, 0);
		Racional g = new Racional(54, 6);
		Racional h = new Racional(b);	
		
		// se declara un objeto (instancia) de tipo Racional
		// pero AUN no ha sido creado (a�n no tiene espacio 
		// en memoria), por lo cual no puede utilizarse el 
		// objeto d
		
		Racional d;
		
		System.out.println("Numeros racionales");
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
		System.out.println("c = " + c.toString());
		System.out.println("f = " + f.toString());
		System.out.println("g = " + g.toString());
		System.out.println("h = " + h.toString());
		
		System.out.println("Operaciones entre racionales");
		d = b.suma(f);
		System.out.println("b + f = " + d.toString());
		d = c.resta(g);
		System.out.println("c - g = " + d.toString());
		d = c.multiplicacion(g);
		System.out.println("c * g = " + d.toString());
		d = g.division(h);
		System.out.println("g / h = " + d.toString());
	}
}