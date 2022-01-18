import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

def routeFile = RunConfiguration.getProjectDir() + '/Data Files/'

WebUI.click(findTestObject('UNIFIN/DatosSeguro/div_seguro'))

WebUI.click(findTestObject('UNIFIN/DatosSeguro/button_cotizarSeguro'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/CotizacionSeguro/div_cotizacionSeguro'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/div_cotizacionSeguro'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/CotizacionSeguro/radio_ninguna'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

WebUI.enhancedClick(findTestObject('UNIFIN/CotizacionSeguro/radio_ninguna'))

WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)

WebUI.setText(findTestObject('UNIFIN/CotizacionSeguro/input_tipoCarga'), 'Personas')

WebUI.selectOptionByLabel(findTestObject('UNIFIN/CotizacionSeguro/select_numeroSemiRemolque'), 'N/A', false)

WebUI.setText(findTestObject('UNIFIN/CotizacionSeguro/textarea_observaciones'), 'Test')

WebUI.selectOptionByLabel(findTestObject('UNIFIN/CotizacionSeguro/select_procedenciaVehiculo'), 'Nacional', false)

WebUI.selectOptionByLabel(findTestObject('UNIFIN/CotizacionSeguro/select_estadoCondiciones'), 'Seminuevo', false)

WebUI.sendKeys(findTestObject('UNIFIN/CotizacionSeguro/input_numeroPasajeros'), '6')

WebUI.selectOptionByLabel(findTestObject('UNIFIN/CotizacionSeguro/select_usoVehiculo'), 'Particular', false)

WebUI.selectOptionByLabel(findTestObject('UNIFIN/CotizacionSeguro/select_servicioVehiculo'), 'Privado / Particular', false)

WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)

WebUI.enhancedClick(findTestObject('UNIFIN/CotizacionSeguro/div_documentos'))

/*
WebUI.waitForElementClickable(findTestObject('UNIFIN/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '1']), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '1']))

WebUI.waitForElementPresent(findTestObject('UNIFIN/CotizacionSeguro/input_uploadFile'), GlobalVariable.REGULAR_TIME_OUT)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('UNIFIN/CotizacionSeguro/input_uploadFile'), 
        routeFile + 'archivo.pdf')

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_guardarDocumento'))
*/
WebUI.waitForElementClickable(findTestObject('UNIFIN/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '1']), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '1']))

WebUI.waitForElementVisible(findTestObject('UNIFIN/CotizacionSeguro/textarea_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('UNIFIN/CotizacionSeguro/textarea_agregarComentario'), 'TEST')

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_comentario'))

WebUI.waitForElementNotPresent(findTestObject('UNIFIN/CotizacionSeguro/textarea_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.enhancedClick(findTestObject('UNIFIN/CotizacionSeguro/div_comentarios'))

WebUI.waitForElementClickable(findTestObject('UNIFIN/CotizacionSeguro/button_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_agregarComentario'))

WebUI.setText(findTestObject('UNIFIN/CotizacionSeguro/textarea_comentarioF'), 'TEST')

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_aceptarComentario'))

WebUI.click(findTestObject('UNIFIN/CotizacionSeguro/button_enviarSeguros'))

WebUI.waitForElementPresent(findTestObject('UNIFIN/DatosSeguro/div_seguro'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('UNIFIN/DatosSeguro/div_seguro'))

WebUI.verifyTextPresent('Solicitud enviada a Bróker', false)

def noFolio = WebUI.getText(findTestObject('UNIFIN/DatosSeguro/label_folio'))

def usuario = WebUI.getAttribute(findTestObject('UNIFIN/DatosSeguro/label_usuario'), 'value')

def ultimoRegistro = CustomKeywords.'Utilidades.ObtenerIndexUltimoRegistro'(GlobalVariable.DATA_SET, 'Folios', 0)

def newRow = Integer.parseInt(ultimoRegistro[1]) + 1

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 0, noFolio)

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 1, usuario)

WebUI.closeBrowser()

