package com.comcast.Orgnization;

import org.testng.annotations.Test;

public class OrgTest {



	@Test(groups="smokeTest")
	public void createOrganizationTest(){
		String BROWSER= System.getProperty("browser");
		String ENV= System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(ENV);
		System.out.println("execute organization");
	}
	@Test(groups="regressionTest")
	public void createOrgwithcontactTest() {
		System.out.println(" createOrgwithcontactTest");
	}
	@Test(groups="regressionTest")
	public void deleteOrgTest() {
		System.out.println("deleteOrgTest");
	}
	@Test(groups="regressionTest")
	public void editOrg() {
		System.out.println("editOrg");
	}

}
