package AccesModifier;

public class St {

   protected int x=10;
   protected int y=20;

    protected void sum(){
        System.out.println (x+y);
    }

}
class St2{

    public static void main(String[] args) {
        St s=new St();
        s.sum ();
        s.x=20;
        s.y=30;
        s.sum ();
    }
}
