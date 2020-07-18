package Day8;

interface A{

    int a=10;  //by defoult static and final

    void m1();  //By defoult it is public
}




public class Test implements A {

    public void m1(){
        System.out.println (a);
    }
    public static void main(String[] args) {

        Test t=new Test();
        t.m1 ();

        A in=new Test();

        System.out.println (a);
        in.m1 ();
    }
}
