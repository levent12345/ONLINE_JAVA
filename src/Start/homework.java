package Start;

public class homework {
    public static void main(String[] args) {

int [] a={5,7,1,9,34,54,32};
int sum=0;
int max=a[0],min=a[0];

//SUM
        for(int i=0;i<a.length;i++){

            sum=sum+a[i];
            if(a[i]>max){max=a[i];}
            if(a[i]<min){min=a[i];}

            if(a[i]==25){
                System.out.println ("Number is here");}

            if(a[i]%2==0){
                System.out.println (a[i]+": is EVEN");}
            else{
                System.out.println (a[i]+": ODD");}

        }
        System.out.println ("Sum :"+sum);
        System.out.println ("max :"+max);
        System.out.println ("min :"+min);
    }
}
