package packet1.packet2.packet3;
class AA{
    private int x;
    private int y;



    private void display(){
        System.out.println (x+y);
    }
        void set(int x,int y){
        this.x=x;
        this.y=y;

    }

    int getx(){
        return x;
    }
    int gety(){
        return y;
    }

    void screen(){
        display ();
    }



}
public class test12 {
    public static void main(String[] args) {
        AA ao=new AA();
ao.set (10,20);
        System.out.println (ao.getx ());
        System.out.println (ao.gety ());
        ao.screen ();

    }
}
