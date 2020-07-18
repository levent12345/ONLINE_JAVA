package AccesModifier;

class tryw{
    private int x;
    private int y;
    private void sum(){
        System.out.println (x+y);
    }
     tryw(int x,int y){
        this.x=x;
        this.y=y;
     }
     void displaysum(){
        sum ();
     }

}

public class trycons {
    public static void main(String[] args) {
        tryw ob=new tryw(10,20);

        ob.displaysum ();
    }
}
