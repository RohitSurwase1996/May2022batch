Feature: Login functionality

Background: Application opens successfully
Given user open browser with "webdriver.chrome.driver" and "C:\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"


@SmokeTest
Scenario: Login functionality with valid credentials
When user click on initial Login page
When user navigate on Login button
When user click on My Profile
When user enter "9923843409" as username
When user enter "Rohit@123" as password
When user click on Login button
Then application shows login successfully

