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

WebUI.callTestCase(findTestCase('04 - Confluent - Kafka/01 - Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/1 - stgClusterLink'),3)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))

element = WebUiCommonHelper.findWebElement(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/2 - stgAzure'),3)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))
*/
WebUI.enhancedClick(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/1 - stgClusterLink'))

WebUI.enhancedClick(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/2 - stgAzure'))

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/3 - topics'))

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/4 - searchTopic'), 'ewallet')

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/5 - ewalletInswitchFundsInRequest'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/7 - messagesLink'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), '-5')

WebUI.sendKeys(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/9 - arrowMessage'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

String amount = WebUI.getText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/11 - amountValue'))

WebUI.verifyMatch(GlobalVariable.e2eSDvalue, amount.substring(1, 4), false, FailureHandling.CONTINUE_ON_FAILURE)

String name = WebUI.getText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/15 - fullNameValue'))

WebUI.verifyMatch(GlobalVariable.e2eSDname, name.substring(1, 28), false, FailureHandling.CONTINUE_ON_FAILURE)

String phone = WebUI.getText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/13 - phoneNumberValue'))

WebUI.verifyMatch(GlobalVariable.phoneNumber, phone.substring(4, 14), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/3 - topics'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inResponse/6 - ewalletInswitchFundsInResponse'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/7 - messagesLink'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), '-5')

WebUI.sendKeys(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/9 - arrowMessage'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

amount = WebUI.getText(findTestObject('04 - Confluent/02 - StoreDeposit/inResponse/16 - valueResponse'))

WebUI.verifyMatch(GlobalVariable.e2eSDvalue, amount.substring(1, 4), false, FailureHandling.CONTINUE_ON_FAILURE)

String status = WebUI.getText(findTestObject('04 - Confluent/02 - StoreDeposit/inResponse/17 - statusOK'))

WebUI.verifyMatch(GlobalVariable.e2eSDStatus, status.substring(1, 10), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

