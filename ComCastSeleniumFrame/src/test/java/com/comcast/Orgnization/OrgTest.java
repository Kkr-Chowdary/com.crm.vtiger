package com.comcast.Orgnization;

import org.testng.annotations.Test;

public class OrgTest {
	String BROWSER= System.getProperty("browser");

	String ENV= System.getProperty("url");


	@Test(groups="smokeTest")
	public void createOrganizationTest() {
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
