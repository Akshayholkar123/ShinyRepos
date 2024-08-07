package Com.Comcast.crm.GenricCommFilesUtility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
@SuppressWarnings("deprecation")
public String getDataFromExcel(String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException,FileNotFoundException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/DataRMG/dataforRMG.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.getRow(rowCount);
	Cell cell=row.getCell(cellCount);
	String data=cell.getStringCellValue();

	wb.close();
	return data;

}
public int getLastRowNum(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/DataRMG/dataforRMG.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rc=sh.getLastRowNum();
		wb.close();
		return rc;
	
}
public void writedataInExcel(String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("./src/test/resources/DataRMG/dataforRMG.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row=sh.getRow(rowCount);
	Cell cell=row.createCell(cellCount);
	cell.setCellValue(data);
	
	FileOutputStream fos=new FileOutputStream("./src/test/resources/DataRMG/dataforRMG.xlsx");
	wb.write(fos);
	
wb.close();
}
}