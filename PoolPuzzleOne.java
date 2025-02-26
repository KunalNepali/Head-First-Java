public class PoolPuzzleOne {
    public static void main(String[] args)
    {
        int x = 0;

        while ( x < 4)
        {
            System.out.print("a");
            if ( x < 1)
            {
                System.out.println(" ");
            }
            System.out.print("n");
            if(x > 1)
            {
                System.out.println(" oyster");
                x = x + 2;
            }

            if(x == 1)
            {
                System.out.println("noys");
            }
            if( x < 1)
            {
                System.out.println("oise");
            }
            System.out.println("");

            x= x + 1;
             }
    }
}
