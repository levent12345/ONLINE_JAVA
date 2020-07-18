package Day5.homeworks;

public class Student {
 int sid;
 String sname;
 int sub1;
 int sub2;
 int sub3;


 void getStuData(int id,String name){
     sid=id;
     sname=name;

 }

 void getStuMarks(int sb1,int sb2,int sb3){
     sub1=sb1;
     sub2=sb2;
     sub3=sb3;

 }
void totalMarks(){
    System.out.println (sid+" "+sname);
    System.out.println (sub1+sub2+sub3);
}

    public static void main(String[] args) {
        Student st1=new Student ();

        st1.getStuData (100,"Ali");
        st1.getStuMarks (20,30,50);
        st1.totalMarks ();
    }
}
