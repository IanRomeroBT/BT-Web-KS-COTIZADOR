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

WebUI.click(findTestObject('UNIFIN/DatosGenerales/switch_clienteRegistrado'))

WebUI.click(findTestObject('UNIFIN/DatosGenerales/button_buscarCliente'))

WebUI.setText(findTestObject('UNIFIN/DatosGenerales/input_buscarCliente'), cliente)

WebUI.click(findTestObject('UNIFIN/DatosGenerales/button_filtrarCliente'))

WebUI.click(findTestObject('UNIFIN/DatosGenerales/span_seleccionarCliente'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosGenerales/button_buscarCliente'), GlobalVariable.REGULAR_TIME_OUT)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_plan'), 'ARRENDAMIENTO PURO', false)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_tipoOperacion'), 'Colocado', false)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_tipoCompra'), 'Referenciada', false)

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_cotizacion'), 'Flotilla', false)

if(WebUI.verifyElementVisible(findTestObject('UNIFIN/DatosGenerales/input_noActivos'), FailureHandling.OPTIONAL)){
	WebUI.setText(findTestObject('UNIFIN/DatosGenerales/input_noActivos'), '5')
}

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosGenerales/div_moneda'), 'PESOS', false)

WebUI.click(findTestObject('UNIFIN/Globales/button_siguiente'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/button_buscarActivo'), GlobalVariable.REGULAR_TIME_OUT)