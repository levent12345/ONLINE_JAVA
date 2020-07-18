package ExceptionsEx;

public class ExceptionHandle {
    public static void main(String[] args) {
        System.out.println ("Its Started");

        int age=20;

        try{
            System.out.println (age/0);}
        catch(ArithmeticException e){
            System.out.println ("Catch a Exception");
        }
        System.out.println ("Its done");
    }
}
