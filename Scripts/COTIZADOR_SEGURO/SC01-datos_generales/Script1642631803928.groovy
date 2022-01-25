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
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosGenerales/switch_clienteRegistrado'))

	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosGenerales/button_buscarCliente'))

	WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_buscarCliente'), cliente)

	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosGenerales/button_filtrarCliente'))
	
	WebUI.waitForElementVisible(findTestObject('COTIZADOR_SEGURO/DatosGenerales/span_seleccionarCliente'), 5)
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosGenerales/span_seleccionarCliente'))

	WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosGenerales/button_buscarCliente'), GlobalVariable.REGULAR_TIME_OUT)
}

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosGenerales/div_plan'), plan.trim(), false)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosGenerales/div_tipoOperacion'), tipoOperacion.trim(), false)

if(tipoOperacion.contains('Colocado') || tipoOperacion.contains('Crédito Puente')) {
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosGenerales/div_tipoCompra'), tipoCompra.trim(), false)

	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosGenerales/div_cotizacion'), cotizacion.trim(), false)
	
	if (cotizacion.contains('Flotilla')) {
		WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_noActivos'), '5')
	}
	
}else {
	WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 'TEST')
}

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosGenerales/div_moneda'), moneda.trim(), false)

WebUI.click(findTestObject('COTIZADOR_SEGURO/Globales/button_siguiente'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_buscarActivo'), GlobalVariable.REGULAR_TIME_OUT)