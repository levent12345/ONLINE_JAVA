package statictic;

public class st {

    int a,b,c;

    void ad(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println ((a+b));

    }
    void ad2(int c){

        this.c=c;
        System.out.println (a+b+c);

    }

    public static void main(String[] args) {
        st ob=new st();

        ob.ad2 (5);
    }
}
