package Day9;

public class ExceptionExamples3 {
    public static void main(String[] args) {
        System.out.println ("Program is started");
        System.out.println ("Program is in progres");
        String a="abc";
        int x=Integer.parseInt (a);//Throw number format exception

        System.out.println ("Program is completed");
        System.out.println ("Program is exited");
    }
}
