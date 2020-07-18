package Static;

public class Employee {

   static int a;
   static int b;

    static void sum(){
        System.out.println (a+b);
    }

}
class Test{

    public static void main(String[] args) {
        Employee em=new Employee ();
        Employee.a=10;
        Employee.b=15;

        System.out.println (Employee.a);
        Employee.sum ();
    }
}