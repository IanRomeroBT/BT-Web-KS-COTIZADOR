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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/MenuQuantico/div_buzonTareas'))

if (tareaAsignada.equals('ok')) {
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/MenuQuantico/div_asignada'))
} else {
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/MenuQuantico/div_sinAsignar'))
}

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/span_disposicion'))

if (perfilGenerico !='ok') {
	
	WebUI.selectOptionByLabel(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/select_perfil'), 'Cotización de Seguros', false)

	WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/input_cotizacion'), folio + Keys.chord(Keys.ENTER))
}


if (perfilGenerico.equals('ok')) {
	WebUI.sendKeys(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/input_cotizacion'), folio + Keys.chord(Keys.ENTER))
	WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/Semaforos/Page_Tareas Asignadas/NoDisposicion'), GlobalVariable.REGULAR_TIME_OUT)
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Semaforos/Page_Tareas Asignadas/NoDisposicion'))
} else {
	WebUI.waitForElementPresent(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/tr_solicitud'), GlobalVariable.REGULAR_TIME_OUT)
	WebUI.click(findTestObject('NEGOCIADOR_SEGURO/Solicitudes/tr_solicitud'))
}