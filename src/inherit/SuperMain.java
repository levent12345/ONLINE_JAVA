package inherit;

class Sp{

    int a;
    int b;


}

class Dp extends Sp{

   void sum(int a,int b){
       super.a=a;
       super.b=b;
       System.out.println (a+b);
   }



}
public class SuperMain {
}
