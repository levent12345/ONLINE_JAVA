package Static;

public class Satatik1 {

    int id;
    String name;
    static int depno;

    void display(){
        m2 ();
        System.out.println (id);
        System.out.println (name);
        System.out.println (depno);

    }

    static void m2(){
        System.out.println ("Static Method");
    }

    public static void main(String args[]) {
        Satatik1 st=new Satatik1 ();

        st.name="Ali";
        st.id=100;
        st.depno=20;
        st.display ();

        Satatik1 st2=new Satatik1 ();

        st2.name="Veli";
        st2.id=101;
        st2.display ();

        m2 ();
    }
}
