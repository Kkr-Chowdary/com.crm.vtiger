package com.comcast.Orgnization;

import org.testng.annotations.Test;

public class OrgTest {
	
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

}
