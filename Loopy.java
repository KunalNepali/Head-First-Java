public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before loop: ");

        while (x == 4)
        {
            System.out.println("In the Loop");
            System.out.println("Value of x is: " + x);
            x = x + 1;
        }
        System.out.println("This is value after Loop: ");
    }
}

/* 
 *{}: This is called Code Blocks 
 *int x; declares integer variable
 * Assignment operator is '=' sign
 * As long as conditional statement is true, while loop runs everything within it's block
 * If conditional test is false, while loop code block won't run. 
 * In the code above: statement while(x==4) is false so, it won't give numeral value.
 * But if we type: while(x < 4) which is true, it gives numeral output.
*/
