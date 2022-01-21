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

WebUI.closeBrowser(FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('NEGOCIADOR_SEGURO/inicio_sesion_quantico'), [('usuario') : 'acorrea_tst', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/MenuQuantico/div_negociador'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/MenuQuantico/div_negociadorOpcion'))

WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/Negociador/input_nombreCliente'), cliente + Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Negociador/button_buscarCliente'))

if (WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/Negociador/tr_cotizacion', [('folio') : folio]), 10, FailureHandling.CONTINUE_ON_FAILURE)) {
    
	WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/Negociador/button_consultarCliente'), GlobalVariable.REGULAR_TIME_OUT)
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Negociador/button_consultarCliente'))
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Negociador/tr_cotizacion', [('folio') : folio]))

    WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Negociador/button_generarNegociacion'))

    WebUI.waitForElementVisible(findTestObject('NEGOCIADOR_SEGURO/Generales/alert_success'), GlobalVariable.REGULAR_TIME_OUT)
}