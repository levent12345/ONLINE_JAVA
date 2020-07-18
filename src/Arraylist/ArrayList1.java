package Arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {


        ArrayList list=new ArrayList ();
        ArrayList <String> list2=new ArrayList <String>() ;

        list.add (5);
        list.add (4);
        list.add (3);
        list.add (2);
        list.add (1);
        list.add ("Ali");
        list.add ("Veli");
        list2.add ("Ali");
        list2.add ("Veli");

        System.out.println (list);
        System.out.println (list.size ());
        list.remove ("Ali");
        System.out.println (list);
        System.out.println (list.size ());

        for(int i=0;i<list.size ();i++){

            System.out.println (list.get (i));
        }
        System.out.println ("--------");
        for(Object  a:list){
            System.out.println (a);
        }
        System.out.println ("--------");
        for(Object b:list2){

            System.out.println (b);
        }
    }
}
