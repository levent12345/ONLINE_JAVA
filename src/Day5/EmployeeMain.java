package Day5;

public class EmployeeMain {
    public static void main(String[] args) {


        Employee emp1=new Employee ();
        emp1.eid=101;
        emp1.name="Ali";
        emp1.sal=200000;
        emp1.depno=22;
        emp1.job="Manager";
        emp1.display ();

        Employee emp2=new Employee ();
        emp2.eid=102;
        emp2.name="Veli";
        emp2.sal=25000;
        emp2.depno=23;
        emp2.job="CEO";
        emp2.display ();


    }
}
