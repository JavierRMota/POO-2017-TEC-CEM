

package practica1;
import java.util.Scanner;

/**
 *
 * @author Fabián Camp Mussa A01378565.
 *         José Javier Rodríguez Mota A01372812.
 *         Lenin Silva Gutiérrez A01373214.
 */
public class VariosMetodos {
    public static void main(String[] args){
        
        //Inicializamos todas las variables
        double celsius, resultado, sueldo, prestaciones, tope, calTotal = 0;;
        int opcion, a, b, c;
        
        //Inicializamos métodos de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Loop que corre al menos una vez
        do{
            
            //Llamamos al menú    
            menu();
        
            //Pedimos la opción deseada
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
        
            //Iniciamos el switch
            switch (opcion){
                case 1: //Calorías totales
                    
                    //Pedimos los datos de la persona
                    System.out.println("Masa en libras:");
                    double masa = entrada.nextDouble();
                    
                    //Repetimos el siguiente bloque 3 veces
                    for(int x=0;x<=2;x++){
                        
                        //Preguntamos las actividades
                        System.out.println("\n Actividad:\n"
                                + "Correr\n"
                                + "Basketball\n"
                                + "Tenis\n"
                                + "Cocinar\n"
                                + "Dormir\n"
                                + "Leer\n"
                                + "Bailar\n"
                                + "Caminar");
                        String actividad = entrada.next();
                        
                        //Preguntamos el tiempo
                        System.out.print("\nTiempo en minutos:");
                        int tiempo = entrada.nextInt();
                        
                        //Calculamos
                        calTotal += calorias(actividad.toLowerCase(), tiempo, masa);
                        if(x==2){
                            //Imprimimos hasta el final
                            System.out.println("Calorías totales consumidas: "+calTotal);
                        }
                        //Dejamos un espacio
                        System.out.println();
                    }
                    
                    break;
                    
                case 2://Conversor a Farenheit
                    
                    //Solicitamos los datos
                    System.out.print("Teclea los grados Celcius que quieras convertir: ");
                    celsius = entrada.nextInt(); 
                    resultado = temperatura(celsius); //Calculamos
                    System.out.println(celsius + "°C" + " a Fahrenheit son: " + resultado + "°F"); //Imprimimos
                    break;
                    
                case 3://Chicharronera
                    
                    //Solicitamos las variables
                    System.out.print("Ingrese valor de a: ");
                    a = entrada.nextInt();
                    while (a ==0){ // Este while es para evitar que surga una división entre 0
                        System.out.println("Valor que dará división entre cero, teclea a diferente de 0");
                        System.out.print("Ingrese valor de a: ");
                        a = entrada.nextInt();
                    }
                    System.out.print("Ingrese valor de b: ");
                    b = entrada.nextInt();
                    System.out.print("Ingrese valor de c: ");
                    c = entrada.nextInt();
                    
                    //Ejecutamos la función
                    cuadratica (a, b, c);
                    break;
                    
                case 4://Progresión
                    
                    //Solicitamos las variables
                    System.out.print("Ingresa el valor de a: ");
                    a = entrada.nextInt();
                    System.out.print("Ingresa el valor de b: ");
                    b = entrada.nextInt();
                    
                    //Obtenemos el resultado
                    resultado = progresion(a, b);
                    
                    //Imprimimos
                    System.out.println("La suma desde "+ a + " hasta " + b + " es " + resultado);
                    break;
                    
                case 5://Ingresos totales
                    
                    //Solicitamos variables
                    System.out.print("Ingrese sueldo: ");
                    sueldo = entrada.nextDouble();
                    System.out.print("Ingrese prestaciones: ");
                    prestaciones = entrada.nextDouble();
                    System.out.print("Ingrese tope: ");
                    tope = entrada.nextDouble();
                    
                    //Calculamos
                    resultado = sueldoFinal(sueldo, prestaciones, tope);
                    
                    //Imprimimos
                    System.out.println("Su sueldo final es: " + resultado);
                    break;
                    
                case 6://Salir del sistema
                    System.out.println("¡Gracias por usar nuestra aplicación!");
                    break;
                default:
                    //Si se pone cualquier otro número...
                    System.out.println("Opciónn no válida");
            }
            
    }while(opcion!=6);//Establecemos condición
        
    }
    
    public static void menu() {
        //Imprimimos el menú
        System.out.println("***************\n"
        +"      Menú    \n"
        +"***************\n"
        +"1. Calorías Quemadas\n"
        +"2. Centígrados a Fahrenheit\n"
        +"3. Ecuación de Segundo Grado\n"
        +"4. Progresión aritmética\n"
        +"5. Sueldo Final\n"
        +"6. Salir");
    }
    
    //1
    public static double calorias(String actividad, int tiempo, double masa){
        int met;
        masa *= 0.453592; //Convierte libras a kilogramos
        double cal = 0.0175*masa*tiempo,total;
        switch (actividad){ 
            case "correr": 
                met = 10;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "basketball": 
                met = 8;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "tenis":
                met = 4;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "cocinar":
                met = 2;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "dormir":
                met = 1;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "leer":
                met = 1;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "bailar":
                met = 3;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            case "caminar":
                met = 2;
                total=cal*met;
                System.out.println("Calorías por "+actividad+" por "+tiempo+" minutos: "+(cal*met)+" cal");
                break;
            default:
                System.out.println("Opción no válida");
                total=0;
                break;
        }
        return total;
    }
    
    //2
    public static double temperatura (double celsius){
        //Fórmula sencilla
        return (double) 9/5 *celsius + 32;
    }
    
    //3
    public static double progresion (int a, int b){
        //Fórmula sencilla
        double n=a-b+1.0;
        return ((a + b) * n) / 2;   
    }
    
    //4
    public static void cuadratica (int a, int b, int c){
        double x1, x2;
        if(Math.pow(b, 2) - 4 * a * c >=0){//verificamos que el discriminante sea positivo o cero
            x1 = ((b * -1.0) + Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a); 
            x2 = ((b * -1.0) - Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a);
            System.out.println("El resultado de la cuadrática de a:" + a + ", b:" + b + ", c:" + c + " es: " + x1);
        }
        else{//Si no, no calculamos nada
            System.out.println("El valor de la raíz es un número complejo.");
        }
         
        
    }
    
    //5
    public static double sueldoFinal(double sueldo, double prestaciones, double tope){
        double variable;
        //Revisamos las primeras dos condiciones
        if (tope <= sueldo + prestaciones){
            variable =(sueldo + prestaciones) * 0.65;
        }
        else {
            variable =(sueldo + prestaciones) * 0.80;
        }
        
        //Condición independiente
        if (prestaciones <= (sueldo + prestaciones) / 2){
             variable = variable * 1.05;
        }
        
        return variable;
    }
    
}
