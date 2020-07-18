package Day5;

public class Student {

    int sid;
    String sname;
    char grade;
Student(int id,String name,char g){//consructor

    sid=id;
    sname=name;
    grade=g;

}

    void display(){


        System.out.println (sid+"  "+sname+"  "+grade);
    }

    void getValues(int id,String name,char g){//Method

        sid=id;
        sname=name;
        grade=g;

    }
}
