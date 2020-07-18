package ExceptionsEx;

public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println ("Program is starting");
        int a=100;
        String b=null;
        String c="abc";
        int[] d=new int[4];

        try{
        System.out.println (a/0);
        System.out.println ("Aritmetik");}
        catch(ArithmeticException e){
            System.out.println ("Cath a ArithmeticException ");
        }
        System.out.println ("Exception handeled");
       try{
        System.out.println (b.length ());}
       catch(NullPointerException e){
           System.out.println ("Cath a NullPointerException ");
       }
        System.out.println ("Exception handeled");

        try{
        System.out.println (Integer.parseInt (c));}
        catch(NumberFormatException e){
            System.out.println ("catch a NumberFormatException");

        }
        System.out.println ("Exception handeled");
        try{
        System.out.println (d[5]);}
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println ("catch a ArrayIndexOutOfBoundsException");}
        System.out.println ("Exception handeled");
        System.out.println ("Program finished");



    }
}
