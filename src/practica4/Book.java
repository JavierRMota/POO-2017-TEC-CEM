
package practica4;

/*
 * Clase ADT Book
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: Febrero 19, 2017.
 * Práctica #4 - Composición
 */
public class Book {
    
    //Variables de instancia
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    //Constructores

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = new Author(author.getName(),author.getEmail(),author.getGender());
        if(price>=0)
            this.price = price;
        else
            this.price=0;
        this.qtyInStock = 0;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = new Author(author);
        if(price>=0)
            this.price = price;
        else
            this.price=0;
        if(qtyInStock>=0)
            this.qtyInStock = qtyInStock;
        else
            this.qtyInStock = 0;
    }

    //Métodos con Nombre
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Método get Autor
    public Author getAuthor() {
        return this.author;
    }

    //Métodos con Precio
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price>=0)
            this.price = price;
    }

    //Métodos con Cantidad
    public int getQtyInStock() {
        return this.qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        if(qtyInStock>=0)
            this.qtyInStock = qtyInStock;
    }
    
    //Métodos del Autor
    
    //Nombre
    public String getAuthorName()
    {
        return this.author.getName();
    }
    
    //Email
    public String getAuthorEmail()
    {
        return this.author.getEmail();
    }
    
    //Género
    public char getAuthorGender()
    {
        return this.author.getGender();
    }

    //Método toString
    @Override
    public String toString() {
        return "Libro{" + "nombre=" + this.name + ", " + this.author.toString() + ", precio=" + this.price + ", inventario=" + this.qtyInStock + '}';
    }
    
}
