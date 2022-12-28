package orange_h_r_m;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC {
	public static void main(String[] args) {
	
		WebDriver driver;
		String TSRTC_Application_url_address="https://www.tsrtconline.in/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Santhosh\\orange\\driverfile 108\\chromedriver.exe");
		driver=new ChromeDriver();
		/*<div class="menu-wrap">
		<div class="menu">
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				Home</a>
			<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
			<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
			<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
			<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
			<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
			<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
			<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
			<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" 
			style="float: right !important;">Customer Survey Form</a> -->
</div>
</div>*/
	
		driver.get(TSRTC_Application_url_address);
		List <WebElement> Header_Block_Links=driver.findElements(By.tagName("a"));
		int Header_Block_Links_Size=Header_Block_Links.size();
		
		System.out.println("TSRTC headerblock Link Text is :"+Header_Block_Links_Size);
		
		for(int i=0;i<=Header_Block_Links_Size;i++) {
			
			//System.out.println(i+" "+Header_Block_Links.get(i).getText());
			
			String Header_Block_Links_Name=Header_Block_Links.get(i).getText();
			
			System.out.println(i+" "+Header_Block_Links_Name);
			
		}
	}

}
