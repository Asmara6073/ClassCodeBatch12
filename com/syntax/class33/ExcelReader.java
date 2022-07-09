package com.syntax.class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    static XSSFWorkbook book;
    static Sheet sheet;
    String path="/Users/tarikabraham/Desktop/Batch12/Test2.xlsx";
    public static void openExcel(String path){
        try{
            FileInputStream fs=new FileInputStream(path);
             book=new XSSFWorkbook(fs);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void getSheet(String sheetName){
        book.getSheet(sheetName);
    }

    public static int getRowCount(){
        return sheet.getPhysicalNumberOfRows();
    }

    public static int getColumnCount(int rowIndex){
        return sheet.getRow(rowIndex).getPhysicalNumberOfCells();
    }


    public static String getCellData(int rowIndex, int colIndex){
        return sheet.getRow(rowIndex).getCell(colIndex).toString();
    }


    public static List<Map<String,String>> excelIntoMap(String path,String sheetName){

        openExcel(path);
        getSheet(sheetName);
        List<Map<String,String>>tableData=new ArrayList<>();

        for(int row=1;row<getRowCount();row++){
            Map<String,String>map=new HashMap<>();

            for(int col=0;col<getColumnCount(row);col++){
                map.put(getCellData(0,col),getCellData(row,col));
            }
            tableData.add(map);
        }

        return tableData;
    }

}
