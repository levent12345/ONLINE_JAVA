package Day4;

public class SingleDimensionalArray {
    public static void main(String[] args) {


    int a[]=new int[5];

    a[0]=5;
    a[1]=2;
    a[2]=20;
    a[3]=30;
    a[4]=10;


        System.out.println (a.length);

        for (int i=0;i<a.length;i++){

            System.out.println (a[i]);
        }

     //For Each Loop
        System.out.println ("FOR EACH LOOP :");
     for(int i:a){
         System.out.println (i);
     }

    }
}
