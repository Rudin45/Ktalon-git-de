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

WebUI.callTestCase(findTestCase('05 - Mambu/01 - Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('05 - Mambu/16 - transaccionesDepsito'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('05 - Mambu/17 - allDepositTransactions'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/06 - FilterList'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('05 - Mambu/06 - FilterList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/07 - filterButton'))

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/19 - editButton'))

WebUI.delay(2)

WebUI.setText(findTestObject('05 - Mambu/20 - Available Column'), 'ewallet Transaction Id')

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/21 - addColumn'))

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/22 - applyChanges'))

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/18 - idOrderColumn'))

WebUI.delay(2)

WebUI.click(findTestObject('05 - Mambu/18 - idOrderColumn'))

WebUI.waitForPageLoad(30)

WebUI.delay(2)

String amountMambu = WebUI.getText(findTestObject('05 - Mambu/15 - amountList'))

WebUI.verifyMatch(GlobalVariable.e2eSDvalue, amountMambu.substring(1, 4), false, FailureHandling.CONTINUE_ON_FAILURE)

String eWalletId = WebUI.getText(findTestObject('05 - Mambu/23 - eWalletId'))

println(eWalletId)

String idKiwi = VariableCollections.map.get('id')

WebUI.verifyMatch(eWalletId, idKiwi, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

