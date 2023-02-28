package toyota.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static toyota.bdd.utils.IConstant.*;

import java.time.Duration;

import toyota.bdd.objects.BuildYourToyotaPage;
import toyota.bdd.objects.CamryLEHybridPage;
import toyota.bdd.objects.FindADealerPage;
import toyota.bdd.objects.LandingPage;
import toyota.bdd.objects.SetYourLocation;
import toyota.bdd.utils.Constant;
import toyota.bdd.utils.ReadProperties;

public class BaseClass {

	public static WebDriver driver;
	public static LandingPage landingPage;
	public static SetYourLocation setYourLocation;
	public static BuildYourToyotaPage buildYourToyotaPage;
	public static FindADealerPage findADealerPage;
	public static CamryLEHybridPage camryLEHybridPage;
  	ReadProperties enVar = new ReadProperties();


	public void setUpDriver(String browser) {
//		String browser = enVar.getProperty(BROWSER);
		String url = enVar.getProperty(URL);
		long pageLoadWait = enVar.getNumProperty(PAGELOAD_WAIT);
		long implicitlyWait = enVar.getNumProperty(IMPLICIT_WAIT);
		initDriver(browser);
		initClasses(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
	}

	public void initClasses(WebDriver driver) {
		landingPage = new LandingPage(driver);
		setYourLocation = new SetYourLocation(driver);
		buildYourToyotaPage = new BuildYourToyotaPage(driver);
		findADealerPage = new FindADealerPage(driver);
		camryLEHybridPage = new CamryLEHybridPage(driver);
	}

	public void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
	}

	public void tearUp() {
		driver.quit();
	}
	
	@SuppressWarnings("unused")
	private String getString(Constant constant) {
		return constant.name();
	}

}

















