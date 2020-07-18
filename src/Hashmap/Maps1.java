package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps1 {
    public static void main(String[] args) {

        HashMap hm=new HashMap ();

        hm.put ("Ali",10);
        hm.put(20,"Veli");

        System.out.println (hm);

        HashMap<Integer,String> map=new HashMap<> ();

        map.put(101,"john");
        map.put(102,"scot");
        map.put(103,"david");
        map.put(104,"smith");
        map.put(105,"kim");

        System.out.println (map);

        Set st=map.keySet ();

        System.out.println (st);
        System.out.println ("--------");

        for(Object a:st){

            System.out.println (a+"   "+map.get (a));
        }
        System.out.println ("--------");

        for(Map.Entry m:map.entrySet ()){

            System.out.println (m);
            System.out.println (m.getKey ());
            System.out.println (m.getValue ());
        }
    }
}
