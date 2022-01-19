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

if (clienteRegistrado.equals('ok')) {
	WebUI.click(findTestObject('UNIFIN/DatosGenerales/switch_clienteRegistrado'))

	WebUI.click(findTestObject('UNIFIN/DatosGenerales/button_buscarCliente'))

	WebUI.setText(findTestObject('UNIFIN/DatosGenerales/input_buscarCliente'), cliente)

	WebUI.click(findTestObject('UNIFIN/DatosGenerales/button_filtrarCliente'))
	
	WebUI.waitForElementVisible(findTestObject('UNIFIN/DatosGenerales/span_seleccionarCliente'), 5)
	
	WebUI.click(findTestObject('UNIFIN/DatosGenerales/span_seleccionarCliente'))

	WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosGenerales/button_buscarCliente'), GlobalVariable.REGULAR_TIME_OUT)
}

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_plan'), plan, false)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_tipoOperacion'), tipoOperacion, false)

if(WebUI.verifyElementPresent(findTestObject('UNIFIN/DatosGenerales/div_tipoCompra'), 3, FailureHandling.OPTIONAL)) {
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_tipoCompra'), tipoCompra, false)

	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_cotizacion'), cotizacion, false)
}

if(WebUI.verifyElementPresent(findTestObject('UNIFIN/DatosGenerales/input_contratoAnterior'), 3, FailureHandling.OPTIONAL)) {
	WebUI.setText(findTestObject('UNIFIN/DatosGenerales/input_contratoAnterior'), 'TEST')
}

if (WebUI.verifyElementVisible(findTestObject('UNIFIN/DatosGenerales/input_noActivos'), FailureHandling.OPTIONAL)) {
	WebUI.setText(findTestObject('UNIFIN/DatosGenerales/input_noActivos'), '5')
}

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_moneda'), moneda, false)

WebUI.click(findTestObject('UNIFIN/Globales/button_siguiente'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/button_buscarActivo'), GlobalVariable.REGULAR_TIME_OUT)