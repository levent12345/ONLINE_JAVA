package objMeth;

public class Cal {

    int x=10;
    int y=20;


    void  sum1(){
        System.out.println (x+y);
    }
    void sum2(int x,int y){
 this.x=x;
 this.y=y;

        System.out.println (x+y);
    }
    int sum3(int x,int y){
        this.x=x;
        this.y=y;

        return x+y;

    }
    int sum4(){

        return x+y;
    }

    public static void main(String[] args) {
        Cal cob=new Cal();

        cob.sum1 ();
        cob.sum2 (5,10);
        cob.sum3 (10,20);
        cob.sum4 ();
        System.out.println (cob.sum3 (10,20));
        System.out.println (cob.sum4 ());
        System.out.println ("-----" +
                "");

        int a=cob.sum3 (10,30);
        int b=cob.sum4 ();
        System.out.println (a);
        System.out.println (b);
    }


}
