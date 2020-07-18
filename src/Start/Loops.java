package Start;

public class Loops {

    static void count(int number){
       int count=0;
       int reverse=0;
      while(number>0){
          count++;
          reverse=10*reverse+number%10;
          number=number/10;

      }
        System.out.println (count);
        System.out.println (reverse);
    }

    public static void main(String[] args) {

count (12345);
}}
