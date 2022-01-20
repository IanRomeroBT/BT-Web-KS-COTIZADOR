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

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_buscarActivo'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_nombreActivo'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_nombreActivo'), 'CHRYSLER')

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_filtrarActivo'))

WebUI.delay(5)

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/a_autoChrysler'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosActivo/div_equipo'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_descripcion'), 'AUTOMÓVIL ')

WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_comentarios'), 'TEST')

if(nuevo != "ok") {
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/switch_nuevo'))
}

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_importe'), Keys.chord(Keys.CONTROL + 'A') + importeAuto + Keys.chord(Keys.TAB))


if (accesorio.equals('ok')) {
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_nuevoAccesorio'))
	
	WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosActivo/textarea_comentarios'), GlobalVariable.REGULAR_TIME_OUT)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosActivo/div_tipo'), 'Accesorio', true)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosActivo/div_descripcion'), 'ADAPTADOR', true)
	
	WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosActivo/textarea_comentarios'), 'TEST ACCESORIO')
	
	if(formaPagoAccesorio.equals('financiado')) {
		WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/radio_financiado'))
	}else {
		WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/radio_contado'))
	}
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_importeSIva'), (Keys.chord(Keys.CONTROL + 'A') + '16.00') +
		Keys.chord(Keys.TAB))
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_aceptar'))
}

if (adaptacion.equals('ok')) {
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_nuevoAccesorio'))
	
	WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/DatosActivo/textarea_comentarios'), GlobalVariable.REGULAR_TIME_OUT)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosActivo/div_tipo'), 'Adaptación', true)
	
	CustomKeywords.'Utilidades.CustomSelect'(findTestObject('COTIZADOR_SEGURO/DatosActivo/div_descripcion'), 'DE REFRIGERACION', true)
	
	WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosActivo/textarea_comentarios'), 'TEST ADAPTACIÓN')
	
	if(formaPagoAdaptacion.equals('financiado')) {
		WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/radio_financiado'))
	}else {
		WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/radio_contado'))
	}	
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosActivo/input_importeSIva'), (Keys.chord(Keys.CONTROL + 'A') + '16.00') +
		Keys.chord(Keys.TAB))
	
	WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosActivo/button_aceptar'))
}

WebUI.click(findTestObject('COTIZADOR_SEGURO/Globales/button_siguiente'))

WebUI.verifyElementPresent(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_rentasDeposito'), GlobalVariable.REGULAR_TIME_OUT)