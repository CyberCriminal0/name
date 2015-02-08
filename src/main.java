//Jack Eller

import java.util.Scanner;

public class main{

    public static void main(String[] args){
	
	tofile tofile = new tofile();
	boolean go = true;

	while(go){

	Scanner scan = new Scanner(System.in);

	System.out.println("Welcome to name!");

	System.out.println("Please input your name on the next line");

	String name = scan.nextLine();

	user use = new user(name);

	System.out.println("Hello " + use.getName() + "!");

        System.out.println("Your userID is:\t" + use.getID());

	tofile.to(use);

	System.out.println("Would you like to add more users?");

        String choice = scan.nextLine();
	
	System.out.println("You said " + choice); 
	
	if(choice.equalsIgnoreCase("no")){

		go = false;

	    }
	}
    }
}