package com.vikram.gui.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vikram.gui.pojo.KeyRegisterModel;

public class ReadingExcelfileToDB {

	static String [] cellvariable=new String[13];
	public static void main(String[] args) throws Exception {
		
		
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
				
		FileInputStream file =new FileInputStream("C:\\Users\\venka\\Documents\\LinkopingKeysdata.xlsx");
		Workbook workbook=new XSSFWorkbook(file);
		Sheet sh=workbook.getSheet("sheet1");
		DataFormatter formatter = new DataFormatter();
		int number_of_rows=sh.getLastRowNum();
		int number_of_cells;
		int number_of_columns=12;
		for(int i=1;i<=number_of_rows;i++)
		{
			
			KeyRegisterModel keyregmodel=new KeyRegisterModel();
			
			
			Row row=sh.getRow(i); 
			for(int j=0;j<=number_of_columns;j++)
			{
				Cell cell=row.getCell(j);
				//String cell_value=cell.toString();
				//String cell_value=cell.getNumericCellValue();
				String cell_value=formatter.formatCellValue(cell);
				
				cellvariable[j]=cell_value;
				//The cellvariable is set to the object
				System.out.println(cell_value);
			}
			keyregmodel.setDistrictNumber(cellvariable[0]);
			keyregmodel.setAdress(cellvariable[1]);
			keyregmodel.setAdressMoreInfo(cellvariable[2]);
			keyregmodel.setKeyModel(cellvariable[3]);
			keyregmodel.setKeySystemNumber(cellvariable[4]);
			keyregmodel.setKeyType(cellvariable[5]);
			keyregmodel.setKeyFRAS(cellvariable[6]);
			keyregmodel.setKeyProfile(cellvariable[7]);
			keyregmodel.setCodesinfo(cellvariable[8]);
			keyregmodel.setAdressOwnerContactDetails(cellvariable[9]);
			keyregmodel.setOwnerMoreInfo(cellvariable[10]);
			keyregmodel.setUpdatedDate(new Date());
		
			session.save(keyregmodel);
				
				
		}
		session.getTransaction().commit();	
		session.close();
	}

}
