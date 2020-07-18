package Inheritence;

class bank1{


  double getInterest(){
      return 10;
   }
        }

class SBI1 extends bank1{

double getInterest(){
return 8.7;
}
}

        class AXES1 extends SBI1{
    double getInterest(){
        return 9.3;

    }
        }
        class ICICI1 extends AXES1{
    double getInterest(){
        return 9.8;
    }
        }

public class overrideEx2 extends ICICI1 {
    public static void main(String[] args) {


        overrideEx2 ob=new overrideEx2 ();

        System.out.println (ob.getInterest ());
    }
}
