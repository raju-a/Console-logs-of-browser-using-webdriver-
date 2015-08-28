package trycache;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.util.logging.Level;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cache {
	 WebDriver driver;
	 @BeforeMethod
	    public void setUp() {
	       // System.setProperty("webdriver.chrome.driver", "c:\\path\\to\\chromedriver.exe");        
	        DesiredCapabilities caps = DesiredCapabilities.firefox();
	        LoggingPreferences logPrefs = new LoggingPreferences();
	        logPrefs.enable(LogType.BROWSER, Level.ALL);
	        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	         driver = new FirefoxDriver(caps);
	        //driver = new ChromeDriver(caps);
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

	    public void analyzeLog() {
	    	
	        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	        for (LogEntry entry : logEntries) {
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	            //do something useful with the data
	        }
	    }

	    @Test
	    public void testMethod() throws InterruptedException {
	        
	        driver.manage().window().maximize();
	        driver.get("http://testing-sb.appspot.com/InitialAccountAction/getAccountInfo.do?accountNumber=8666859643");
	        Thread.sleep(10000);
	        
	        //do something on page
	        analyzeLog();
	        Thread.sleep(10000);
	    }
	//public static void main(String[] args) {
      
    
//		Cache newobj= new Cache();
//		newobj.createinstance();
//		
//     }
//	
//	public void createinstance()
//	{
//		for (int i=94;i<=104;i++)
//		{
//			WebDriver dd = new FirefoxDriver();
//			//dd.manage().window().maximize();
//	        readcsvfile(dd,i);
//	        dd.close();
//	        
//			
//		}
//		
//	}
//
//
//	public void readcsvfile(WebDriver obj, int no ){
//		String csvFile = "/Users/raju/Desktop/tryread"+no+".csv";
//		BufferedReader br = null;
//		String line = "";
//		
//	 
//		try {
//	 
//			br = new BufferedReader(new FileReader(csvFile));
//			while ((line = br.readLine()) != null) {
//	 
//				
//				String acno=line;
////				for(int i=1;i<34;i++)
////				{
//					obj.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND +"t");
//				    ArrayList<String> tabs = new ArrayList<String> (obj.getWindowHandles());
//				    //obj.switchTo().window(tabs.get(i));
//				    obj.get("http://alpha-sb.appspot.com/InitialAccountAction/getAccountInfo.do?accountNumber="+acno);
//                    System.out.println(acno); 
//					
//				//}
//
//				
//	 
//			}
//	 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (br != null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	 
//		System.out.println("Done");
//	 
		
//		/****************** Browser stack *************/
		

		

	

//		  public static final String USERNAME = "raju90";
//		  public static final String AUTOMATE_KEY = "gRNW9CxYjTTrWhSLPzNk";
//		  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
//
//		  public static void main(String[] args) throws Exception {
//		    
//		    DesiredCapabilities caps = new DesiredCapabilities();
//		    caps.setCapability("browser", "IE");
//		    caps.setCapability("browser_version", "7.0");
//		    caps.setCapability("os", "Windows");
//		    caps.setCapability("os_version", "XP");
//		    caps.setCapability("browserstack.debug", "true");
//
//		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//		    driver.get("http://www.google.com/ncr");
//		    WebElement element = driver.findElement(By.name("q"));
//
//		    element.sendKeys("BrowserStack");
//		    element.submit();
//
//		    System.out.println(driver.getTitle());
//		    driver.quit();

// /*********************** SB 5 try ************************/	
//	public static final String USERNAME = "raju90";
//	  public static final String AUTOMATE_KEY = "gRNW9CxYjTTrWhSLPzNk";
//	  public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
//	
//	public static void main(String[] args) throws JSONException, MalformedURLException {
//		
//		String conid="123657856hjfdjhfd89r9834531288889";
//		
//		 DesiredCapabilities caps = new DesiredCapabilities();
//		 caps.setCapability("browser", "Chrome");
//		 caps.setCapability("browser_version", "39.0");
//		 caps.setCapability("os", "Windows");
//		 caps.setCapability("os_version", "8.1");
//		 caps.setCapability("resolution", "1024x768");
//		
//		    WebDriver dd = new RemoteWebDriver(new URL(URL), caps);
//		//WebDriver dd = new FirefoxDriver();
//		dd.manage().window().maximize();
//		
//		dd.get("http://testing-sb.appspot.com/InitialAccountAction/getAccountInfo.do?accountNumber=1006859643&connId="+conid+"&incomingANI=901436560&agentLogin=raju.pillai@a-cti.com#messageHistory");
//	    dd.findElement(By.xpath("html/body/section/div[1]/div/i")).click();
//	    dd.findElement(By.id("radio_option_data_67fb2eaf-8acc-43ef-a349-f7e8471592b2")).click();
//	    dd.findElement(By.xpath("//*[@id='step_6ea8bf5e-49be-45fd-e001-a8c95857baac']/div[5]/i")).click();
//	sentstatusfromfull("Batchsend",conid);
//
//	}
//	public static String sentstatusfromfull(String checkthis, String conid ) throws JSONException
//	{
////		String connectionId = "26f01f6340dd9d4";
//		String pUrl = "https://full-historyservice.appspot.com/Interaction/getInteraction.do?connectionId="+conid+"&apiKey=3cb8cc68-ecb9-4f00-92fb-fe38bfa103a4&type=7773327f-9328-435d-bec9-c868bc3a301e&isParent=false";
//		BufferedReader reader = null;
//		HttpURLConnection connection = null;
//		String lResponseString = "";
//		String lRespObj = "";
//		JSONArray interactionArray = null;
//		try
//			{
//				URL url = new URL( pUrl );
//				connection = (HttpURLConnection) url.openConnection();
//				connection.setDoInput( true );
//				connection.setDoOutput( true );
//				connection.setRequestMethod( "POST" );
//				connection.setConnectTimeout( 0 );
//				connection.setReadTimeout( 60000 );
//				connection.setInstanceFollowRedirects( false );
//				OutputStreamWriter writer = new OutputStreamWriter( connection.getOutputStream() );
//				writer.write( "" );
//				writer.flush();
//				reader = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );
//				while ( ( lResponseString = reader.readLine() ) != null )
//					lRespObj = lResponseString;
//					interactionArray = new JSONArray( lRespObj );
//			}
//		catch ( Exception e )
//			{
//				e.printStackTrace();
//			}
//		finally
//			{
//				try
//					{
//						if ( reader != null )
//							reader.close();
//						if ( connection != null )
//							connection.disconnect();
//					}
//				catch ( Exception e )
//					{
//						e.printStackTrace();
//					}
//			}
//		for(int i=0;i<interactionArray.length();i++)
//		{
//			JSONObject interactionObject = new JSONObject(interactionArray.getString(i));
//			JSONArray interactionStatusList = new JSONArray( interactionObject.getString("interactionStatusList"));
//			for(int j=0;j<interactionStatusList.length();j++)
//			{
//				JSONObject interactionStatusObject = new JSONObject(interactionStatusList.getString(j));
//				System.out.println("Status ::: "+interactionStatusObject.getString("status"));
//				if(checkthis.equalsIgnoreCase(interactionStatusObject.getString("status")))
//				{
//					System.out.println(checkthis);
//					System.out.println("pass");
//					
//				}
////				else
////				{
////					testStepFailed("<font color=red><i class=\"fa fa-thumbs-o-down fa-2x\"></i>&nbsp;"+"Failed to save or sent");
////				}
//			}
//			
//		}
//		return checkthis;
//		
		// ************************* try new ***************************
		
		
		
	//}
	

}
