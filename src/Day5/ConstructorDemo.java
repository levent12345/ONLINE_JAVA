package Day5;

public class ConstructorDemo {

   int x;
   int y;

   ConstructorDemo(){  //not parametirezed
     x=10;
     y=20;
   }

    ConstructorDemo(int a,int b){  //parametirized
        x=a;
        y=b;
    }






   void print(){

       System.out.println (x+y);
   }


    public static void main(String[] args) {
        ConstructorDemo cdem=new ConstructorDemo ();
        ConstructorDemo cdem2=new ConstructorDemo (100,50);
        cdem.print ();
        cdem2.print ();





    }

}
