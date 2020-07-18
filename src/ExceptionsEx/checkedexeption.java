package ExceptionsEx;

public class checkedexeption {
    public static void main(String[] args) {
        System.out.println ("Program started");


        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            System.out.println ("Catch a Exception");
        }

        System.out.println ("Program completed");

    }
}
