package Day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

    //Declaaration
        HashMap<Integer,String> hm=new HashMap ();
        hm.put (101,"John");
        hm.put (102,"Jehn");
        hm.put (103,"Juhn");
        hm.put (104,"Jahn");
        hm.put (105,"Kim");

        System.out.println (hm);

        hm.remove (103);
        System.out.println (hm);


        for(Map.Entry m:hm.entrySet ()){
            System.out.println (m.getKey ()+"  "+m.getValue ());
        }
    }
}
