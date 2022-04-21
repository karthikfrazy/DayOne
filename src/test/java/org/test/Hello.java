package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hello {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\spark\\eclipse-workspace\\MavenSample\\Excel\\data.task.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		
	}

}
