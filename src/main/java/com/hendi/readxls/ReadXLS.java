/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.readxls;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author hendi.santika
 */
public class ReadXLS {

    public static void main(String[] args) throws BiffException, IOException {
        Workbook workbook = Workbook.getWorkbook(new File("D:/Tes/inputFiles/Persib.xls"));

        Sheet firstSheet = workbook.getSheet(0);
        System.out.println("Rows in first sheet : " + firstSheet.getRows());
        System.out.println("Columns in first sheet : " + firstSheet.getColumns());
        System.out.println();

        for (int row = 0; row < firstSheet.getRows(); row++) {
            for (int column = 0; column < firstSheet.getColumns(); column++) {
                System.out.print(firstSheet.getCell(column, row).getContents() + "\t\t");
            }
            System.out.println();
        }

        //Close and free allocated memory 
        workbook.close();
    }
    
     
}
