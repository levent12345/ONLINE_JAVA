package objMeth;

public class Stud {
    int sid;
    String name;
    char grade;


    void display(){
        System.out.println ("ID :"+sid);
        System.out.println ("NAME: "+name);
        System.out.println ("GRADE: "+grade);

    }

    void set(int sid,String name,char grade){
        this.sid=sid;
        this.name=name;
        this.grade=grade;
    }
    void set2(int id,String nm,char g){
        sid=id;
        name=nm;
        grade=g;

    }

    Stud(int sid,String name,char grade){
        this.sid=sid;
        this.name=name;
        this.grade=grade;
    }


}
