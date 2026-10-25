import java.util.Scanner;


public class Lesson7maths {
    public static void main(String[] args) {
/* now we are going to explore some basic mathematical operations in Java
finding minimum and maximum values
 */
double a=23.6;
double b= 34.7;
double c= 12.4;
double d=Math.min(a,Math.min(b,c));//you can use Math.min() method to find the minimum value among two numbers and you can use it again to find the minimum value among three numbers by using it twice
System.out.println(d);
double  f=78.24;
double  g=90.56;
double  h=67.89;
double max=Math.max(f,Math.max(g,h));//you can use Math.max() method to find the maximum value among two numbers and you can use it again to find the maximum value among three numbers by using it twice
System.out.println(max);
//let's create a method to find the hypotneuse
//  of a right triangle given the lengths of the two sides
System.out.println("enter the first side1");



Scanner hyp = new Scanner(System.in);
double side1 = hyp.nextDouble();
System.out.println("enter the first side1");
double side2 = hyp.nextDouble();
double hypotenuse = Math.hypot(side1, side2);// we import Math.hypot from built in functions
System.out.println(" the hypotenuse is" + hypotenuse);
hyp.close();












    }
    
}
