package AccesModifier;

class A{
        //PRIVATE
// private int data=10;
//
//private void m1(){
//
// }
       //DEFOULT
//   int data=10;
//
//   void m1(){
//       System.out.println (data);
//    }
//
//}

    protected int data=10;

    protected void m1(){
        System.out.println (data);
    }

}

public class simple {
    public static void main(String[] args) {
        A aobj=new A();
        aobj.data=20;
        aobj.m1();
    }
}
