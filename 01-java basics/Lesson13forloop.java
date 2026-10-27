import java.util.Scanner;

public class Lesson13forloop {
    public static void main(String[]args){
    for (int i = 1; i <= 5; i++) {
    System.out.println(i);}
    /*Exercise: Multiplication table
Ask the user for a number, then use a for loop to print its multiplication table from 1 to 10.

For example, if they enter 4, print 4 x 1 = 4 through 4 x 10 = 40. Paste your code here when you’re ready. */
Scanner input =new Scanner(System.in);
System.out.println("Enter a number : ");
int num =input.nextInt();
for(int x=1;x<=10; x++){
    System.out.println(num*x);
}

/*Challenge: Count and sum
Ask the user for a positive integer n. Use a for loop to:
1. Print every number from 1 to n.
2. Calculate and print their total sum.
For example, if the user enters 5, print 1 2 3 4 5 and then Sum = 15.

Extra challenge: If n is less than 1, print Please enter a positive integer instead. Use an if statement to check that first. */
    
}
}
