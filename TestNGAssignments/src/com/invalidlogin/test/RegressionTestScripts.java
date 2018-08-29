package com.invalidlogin.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



public class RegressionTestScripts {
	
	@Test(priority=1)
	public void verifiedValidLogin() throws InterruptedException, IOException
	{
		MethodRepository obj=new MethodRepository();
						 obj.browserAppLaunch();
						 obj.validLogin();
						 Assert.assertTrue(obj.verifiedValidLogin(), "Tested");
						 obj.appClose();
	}
	
	@Test(priority=0)
	public void verifiedInvalidLogin() throws IOException, InterruptedException
	{
		
		MethodRepository obj1 =new MethodRepository();
						 obj1.browserAppLaunch();
						 obj1.invalidLogin();
						 Assert.assertTrue(obj1.verifiedInvalidLogin(), "Test Case Pass");
						 obj1.appClose();
						 				 
	}
	
}
	/*@Test(priority=1)
	public void navigate()
	{
		MethodRepository obj2 =new MethodRepository();
						 obj2.pageNavigate();
	}*/


