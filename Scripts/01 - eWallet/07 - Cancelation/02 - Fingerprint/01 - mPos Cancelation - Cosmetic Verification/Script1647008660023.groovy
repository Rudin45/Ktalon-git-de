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

WebUI.callTestCase(findTestCase('01 - eWallet/02 - Login/02 - Fingerprint/2 - Login Successfully - First Time - Fingerprint'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/07 - Cancelation/01 - Linea Tarjeta Home'), 10)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/02 - Cancelation Link'), 'Hacer devolución')

Mobile.tap(findTestObject('01 - eWallet/07 - Cancelation/02 - Cancelation Link'), 4)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/03 - Continuar Button'), 'Continuar')

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/04 - Hacer Devolucion Label'), 'Hacer devolución')

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/05 - Al continuar Label'), 'Al continuar, el total de la compra se reembolsará a tu cliente.')

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/07 - Cancelar Link'), 'Cancelar')

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/07 - Cancelation/07 - Cancelar Link'), 4)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/07 - Cancelation/09 - Tiempo restante'), 'Tiempo restante para procesar la devolución:')

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/07 - Cancelation/08 - BackArrow'), 4)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/03 - Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

