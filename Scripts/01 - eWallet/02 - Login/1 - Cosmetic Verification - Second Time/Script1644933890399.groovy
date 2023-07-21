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

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/01 - Start Aplication/Start Application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/01 - Welcome/07 - Ya tengo cuenta Link'), 10)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/02 - Login/00 - Logo SiHay'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/01 - Hola'), '¡Hola!', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/02 - Que gusto'), 'Qué gusto verte de nuevo', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/03 - Numero celular'), 'Número celular a 10  dígitos', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/04 - Password'), 'Contraseña', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/06 - Ingresar Button'), 'Ingresar', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/05 - Olvidaste Password'), '¿Olvidaste tu contraseña?', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('01 - eWallet/02 - Login/07 - Crear Cuenta nueva Link'), 'Crear cuenta nueva', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

