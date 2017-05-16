
package practica6;

/*
* Clase ArregloVentas
* Autor: Angeles Junco
*/

public class PruebaVentas {
	
	public static void main(String[] args) {
		
		int [] ventas1 = {12, 23, 4, 56, 78, 45, 34, 78, 98, 15, 27, 67};
		int [] ventas2 = {9, 32, 56, 43, 79, 72, 61, 85, 93, 13, 47, 90};
		
		VentasEmpleado marco = new VentasEmpleado("Marco", "Arellano");
		VentasEmpleado arturo = new VentasEmpleado("Arturo", "Rosas", ventas1);
		VentasEmpleado maricela = new VentasEmpleado("Maricela", "Quintana", ventas2);
		
		System.out.println(arturo);
			
		System.out.println("\nPromedio de ventas de Arturo : " + arturo.promedioVentas());

		System.out.println("\nEl mes de mejores ventas de Arturo es : " + arturo.mayorVenta());
		
		System.out.println("\nEl mes de peores ventas de Arturo es : " + arturo.menorVenta());

		System.out.println("\n\n"+ marco);
		
		marco.setVenta(0, 35);
		marco.setVenta(3, 47);
		marco.setVenta(5, 10);
		marco.setVenta(6, 95);
		marco.setVenta(8, 56);
		marco.setVenta(9, 36);
		marco.setVenta(11, 46);

		System.out.println("\nVentas actualizadas de marco\n");
		System.out.println(marco);

		System.out.println("\nEl mes de mejores ventas de Marco es : " + marco.mayorVenta());
		
		System.out.println("\n\n" + maricela);
		System.out.println("\n\nLas ventas del mes de Marzo de Maricela son : " + maricela.getVenta(2));
		
		
		
		System.out.println("\n\n");
	}
}