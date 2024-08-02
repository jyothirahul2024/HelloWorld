package handsOn;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("test case 1");
		
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("--remote-allow-origins=*");
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(chromeOptions); driver.manage().window().maximize();
		 * driver.get("https://www.hotstar.com");
		 */
		try {
			//System.out.println("");
			File f1 = new File("DataProvider/TestData.xlsx");
			
			XSSFWorkbook wrk = new XSSFWorkbook(f1);
			XSSFSheet sht = wrk.getSheetAt(0);
			//XSSFSheet sht2 = wrk.getSheetAt(1);
			XSSFRow rw =sht.getRow(0);
			//XSSFRow rw1 = sht2.getRow(0);
			//int sheet = wrk.getActiveSheetIndex();
			XSSFCell cl =rw.getCell(0);
			String cellval = cl.getStringCellValue();
			//System.out.println(cellval);
			int trow = sht.getLastRowNum()+1;
			int tcol = rw.getLastCellNum();
			
			/*
			 * for(int i=0;i<3;i++) { rw =sht.getRow(i); cl =rw.getCell(0);
			 * System.out.println(cl.getStringCellValue());
			 * 
			 * }
			 */
			
			/*
			 * for(int i=0;i<4;i++) { // rw.getCell(i); cl =rw.getCell(i);
			 * System.out.println(cl.getStringCellValue());
			 * 
			 * }
			 */
			System.out.println("total rows" + trow);
			System.out.println("total sheets: " + wrk.getNumberOfSheets());
			/*
			 * for(int i=0;i<rw.getLastCellNum();i++) {
			 * 
			 * rw = sht.getRow(i);
			 * 
			 * for(int j=0;j<4;j++) { cl =rw.getCell(j);
			 * System.out.print(cl.getStringCellValue()); System.out.print(" ");
			 * 
			 * 
			 * } System.out.println(""); }
			 */
			
		/*	for(int i=0;i<wrk.getNumberOfSheets();i++) {
				sht = wrk.getSheetAt(i);
				System.out.println("At sheet: " + sht.getSheetName());
				rw = sht.getRow(0);
				for(int j=0; j<=sht.getLastRowNum(); j++) {
					rw = sht.getRow(j);
					for(int k=0;k<rw.getLastCellNum();k++) {
						cl = rw.getCell(k);
						System.out.print(cl.getStringCellValue());
						System.out.print(" ");
					}
					System.out.println("");
				}
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		
		/*
		 * String a[][] = new String[2][4]; a[0][0] = "cat"; a[0][1] = "dog"; a[0][2] =
		 * "cow"; a[0][3] = "crow";
		 * 
		 * a[1][0] = "lion"; a[1][1] = "pigeon"; a[1][2] = "parrot"; a[1][3] = "tiger";
		 * 
		 * for(int i=0;i<a[0].length;i++) { System.out.println(a[0][i]); //for(int
		 * j=0;j<a[1].length;j++) { System.out.println(a[1][i]); //}
		 * 
		 * }
		 */
			String a[][] = new String[trow][tcol];
			System.out.println("Total Row: "+ trow);
			System.out.println("Total Column: "+ tcol);
			for(int i=0;i<trow;i++) {
				rw = sht.getRow(i);
				
				for(int j=0;j<tcol;j++) {
					cl = rw.getCell(j);
					a[i][j]=cl.getStringCellValue();
					System.out.println(a[i][j]);
							}
					
				
			}
			//System.out.println("First row First cell"+ a[0][0]);
			for(int i=0;i<a[0].length;i++) {
				//System.out.println(a[0][i]);
				//System.out.println(a[0][i]);
				
			}
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
