//Chapter5Homework
//Implement calculator using Conditional Statement

import java.util.Scanner;

public class Chapter5HW{
	
public static void main(String[]args) {
	
	boolean status=true;
	    while (status){
	    Scanner scanner = new Scanner(System.in);
	    Scanner scanner1 = new Scanner(System.in);
	    
	    System.out.print("Enter your first number:");
	    int num1 = scanner.nextInt();
	    
	    System.out.print("\nEnter your second number:");
	    int num2 = scanner.nextInt();
	    
	    System.out.print("\nEnter the fuction (+,-,*,/)here:");
	    int ans =0;
	    String option = scanner1.nextLine();
	    if(option.equalsIgnoreCase("+")) {
	        ans = num1 + num2;
	    }
	    else if(option.equalsIgnoreCase("-")) {
	        ans = num1 - num2;
	    }
	    else if(option.equalsIgnoreCase("*")) {
	        ans = num1 * num2;
	    }
	    else if(option.equalsIgnoreCase("/")) {
	        ans = num1 / num2;
	       
	    }
	    System.out.printf("\nYour answer is:%d\n",  ans);
	     System.out.print("\nPress N to try a new calculation or press S for shutdown:\n");
	   
	   Scanner c = new Scanner(System.in);
	        String input=c.nextLine();
	        if (input.equalsIgnoreCase("S")) {
	            System.exit(0);
	        } else if (input.equalsIgnoreCase("0")) {
	            status = true; 
	        }
	    }
	}
}

// Good job...please see if you can make the output more informative
