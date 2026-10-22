#JAVA
why you need to learn java?
1.its top popular language
2.extremly flexible
3.platform independnet
- computer languages are spectrum between higlevel and low level
computers understand only binary(matchine code) humans have dificalties to understand matchine code so the is source code (human understandable) then compiled(transformed ) machine code 
source code (ends with .java)------------->matchine code (0000000001 0000000101)
if you write a soure code and compile it to mac os it will run only on it the same for windows and linux becouse diffrent devices understand diffrent machine languge 
java cames with a solution for this problem there is an intermediate between the soures code and matchine code which is called byte code
sourecode------->byte codes-------->matchine code 
this byte code is a platform independent code that could be complied on diffrent devices. what this means that your source code (Example.java)compile to Example.class by java compiler then this byte code will changed to matchine code by JVM(java virtual matchine)
so what is JVM?
this is one important question to answer 
but lets see JDK first 
JDK is (java developmental kit) which contains java libraries  javac,toolkit,and JRE
JRE(java runtime environment) which contains standard libraries and JVM
-JVM (java virtual matchine )it is simply responsible to excute java programs
it compiles byte codes tomatchine codes 
so diffrent devices contains diffrent types of JVM
now lets set up and write our first code 
to do this we need 
1.Java JDK — the tools to build and run Java programs. Download the Windows x64 MSI from Eclipse Temurin. Choose JDK 21, then run the installer and keep the default options.
2.A code editor — VS Code is a simple choice. In VS Code, install the Extension Pack for Java.
3.Check the setup — open Command Prompt and enter java -version, then javac -version. Both should show a version number.
our first code 
step one create a file called Lesson1.java  (becarefull make sure tha the file name starts with uppercase letters)
public class Lesson1 {
    public static void main(String[]args){
        System.out.println("hello my first code in java");
    }
    
} 
out put 
hello my first code in java
main is the entry point Java looks for when you run a program. If your class has no main method, Java has no starting point, so it can’t run that class as a normal standalone program.
For example, this class can be compiled:
public class Lesson1 {
    // No main method
}
But trying to run it with java Lesson1 will produce an error saying that no main method was found.
A class without main can still be useful: another class can use it, or it can be part of a larger program.