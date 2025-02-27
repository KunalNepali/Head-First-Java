//Chapter 4
class Dog {
    int size;
    String name;

    void bark() {
        if(size > 60) {
            System.out.println("WOOF!! WOFF!!!");
        }

        else if(size > 14) {
            System.out.println("RUFFF!! RUFF!");
        }
        else {
            System.out.println("UHHHH! UHHH");
        }
    }
}