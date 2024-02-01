package askhsoula1;


import java.util.ArrayList;
import java.util.List;

public class author {

    String name;
    String lastName;
    String country;
    List<String> books;

    public author(String name, String lastName, String country, List<String> books) {
        this.name=name;
        this.lastName=lastName;
        this.country=country;
        this.books=books;

    }
    public static author insertAuthor (String name, String lastName, String country, List<String> books) {
        if (books.size()<= 5){

        return new author(name,lastName,country,books);
    }
        return null;
    }
    public void printAuthor(){
        System.out.println(this.name+"\n"+this.lastName+"\n"+this.country+"\n"+this.books);
    }

    public void changeName(String name){
        this.name=name;
    }

    public void changeLastName(String lastName){
        this.lastName=lastName;
    }
    /*public void changeFullName(String name,String lastName){
        changeName(name);
        changeLastName(lastName);
    }*/
    public void changeCountry(String country){
        this.country=country;
    }
    public void addBook(String book){
        if (this.books.size()==5) {
            System.out.println("maximum amount of books in the list");
            return;}

        if (this.books.contains(book)){
            System.out.println("same book");
            return;}
        this.books.add(book);
    }
    public void changeBook(String book,String newBook){
        if (this.books.contains(newBook))
            return;
        List<String>changedBooks=new ArrayList<String>();
        for (String Book:this.books){
            if (Book!=book){
                changedBooks.add(Book);
            }
            else {
                changedBooks.add(newBook);
            }

        }
        this.books=changedBooks;

    }
    public String getName(){
        return this.name;

    }
    public String getLastName(){
        return this.lastName;
    }
    public String getCountry(){
        return this.country;
    }
    public List<String> getBooks(){
        return this.books;
    }






}
