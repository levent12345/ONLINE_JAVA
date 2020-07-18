package ExceptionsEx;

public class exceex {
    public static void main(String[] args) {
        System.out.println ("Program is starting");
        int a=100;
        String b=null;
        String c="abc";
        int[] d=new int[4];

        try{
            System.out.println (a/0);
            System.out.println (b.length ());
            System.out.println (Integer.parseInt (c));
            System.out.println (d[5]);
            System.out.println ("Aritmetik");}
        catch(Exception e){

        }




    }
}
