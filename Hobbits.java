public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3]; // Valid indices: 0, 1, 2
        int z = 0;

        while(z < 3) { 
            h[z] = new Hobbits(); // Initialize the object
            h[z].name = "frodo";

            if(z == 1) { 
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            
            z = z + 1; // Increment `z` at the end
        }
    }
}
