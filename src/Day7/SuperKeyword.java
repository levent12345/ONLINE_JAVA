package Day7;

class Animal{

    String color="white";

    Animal(){
        System.out.println ("Animal is Created");
    }

    void eating(){
        System.out.println ("Eating...");
    }
}

class Dog extends Animal{
    String color="black";

    Dog(){
        super();
        System.out.println ("Dog is created");

    }

    void displaycolor()
    {
        System.out.println (color);
        System.out.println (super.color);
    }

    void eating(){
        System.out.println ("Eating Bread...");
        super.eating ();
    }
}




public class SuperKeyword {

    public static void main(String[] args) {
        Dog dg=new Dog ();

        dg.displaycolor ();

        dg.eating ();



    }
}
