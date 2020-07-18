package Day4;

public class ArrayBiggestNumber {
    public static void main(String[] args) {



    int a[] = {9, 12, 34, 5, 7};
    int max = a[0];
    int min = a[0];

    for(int i:a)
    {
  if(i%2==0){
      System.out.println (i+":  Even Number"); } else{
      System.out.println (i+":  Odd Number");}
if(i>max){max=i;}
    }
        System.out.println (max);
        for(int i:a)
        {
            if(i<min){min=i;}
        }
        System.out.println (min);
}
}
