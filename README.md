# Console-logs-of-browser-using-webdriver-

Its allways best Idea to get the console logs of browser for every run 

Two simple Steps 

1. Fist setup the Environment 
 
          DesiredCapabilities caps = DesiredCapabilities.firefox();
	        LoggingPreferences logPrefs = new LoggingPreferences();
	        logPrefs.enable(LogType.BROWSER, Level.ALL);
	        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
	        driver = new FirefoxDriver(caps);

2. Call this method anywhere inside your code

         public void analyzeLog()
               {
	    	  LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	          for (LogEntry entry : logEntries) {
	          System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " entry.getMessage());
	            
	        }
	    }
	    
	
