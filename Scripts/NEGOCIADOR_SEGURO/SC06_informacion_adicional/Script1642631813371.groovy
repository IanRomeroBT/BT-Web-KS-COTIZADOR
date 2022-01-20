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

if(cotizacionAceptada != "ok") {
	String[] lPlazo
	
	if (plazos.toString().contains('-')) {
		lPlazo = plazos.toString().split('-')
	} else {
		lPlazo = new String[1]
	
		(lPlazo[0]) = plazos.toString()
	}
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Generales/button_tomarTarea'))
	
	WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/switch_cotizarSeguro'), 5)
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/div_seguroCliente'))
	
	if (WebUI.verifyElementVisible(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/select_aseguradoraSC'), FailureHandling.OPTIONAL)) {
		WebUI.selectOptionByLabel(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/select_aseguradoraSC'), 'MAPFRE MEXICO, S.A.',
			false)
	
		WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_montoAsegurado'), (Keys.chord(Keys.CONTROL +
				'A') + '500000') + Keys.chord(Keys.TAB))
	
		WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_totalPrima'), (Keys.chord(Keys.CONTROL +
				'A') + '19000') + Keys.chord(Keys.TAB))
	
		WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/textarea_comentarios'), Keys.chord(Keys.CONTROL +
				'A') + 'TEST')
	}
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/switch_cotizarSeguro'))
	
	WebUI.setText(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_sumaAsegurada'), '500,000')
	
	WebUI.selectOptionByLabel(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/select_aseguradora'), 'SEGUROS ATLAS, S. A.',
		false)
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/div_prima'))
	
	for (def uniquePlazo : lPlazo) {
		if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
			WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_PrimaNetaDYN', [('idx') : '1']), (Keys.chord(
					Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
		}
		
		if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
			WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_PrimaNetaDYN', [('idx') : '2']), (Keys.chord(
					Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
		}
		
		if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('36')) {
			WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_PrimaNetaDYN', [('idx') : '3']), (Keys.chord(
					Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
		}
		
		if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
			WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_PrimaNetaDYN', [('idx') : '4']), (Keys.chord(
					Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
		}
		
		if (WebUI.verifyElementPresent(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_emisionPolizaDYN', [('idx') : '1']),
			1, FailureHandling.OPTIONAL)) {
			if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
				WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_emisionPolizaDYN', [('idx') : '1']),
					(Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
			}
			
			if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
				WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_emisionPolizaDYN', [('idx') : '2']),
					(Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
			}
			
			if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('36')) {
				WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_emisionPolizaDYN', [('idx') : '3']),
					(Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
			}
			
			if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
				WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/input_emisionPolizaDYN', [('idx') : '4']),
					(Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
			}
		}
	}
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/button_guardar'))
	
	WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/button_visualizar'), 5)
	
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/button_enviar'))
	
	WebUI.waitForElementNotPresent(findTestObject('NEGOCIADOR_SEGURO/InformacionAdicional/button_enviar'), 5)
}