package Day6;

public class Overloading {

    void sum(int a,int b){
        System.out.println (a+b);
    }
    void sum(int a,double b){
        System.out.println (a+b);
    }
    void sum(double a,double b){
        System.out.println (a+b);
    }
    void sum(int a,int b,int c){
        System.out.println (a+b+c);
    }

    public static void main(String[] args) {

        Overloading ov= new Overloading ();

        ov.sum (10.2,10.5);
        ov.sum(5,5,5);


    }


}
