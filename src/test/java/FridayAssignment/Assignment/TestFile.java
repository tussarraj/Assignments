package FridayAssignment.Assignment;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFile extends BaseTest{
	
	public FlipkartDemo obj;
	
	WebDriver driver;
	
	@BeforeClass
	public void setup(){

        driver = getDemoDriver();
        obj = new FlipkartDemo(driver);
}
	
	@Test
    public void Scenario() throws InterruptedException{
        
	obj.flipkart();	
	

    }
	
	
}