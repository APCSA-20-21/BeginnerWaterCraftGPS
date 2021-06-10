//imports
import java.util.Scanner;

public int input () 
{
    //objects
    Scanner input = new Scanner(System.in);
    
    //x coordinate
    System.out.println("Please enter the wanted x coordinate. (a number from 1 through 20)");
    int xcoordinate = input.nextInt();
    while (xcoordinate > 20 || xcoordinate < 1) 
    {
        System.out.print.ln("That is not a valid input, please enter an x coordinate again. (a number from 1 through 20)");
        int xcoordinate = input.nextInt();
    }
    
    //y coordinate
    System.out.println("Please enter the wanted y coordinate. (a number from 1 through 20)");
    int ycoordinate = input.nextInt();
    while (ycoordinate > 20 || ycoordinate < 1) 
    {
        System.out.print.ln("That is not a valid input, please enter an x coordinate again. (a number from 1 through 20)");
        int ycoordinate = input.nextInt();
    }
    
    return xcoordinate, ycoordinate; //probably won't work, trying return two values at once
    
}