import org.openqa.selenium.chrome.ChromeDriver;

public class practice_open_google {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	ChromeDriver santhosh=new ChromeDriver();
	santhosh.get("https://www.google.com/");
	String actual_title=santhosh.getTitle();
	System.out.println("the actual title is:"+actual_title);
	
	
	santhosh.quit();
	}

}
