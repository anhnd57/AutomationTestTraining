package automation.testsuite;

import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day7_Practice extends CommonBase{
	
	@BeforeTest
	public void openChrome()
	{
		driver = initChromeDriver("https://bepantoan.vn/");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Hello my first Project");
	}

}
