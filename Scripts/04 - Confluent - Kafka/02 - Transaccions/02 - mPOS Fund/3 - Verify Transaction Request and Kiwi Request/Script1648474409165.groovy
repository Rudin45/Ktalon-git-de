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
import base.util.*

WebUI.callTestCase(findTestCase('04 - Confluent - Kafka/01 - Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/1 - stgClusterLink'))

WebUI.enhancedClick(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/2 - stgAzure'))

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/3 - topics'))

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/4 - searchTopic'), 'ewallet')

WebUI.click(findTestObject('04 - Confluent/03 - Card-Request/a_ewallet-transactions-request'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/7 - messagesLink'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), '-1')

WebUI.sendKeys(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/9 - arrowMessage'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

String amount = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Transactions Request/amount'))

WebUI.verifyMatch(GlobalVariable.e2eSDvalue, amount, false, FailureHandling.CONTINUE_ON_FAILURE)

String phone = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Transactions Request/phone'))

WebUI.verifyMatch(GlobalVariable.phoneNumber, phone.substring(4, 14), false, FailureHandling.CONTINUE_ON_FAILURE)

String status = 'pending'

String statusTrnx = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Transactions Request/status'))

WebUI.verifyMatch(status, statusTrnx.substring(1, 8), false, FailureHandling.CONTINUE_ON_FAILURE)

String type = 'deposit'

String typeTrnx = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Transactions Request/typeTrnx'))

WebUI.verifyMatch(type, typeTrnx.substring(1, 8), false, FailureHandling.CONTINUE_ON_FAILURE)

String idTrnx = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Transactions Request/idTrnx'))

String id = idTrnx.substring(1, 37)

println(id)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/3 - topics'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/03 - Card-Request/a_ewallet-kiwi-request'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/7 - messagesLink'))

WebUI.waitForPageLoad(30)

WebUI.delay(3)

WebUI.setText(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), '-1')

WebUI.sendKeys(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/8 - offsetSearch'), Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('04 - Confluent/02 - StoreDeposit/inRequest/9 - arrowMessage'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

amount = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Kiwi Request/amount'))

WebUI.verifyMatch(GlobalVariable.e2eSDvalue, amount, false, FailureHandling.CONTINUE_ON_FAILURE)

phone = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Kiwi Request/phone'))

WebUI.verifyMatch(GlobalVariable.phoneNumber, phone.substring(4, 14), false, FailureHandling.CONTINUE_ON_FAILURE)

String statusKiwi = 'processing'

String statusTrnxKiwi = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Kiwi Request/status'))

WebUI.verifyMatch(statusKiwi, statusTrnxKiwi.substring(1, 11), false, FailureHandling.CONTINUE_ON_FAILURE)

typeTrnx = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Kiwi Request/typeTrnx'))

WebUI.verifyMatch(type, typeTrnx.substring(1, 8), false, FailureHandling.CONTINUE_ON_FAILURE)

idTrnx = WebUI.getText(findTestObject('04 - Confluent/03 - Card-Request/Kiwi Request/idTrnx'))

String idKiwi = idTrnx.substring(1, 37)

WebUI.verifyMatch(id, idKiwi, false, FailureHandling.CONTINUE_ON_FAILURE)

VariableCollections.map.put('id', id)

/*

WebUI.callTestCase(findTestCase('05 - Mambu/02 - Transaccions/Verify Trnx'), [:], FailureHandling.CONTINUE_ON_FAILURE)

idMambu = WebUI.getText(findTestObject('05 - Mambu/13 - idMambu'))

WebUI.verifyMatch(id, idMambu, false, FailureHandling.CONTINUE_ON_FAILURE)

*/
WebUI.closeBrowser()

