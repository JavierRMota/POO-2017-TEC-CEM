
package practica5;

/* 
 * Clase Fecha
 * Autor: Angeles Junco
 */
 
 public class Fecha {
 	private int mes;
 	private int dia;
 	private int anio;
 	
 	public Fecha(int dia, int mes, int anio) {
 		if (mes <= 0 || mes >12) {
 			this.mes = 1;
 			this.dia = 1;
 		}
 		else {
 			this.mes = mes;
 			if (dia <= 0 || dia > diasDelMes(mes))
 				this.dia = 1;
 			else
 				this.dia = dia;
 		}
 		this.anio = anio;
 	}
 	
 	public Fecha(Fecha f){
 		this.dia = f.dia;
 		this.mes = f.mes;
 		this.anio = f.anio;
 	}
 	
 	public int getDia () {
 		return this.dia;
 	}
 	
 	public int getMes () {
 		return this.mes;
 	}
 	
 	public int getAnio () {
 		return this.anio;
 	}
 	
 	public void setDia(int dia) {
 		if (dia >= 1 && dia <= diasDelMes(this.mes))
 			this.dia = dia;
 	}
 	
 	public void setMes(int mes) {
 		if (mes >= 1 && mes <= 12 && this.dia <= diasDelMes(mes))
 			this.mes = mes;
 	}
 	
 	public void setAnio(int anio) {
 		this.anio = anio;
 	}
 		
 	public String toString() {
 		return this.dia + " / " + this.mes + " / " + this.anio;
 	}


 	
 	public boolean esMenorQue(Fecha f) {
 	 
 		if (this.anio > f.anio)
 			return true;	
 		if (this.mes > f.mes && f.anio == this.anio)
 			return true;
 		if (this.dia > f.dia && this.mes == f.mes && f.anio == this.anio)
 			return true;
 			
 		return false; 	
 	}
 

 	private int diasDelMes(int mes){
 		switch (mes) {
 			case 1:
 			case 3:
 			case 5:
 			case 7:
 			case 8:
 			case 10:
 			case 12: return 31;
 			case 2: return 28;
 			case 4:
 			case 6:
 			case 9:
 			case 11: return 30;		
 		}
 		return 0;
 	}
 }