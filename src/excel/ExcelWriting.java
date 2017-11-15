package excel;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriting {
    public static void writeToExcel(int[] array) throws IOException {
        //Workbook wb = new HSSFWorkbook();
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Sheet");
        FileOutputStream fileOutputStream = new FileOutputStream("E://file.xlsx");

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(0);

        cell.setCellValue("Array: ");
        for(int i = 0,j=1 ; i < array.length; i++, j++) {
            cell = row.createCell(j);
            cell.setCellValue(array[i]);

        }
        wb.write(fileOutputStream);
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        writeToExcel(array);
    }
}

