
package practica2;
/**
 * Clase Racional.java
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 6, 2017.
 * Práctica # 2 - ADT Racional.
 */
public class Racional {
    // Atributos de la clase
    private int numerador;
    private int denominador;
    
    // Métodos de la clase
    
    // Constructores
    public Racional(){
        numerador = 1;
        denominador = 1;
    }
    // Este constructor evita que exista la división entre 0; en dado caso de que se ponga un cero este se cambia por uno.
    public Racional(int x, int y){
        numerador = x;
        if (y != 0){
            denominador = y;
        }
        else{
            denominador = 1;
        }
    }
    // Establece el Racional r haciendo una copia del racional que tome como variable
    public Racional(Racional r){
        this.numerador = r.numerador; // también se podría poner de la siguiente manera numerador = r.getNumerador();
        this.denominador = r.denominador; // también se podría poner
    }
    // Regresa el numerador.
    public int getNumerador() {
        return numerador;
    }
    // Establece un nuevo número para el numerador.
    public void setNumerador(int x) {
        this.numerador = x;
    }
    // Regresa el denominador.
    public int getDenominador() {
        return denominador;
    }
    // Establece un nuevo número para el denominador.
    public void setDenominador(int y) {
        this.denominador = y;
        
    }
    // Convierte los valores de regreso de las operaciones a una cadena y el @Override es parte de la sintaxis.
    @Override
    public String toString(){
        if(this.numerador == this.denominador){
            return "1";
        }
        if(this.denominador == 1){
            return "" + this.numerador;
        }
        if(this.numerador == 0){
            return "0";
        }
        return this.numerador + "/" + this.denominador;
    }
    // Establece la operación de suma entre racionales.
    public Racional suma(Racional r){
        Racional resultado= new Racional();
        //Este paso se lo agregamos nosotros, revisa que si son del mismo denominador, puede hacer la suma directa.
        if (this.denominador==r.denominador){
            resultado.numerador=this.numerador+r.numerador;
            resultado.denominador=this.denominador;
        }
        else{
            resultado.denominador=this.denominador*r.denominador;
            resultado.numerador=this.numerador*r.denominador+r.numerador*this.denominador;
        }
        return resultado;
    }
    // Establece la operación de resta entre racionales.
    public Racional resta(Racional r){
        Racional resultado= new Racional();
        //Este paso se lo agregamos nosotros, revisa que si son del mismo denominador, puede hacer la resta directa.
        if (this.denominador==r.denominador){
            resultado.numerador=this.numerador-r.numerador;
            resultado.denominador=this.denominador;
        }
        else{
            resultado.denominador=this.denominador*r.denominador;
            resultado.numerador=this.numerador*r.denominador-r.numerador*this.denominador;
        }
        return resultado;
    }
    // Establece la operación de multiplicación entre racionales.
    public Racional multiplicacion(Racional r){
        Racional resultado = new Racional();
        resultado.numerador = this.numerador * r.numerador;
        resultado.denominador = this.denominador * r.denominador;
        return resultado;
    }
    // Establece la operación de división entre racionales.
    public Racional division(Racional r){
        Racional resultado = new Racional();
        resultado.denominador=this.denominador*r.numerador;
        resultado.numerador=this.numerador*r.denominador;
        return resultado;
    }
}
