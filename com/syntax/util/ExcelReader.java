package com.syntax.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String,String>> getData(String path,String sheetName) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet(sheetName);

        //A list of maps to store the data from excel. Each map will store the data from each row
        List<Map<String,String>> excelData=new ArrayList<>();
        //Getting the header from the excel file so that we can use the data from this header row as keys for the map
        Row headerRow=sheet.getRow(0);
        //we write a loop to get all the rows from this sheet except from the first row becasue it is the header row
        for(int j=1;j<sheet.getPhysicalNumberOfRows();j++){
            //we get all the rows starting from row at index 1
            Row row=sheet.getRow(j);
            //for each new row we are creating a new map to store the data, so we don't override the data for previous rows
            LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
            //once we have got the row, we fetch the data from all the cells with the help of a loop
            for(int i=0; i<row.getPhysicalNumberOfCells();i++){
                //we use the headerRow to get the keys and the row to get the corresponding cell value
                linkedHashMap.put(headerRow.getCell(i).toString(),row.getCell(i).toString());
            }
            // once we are done storing all the data from a row inside a map, we put that map into the list
            excelData.add(linkedHashMap);
        }
       return excelData;
    }

}
