package Day8;


interface ABC {

    int x = 100;
    void m1();

}

interface XYZ{

    int y=200;
    void m2();
}

public class multipleInheritance implements ABC,XYZ {


    public void m1(){
        System.out.println (x);
    }

    @Override
    public void m2() {
        System.out.println (y);
    }

    public static void main(String[] args) {

       multipleInheritance mt=new multipleInheritance ();
       mt.m1 ();
       mt.m2 ();

    }
}
