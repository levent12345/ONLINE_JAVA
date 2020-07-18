package Day5.homeworks;

public class Calculation {
    int num1;
    int num2;
    int num3;

    Calculation(int n1,int n2,int n3){
      num1=n1;
      num2=n2;
      num3=n3;
    }
   void assign(int a1,int a2,int a3){

        num1=a1;
        num2=a2;
        num3=a3;
   }
    void sum(){

        System.out.println (num1+num2+num3);
    }

    public static void main(String[] args) {
        Calculation cal=new Calculation (10,15,20);

        cal.sum ();


        cal.num1=20;
        cal.num2=40;
        cal.num3=50;

        cal.sum ();

        cal.assign (2,3,4);
        cal.sum ();


    }

}
