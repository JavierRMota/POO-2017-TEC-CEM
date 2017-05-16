
package practica6;

/*
 * Clase Matriz
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: marzo 23, 2017.
 * Práctica #6 - Arreglos
 */
public class Matriz {
    protected int[][] mat;
    protected static final int REN=5, COL=5;

    public Matriz() {
        this.mat= new int[REN][COL];
    }
    public Matriz(int ren,int col) {
        if( ren>=0 && col>=0)
            this.mat= new int[ren][col];
        else
            this.mat= new int[REN][COL];
        
    }

    public Matriz restaMatrices(Matriz b) {
        Matriz resta = null;
        if(this.mat.length == b.mat.length && this.mat[0].length ==b.mat[0].length)
        {
            resta = new Matriz(this.mat.length, this.mat[0].length);
            for(int x=0; x<this.mat.length; x++)
            {
                for(int i=0; i< this.mat[x].length;i++)
                {
                    resta.mat[x][i]=this.mat[x][i]-b.mat[x][i];
                }
            }
        }
        return resta;
        
        
    }

    public void setElement(int ren, int col, int value) {
        if( ren>=0 && ren<this.mat.length && col>=0 && col < this.mat[0].length)
            this.mat[ren][col]=value;
    }

    public Matriz sumaMatrices(Matriz b) {
        Matriz suma= null;
        if(this.mat.length == b.mat.length && this.mat[0].length ==b.mat[0].length)
        {
            suma = new Matriz(this.mat.length, this.mat[0].length);
            for(int x=0; x<this.mat.length; x++)
            {
                for(int i=0; i< this.mat[x].length;i++)
                {
                    suma.mat[x][i]=this.mat[x][i]+b.mat[x][i];
                }
            }
            
        }
        return suma;
    }

    @Override
    public String toString() {
        String str="";
        for (int x=0;x<this.mat.length;x++){
            for (int i=0; i<this.mat[x].length;i++){
                str+="| "+this.mat[x][i]+"\t";
            }
            str+="|\n";
        }
        return str;
    }
    
    public int mayorMatriz(){
        int res=this.mat[0][0];
        for (int x=0;x<this.mat.length;x++){
            for (int i=0; i<this.mat[x].length;i++){
                if(this.mat[x][i]>res)
                    res=this.mat[x][i];
            }
        }
        return res;
    }
    public int menorMatriz(){
        int res=this.mat[0][0];
        for (int x=0;x<this.mat.length;x++){
            for (int i=0; i<this.mat[x].length;i++){
                if(this.mat[x][i]<res)
                    res=this.mat[x][i];
            }
        }
        return res;
    }
    public double promedioMatriz()
    {
        double prom=0.0;
        for (int[] mat1: this.mat)
        {
            for(int dato: mat1)
            {
                prom+=dato;
            }
        }
        return prom/(this.mat.length*this.mat[0].length);
    }
}
