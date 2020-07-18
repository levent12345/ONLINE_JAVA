package Day3;

public class homework2 {
    public static void main(String[] args) {

        int a=6;
        int b=3;
        int c=12;

        if(a>b&&a>c){ System.out.println ("a is biggest number");}
        if(b>a&&b>c){ System.out.println ("b is biggest number");}
        if(c>a&&c>b){ System.out.println ("c is biggest number");}

        if(a<b&&a<c){ System.out.println ("a is smallest number");}
        if(b<a&&b<c){ System.out.println ("b is smallest number");}
        if(c<a&&c<b){ System.out.println ("c is smallest number");}

        if(a>b&&a<c){ System.out.println ("a is Middle number");}
        if(b>a&&b<c){ System.out.println ("b is Middle  number");}
        if(c>a&&c<b){ System.out.println ("c is Middle  number");}



    }
}
