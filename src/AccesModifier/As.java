package AccesModifier;

public class As {

    private int x;
    private int y;

    private void m1(){

        System.out.println (x+y);
    }

    void setx(int a){
      x=a;
    }
    void sety(int b){
        y=b;
    }
    int getx(){
        return x;
    }

    int gety(){
        return y;
    }
    void m2(){
        m1 ();
    }

}

class Bs{
    public static void main(String[] args) {
        As a=new As();

        a.setx (5);
        a.sety (8);
        int b=a.getx ();
        int b2=a.gety ();

        System.out.println (b);
        System.out.println (b2);

        a.m2 ();
    }
}
