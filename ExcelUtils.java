package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 private static XSSFWorkbook ExcelWBook;
	    private static XSSFSheet ExcelSheet;
	    private static XSSFRow row;
	    private static XSSFCell Cell;
	    public static void setExcelFile(String path,String SheetName) throws IOException
	    {
	        FileInputStream ExcelFile=new FileInputStream(path);
	        ExcelWBook = new XSSFWorkbook(ExcelFile);
	        ExcelSheet=ExcelWBook.getSheet(SheetName);
	    }

	    public static String readData(int row, int col)
	    {
	        try
	        {
	        Cell=ExcelSheet.getRow(row).getCell(col);
	        String val = Cell.getStringCellValue();

	        return val;
	        }
	        catch(Exception e)
	        {
	            return "";
	        }
	    }
	    public static void writeData(int rowval,int col,String val) throws IOException
	    {
	        row=ExcelSheet.getRow(rowval);
	        Cell=row.getCell(col);
	        if(Cell==null)
	        {
	            Cell=row.createCell(col);
	            Cell.setCellValue(val);
	        }
	        else
	        {
	            Cell.setCellValue(val);
	        }
	        FileOutputStream fout=new FileOutputStream(ConstantValues.filename);
	        ExcelWBook.write(fout);
	        fout.flush();
	        fout.close();
	    }
	    public static int getRowNumber()
	    {
	        int rowcount=0;
	        rowcount=ExcelSheet.getLastRowNum()+1;
	        return rowcount;
	    }
}