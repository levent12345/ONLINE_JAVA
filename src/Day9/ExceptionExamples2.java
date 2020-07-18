package Day9;

public class ExceptionExamples2 {
    public static void main(String[] args) {
        System.out.println ("Program is started");
        System.out.println ("Program is in progres");
       String a=null;
try{
        System.out.println (a);}//Throw null pointer exception
        catch (Exception e){
            System.out.println ("Entered in to catch block");}
finally {
    System.out.println ("This is Finally Block");
}
        System.out.println ("Program is completed");
        System.out.println ("Program is exited");
    }
}
