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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.ResultSetMetaData as ResultSetMetaData
import org.postgresql.jdbc.PgResultSet as PgResultSet
import base.util.*

CustomKeywords.'databases.PostgressDB.connectDB'(GlobalVariable.dbServer, GlobalVariable.dbName, GlobalVariable.dbPort, 
    GlobalVariable.dbUsername, GlobalVariable.dbPassword)

String idKiwi = VariableCollections.map.get('id')

println(idKiwi)

//idKiwi = '1dabf6a0-05d5-4faa-bbde-0b23c82fcd5b'
String selectData = ('SELECT * FROM transactions where id = \'' + idKiwi) + '\''

println('Select Data' + selectData)

//String selectData= "SELECT * FROM transactions where id ='1dabf6a0-05d5-4faa-bbde-0b23c82fcd5b'"
//println("Select Data:  " + selectData)
List<List> rowList = CustomKeywords.'databases.PostgressDB.executeQuery'(selectData)

println(rowList)

String eWalletId = rowList.get(0).get(0)

String type = rowList.get(0).get(2)

String amount = rowList.get(0).get(7)

String status = rowList.get(0).get(8)

String method = rowList.get(0).get(13)

String originalAmount = rowList.get(0).get(14)

println(eWalletId)

println(type)

println(amount)

println(status)

println(method)

println(originalAmount)

WebUI.verifyMatch(eWalletId, idKiwi, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(amount, GlobalVariable.e2eSDvalue, false, FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'databases.PostgressDB.closeDatabaseConnection'()

