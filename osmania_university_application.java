package orange_h_r_m;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class osmania_university_application {
	public static void main(String[] args) {
		
		WebDriver driver;
		String OU_Application_url_address="https://www.osmania.ac.in/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Santhosh\\orange\\driverfile 108\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(OU_Application_url_address);
		//<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" style="position:relative; z-index:1000"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
		
		WebElement OU_dropDown=driver.findElement(By.id("gtranslate_selector"));
		OU_dropDown.click();
		
		//<option value="">Select Language</option>
		
		List<WebElement> OU_dropDown_List=driver.findElements(By.tagName("option"));
		int OU_dropDown_List_Count=OU_dropDown_List.size();
		
		System.out.println("OU_dropDown_List_size is  :  "+OU_dropDown_List_Count);
		
		for(int i=0;i<=OU_dropDown_List_Count;i++) {
			
			String OU_dropDown_List_Name=OU_dropDown_List.get(i).getText();	
		System.out.println(i+" "+OU_dropDown_List_Name);	
		
		//<option value="en|te">Telugu</option>
		
		Select Telugu_Language_Select=new Select(OU_dropDown);
		//Telugu_Language_Select.selectByVisibleText("Telugu");
		//Telugu_Language_Select.selectByValue("en|te");
		//Telugu_Language_Select.selectByIndex(7);
		
	//selecting options from dropdown without using methods
		
		List<WebElement>alloptions=Telugu_Language_Select.getOptions();
		
		for(WebElement option:alloptions) {
			
			if(option.getText().equals("Telugu"))
					{
				option.click();
				break;
			}
		}
			
		}
		
	}

}
