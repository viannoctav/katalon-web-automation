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
import com.example.RandomHelper as RandomHelper

// Generate random data
String firstName = RandomHelper.randomName(6)
String lastName  = RandomHelper.randomName(5)
String email     = RandomHelper.randomEmail()
String phone     = RandomHelper.randomPhone()
String postal    = RandomHelper.randomPostalCode()
String password  = "Auto@" + RandomHelper.randomName(6) + "1!"
String street    = RandomHelper.randomStreet()
def location = RandomHelper.randomCityState()
String city  = location['city']
String state = location['state']

println('=== DATA REGISTER RANDOM ===')
println("Name     : ${firstName} ${lastName}")
println("Email    : ${email}")
println("Phone    : ${phone}")
println("Password : ${password}")
println("Street   : ${street}")
println("City     : ${city}")
println("State    : ${state}")
println('=============================')

WebUI.assertElementText(findTestObject('Page_Home/buttonLoginFromHomePage'), 'Sign in', 0)
WebUI.click(findTestObject('Page_Home/buttonLoginFromHomePage'))
WebUI.assertElementText(findTestObject('Page_Login/headerLogin'), 'Login', 0)
WebUI.assertElementText(findTestObject('Page_Login/buttonRegisterFromLoginPage'), 'Register your account', 0)
WebUI.click(findTestObject('Page_Login/buttonRegisterFromLoginPage'))
WebUI.assertElementText(findTestObject('Page_Register/headerRegistration'), 'Customer registration', 0)
WebUI.assertElementText(findTestObject('Page_Register/labelFirstName'), 'First name', 0)
WebUI.setText(findTestObject('Page_Register/fieldFirstName'), firstName)
WebUI.assertElementText(findTestObject('Page_Register/labelLastName'), 'Last name', 0)
WebUI.setText(findTestObject('Page_Register/fieldLastName'), lastName)
WebUI.assertElementText(findTestObject('Page_Register/labelDateOfBirth'), 'Date of Birth *', 0)
WebUI.setText(findTestObject('Page_Register/fieldDateOfBirth'), '1998-08-09')
WebUI.assertElementText(findTestObject('Page_Register/labelCountry'), 'Country', 0)
WebUI.selectOptionByValue(findTestObject('Page_Register/fieldCountry'), 'ID', false)
WebUI.assertElementText(findTestObject('Page_Register/labelPostalCode'), 'Postal code', 0)
WebUI.setText(findTestObject('Page_Register/fieldPostalCode'), postal)
WebUI.assertElementText(findTestObject('Page_Register/labelHouseNumber'), 'House number', 0)
WebUI.setText(findTestObject('Page_Register/fieldHouseNumber'), phone)
WebUI.assertElementText(findTestObject('Page_Register/labelStreet'), 'Street', 0)
WebUI.setText(findTestObject('Page_Register/fieldStreet'), street)
WebUI.assertElementText(findTestObject('Page_Register/labelCity'), 'City', 0)
WebUI.setText(findTestObject('Page_Register/fieldCity'), city)
WebUI.assertElementText(findTestObject('Page_Register/labelState'), 'State', 0)
WebUI.setText(findTestObject('Page_Register/fieldState'), state)
WebUI.assertElementText(findTestObject('Page_Register/labelPhoneNumber'), 'Phone', 0)
WebUI.setText(findTestObject('Page_Register/fieldPhoneNumber'), phone)
WebUI.assertElementText(findTestObject('Page_Register/labelEmailAddress'), 'Email address', 0)
WebUI.setText(findTestObject('Page_Register/fieldEmailAddress'), email)
WebUI.assertElementText(findTestObject('Page_Register/labelPassword'), 'Password', 0)
WebUI.setText(findTestObject('Page_Register/fieldPassword'), password)
WebUI.click(findTestObject('Page_Register/buttonSubmitRegister'))
WebUI.assertElementVisible(findTestObject('Page_Login/headerLogin'), 0)

// Simpan email & password ke GlobalVariable
GlobalVariable.tempEmail    = email
GlobalVariable.tempPassword = password
