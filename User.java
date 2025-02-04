import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private int phonenumber;

    public User(String firstname, String lastname, int age, int phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public void usersave(File file) {
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("firstname: " + firstname + ", lastname: " + lastname + ", age: " + age + ", phone number: " + phonenumber + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("Kohli.txt");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter firstname: ");
            String fname = sc.nextLine();
            
            System.out.println("Enter lastname: ");
            String lname = sc.nextLine();
            
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter phone number: ");
            int phonenumber = sc.nextInt();
            
            User u = new User(fname, lname, age, phonenumber);
            u.usersave(file);
            System.out.println("Do you want to continue creating users? (Type QUIT to exit): ");

            String inp = sc.next();
            if (inp.equals("QUIT")) {
                flag = false;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
