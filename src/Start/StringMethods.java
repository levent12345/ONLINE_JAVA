package Start;

public class StringMethods {
    public static void main(String[] args) {
        String str="Welcome Java";
        String str2=" Hello!";
        String str3=" I love you guys.";


        String a[]=str3.split (" ");

        for(String c:a){
            System.out.println (c);
        }

        System.out.println (str.indexOf ("a"));

        System.out.println ("--------------");
        System.out.println (str.length ());
        System.out.println (str.concat (" WOOW"));
        System.out.println (str.concat (str2));
        System.out.println (str2.length ());
        System.out.println (str2.trim ().length ());

        String q="ali";
        String w="ali";

        System.out.println (q==w);
        System.out.println ("----------");

        String c="12asjlwg4567237)$@(!#$(!";

        System.out.println (c.replaceAll ("[^a-z]","*"));




    }
}
