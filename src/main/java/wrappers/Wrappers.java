package wrappers;


public interface Wrappers {


	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Saravanan T
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */
	public void invokeApp(String browser);

	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Saravanan T
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */		
	public void invokeApp(String browser, boolean bRemote);

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Saravanan T
	 * @return 
	 * @throws Exception 
	 */
	public void enterById(String idValue, String data);

	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Saravanan T
	 */
	public void enterByXpath(String xpathValue, String data);


	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Saravanan T
	 */
	public boolean verifyTitle(String title);

	
	/**
	 * This method will verify the given text with exact match
	 * @param xpath - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Saravanan T
	 */
	public void verifyTextByXpath(String xpath, String text);

	/**
	 * This method will click the element using link text as locator
	 * @param linkText  The linkText (locator) of the element to be clicked
	 * @author Saravanan T
	 */
	public void clickByLinkText(String linkText);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Saravanan T
	 */
	public void clickById(String id);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Saravanan T
	 */
	public void clickByXpath(String xpathVal);

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Saravanan T
	 */
	
	/**
	 * This method will verify whether the element is present using id as locator
	 * @param id  The id (locator) of the element to be verified
	 * @author Saravanan T
	 */
	public void isExistById(String id);
	
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Saravanan T
	 */
	public String getTextByXpath(String xpathVal);

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Saravanan T
	 */
	public void selectVisibileTextById(String id, String value);


	/**
	 * This method will move the control to the last window
	 * @author Saravanan T
	 */
	public void switchToLastWindow();

	/**
	 * This method will take snapshot of the browser
	 * @author Saravanan T
	 */
	public long takeSnap();

	/**
	 * This method will close the active browser
	 * @author Saravanan T
	 */
	public void closeBrowser();


	/**
	 * This method will close all the browsers
	 * @author Saravanan T
	 */
	public void closeAllBrowsers();

}
