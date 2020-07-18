package Start;

public class MultiArray {
    public static void main(String[] args) {

        int[][] a=new int[3][2];

        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;
        System.out.println (a.length);
        System.out.println (a[0].length);
        System.out.println ();

        for(int[] b:a){
            for(int c:b){
                System.out.println (c);
            }
        }

        System.out.println ("------------");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){

                System.out.println (a[i][j]);
            }
        }
    }
}
