package AccesModifier;


class AB{

    private int x =5;
    private int y=10;
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

    void display(){
        sum ();
    }

}

public class SeterAndGetter {
    public static void main(String[] args) {


        AB ab = new AB ();
        ab.display ();

        ab.setx (25);
        ab.sety (40);
        System.out.println (ab.getx ());
        System.out.println (ab.gety ());
        ab.display ();



    }
}
