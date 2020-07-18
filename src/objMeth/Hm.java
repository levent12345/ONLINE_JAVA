package objMeth;

public class Hm {

    int sid;
    String sname;
    int sub1;
    int sub2;
    int sub3;

    void getStuData(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
    void getStuMarks(int sub1,int sub2,int sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }
    void totalMarks(){
        System.out.println ("SID: "+sid);
        System.out.println ("SNAME: "+sname);
        System.out.println ("Total Marks: "+(sub1+sub2+sub3));
    }

    public static void main(String[] args) {
        Hm st=new Hm();
        st.getStuData (101,"Hank");
        st.getStuMarks (60,70,80);
        st.totalMarks ();
    }


}
