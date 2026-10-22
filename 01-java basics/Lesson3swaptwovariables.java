public class Lesson3swaptwovariables {
    public static void main(String[] args) {
        // we are going to create two variables which are string type
       /*  String a="hello";
        String b="world";
        //we are going to swap the values of the two variables
       System.out.println("a: " + a);
       System.out.println("b: " + b);
       //here we have hello in a and world in b  what we should do to swap the valves of a and b  to make a=world and b=hello
       //do assigning a=b will work?
       a=b;
       System.out.println(a);
         //output: world then what about the values of b
        System.out.println(b);
        //output: world so we lost the value of a which was hello and now both a
        //and b have the same value which is world so we need to use a third variable to store the value of a before we assign b to a*/
        // so let's create a third variable c to store the value of a before we assign b to a
        String a="hello";   
        String b="world";
        String c=a; // we are storing the value of a in c
        a=b; // we are assigning the value of b to a
        b=c; // we are assigning the value of c to b
        System.out.println("a: " + a);
        System.out.println("b: " + b);
      
    
    
    
    
    
    
    
    
    
    
    }
    }
