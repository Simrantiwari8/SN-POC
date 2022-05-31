//package com.sn.Testcases;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.sn.Commons.TestBase;
//import com.sn.Pages.HomePage;
//import com.sn.Pages.IncidentCreate;
//import com.sn.Pages.LoginPage;
//import com.sn.utilities.ExcelUtilities;
//import com.sn.utilities.TestUtil;
//
//public class IncidentCreateTest extends TestBase {
//	
//	LoginPage loginpage;
//	HomePage homepage;
//	IncidentCreate incidentcreate;
//	
//	static String wbsheet="IncidentData";
//	
//	public IncidentCreateTest()
//	{
//		super();
//	}
//	
//	@BeforeMethod
//	public void setup() throws InterruptedException
//	{
//		launch();
//		loginpage = new LoginPage();
//		homepage = loginpage.LoginData(p.getProperty("un"), p.getProperty("pass"));
//		incidentcreate = homepage.SearchIncident();	
//	}
//	
//	/*
//	 * @DataProvider public Object[][] getIncidentdata() throws IOException { Object
//	 * Obj1[][]=ExcelUtilities.getExcel(wbsheet); return Obj1; }
//	 */
//	/*
//	 * @DataProvider public void writeIncidentdata() {
//	 * 
//	 * }
//	 */
//	
//	@DataProvider
//	public Iterator<Object[]> getIncidentData()
//	{
//	ArrayList<Object[]> testData=TestUtil.getDataFromExcel(wbsheet);
//	return testData.iterator();
//	
//	}
//	
//	
//	  @Test(dataProvider = "getIncidentData")
//	  public void createIncident(String Caller,String Shortdescription) throws InterruptedException {
//		 //if(Caller.equals(true) || Shortdescription.equals(true))
//		  if(Caller.isBlank() || Shortdescription.isBlank() )
//		 {
//			  System.out.println("Invalid data is choosen");
//				 incidentcreate.ClickonNewButton();
//				 incidentcreate.InvalidIncidentcreate(Caller, Shortdescription);
//			
//			
//		 }
//		 else 
//		 {
//			 System.out.println("Valid data is choosen");
//			 incidentcreate.ClickonNewButton(); //Thread.sleep(3000);
//			  incidentcreate.CreateNewIncident(Caller,Shortdescription); //Thread.sleep(3000);
//			  String name = incidentcreate.verifyIncidentPage(); 
//			  System.out.println(name);
//			 // String actualname = "Incidents [Portal view]";
////			  if(name.equals(actualname))
////			  {
////				  System.out.println("Test Case passed");
////			  }
////			  else
////			  {
////				  System.out.println("Testcase failed");
////			  }
//			 Assert.assertEquals(name, "Incidents [Portal view]", "Incident not created");
//		 }
//			
//	  }
//	 
//	/*
//	 * @Test public void Changereq() throws InterruptedException {
//	 * incidentcreate.ClickonNewButton();
//	 * System.out.println("Clicked on new button"); }
//	 */
//	@AfterMethod
//	public void teardown()
//	{
//		driver.quit();
//	}
//	
//	
//}


package com.sn.Testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
//import org.apache.commons.math3.stat.inference.TestUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sn.Commons.TestBase;
import com.sn.Pages.CreateChange;
import com.sn.Pages.HomePage;
import com.sn.Pages.IncidentCreate;
import com.sn.Pages.LoginPage;
import com.sn.utilities.TestUtil;

public class IncidentCreateTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	IncidentCreate incidentcreate;
	CreateChange  createChange ;
	static String wbsheet ="IncidentData";

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		launch();
		loginpage = new LoginPage();
		homepage = loginpage.LoginData(p.getProperty("un"), p.getProperty("pass"));
		incidentcreate=homepage.SearchIncident();
		

	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
	ArrayList<Object[]> testData=TestUtil.getDataFromExcel(wbsheet);
	return testData.iterator();
	
	}
	
	
	
 // @Test
	public void verifyincidentCreatepage() throws InterruptedException {

//		System.out.println("Executing verifyincidentCreatepage test case");
//		String act=incidentcreate.verifyincidentCreate();
//		System.out.println("incidentcreate page title is   :" + act);
//		
//		String exp="Incidents [Portal view] | ServiceNow";
//		if(act.equalsIgnoreCase(exp)) {
//			System.out.println("Opened incidents create page");  
//		}else {
//			System.out.println("Not opened incidents create page");
//			
//		}
	  
	  
	}

	@Test(dataProvider="getTestData")
	public void incidentCreate01(String Caller,String Shortdiscription) throws InterruptedException {

		System.out.println("Executing incidentCreate test case");
		createChange =incidentcreate.incidentCreate01(Caller,Shortdiscription);
		
		
			
	  }

	

	@AfterMethod
	public void teardown()

	{
		driver.quit();


	}
}
