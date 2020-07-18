package Day7;



class Teacher{
    String designation="Teacher";
    String collageName="BeginnersBook";
     void does(){
         System.out.println ("Teaching...");
     }
}

class ComputerTeacher extends Teacher{




        }

public class homework1 {
    public static void main(String[] args) {
        ComputerTeacher ct= new ComputerTeacher ();

        System.out.println (ct.designation);
        System.out.println (ct.collageName);
        ct.does ();
        ct.collageName="Hasan";
        ct.designation="N/A";
        System.out.println (ct.designation);
        System.out.println (ct.collageName);
        ct.does ();

    }
}
