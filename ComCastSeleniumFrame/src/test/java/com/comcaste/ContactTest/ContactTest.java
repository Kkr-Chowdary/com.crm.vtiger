package com.comcaste.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smokeTest")
	public void createcontactTest() {
		System.out.println("execute contact");
	}
	@Test(groups="regressionTest")
	public void createcontactwithorgTest() {
		System.out.println(" createcontactwithorgTest");
	}
	@Test(groups="smokeTest")
	public void deletecontactTest() {
		System.out.println("deletecontact");
	}
}
