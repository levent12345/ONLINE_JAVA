package inherit;

import pack1.A;

class Bank{

    double  rateOfInterest(){

        return 7.2;
    }
}
class SBI extends Bank{

    double  rateOfInterest(){

        return 8.8;
    }
}
class ICICI extends Bank{

    double  rateOfInterest(){

        return 9.7;
    }
}
class AXIS extends Bank{

    double  rateOfInterest(){

        return 8.5;
    }
}
public class BankMain {
    public static void main(String[] args) {
       SBI sob= new SBI ();
       ICICI iob=new ICICI ();
       AXIS aob=new AXIS ();
        System.out.println (sob.rateOfInterest ());
        System.out.println (iob.rateOfInterest ());
        System.out.println (aob.rateOfInterest ());












    }
}
