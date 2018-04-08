import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

public class comments {//Class states the Java file name
    public static final int COMMISSION = 20;
    public static final int RATE = 60;
    public static void main(String[] args){//This is the main method, all other methods are called from within the main(*public, static, void , main(String[] args) {// }*)
        myFirstMethod();//Calling a function in Java is pretty easy, similar to other programming like Python,PHP
        mySecondMethod();//Second method called from my program
        System.out.println("My first program with a method called");//Outputs *prints out* the text in quotes
        int sale = COMMISSION*RATE;
    }
    public static void myFirstMethod(){//Declaring a method you follow *public, static, void, name(of the method)*
        System.out.println("A well-formed Java program has\na main method with { and }\nbraces.");
        System.out.println("A System.out.println statement\nhas ( and ) and usually a\nString that starts and ends\nwith a \" character.\n(But we type \\\"/ instead!)\n");
    }
    public static void mySecondMethod(){
        System.out.println("This is my first method, i Love Java");
    }
}
