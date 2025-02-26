import java.io.FileNotFoundException;   //Imports the FileNowFoundException

public class index {  // declares public class named index
    public static void main(String[] args)  //  Declaring the main 
    {
        int size = 27;          //Declare an integer variable named 'size' and give it the value 27 ;
         String name = "LEFO";  // Declare a data type as String name set to "LEFO" ;
        
        Dog myDog = new Dog(name, size);   // Created an object myDog of Dog class, passing name and size as arguments to constructor
        int x = size -5 ; // Assigns size - 5 to x (integer data type)  
        if( x < 15 ) myDog.bark(8);  // This is a conditional statement, checking if x is less than 15.
        
        while( x > 3 )// x is 22, while loop runs indefinitely, nothing else can update x 
        {
         myDog.play();  
        }    

        int[] numList = {2,4,6,8}; // Here integer array numList is declared with respective values 
        System.out.print("Hello"); // Prints Hello
        System.out.print("Dog: " + name); // Prints Dog: LEFO

        String num = "8"; /// Declares String num with value 8

        int z = Integer.parseInt(num); // converts the num to int using Integer.parseInt(num) & stores it in z

        try {
            readTheFile("myFile.txt"); // Here, it attempts to call readTheFile("myFile.txt"),
        }
         catch (FileNotFoundException ex) // Checks if it catches FilenotFoundException 
         {
         System.out.print("File not found."); // Prints File not found.
        }
    }

}
