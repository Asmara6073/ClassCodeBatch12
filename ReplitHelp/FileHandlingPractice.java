package ReplitHelp;

import com.syntax.class25.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingPractice {

    public static void main(String[] args) throws IOException {
        String path="/Users/tarikabraham/Desktop/Batch12/Test2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet2");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);

        System.out.println(cell);

        System.out.println(xssfWorkbook.getSheetName(1));


    }

}
