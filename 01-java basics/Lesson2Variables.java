/* Variables in Java 
variables are place holders for storing data values 
in mathimatics we had solved equations like this 
3x+2=17
x=5 in algerbra this variables behave the given value
in same way here variables acts as place holders and they are not limited to nubmers the can also accept words sentences and any other data type*/

/*A data type tells Java what kind of value a variable can hold, such as a whole number, decimal number, character, or text
there is two typess of data types:
Primitive and reference data types
- Primitive data types hold a simple value directly, such as a number, a single character, or true/false.
- Reference data types refer to an object that holds the data. String is a reference type that represents a sequence of characters.
Java data types
Data type	Category	    What it represents	     Example
boolean	    Primitive	    A true-or-false value	  true
byte	    Primitive	    A small whole number	  100
short	    Primitive	    A whole number	          20000
int	        Primitive	    A whole number         	  42
long	    Primitive	    A large whole number		9000000000L
float	    Primitive	    A decimal number with about 6–7 digits of precision	3.14f
double	    Primitive	    A decimal number with about 15–16 digits of precision	3.14159
char	    Primitive	    A single character	'f'
String	    Reference	    A sequence of characters (text)	"Hello world!" */




public class Lesson2Variables {
    public static void main(String[]args){
        /*int Num = 5;               // Integer (whole numberNUMBERS with out decimals/ )
        float FloatNum = 5.99f;   // Floating point number
        char Letter = 'D';         // Character
        boolean Bool = true;       // Boolean
        String Text = "Hello";     // String
        System.out.println(Num);
        System.out.println(FloatNum);
        System.out.println(Letter);
        System.out.println(Bool);
        System.out.println(Text);*/
        int x;//declaring a variable
        x=5;//assigning a value to the variable
        System.out.println(x);
        //output: 5
        double y=5; //initializing a variable
        System.out.println(y);
        //output: 5.0
        //if you try to print system.out.println("y"); it will give an error because y is not declared or initialized
    // any thing in side "" is considered as a string and it will print the string as it is but if you want to print the value of the variable you have to use the variable name without " "
    System.out.println("the value of y is: " + y);
    //output: the value of y is: 5
    //the + operator is used to concatenate the string and the variable value
    //example of variable declaration and initialization
    String name = "Amina"; //declaring and initializing a variable
    System.out.println("the value of name is: " + name);
    //output: the value of name is: Amina
    //but if you try to print system.out.println("name"); it will give an error because name is not declared or initialized
    //boolean values they can only be true or false cant hold values like numbers of strings
//character values they can only hold a single character and it should be in single quotes ' ' and not in double quotes " "
  char letter = 'A'; //declaring and initializing a variable
  System.out.println( letter);  


}
}
