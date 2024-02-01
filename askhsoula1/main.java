package askhsoula1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    static employee Employee;
    static author Author;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();



        Employee = employee.logInEmployee(name,lastName,username);
        Employee.printEmployee();




        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter author last name: ");
        String authorLastName = scanner.nextLine();

        System.out.print("Enter author country: ");
        String authorCountry = scanner.nextLine();

        List<String> books=new ArrayList<String>();
        System.out.println("How many books???");
        int x=scanner.nextInt();
        scanner.nextLine();
        for (int i=1; i<x+1; i++){
            System.out.println("Enter author book number "+(i)+" : ");
            String book=scanner.nextLine();
            books.add(book);
        }
        scanner.close();
        Author=author.insertAuthor(authorName,authorLastName,authorCountry,books);
        Author.printAuthor();

    }


}
