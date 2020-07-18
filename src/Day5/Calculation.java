package Day5;

public class Calculation {

  int x=10;
  int y=20;
// 1-No parameters no return type
//  void sum(){
//      System.out.println (x+y);
//  }

    // 2-No parameters has return type
// int sum(){
//     return x+y;
// }

    //3- has parameters no return type
// void sum(int a, int b){
//     System.out.println (a+b);
//    }
//4- has parameters has return type
   int sum(int a, int b){
       return a+b;
    }


    public static void main(String[] args) {
        Calculation cal1=new Calculation ();

    int a=cal1.sum (100,200);
        System.out.println (a);

    }
}
