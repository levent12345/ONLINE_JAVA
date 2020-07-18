package Day6;

public class ConstructorOverloading {

    ConstructorOverloading(int a,int b){
        System.out.println (a+b);
    }
    ConstructorOverloading(int a,double b){
        System.out.println (a+b);
    }
    ConstructorOverloading(double a,double b){
        System.out.println (a+b);
    }
    ConstructorOverloading(int a,int b,int c){
        System.out.println (a+b+c);
    }

    public static void main(String[] args) {

        ConstructorOverloading ov= new ConstructorOverloading (15,25);
        ConstructorOverloading ov1= new ConstructorOverloading (15.2,10);
        ConstructorOverloading ov2= new ConstructorOverloading (15.3,10.6);

ov.main(12);

    }

    void main(int x) {
        System.out.println (x);
    }


}
