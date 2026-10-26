import java.util.Scanner;
public class lesson10switches {
    public static void main(String[]args){
        //switch is a statment that allows variables to be tested for equality against a list of values
        // if you find your self using if statment back to back it is efficent to use switch
    /*Mini project 4: Café order using switch
Ask the user to choose a drink by entering a number:
1. Tea — $2
2. Coffee — $3
3. Juice — $4
4. Water — $1
Use a switch to print the drink and its price. For any other number, print Invalid choice. */
System.out.println("Enter the number of the you choose 1.Tea \n 2.coffee \n 3.juice \n 4.water ");

Scanner input = new Scanner(System.in);
int x = input.nextInt();
switch(x){
case 1:System.out.println("tea=$2");
    break;
case 2:System.out.println("Coffee — $3");
    break;
case 3:System.out.println("Juice — $4");
    break;
case 4:System.out.println("Water — $1");
    break;    
}
    
 /*Mini project 5: Simple calculator
Ask the user to enter two numbers, then choose an operation:
1. Add
2. Subtract
3. Multiply
4. Divide
Use a switch to perform the chosen operation. For division, check that the second number isn’t zero before dividing. For any other choice, print Invalid operation. */
    System.out.println("Enter a number1 :");
    Scanner inpt = new Scanner(System.in);
    int a =inpt.nextInt();
    System.out.println("Choose an opration '+','-','*','/'");
    char c =inpt.next().charAt(0);

    System.out.println("Enter a number2 :");
    int b =inpt.nextInt();
    switch(c){
        case '+':System.out.println(a+b);
        break;
        case '-':System.out.println(a-b);
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':System.out.println(a/b);
        break;

        
    }


    
    
    
    
    
    
    
    
    
    
    
    }
}
