package Day8;

interface A2{
    int a=20;
    int b=25;
    void sum();

}
public class homework1 implements A2 {

    public void sum(){
        System.out.println (a+b);
    }

    public static void main(String[] args) {
homework1 hm=new homework1 ();
        System.out.println (a);
        System.out.println (b);
        hm.sum ();

    }
}
