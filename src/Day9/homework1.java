package Day9;

public class homework1 {
    public static void main(String[] args) {
        int a=10;
        int b[]=null;
        String c=null;
        String d="abc";
        System.out.println ("Program started");
        try{System.out.println (a/0);}
        catch (ArithmeticException e){
            System.out.println ("Aritmetic Exceptions");}

       try{
        System.out.println (b[0]);}
       catch(NullPointerException e){
           System.out.println ("NullPointer Exception");
       }


       try{ int x=Integer.parseInt (d);
        System.out.println (x);}
       catch(NumberFormatException e){
           System.out.println ("Number Format Exception");
       }


    }
}
