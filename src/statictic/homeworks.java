package statictic;

public class homeworks {

    int sum(int x,int y){
        return x+y;
    }

    int sum(int x,int y,int z){

        return x+y+z;
    }

    double sum(double x,double y){

        return x+y;
    }
    double sum(double x,double y,double z){

        return x+y+z;
    }

    public static void main(String[] args) {
        homeworks hm= new homeworks ();

        System.out.println (hm.sum (5,20));
        System.out.println (hm.sum (5,20,30));
        System.out.println (hm.sum (5.5,20.3));
        System.out.println (hm.sum (5.2,20.4,10.3));
    }
}

