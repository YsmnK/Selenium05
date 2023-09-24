package com.neotech.lesson05;

public class Recap {
	
//	Properties file - is a file that has .properties extension and we store data in key=value format
//			We use this file to store configuration settings.
//			We can make changes to this file without effecting the java code.
//
//			To read the data from properties file we use Properties class, we use load() method.
//
//			--------------------------------
//			Step 1
//
//			a)
//			We are reading key=value pairs from configuration.properties file
//				browser=chrome
//				url=https://hrm.neotechacademy.com/
//
//			b)
//			if the value of browser is chrome
//				We open chrome browser
//			if the value of browser is firefox
//				We open firefox browser
//
//			c)
//			We navigate to the website which is stored in configuration.properties file
//			--------------------------------
//			Step 2
//
//			a)
//			We created a Constants.java class where we store the path of (chrome driver, gecko driver and configuration file)
//
//			b)
//			We created a ConfigsReader.java class which will read the configuration file
//
//			c)
//			We change from if statement to switch statement
//
//			d)
//			We changed the hard-coded strings to those variables from Constants.java file
//			--------------------------------
//			Step 3
//
//			a)
//			We created a BaseClass which has setUp() and tearDown() methods
//
//			b)
//			In our test case, we are inheriting the BaseClass to use setUp() and tearDown() methods
//
//
}
