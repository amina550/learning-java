import java.util.Scanner;
public class lesson12whileloop {
   //while loop is use to excute a block of code until a certain condition meet 
    public static void main(String[]args){
        int count = 1;

while (count <= 5) {
    System.out.println(count);
    count++; // Increase count so the condition eventually becomes false
}
/*Exercise: Password attempts
Write a program that asks the user to enter a password. Keep asking while the password is incorrect. When they enter "java123", print Access granted.
 */
int attempts=1 ;

while(attempts<=3){
    System.out.println("Enter your password :");
    Scanner pws =new Scanner(System.in);
    String pass=pws.nextLine();
    if (pass.equals("java123")){//for string compsrision we use .equals
        System.out.println(" Access granted.");
        break;
    }
    else{
        System.out.println("Access is denied");
    attempts++;    
    }
    }
}








    }

