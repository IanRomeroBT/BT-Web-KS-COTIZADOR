import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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

if(cotizacionAceptada != 'ok') {
	WebUI.closeBrowser(FailureHandling.OPTIONAL)
	
	WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/iniciar_sesion_unifin'), [('usuario') : usuario], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/acceder_cotizador'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/ingresar_cotizacion'), [('folio') : folio], FailureHandling.STOP_ON_FAILURE)
	
	//Eliminar cuando funcione el input de contrato
	if(WebUI.verifyElementPresent(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 3, FailureHandling.OPTIONAL)) {
		WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 'TEST')
	}
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'))
	
	WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_verCotizacion'), 10)
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_verCotizacion'))
	
	WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_aceptarPrima'), 10)
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_aceptarPrima'))
	
	WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'), 10)
	
	//Eliminar cuando funcione el input de contrato
	if(WebUI.verifyElementPresent(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 3, FailureHandling.OPTIONAL)) {
		WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 'TEST')
	}
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'))
	
	WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_cotizacionAceptada'), 10)
}

