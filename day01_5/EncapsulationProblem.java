package day01_5;
/*
1) Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book (including the author details)
 */
class Author{
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name,Author author,double price,int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    void display(){
        System.out.println("The name of the book: "+getName());
        System.out.println("The author of the book: "+getAuthor().getName());
        System.out.println("The price of the book: "+getPrice());
        System.out.println("The stock of the book: "+getQtyInStock());
    }
}

public class EncapsulationProblem {
    public static void main(String[] args) {
        Author a=new Author("Robert Kiyosaki","ashish@gmail.com",'M');
        Book b=new Book("Rich Dad Poor Dad",a,150.0,50);
        b.display();
    }
}
