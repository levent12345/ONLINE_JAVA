package ClassObjectMethod;

public class Calculation {
    int a;
    int b;

//    void sum(){
//        System.out.println (a+b);
//    }
//    void sum (int x,int y){
//
//        a=x;
//        b=y;
//        System.out.println (a+b);
//    }

    int sum(int x,int y){
        a=x;
        b=y;
        return a+b;
    }



    public static void main(String[] args) {
        Calculation cal=new Calculation ();

//        cal.a=200;
//        cal.b=300;
//



        int c=cal.sum (100,200);
        System.out.println (c);
    }
}
