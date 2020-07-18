package Day6;

public class StaticExample {

  static int a=10;
  int b=20;

  static void m1(){
      StaticExample st=new StaticExample ();
      System.out.println (a);
      System.out.println (st.b);
      System.out.println ("This is m1- Static method");
  }
  void m2(){
      System.out.println ("This is m2- NONStatic method");
  }
void m3(){
    System.out.println (a);
    System.out.println (b);
    m1 ();
    m2 ();

}

    public static void main(String[] args) {
StaticExample st=new StaticExample ();
        System.out.println (a);
        m1 ();


        System.out.println (st.b);
        st.m2 ();
        st.m3 ();

    }
}
