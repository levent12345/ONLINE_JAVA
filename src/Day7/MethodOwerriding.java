package Day7;

class Bank{

 double  rateOfInterest(){
       return 0;
    }
}
class SBI extends Bank{

    double  rateOfInterest(){
        return 10.5;
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



public class MethodOwerriding {
    public static void main(String[] args) {
        SBI sbi=new SBI();
        System.out.println (sbi.rateOfInterest ());

        ICICI ici=new ICICI ();
        System.out.println (ici.rateOfInterest ());

        AXIS ax=new AXIS ();
        System.out.println (ax.rateOfInterest ());

    }
}
