// we are looking for the logical opraters and,or,not
import java.util.Scanner;
public class lesson11logicalopration {
    public static void main(String[]args){
        //&& =and must both conditions must be true  to get true
        //|| = or either of the conditions have to be  to get true
        //! = it is the reverse of the given conditional 
 /*Exercise: Admission checker
Write a Java program that asks for a student’s exam score and attendance percentage, then decides whether they qualify.

A student qualifies if:
- Their score is at least 70 and their attendance is at least 80%, or
- Their score is at least 90, even if their attendance is lower.
If the score is below 0 or above 100, or attendance is below 0 or above 100, print Invalid input. Otherwise, print either Qualified or Not qualified. */
Scanner scanner =new Scanner(System.in);
System.out.println("enter your score");
int score=scanner.nextInt();
System.out.println("enter your Attendance");
int attendance=scanner.nextInt();
if((score<0 ||score>100)||(attendance<0 ||attendance>100)){
    System.out.println("Invalid input");
} else if((score>=70 && attendance>=80)||(score>=90)){
    System.out.println(" your  QUALIFIED");
} else{
    System.out.println(" your  NOT  QUALIFIED");
}

/*Free shipping applies if the order is at least $50, or the customer is a member and the order is at least $25. Otherwise, shipping costs $5. */
System.out.println("are you a member \n 1. yes \n 2.no");
Scanner ask = new Scanner(System.in);
int op = ask.nextInt();
System.out.println("enter the amount of payment");
double pp= ask.nextInt();
if((pp>=50)||(op==1 &&pp>=25)){
    System.out.println("you have free shipping");
}
else{
    System.out.println("the shipping fee is 5$");
}
}




}

    
    

