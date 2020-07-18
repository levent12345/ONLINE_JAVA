package AccesModifier;

class AaA{
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
    int getx(){
        return x;
    }
    int gety(){
        return y;
    }
    void getSum(){
        sum ();
    }

}

public class gets {
    public static void main(String[] args) {
        AaA ao=new AaA();


        ao.setx (5);
        ao.sety (10);
        ao.getSum ();
        int getx=ao.getx ();
        int gety=ao.gety ();

        System.out.println (getx);
        System.out.println (gety);




    }
}
