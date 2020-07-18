package ClassObjectMethod;

public class Employee {
    int empid;
    String empname;
    int salary;
    int depno;

    Employee( int empid1,String empname1,int salary1,int depno1){
        empid=empid1;
        empname=empname1;
        salary=salary1;
        depno=depno1;

        System.out.println ("I'm Constructor");
    }

    void display(){
        System.out.println ("Welcome to our company ;");
        System.out.println ("Employee Id: "+empid);
        System.out.println ("Employee Name : "+empname);
        System.out.println ("Employee Salary : "+salary);
        System.out.println ("Employee Department number : "+depno);

    }

    void initialize(int empid, String empname, int salary,int depno){
        System.out.println ("Welcome to our company ;");
       this.empid=empid;
       this.empname=empname;
       this.salary=salary;
       this.depno=depno;
    }

    public static void main(String[] args) {
        Employee em=new Employee (102033,"Tomy",5000,5);
        em.display ();

       /* em.depno=10;
        em.salary=3000;
        em.empid=102030;
        em.empname="John Doe";
        em.display ();

        Employee em2=new Employee ();
        em2.empname="Max Doe";
        em2.empid=102031;
        em2.salary=2500;
        em2.depno=12;
        em2.display ();

        Employee em3=new Employee ();

        em3.initialize (102032,"Allen Joe",4000,15);
        em3.display ();

        */



    }
}
