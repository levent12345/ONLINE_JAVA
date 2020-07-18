package SDETCLASS1;

public class OperatorsClass3 {

    public static void main (String[] args){

      int a=10;
      int b=20;


// Aritmetic operators + - * / %
        System.out.println ("Aritmetic:------------------------------");
        System.out.println ("Sum of a and b :"+(a+b));
        System.out.println ("Dif of a and b :"+(b-a));
        System.out.println ("Mul of a and b :"+(a*b));
        System.out.println ("Div of a and b :"+(a/b));
        System.out.println ("Mod of a and b :"+(a%b));
//Relational operators (comparison operators)  == < > <= >= !=
//Always return boolean value
        System.out.println ("Relational:------------------------------");
        System.out.println (a==b);//false
        System.out.println (a<b);//true
        System.out.println (a>b);//false
        System.out.println (a<=b);//true
        System.out.println (a>=b);//false
        System.out.println (a!=b);//true
//Logical operators && || !
//Works between two booleans

      boolean x=true;
      boolean y=false;
      System.out.println ("Logical:------------------------------");
      System.out.println (x&&y);//false
      System.out.println (x||y);//true
      System.out.println (!x);//false
      System.out.println (!y);//true
  //Increment/Decrement operators  ++  --

      System.out.println ("Increment/Decrement:------------------------------");
      System.out.println (a);
      System.out.println (a++);
      System.out.println (a);
      System.out.println (a);

    }
}
