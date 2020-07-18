package Day4;

public class Matrices {
    public static void main(String[] args) {

     int a[][]={{2,3,3},{4,8,4}};
     int b[][]={{2,1,5},{3,4,6}};
     int c[][]=new int[2][3];

//       c[0][0]=a[0][0]+b[0][0];
//        c[0][1]=a[0][1]+b[0][1];
//        c[1][0]=a[1][0]+b[1][0];
//        c[1][1]=a[1][1]+b[1][1];


        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){

                c[i][j]=a[i][j]+b[i][j];
            }
        }

for(int i[]:c){
    for(int j:i){

        System.out.println (j);
    }
}
    }
}
