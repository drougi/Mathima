package askhsoula1;

public class employee {
    String name;
    String lastName;
    String username;

    public employee(String name, String lastName, String username) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
    }

    public static employee logInEmployee(String name, String lastName, String username) {
        String s = username.substring(0, 10);
        if (!s.equals("bookcorner")) {
            System.out.println("Username doesn't contain keyword 'bookcorner'");
            return null;
        }
        return new employee(name, lastName, username);
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void printEmployee() {
        System.out.println(this.name + "\n" + this.lastName + "\n" + this.username);
    }

}
