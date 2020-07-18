package AccesModifier;

class Az{
    private int x;
    private int y;
    private void sum(){
        System.out.println (x+y);
    }

    void setx(int x){
        this.x=x;
    }
    void sety(int y){
        this.y=y;
    }
    int getx(){return x;}
    int gety(){return y;}
    int display(){return x+y;}
    void m1(){sum ();}
}

public class Setter {
    public static void main(String[] args) {
        Az ao=new Az();

        ao.setx (5);
        ao.sety (10);
        System.out.println (ao.getx ());
        System.out.println (ao.gety ());
        System.out.println (ao.display ());
        ao.m1 ();



    }
}
