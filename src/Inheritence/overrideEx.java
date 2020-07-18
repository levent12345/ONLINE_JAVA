package Inheritence;

class bank{


  double getInterest(){
      return 10;
   }
        }

        class SBI extends bank{

    double getInterest(){
        return 8.7;
    }
        }

        class AXES extends bank{
    double getInterest(){
        return 9.3;

    }
        }
        class ICICI extends bank{
    double getInterest(){
        return 9.8;
    }
        }

public class overrideEx {
    public static void main(String[] args) {


    }
}
