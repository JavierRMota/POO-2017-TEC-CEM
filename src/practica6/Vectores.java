
package practica6;

import java.util.Arrays;

/*
 * Clase Vectores
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: marzo 23, 2017.
 * Práctica #6 - Arreglos
 */
public class Vectores {
    public static void main(String[] args)
    {
        int [] arreglo1={1,2,3,4,5,6,7,8,9},arreglo2={0,3,8,10,11,12,9},arreglo3={14,0,0,11,14,7,8,9},arreglo4={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        
        //Arreglo1
        System.out.println("\n*** Arreglo 1 *** \n"+Arrays.toString(arreglo1)
        +"\n\nDato mayor:"+datoMayor(arreglo1)
        +"\nDato menor:"+datoMenor(arreglo1)
        +"\nPromedio:"+promedio(arreglo1)
        +"\nMenores de 5:"+cuentaMenores(arreglo1, 5)
        +"\nArreglo invertido:"+Arrays.toString(invierteArreglo(arreglo1))
        +"\nMultiplos de 1:"+Arrays.toString(multiplosDe(arreglo1,1))
        );
     
        //Arreglo2
        System.out.println("\n*** Arreglo 2 *** \n"+Arrays.toString(arreglo2)
        +"\n\nDato mayor:"+datoMayor(arreglo2)
        +"\nDato menor:"+datoMenor(arreglo2)
        +"\nPromedio:"+promedio(arreglo2)
        +"\nDatos mayores entre 2 y 3"+Arrays.toString(datosMayores(arreglo2,arreglo3))
        +"\nMenores de 11:"+ cuentaMenores(arreglo2, 11)
        +"\nArreglo invertido:"+Arrays.toString(invierteArreglo(arreglo2))
        +"\nMultiplos de 3:"+Arrays.toString(multiplosDe(arreglo2,3))
        );
        
        //Arreglo3
        System.out.println("\n*** Arreglo 3 *** \n"+Arrays.toString(arreglo3)
        +"\n\nDato mayor:"+datoMayor(arreglo3)
        +"\nDato menor:"+datoMenor(arreglo3)
        +"\nPromedio:"+promedio(arreglo3)
        +"\nDatos mayores entre 3 y 1"+Arrays.toString(datosMayores(arreglo3,arreglo1))
        +"\nMenores de 11:"+ cuentaMenores(arreglo3, 11)
        +"\nArreglo invertido:"+Arrays.toString(invierteArreglo(arreglo3))
        +"\nMultiplos de 7:"+Arrays.toString(multiplosDe(arreglo3,7))
        );
        
        //Arreglo4
        System.out.println("\n*** Arreglo 4 *** \n"+Arrays.toString(arreglo4)
        +"\n\nDato mayor:"+datoMayor(arreglo4)
        +"\nDato menor:"+datoMenor(arreglo4)
        +"\nPromedio:"+promedio(arreglo4)
        +"\nDatos mayores entre 4 y 1"+Arrays.toString(datosMayores(arreglo4,arreglo1))
        +"\nMenores de 11:"+ cuentaMenores(arreglo4, 11)
        +"\nArreglo invertido:"+Arrays.toString(invierteArreglo(arreglo4))
        +"\nMultiplos de 5:"+Arrays.toString(multiplosDe(arreglo4,5))
        );
    }

    public static int datoMayor(int[] arr)
    {
        int dato;
        dato=arr[0];
        for(int dato1 : arr)
        {
            if(dato1>dato)
                dato=dato1;
        }
        return dato;
    }
    
    public static int datoMenor(int[] arr)
    {
        int dato;
        dato=arr[0];
        for(int dato1 : arr)
        {
            if(dato1<dato)
                dato=dato1;
        }
        return dato;
    }
    
    public static double promedio(int[] arr)
    {
        double promedio=0.0;
        int contador=0;
        for( int dato:arr)
        {
            promedio+=dato;
            contador+=1;
        }
        return  promedio/=contador;
    }
    
    public static int[] datosMayores(int[] arr1, int[] arr2)
    {
        int arr3[],mayor,dato;
        if(arr1.length<=arr2.length)
            mayor=arr1.length;
        else
            mayor=arr2.length;
        arr3= new int[mayor];
        for (int x=0;x<mayor;x++)
        {
            if(arr1[x]>=arr2[x])
                dato=arr1[x];
            else
                dato=arr2[x];
            arr3[x]=dato;
        }
        
        return arr3;
    }
    
    public static int cuentaMenores(int [] arr, int dato)
    {
        int contador=0;
        for(int dato2 : arr)
        {
            if(dato2<dato)
                contador+=1;
        }    
        return contador;
    }
    
    public static int[] invierteArreglo(int [] arr)
    {
        int [] arr2 = new int[arr.length];
        for(int x=arr.length-1;x>=0;x--)
        {
            arr2[arr.length-x-1]=arr[x];
        }
        return arr2;
    }
    
    public static int[] multiplosDe(int [] arr, int dato)
    {
        int contador=0,arr2[];
        for(int dato2 : arr)
        {
            if (dato2%dato==0)
                contador+=1;
        }
        arr2 = new int[contador];
        contador=0;
        for(int dato2 : arr)
        {
            if (dato2%dato==0)
            {
                arr2[contador]= dato2;
                contador+=1;
            }
            if (contador==arr2.length)
                break;
        }
        return arr2;
    }    
}
