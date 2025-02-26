class Dog{
    String name;
    public static void main(String[] args) {

        //make dog object and access it.
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "LEO";

        //create Dog array
        Dog[] myDogs = new Dog[3];

        // put dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //access Dogs using array
        myDogs[0].name = "Rambo";
        myDogs[1].name = "Rocket";

        //Hmm... what is the name of myDog[2]  ?

        System.out.println("Last dog's name is: ");
        System.out.println(myDogs[2].name);

        //now loop via array then tell dogs to bark;

        int x = 0;

        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark()
    {
        System.out.println(name + " BHAU BHAU!");
    }

    public void eat()
    {
        System.out.println(name + "Food name");
    }

    public void area()
    {
        System.out.println(name + "Area Name");
    }
}