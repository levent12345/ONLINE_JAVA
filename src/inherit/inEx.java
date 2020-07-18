package inherit;
class AAA{

    int a;

    void display(){
        System.out.println ("a: "+a);
    }
}

class BBB extends AAA{

    int b;
     void print(){

         System.out.println ("b: "+b);
     }}
class CCC extends BBB{
         int c;
         void disp(){

             System.out.println ("c: "+c);
         }


}
public class inEx {
    public static void main(String[] args) {
        CCC ob=new CCC();


        ob.a=10;
        ob.b=20;
        ob.c=25;


        ob.display ();
        ob.print ();
        ob.disp ();
    }
}
