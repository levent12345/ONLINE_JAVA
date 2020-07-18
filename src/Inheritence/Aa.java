package Inheritence;

public class Aa {
    static int a;
    static int b;
    static void m1(){
        System.out.println ("Aa class");
        System.out.println (a+b);
    }
}
class Ab extends Aa{

    static int c;
    static int y;

    static void m2(){
        System.out.println ("Ab class");
        System.out.println (c+y);
    }

}

class Ac extends Ab{

    public static void main(String[] args) {
//       Aa aoj=new Aa();
//
//       aoj.a=10;
//       aoj.b=20;
//       aoj.m1 ();
//
//       Ab aoj2=new Ab();
//       aoj2.c=10;
//       aoj2.y=25;
//       aoj2.m2 ();
//
//       Ac ac=new Ac();
//       ac.a=1;
//        ac.b=2;
//        ac.c=3;
//        ac.y=4;
//
//       ac.m1 ();
//       ac.m2 ();

a=2;
b=4;
c=5;
y=10;
m1 ();
m2 ();



    }

}