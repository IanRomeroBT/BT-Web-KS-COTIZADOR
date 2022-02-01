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

if(cotizacionAceptada != 'ok') {
	WebUI.callTestCase(findTestCase('BROKER_SEGURO/inicio_sesion_quantico'), [('usuario') : 'lucero.vargas_tst', ('password') : 'RigbBhfdqOBGNlJIWM1ClA=='],
		FailureHandling.STOP_ON_FAILURE)
	
	/*
	WebUI.callTestCase(findTestCase('BROKER_SEGURO/acceder_solicitud'), [('folio') : folio], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('BROKER_SEGURO/SC06_informacion_adicional'), [('plazos') : plazos, ('cotizacionAceptada') : cotizacionAceptada],
		 FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('BROKER_SEGURO/SC07_aceptar_prima'), [('usuario') : 'fernanda.rojas', ('folio') : folio,
		('cotizacionAceptada') : cotizacionAceptada], FailureHandling.STOP_ON_FAILURE)
	*/
	WebUI.callTestCase(findTestCase('BROKER_SEGURO/SC08_generar_negociacion'), [('cliente') : cliente, ('folio') : folio], FailureHandling.STOP_ON_FAILURE)
	
}
