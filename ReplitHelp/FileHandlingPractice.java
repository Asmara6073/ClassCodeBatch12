package ReplitHelp;

import com.syntax.class25.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingPractice {

    public static void main(String[] args) throws IOException {
        String path="/Users/tarikabraham/Desktop/Batch12/Test2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet2");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);
        sheet.createRow(2).createCell(0).setCellValue("Paulos");
        sheet.createRow(2).createCell(1).setCellValue(12);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);


        System.out.println(cell);

        System.out.println(xssfWorkbook.getSheetName(1));


    }

}
