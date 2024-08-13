//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:

public class program3{

    public static void main(String []args){
    
    int length = 0;
    
    int width = 0;
    
    int area = 0;
    
    int perimeter = 0;
    
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter the length: ");

      length = myObj.nextInt();

    System.out.println("Enter the width: ");
    
     width = myObj.nextInt();
       
    System.out.println("The length is: " + length);
    
    
    System.out.println("The width is: " + width);
    
    area = length*width;
    
    System.out.println("The area is: " + area);
    
    perimeter = 2*length + 2*width;
    
    System.out.println("The perimeter is: " + perimeter);
    
    
    
    }
    
    
}



//Paste console output below:
/*
Enter the length: 
6
Enter the width: 
9
The length is: 6
The width is: 9
The area is: 54
The perimeter is: 30


*/
