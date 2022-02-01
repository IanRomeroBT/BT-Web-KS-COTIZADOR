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

WebUI.scrollToPosition(0, 0)

String[] lPlazo

String idxPlazo = ''

def delimitador = 'El porcentaje debe ser un valor entre '

String porcentajeDyn = ''

String iva = ''

if (plazos.toString().contains(',')) {
    lPlazo = plazos.toString().split(',')
} else {
    lPlazo = new String[1]

    (lPlazo[0]) = plazos.toString()
}

WebUI.scrollToPosition(0, 0)

for (def uniquePlazo : lPlazo) {
    idxPlazo = ''

    if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
        idxPlazo = '1'

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : idxPlazo]))
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
        idxPlazo = '2'

        WebUI.scrollToPosition(0, 0)

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : idxPlazo]))
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('36')) {
        idxPlazo = '3'

        WebUI.scrollToPosition(0, 0)

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : idxPlazo]))
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
        idxPlazo = '4'

        WebUI.scrollToPosition(0, 0)

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : idxPlazo]))
    } else if (uniquePlazo.isEmpty() == false) {
        idxPlazo = '5'

        WebUI.scrollToPosition(0, 0)

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : idxPlazo]))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoPersonalizado'), Keys.chord(Keys.CONTROL + 
                'A') + uniquePlazo)

        WebUI.delay(2)
    }
    
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '1']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))
																															
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '2']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '3']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '4']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '5']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))

    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '6']), 
        (Keys.chord(Keys.CONTROL + 'A') + '55') + Keys.chord(Keys.TAB))

    //Editar con valores validos
	
	WebUI.scrollToPosition(0, 0)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '1']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))
	
	WebUI.delay(1)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '2']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))
	
	WebUI.delay(1)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '3']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))

	WebUI.delay(1)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '4']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))

	WebUI.delay(1)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '5']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))

	WebUI.delay(1)
	
    WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_porcentajesDYN', [('idxPlazo') : idxPlazo, ('idxPorcentaje') : '6']), 
        (Keys.chord(Keys.CONTROL + 'A') + (WebUI.getText(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/span_error', 
                [('idx') : '1'])).replace(delimitador, '').split(' y ')[0]).trim()) + Keys.chord(Keys.TAB))
}

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_rentasDeposito'), noRentasDeposito.toString())

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_rentasAnticipadas'), noRentasAnticipadas.toString() + 
    Keys.chord(Keys.TAB))
	
WebUI.click(findTestObject('COTIZADOR_SEGURO/Globales/button_siguiente'))