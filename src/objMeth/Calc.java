package objMeth;

public class Calc {

    int x,y,z;

    Calc(int a,int b,int c){
        x=a;y=b;z=c;
    }

    void sum(){

        System.out.println ("Sum of Numbers: "+(x+y+z));
    }

    public static void main(String[] args) {
        Calc cob=new Calc(10,20,30);

        cob.sum ();
    }
}
