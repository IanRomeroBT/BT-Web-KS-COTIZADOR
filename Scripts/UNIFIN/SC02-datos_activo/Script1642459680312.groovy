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

WebUI.click(findTestObject('UNIFIN/DatosActivo/button_buscarActivo'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/input_nombreActivo'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('UNIFIN/DatosActivo/input_nombreActivo'), 'CHRYSLER')

WebUI.click(findTestObject('UNIFIN/DatosActivo/button_filtrarActivo'))

WebUI.delay(5)

WebUI.click(findTestObject('UNIFIN/DatosActivo/a_autoChrysler'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/div_equipo'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('UNIFIN/DatosActivo/input_descripcion'), 'AUTOMÓVIL ')

WebUI.setText(findTestObject('UNIFIN/DatosActivo/input_comentarios'), 'TEST')

WebUI.sendKeys(findTestObject('UNIFIN/DatosActivo/input_importe'), Keys.chord(Keys.CONTROL + 'A') + importeAuto)

if(nuevo != "ok") {
	WebUI.click(findTestObject('UNIFIN/DatosActivo/switch_nuevo'))
}


if (accesorio.equals('ok')) {
	
	WebUI.click(findTestObject('UNIFIN/DatosActivo/button_nuevoAccesorio'))
	
	WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/textarea_comentarios'), GlobalVariable.REGULAR_TIME_OUT)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosActivo/div_tipo'), 'Accesorio', true)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosActivo/div_descripcion'), 'ADAPTADOR', true)
	
	WebUI.setText(findTestObject('UNIFIN/DatosActivo/textarea_comentarios'), 'TEST ACCESORIO')
	
	if(formaPagoAccesorio.equals('financiado')) {
		WebUI.click(findTestObject('UNIFIN/DatosActivo/radio_financiado'))
	}else {
		WebUI.click(findTestObject('UNIFIN/DatosActivo/radio_contado'))
	}
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('UNIFIN/DatosActivo/input_importeSIva'), (Keys.chord(Keys.CONTROL + 'A') + '16.00') +
		Keys.chord(Keys.TAB))
	
	WebUI.click(findTestObject('UNIFIN/DatosActivo/button_aceptar'))
}

if (adaptacion.equals('ok')) {
	
	WebUI.click(findTestObject('UNIFIN/DatosActivo/button_nuevoAccesorio'))
	
	WebUI.waitForElementClickable(findTestObject('UNIFIN/DatosActivo/textarea_comentarios'), GlobalVariable.REGULAR_TIME_OUT)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosActivo/div_tipo'), 'Adaptación', true)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('UNIFIN/DatosActivo/div_descripcion'), 'DE REFRIGERACION', true)
	
	WebUI.setText(findTestObject('UNIFIN/DatosActivo/textarea_comentarios'), 'TEST ADAPTACIÓN')
	
	if(formaPagoAdaptacion.equals('financiado')) {
		WebUI.click(findTestObject('UNIFIN/DatosActivo/radio_financiado'))
	}else {
		WebUI.click(findTestObject('UNIFIN/DatosActivo/radio_contado'))
	}	
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('UNIFIN/DatosActivo/input_importeSIva'), (Keys.chord(Keys.CONTROL + 'A') + '16.00') +
		Keys.chord(Keys.TAB))
	
	WebUI.click(findTestObject('UNIFIN/DatosActivo/button_aceptar'))
}

WebUI.click(findTestObject('UNIFIN/Globales/button_siguiente'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/Globales/button_cotizar'), GlobalVariable.REGULAR_TIME_OUT)