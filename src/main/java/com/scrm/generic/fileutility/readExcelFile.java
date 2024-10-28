package com.scrm.generic.fileutility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcelFile 
{
	
	public static Object[][] convertTo2DArray(ArrayList<ArrayList<String>> listOfLists) {
		int rows = listOfLists.size();

		Object[][] array = new Object[100][100];

		for (int i = 0; i < rows; i++) {
			ArrayList<String> rowList = listOfLists.get(i);
			int cols = listOfLists.get(i).size();  
			for (int j = 0; j < cols; j++) {
				array[i][j] = rowList.get(j);
			}
		}

		return array;
	}
	/**
	 * 
	 * @param Path for excel
	 * @return object array containg all the excel data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object[][] readExcelData(String Path) throws EncryptedDocumentException, IOException
	{
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		File f = new File(Path);
		Workbook wb = WorkbookFactory.create(f); 
		Sheet sh = wb.getSheet("AccountsNew");
		int rowNum = sh.getPhysicalNumberOfRows();
		for(int i=0;i<rowNum;i++)
		{
			ArrayList<String > arr = new ArrayList<String>();
			int col = sh.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<col;j++)
			{
				arr.add(sh.getRow(i).getCell(j)+"");
			}
			data.add(arr);
			arr=null;
		}
		Object[][] o = convertTo2DArray(data);
		return o;
	}
    
	/**
	 * 
	 * @param path to excel sheet
	 * @param rowNo
	 * @return enter row data in string format
	 * @throws Exception
	 * @throws IOException
	 */
	public static String[] getRow(String path,int rowNo) throws Exception, IOException
	{
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		File f = new File(path);
		Workbook wb = WorkbookFactory.create(f); 
		Sheet sh = wb.getSheet("AccountsNew");
		Row rowData= sh.getRow(rowNo);
		String[] str= new String[rowData.getPhysicalNumberOfCells()];
		int j=0;
		for(Cell i:rowData)
			str[j++]=i+" ";
		return str;

	}
}
