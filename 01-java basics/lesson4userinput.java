// now we are going to learn about user input in java
// we are going to use the scanner class to get user input in java
// we need to import the scanner class from the java.util package
import java.util.Scanner;
public class lesson4userinput {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("what is your name ?");
            String name=scanner.nextLine(); // we are using the nextLine() method to get the user input as a string
            System.out.println("My name is "+ name );
            System.out.println("Age ?");
            int age=scanner.nextInt(); // we are using the nextInt() method to get the user input as an integer
            scanner.nextLine(); // consume the newline left by nextInt()
            System.out.println(" I am "+ age + "years old");
            System.out.println("Where are you from?");
            String location=scanner.nextLine(); // we are using the nextLine() method to get the user input as a string
            System.out.println("I am from " + location);
            System.out.println("Where do you learn ?");
            String school=scanner.nextLine(); // we are using the nextLine() method to get the user input as a string
            System.out.println("I learn at " + school);
    }
}
