package pac1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "smoke")
	public void createcontactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println("Execute createcontactTest");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}
	@Test
	public void modifycontactTest() {
		System.out.println("Execute modifycontactTest");
		
	}

}
