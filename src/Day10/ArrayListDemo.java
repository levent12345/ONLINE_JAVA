package Day10;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {


        ArrayList ar=new ArrayList ();
        ArrayList<String> ar2=new ArrayList ();
        ar.add (10);
        ar.add ("car");
        ar.add ('A');
        System.out.println (ar);

        for(Object a:ar){
            System.out.println (a);
        }

    }
}
