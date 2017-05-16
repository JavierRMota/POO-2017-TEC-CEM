package examen3;
/*
 * Examen Tercer Parcial 
 * Programacion Orientada a Objetos
 * 201711
 * Autor: José Javier Rodríguez Mota
 * Matricula: A01372812
 */

import java.util.Arrays;

public class PruebaAlumnos {
	
    public static void main (String args[]) {
    
       	Alumno alumnos[] = new Alumno[15];
        Alumno reprobados[] = new Alumno[5];
        Alumno aprobados[] = new Alumno[10];      
		
		int k = 0, i;
			
		alumnos[k++] = new Profesional("Marco", "Arellano", 456789, 93.5, "ISC", "AESC");
		alumnos[k++] = new Profesional("Arturo", "Rosas", 234156, 84.3, "INT", "AeSC");
		alumnos[k++] = new Preparatoria("Emma", "Rodriguez", 213456, 53.4, "Tenis");
        alumnos[k++] = new Profesional("Roman", "Lopez", 874443, 76.5, "IIS", "ADEiis");
		alumnos[k++] = new Preparatoria("Hector", "Gutierrez", 122333, 87.4, "VolleyBaLL");
		alumnos[k++] = new Preparatoria("Mariano", "Perez", 334455, 94.3, "Americano");
		alumnos[k++] = new Profesional("Marcela", "Chavez", 334267, 56.5, "IMA", "ADEIM");
		alumnos[k++] = new Profesional("Maricela", "Gomez", 785689, 73.7, "LEM", "AeM");
		alumnos[k++] = new Profesional("Patricia", "Ramos", 898967, 85.6, "LAD", "ANIma");
		alumnos[k++] = new Preparatoria("Raul", "Trejo", 764439, 92.3, "Americano");
		alumnos[k++] = new Preparatoria("Edgar", "Tovar", 834512, 56.4, "TeniS");
		alumnos[k++] = new Profesional("Marcos", "Garcia", 334298, 69.5, "IMA", "ADEIM");
		alumnos[k++] = new Profesional("Ricardo", "Rubio", 234176, 91.3, "IIS", "ADeIIs");
		alumnos[k++] = new Profesional("Jorge", "Ramirez", 998888, 67.3, "ISDR", "ADA");
		alumnos[k++] = new Profesional("Fernanda", "Perea", 213471, 90.3, "IIS", "AMI");
		
                    
	
    	System.out.println("\n\n*** ALUMNOS QUE PRACTICAN TENIS***");
   	 	PruebaAlumnos.consultaDeporte(alumnos, "tenis");
		System.out.println("\n\n*** ALUMNOS QUE PRACTICAN AMERICANO***");
    	PruebaAlumnos.consultaDeporte(alumnos, "AmeriCANO");
        
        
        System.out.println("\n\n*** PROMEDIO ALUMNOS DE AESC***");
        System.out.println("El promedio es:" + PruebaAlumnos.promedioAlumnos(alumnos, "Aesc"));
        
        
        PruebaAlumnos.split(alumnos, reprobados, aprobados);
        System.out.println("\n\n*** ALUMNOS REPROBADOS ***");
    	System.out.println(Arrays.toString(reprobados));
        System.out.println("\n\n*** ALUMNOS APROBADOS ***");
    	System.out.println(Arrays.toString(aprobados));
        
        
        
        System.out.println("\n\n*** PROMEDIO ALUMNOS ANTES DE ACTUALIZAR ***");
    	System.out.println(Arrays.toString(alumnos));
	   
        PruebaAlumnos.puntosExtra(alumnos, 5.0);
        System.out.println("\n\n*** PROMEDIO ALUMNOS DESPUES DE ACTUALIZAR ***");
    	System.out.println(Arrays.toString(alumnos));
        
 
		System.out.println("\n\n");
    }
    
    
    // IMPLEMENTAR
    public static void split (Alumno[] alumno, Alumno[] reprobados, Alumno[] aprobados)	{
        int contadorR=0,contadorA=0;
        for(Alumno a : alumno)
        {
            if(a.getPromedio()<70)
            {
                reprobados[contadorR]=a;
                contadorR++;
            }
            else
            {
                aprobados[contadorA]=a;
                contadorA++;
            }
        }
    }
    
    
    
    // IMPLEMENTAR
    public static void consultaDeporte (Alumno [] alumnos, String deporte) {
        for(Alumno a: alumnos)
        {
             //Revisamos que sea de Preparatoria y que no esté vacío
            if(a!=null && a instanceof Preparatoria)
            {
                //Downcast
                Preparatoria p = (Preparatoria) a;
                //Revisamos deporte
                if(p.getDeporte().equalsIgnoreCase(deporte))
                {
                    System.out.println(p);
                }
            }
        }
    
    }

   
   
	// IMPLEMENTAR 
    public static double promedioAlumnos(Alumno [] alumnos, String asocia) {
        int  contador=0;
        double suma=0;
        for(Alumno a: alumnos)
        {
            //Revisamos que sea de Profesional y que no esté vacío
            if(a!=null && a instanceof Profesional)
            {
                //Downcast
                Profesional p = (Profesional) a;
                //Revisamos asociacion
                if(p.getAsociacion().equalsIgnoreCase(asocia))
                {
                    //añadimos al promedio
                    suma+=p.getPromedio();
                    contador++;
                }
            }
        }
        return suma/contador;
    }
    
    
    
    // IMPLEMENTAR
    public static void puntosExtra(Alumno[] alumno, double cuanto){
    	//aquí no se necesita verificar si es de profesional o preparatoria porque ambos tienen promedio
        for(Alumno a : alumno)
        {
            if(a!=null)
                a.setPromedio(a.getPromedio()+cuanto);
        }
    }
    
   
}
