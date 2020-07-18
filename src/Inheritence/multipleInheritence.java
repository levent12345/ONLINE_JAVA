package Inheritence;

interface A2{

    int a=10;
    void display();

}
interface A3{
    int b=20;
    void show();

}



public class multipleInheritence implements A2,A3 {

public void display(){
    System.out.println (a);
}

public void show(){
    System.out.println (b);
}

    public static void main(String[] args) {
        multipleInheritence mt=new multipleInheritence ();

        mt.display ();
        mt.show ();
    }

}
