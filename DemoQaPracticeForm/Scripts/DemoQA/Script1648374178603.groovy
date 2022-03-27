import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('DemoQAApplication/input_Name_firstName'), 0)

WebUI.setText(findTestObject('DemoQAApplication/input_Name_firstName'), 'VIVEK')

WebUI.setText(findTestObject('DemoQAApplication/input_Name_lastName'), 'TV')

WebUI.setText(findTestObject('DemoQAApplication/input_Email_userEmail'), 'vivek@gmail.com')

WebUI.click(findTestObject('DemoQAApplication/label_Male'))

WebUI.setText(findTestObject('DemoQAApplication/input_MobNumber'), '1234567890')

WebUI.sendKeys(findTestObject('DemoQAApplication/input_Subjects_subjectsInput'), 'Test Project')

WebUI.delay(2)

WebUI.click(findTestObject('DemoQAApplication/label_Sports'))

WebUI.setText(findTestObject('DemoQAApplication/textarea_Current Address_currentAddress'), 'Bangalore')

WebUI.scrollToElement(findTestObject('DemoQAApplication/button_Submit'), 0)

WebUI.submit(findTestObject('DemoQAApplication/button_Submit'))

WebUI.verifyElementPresent(findTestObject('DemoQAApplication/div_Thanks for submitting the form'), 0)

WebUI.closeBrowser()

