import java.util.Scanner;

public class aggelos_scanner {

    private static Scanner bomba = new Scanner(System.in);

    public aggelos_scanner() {
    }

    public String getNextLine() {

        return bomba.nextLine();


    }

    public String getNextLine(String bobos) {
        System.out.print(bobos);
        return bomba.nextLine();


    }

    public int getNextInt() {

        return bomba.nextInt();


    }

    public int getNextInt(String bober) {
        System.out.print(bober);
        return bomba.nextInt();


    }
    public double getNextDouble(String text){
        System.out.println(text);
        return bomba.nextDouble();
    }

    public double getNextDouble(){
        return bomba.nextDouble();
    }

}
