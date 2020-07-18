package Day7;
class parent{

    int a;
    void display(){
        System.out.println (a);
    }
}
class child1 extends parent{
    int c1;
    void displayC1(){
        System.out.println (c1);
    }

}
class child2 extends parent{
    int c2;
    void displayC2(){
        System.out.println (c2);
    }

}

class child3 extends parent{
    int c3;
    void displayC3(){
        System.out.println (c3);
    }

}

public class HierarchyInheritence {
    public static void main(String[] args) {
        child1 cob1=new child1 ();
        child2 cob2=new child2 ();
        child3 cob3=new child3 ();

        cob1.a=10;
        cob1.c1=20;
        cob1.display ();
        cob1.displayC1 ();

        cob2.a=5;
        cob2.c2=10;
        cob2.display ();
        cob2.displayC2 ();


    }
}
