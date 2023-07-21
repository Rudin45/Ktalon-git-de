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

WebUI.callTestCase(findTestCase('01 - eWallet/02 - Login/01 - No Fingerprint/2 - Login Successfully - First Time'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/55 Perfil'), 30)

Mobile.tap(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/55 Perfil'), 10)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/06 - Profile/01 - General/07 - Opciones'), 30)

Mobile.tap(findTestObject('01 - eWallet/06 - Profile/01 - General/07 - Opciones'), 10)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/01 - Password'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/01 - Password'), 'Contraseña')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/02 - NIP'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/02 - NIP'), 'NIP')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/03 - Preguntas'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/03 - Preguntas'), 'Pregunta de seguridad')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/06 - back'), 10)

Mobile.tap(findTestObject('01 - eWallet/06 - Profile/02 - Opciones/06 - back'), 10)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/03 - Home/cerrarSesion'), 10)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/salir'), 10)

Mobile.closeApplication()

