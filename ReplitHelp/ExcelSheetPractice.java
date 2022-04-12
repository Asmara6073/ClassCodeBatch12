package ReplitHelp;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A list of maps to store the data from excel. Each map will store the data from each row
 *  Getting the header from the excel file so that we can use the data from this header row as keys for the map
 * we write a loop to get all the rows from this sheet except from the first row because it is the header row
 * we get all the rows starting from row at index 1
 * for each new row we are creating a new map to store the data, so we don't override the data for previous rows
 * once we have got the row, we fetch the data from all the cells with the help of a loop
 * we use the headerRow to get the keys and the row to get the corresponding cell value
 * once we are done storing all the data from a row inside a map, we put that map into the list
 */
public class ExcelSheetPractice {

    public static void main(String[] args) throws IOException {

        String path="/Users/tarikabraham/Desktop/Batch12/AprilBudget.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");

        List<Map<String,String>> excelData=new ArrayList<>();

        Row headerRow=sheet.getRow(0);// header row

        for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){
            Row row=sheet.getRow(i);
            LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
            for(int j=0;j<row.getPhysicalNumberOfCells();j++){
                linkedHashMap.put(headerRow.getCell(j).toString(),row.getCell(j).toString());
            }
            excelData.add(linkedHashMap);

        }
        System.out.println(excelData);







    }
}
