package Day9;

public class ExceptionExamples {
    public static void main(String[] args) {
        System.out.println ("Program is started");
        System.out.println ("Program is in progres");

        int a=100;
        int res=0;
try{

    res=a/0;
       // System.out.println (a/0);
        //System.out.println (a/2);
}

catch(ArithmeticException e){
    System.out.println ("Found an Exception");
}
//Throw aritmetic exception
        System.out.println (res);
        System.out.println ("Program is completed");
        System.out.println ("Program is exited");
    }
}
