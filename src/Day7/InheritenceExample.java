package Day7;


class A{

    int a;
    void display(){
        System.out.println (a);
    }
}
class B extends A{

    int b;
    void print(){
        System.out.println (b);
    }
}

class C extends B{

   int c;

   void show(){
       System.out.println (c);
   }


}

public class InheritenceExample {
    public static void main(String[] args) {


    A aob=new A();
   aob.a=100;
   aob.display ();

   B bob=new B();
   bob.b=200;
   bob.print ();
   bob.a=150;
   bob.display ();

   C cob= new C();
   cob.a=5;
   cob.b=10;
   cob.c=15;
   cob.display ();
   cob.print ();
   cob.show ();


}}
