package Interface;

interface testi{

    int a=10;
    void display();//abstract method

}
public class interfaceEx implements testi {

    public void display(){
        System.out.println (a);
    }
    public static void main(String[] args) {

    }
}
