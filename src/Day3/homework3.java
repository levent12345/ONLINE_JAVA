package Day3;

public class homework3 {
    public static void main(String[] args) {

        int a=6;
        int b=12;
        int c=3;
        int temp;

       // a>b,a>c,b>c

        if(a>b){temp=b;b=a;a=temp;}
        if(a>c){temp=c;c=a;a=temp;}
        if(b>c){temp=c;c=b;b=temp;}
        System.out.println (" a : "+a+" b : "+b+" c : "+c);


    }
}
