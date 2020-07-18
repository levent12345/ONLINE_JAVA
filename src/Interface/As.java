package Interface;


interface As1{
    int x=20;
    int y=15;
    void sum();
    default void sum2(){
        System.out.println (x-y);
    }
}


public class As implements As1{

    public void sum(){
        System.out.println (x+y);
    }

    public static void main(String[] args) {
        As a=new As();

        a.sum ();
        a.sum2 ();
    }
}
