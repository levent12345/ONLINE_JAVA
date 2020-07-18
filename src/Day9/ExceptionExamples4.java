package Day9;

public class ExceptionExamples4 {
    public static void main(String[] args) {
        System.out.println ("Program is started");
        System.out.println ("Program is in progres");
        int a[]=new int [5];
        a[10]=12;// throw ArrayIndexOutOfBoundsException
        System.out.println ("Program is completed");
        System.out.println ("Program is exited");
    }
}
