package datadrivenClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.Register_page;
import pageClasses.YourStore;

public class TC003_RegisterNewCustomer extends BaseClass {
	@Test(dataProvider = "RegisterInputValues")
	public <NewRegister> void doRegister(String frstName, String lastName, String email, String telephone, String pword,
			String confirmpwd) {
		YourStore st = new YourStore(driver);
		st.doClickOnMyAccount();
		Register_page cust = new Register_page(driver);
		cust.doRegister(frstName, lastName, email, telephone, pword, confirmpwd);
	}

	@DataProvider(name = "RegisterInputValues")
	public Object[][] passdata() throws IOException {
		File src = new File("C:\\Users\\karth\\eclipse-workspace\\pageobjectmodel_democart\\src\\registertestdata.xlsx");
	
		// load the excel file
		FileInputStream fis = new FileInputStream(src);
		// load the workbook from the above excel file
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// load the sheet from above excel workbook
		
		XSSFSheet sheet = wb.getSheetAt(0);
		// how many total rows in my excel sheet
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
	
		int rows = rowCount + 1;
		System.out.println(rows);
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		
		String data[][] = new String[rowCount][cellCount];
		for (int i = 1; i < rowCount + 1; i++) {
			Row r = sheet.getRow(i);
			r.toString();
			for (int j = 0; j < cellCount; j++) {
				// getStringCellValue--don't use this as it returns exception if used integer
				// values
				System.out.println(data[i - 1][j] = r.getCell(j).toString());
			}
		}
		return data;
	}

}
