/**

* This program will clauclate the factorial using recursion.

*

* @author  Laura Duffley

* @version 1.0

* @since   2022-04-04

*/

/*Java Program to find factorial of a number using Recursive Function*/
import java.util.Scanner;

// public class
public class Unit202
{
    public static void main(String[] args) 
    {
        // get user input
        Scanner sc = new Scanner(System.in);
        // greet user
        System.out.println("Hi there! This program calculates the factorial of your entry using recursion.");
        System.out.println("Please enter a number greater than 0:");
        
        // convert user entry to int
        int userNum = sc.nextInt();   //Input the number
        // if else to check that number is greater than 0
        if(userNum>=0) 
        {
           // call recursive function to find factorial
           int factorial=findFactorial(userNum);
           System.out.println("The factorial of the entered the number is :"+factorial);
        }        
        else
        {
            // display error message
            System.out.println("Invalid entry.");
            System.out.println("Please enter a number greater than 0.");
        } 
    }
    // recursive function to caluclatee factorial of user number
    public static int findFactorial(int userNum)
    {
        // from https://beginnersbook.com/2014/01/java-program-to-find-factorial-of-a-given-number-using-recursion/
        if(userNum==0)
        return 1;
        else if(userNum==1)
        return 1;
        else
        // return factorial
        return userNum*findFactorial(userNum-1);        
    }
}
