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

WebUI.assertElementText(findTestObject('Page_Home/buttonLoginFromHomePage'), 'Sign in', 0)

WebUI.click(findTestObject('Page_Home/buttonLoginFromHomePage'))

WebUI.assertElementText(findTestObject('Page_Login/headerLogin'), 'Login', 0)

WebUI.assertElementText(findTestObject('Page_Login/buttonRegisterFromLoginPage'), 'Register your account', 0)

WebUI.click(findTestObject('Page_Login/buttonRegisterFromLoginPage'))

WebUI.assertElementText(findTestObject('Page_Register/headerRegistration'), 'Customer registration', 0)

WebUI.assertElementText(findTestObject('Page_Register/labelFirstName'), 'First name', 0)

WebUI.setText(findTestObject('Page_Register/fieldFirstName'), 'Robot')

WebUI.assertElementText(findTestObject('Page_Register/labelLastName'), 'Last name', 0)

WebUI.setText(findTestObject('Page_Register/fieldLastName'), 'Auto')

WebUI.assertElementText(findTestObject('Page_Register/labelDateOfBirth'), 'Date of Birth *', 0)

WebUI.setText(findTestObject('Page_Register/fieldDateOfBirth'), '1998-08-09')

WebUI.assertElementText(findTestObject('Page_Register/labelCountry'), 'Country', 0)

WebUI.selectOptionByValue(findTestObject('Page_Register/fieldCountry'), 'ID', false)

WebUI.assertElementText(findTestObject('Page_Register/labelPostalCode'), 'Postal code', 0)

WebUI.setText(findTestObject('Page_Register/fieldPostalCode'), '198989')

WebUI.assertElementText(findTestObject('Page_Register/labelHouseNumber'), 'House number', 0)

WebUI.setText(findTestObject('Page_Register/fieldHouseNumber'), '6288888888')

WebUI.assertElementText(findTestObject('Page_Register/labelStreet'), 'Street', 0)

WebUI.setText(findTestObject('Page_Register/fieldStreet'), 'Bekasi')

WebUI.assertElementText(findTestObject('Page_Register/labelCity'), 'City', 0)

WebUI.setText(findTestObject('Page_Register/fieldCity'), 'Bekasi')

WebUI.assertElementText(findTestObject('Page_Register/labelState'), 'State', 0)

WebUI.setText(findTestObject('Page_Register/fieldState'), 'Bekasi')

WebUI.assertElementText(findTestObject('Page_Register/labelPhoneNumber'), 'Phone', 0)

WebUI.setText(findTestObject('Page_Register/fieldPhoneNumber'), '6288888888888888')

WebUI.assertElementText(findTestObject('Page_Register/labelEmailAddress'), 'Email address', 0)

WebUI.setText(findTestObject('Page_Register/fieldEmailAddress'), 'robotmodeauto@gmail.com')

WebUI.assertElementText(findTestObject('Page_Register/labelPassword'), 'Password', 0)

WebUI.setText(findTestObject('Page_Register/fieldPassword'), 'Robotmodeauto123!')

WebUI.click(findTestObject('Page_Register/buttonSubmitRegister'))

WebUI.assertElementVisible(findTestObject('Page_Login/headerLogin'), 0)

