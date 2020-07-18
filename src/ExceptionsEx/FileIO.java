package ExceptionsEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {

        FileReader fr=null;

        fr=new FileReader ("/Users/user/Desktop/text.txt");

        BufferedReader bfr=new BufferedReader (fr);

        System.out.println (bfr.readLine ());





    }
}
