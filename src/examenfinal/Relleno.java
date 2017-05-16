
package examenfinal;
/* 
 * Interfaz Relleno
 */


public interface Relleno {
	
	public static final double costoDefault = 0.5;
	public static final double costoRelleno[] = {3.0, 1.5, 2.5, 3.0, 2.3};
	public static final String rellenos[] = {"LicorMenta", "Fresa", "Avellana", "Cereza", "Nutella"};
	public static final String rellenoDefault = "Sin relleno";
	void setRelleno(String relleno);
	String getRelleno();
}

