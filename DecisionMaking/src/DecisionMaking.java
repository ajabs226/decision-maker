import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

    // TODO Auto-generated method stub

    Scanner scnr = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scnr.next();
    if (name.matches("^[a-zA-Z]*$")) {
    	System.out.println("Hello, " + name +"!");
    } else {
        System.out.println("Please enter a valid name.");
        return;
    }

    System.out.println("Enter a number between 1 and 100");
    double number = scnr.nextDouble();
    if (number <=0 || number > 100 && number == scnr.nextDouble()) {
    	System.out.println("Not a valid number.");
        return;
        }
    if (!(number % 2 == 0) && number < 60){
        System.out.println(number + " and odd.");
        } else if (!(number % 2 == 0) && number > 60)  {
        	System.out.println(number + " is odd and over 60.");
        } else if (number % 2 == 0 && number >=2 && number <25) {
        	System.out.println("Even and less than 25.");
        } else if (number % 2 == 0 && number >=26 && number <=60) {
        	System.out.println("Even.");
        } else {
        	System.out.println(number + " and Even.");  
        }
	} 
} 

