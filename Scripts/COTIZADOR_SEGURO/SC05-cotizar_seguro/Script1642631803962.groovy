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

String[] lPlazo

if (plazos.toString().contains('-')) {
    lPlazo = plazos.toString().split('-')
} else {
    lPlazo = new String[1]

    (lPlazo[0]) = plazos.toString()
}

def routeFile = RunConfiguration.getProjectDir() + '/Data Files/'

def flag = false

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'))

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_cotizarSeguro'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/div_cotizacionSeguro'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/div_cotizacionSeguro'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/radio_ninguna'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

WebUI.enhancedClick(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/radio_ninguna'))

WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)

WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_tipoCarga'), 'Personas')

WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_numeroSemiRemolque'), 'N/A', false)

WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_observaciones'), observaciones)

WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_procedenciaVehiculo'), 'Nacional', false)

if (nuevo.equals('ok')) {
    WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_estadoCondiciones'), 'Nuevo', false)
} else {
    WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_estadoCondiciones'), 'Seminuevo', 
        false)
}

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_numeroPasajeros'), '6')

WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_usoVehiculo'), 'Particular', false)

WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_servicioVehiculo'), 'Privado / Particular', 
    false)

WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)

WebUI.enhancedClick(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/div_documentos'))

/* Habilitar cuando se permitan cargar documentos
WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '1']), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '1']))

WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_uploadFile'), GlobalVariable.REGULAR_TIME_OUT)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_uploadFile'), 
        routeFile + 'archivo.pdf')

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_guardarDocumento'))
*/
WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '1']), 
    GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '1']))

WebUI.waitForElementVisible(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_agregarComentario'), 'TEST')

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentario'))

WebUI.waitForElementNotVisible(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentario'), GlobalVariable.REGULAR_TIME_OUT)

if (seguroCliente.equals('ok')) {
    WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/switch_clientePropSeguro'))

    /* Habilitar cuando se permitan cargar documentos
	 WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '2']), GlobalVariable.REGULAR_TIME_OUT)
	 
	 WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_cargarArchivoDYN', [('idx') : '2']))
	 
	 WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_uploadFile'), GlobalVariable.REGULAR_TIME_OUT)
	 
	 CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile'(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_uploadFile'),
			 routeFile + 'archivo.pdf')
	 
	 WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_guardarDocumento'))
	 */
    WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '2']), 
        GlobalVariable.REGULAR_TIME_OUT)

    WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentarioArchivoDYN', [('idx') : '2']))

    WebUI.waitForElementVisible(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

    WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_agregarComentario'), 'TEST')

    WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentario'))

    WebUI.waitForElementNotVisible(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_comentario'), GlobalVariable.REGULAR_TIME_OUT)
}

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/div_prima'))

if (WebUI.verifyElementVisible(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/tab_prima'), FailureHandling.OPTIONAL)) {
	
	 WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_sumaAsegurada'), '500000')

    WebUI.selectOptionByLabel(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/select_aseguradora'), 'SEGUROS ATLAS, S. A.', 
        false)

	flag = true
	
    WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/tab_prima'))

    for (def uniquePlazo : lPlazo) {
        if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
            WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_PrimaNetaDYN', [('idx') : '1']), (Keys.chord(
                    Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
        }
        
        if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
            WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_PrimaNetaDYN', [('idx') : '2']), (Keys.chord(
                    Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
        }
        
        if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('36')) {
            WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_PrimaNetaDYN', [('idx') : '3']), (Keys.chord(
                    Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
        }
        
        if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
            WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_PrimaNetaDYN', [('idx') : '4']), (Keys.chord(
                    Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_emisionPolizaDYN', [('idx') : '1']), 
            1, FailureHandling.OPTIONAL)) {
            if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
                WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_emisionPolizaDYN', [('idx') : '1']), 
                    (Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
            }
            
            if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
                WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_emisionPolizaDYN', [('idx') : '2']), 
                    (Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
            }
            
            if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('36')) {
                WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_emisionPolizaDYN', [('idx') : '3']), 
                    (Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
            }
            
            if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
                WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/input_emisionPolizaDYN', [('idx') : '4']), 
                    (Keys.chord(Keys.CONTROL + 'A') + '19000') + Keys.chord(Keys.TAB))
            }
        }
    }
}

WebUI.enhancedClick(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/div_comentarios'))

WebUI.waitForElementClickable(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_agregarComentario'), GlobalVariable.REGULAR_TIME_OUT)

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_agregarComentario'))

WebUI.setText(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/textarea_comentarioF'), 'TEST')

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_aceptarComentario'))

WebUI.click(findTestObject('COTIZADOR_SEGURO/CotizacionSeguro/button_enviarSeguros'))

WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'), GlobalVariable.REGULAR_TIME_OUT)

//Eliminar cuando funcione el input de contrato
if (WebUI.verifyElementPresent(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 3, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('COTIZADOR_SEGURO/DatosGenerales/input_contratoAnterior'), 'TEST')
}

WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosSeguro/div_seguro'))

if(flag) {
	WebUI.waitForElementPresent(findTestObject('COTIZADOR_SEGURO/DatosSeguro/button_cotizacionAceptada'), 10)
}else {
	WebUI.verifyTextPresent('Solicitud enviada a Br??ker', false)
}

def noFolio = WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosSeguro/label_folio'))

def usuario = WebUI.getAttribute(findTestObject('COTIZADOR_SEGURO/DatosSeguro/label_usuario'), 'value')

def plazos = plazos

def plan = plan

def ultimoRegistro = CustomKeywords.'Utilidades.ObtenerIndexUltimoRegistro'(GlobalVariable.DATA_SET, 'Folios', 0)

def newRow = Integer.parseInt(ultimoRegistro[1]) + 1

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 0, noFolio)

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 1, usuario)

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 2, plazos)

CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 3, plan)

if(flag) {
	CustomKeywords.'Utilidades.EscribirExcel'(GlobalVariable.DATA_SET, 'Folios', newRow, 4, "ok")
}

WebUI.closeBrowser()