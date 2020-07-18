package Day8;

interface A10{
    int a=5;
    int b=10;

    void add();

}
interface A11{
    int x=3;
    int y=20;

    void mul();

}

public class homework2 implements A10,A11 {

    @Override
    public void add() {
        System.out.println (a+b);
    }

    @Override
    public void mul() {
        System.out.println (x*y);
    }

    public static void main(String[] args) {
        homework2 hm2=new homework2 ();

        hm2.add ();
        hm2.mul ();
    }
}
