package Interface;

class A1{

    void m1(){
        System.out.println ("A1 class");
    }
}

interface B1{

    void m2();
}
interface B2{

    void m3();
}

class A2{
    void m3(){

        System.out.println ("A2 class");
    }
}
public class HyridInh extends A1 implements B1,B2 {


    @Override
    public void m2() {
        System.out.println ("From B1");
    }

    @Override
    public void m3() {
        System.out.println ("From B2");
    }

    public static void main(String[] args) {
        HyridInh ho=new HyridInh();


        ho.m1 ();
        ho.m2 ();
        ho.m3 ();


    }
}
