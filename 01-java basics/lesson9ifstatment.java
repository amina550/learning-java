// today we are learning conditoinals
/* what are conditionals?
coditionals a block of code that performs is the given statment is true */


/*Mini project 1: Ticket price calculator
Write a Java program that asks for a person’s age and prints their ticket price:
- Under 5: free
- Ages 5–12: $5
- Ages 13–64: $10
- Age 65 or older: $6
- If the age is below 0, print Invalid age*/
import java.util.Scanner;
public class lesson9ifstatment {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age =input.nextInt();
        if( age>=0 &&age<=5){
            System.out.println("your ticket price is free");
        }
        else if(age>5 && age<=12){
            System.out.println("your ticket price is 5$");
        }
        else if(age>12 && age<=64){
            System.out.println("your ticket price is 10$");
        }
        else if(age>64 ){
            System.out.println("your ticket price is 6$");
        }
        else {
            System.out.println("print Invalid age");
        }
        

    }
    
}
