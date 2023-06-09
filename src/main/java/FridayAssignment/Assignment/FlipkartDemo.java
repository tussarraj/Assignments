package FridayAssignment.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartDemo {
	
	WebDriver driver;
    public FlipkartDemo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

}
    
    @FindBy(xpath = "//button[text()='✕']")
    WebElement closewindow;

    @FindBy(xpath = "(//img[@class=\"_396cs4\"])[2]")
    WebElement mobile;

    @FindBy(xpath = "//div[text()='SAMSUNG']")
    WebElement samsung;

    @FindBy(xpath = "//div[text()='APPLE']")
    WebElement apple;

    @FindBy(xpath = "//div[text()='realme']")
    WebElement realme;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removeapple;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removesamsung;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removerealme;
    
    public void flipkart() {
    	
    	closewindow.click();
    	mobile.click();
    	samsung.click();
    	apple.click();
    	realme.click();
    	removeapple.click();
    	removesamsung.click();
    	removerealme.click();
    	
    	
    	
    	
    }
    
    
}
