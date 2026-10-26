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
            System.out.println(" Invalid age");
        }
        System.out.println("Enter an number : ");
        int x = input.nextInt();
        if (x>0){
            System.out.println("the number is positive");
        }
        else if(x==0){
            System.out.println("the number is zero");
        }
        else{
            System.out.println("the number is negative");
        }
        /*Mini project 3: Student grade and result
Ask the user for a score from 0 to 100, then print the grade and result:
- 90–100: Grade A — Pass
- 80–89: Grade B — Pass
- 70–79: Grade C — Pass
- 60–69: Grade D — Pass
- Below 60: Grade F — Fail
- Below 0 or above 100: Invalid score
Extra exam condition: If the score is exactly 100, also print Perfect score! */
System.out.println("Enter your score : ");
int i=input.nextInt();
if (i>100 || i <0){
    System.out.println("the given score is invalid");
}
if (i<100 &&i >=90){
    System.out.println("You scored A");
    }
else if (i<90 && i >=80){
    System.out.println("You scored B");
    }
else if (i<80 && i >=70){
    System.out.println("You scored C");
    }
else if (i<70 && i >=60){
    System.out.println("You scored D");
    }
else {
    System.out.println("You scored F");
  
}














    }
    
}
