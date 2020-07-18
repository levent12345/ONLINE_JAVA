package ExcellEx;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcellExxxxx {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream ("/Users/user/Desktop/ONLINE/src/list2.xls") ;
        System.out.println ("---------------Test1");
        try{
        XSSFWorkbook wb=new XSSFWorkbook(fis);

        System.out.println ("---------------Test2");
        XSSFSheet s=wb.getSheet ("sheet1");
        String value=s.getRow (1).getCell (1).getStringCellValue ();
        System.out.println (value);}catch(Throwable e){
            System.out.println ("Exception Found");
        }




    }
}
