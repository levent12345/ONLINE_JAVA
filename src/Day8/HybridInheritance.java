package Day8;

class A1{
    void m1(){
        System.out.println ("Class A1");
    }
}

interface I1{

    void m2();

}

interface I2{
    void m3();

}





public class HybridInheritance extends A1 implements I1,I2  {

    @Override
    public void m2() {
        System.out.println ("Interface 1");
    }

    @Override
    public void m3() {
        System.out.println ("Interface 2");
    }

    public static void main(String[] args) {

        HybridInheritance mi= new HybridInheritance ();

        mi.m1 ();
        mi.m1 ();
        mi.m3();

    }
}
