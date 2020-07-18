package ExceptionsEx;



public class LearnEx {
    int age;
   void handleex(int age){
       this.age=age;

       if(age<18){
           throw new ArithmeticException ("Can not Vote");
       }
   }



    public static void main(String[] args) {
        LearnEx ob=new LearnEx();
        ob.handleex (15);




    }
}
