import java.util.Scanner;
public class lesson14nestedloop {
    //nesteded loop is a loop inside an other loop
    public static void main(String[] args) {
        /*Nested loop exercise: Rectangle of stars
Ask the user for a number of rows and columns. Use nested for loops to print a rectangle of stars.

For example, with 3 rows and 5 columns: */

/* 
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of rows");
    
int row=input.nextInt();
System.out.println("Enter the number of column");
    
int col=input.nextInt();
int i =1;
while(i<=row){
    int j =1;
    while(j<= col){
         System.out.print("*");
        j++;
}
    System.out.println();

i++;}*/
   Scanner value =new Scanner(System.in);
   System.out.println("enter num1");
    int x =value.nextInt();
    System.out.println("enter num2");
    int y =value.nextInt();
    
    int l=1;
    while(l<=x){
        int k=1+l;
        while(k<=y+l){
            System.out.print(k);
        k++;
        }

       System.out.println();
    l++;
    }
    










}



}

    

