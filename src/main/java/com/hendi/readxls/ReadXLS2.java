/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.readxls;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author hendi.santika
 */
public class ReadXLS2 {
    public void readExcel() throws BiffException, IOException {
        String FilePath = "D:/Tes/inputFiles/Persib.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);

        // TO get the access to the sheet
//        Sheet sh = wb.getSheet("Sheet1");
        Sheet sh = wb.getSheet(0);

        // To get the number of rows present in sheet
        int totalNoOfRows = sh.getRows();

        // To get the number of columns present in sheet
        int totalNoOfCols = sh.getColumns();

        for (int row = 0; row < totalNoOfRows; row++) {

            for (int col = 0; col < totalNoOfCols; col++) {
                System.out.print(sh.getCell(col, row).getContents() + "\t");

            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws BiffException, IOException {
        ReadXLS2 data = new ReadXLS2();
        data.readExcel();
    }
}
