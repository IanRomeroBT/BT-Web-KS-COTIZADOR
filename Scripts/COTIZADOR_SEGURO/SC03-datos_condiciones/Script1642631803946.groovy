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

String iva = ''

if (plazos.toString().contains('-')) {
    lPlazo = plazos.toString().split('-')
} else {
    lPlazo = new String[1]

    (lPlazo[0]) = plazos.toString()
}

if (plan.equals('ARRENDAMIENTO PURO') || plan.equals('ARRENDAMIENTO AGRICOLA') || 
	plan.equals('ESTRUCTURADO AGRICOLA')) {
    iva = '14'
} else if (plan.equals('ARRENDAMIENTO FRONTERA') || plan.equals('ESTRUCTURADO PURO') || 
	plan.equals('ESTRUCTURADO FRONTERA')) {
    iva = '12'
}

WebUI.scrollToPosition(0, 0)

for (def uniquePlazo : lPlazo) {
    if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('12')) {
        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '12') + Keys.chord(Keys.TAB))

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : '1']))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '20') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_caDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_cafDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vrcDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '15') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vriDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '20') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_tasaDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + iva) + Keys.chord(Keys.TAB))
		
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('24')) {
        WebUI.scrollToPosition(0, 0)

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '24') + Keys.chord(Keys.TAB))

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : '2']))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '20') + Keys.chord(Keys.TAB))


        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_caDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_cafDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vrcDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '15') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vriDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '20') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_tasaDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + iva) + Keys.chord(Keys.TAB))
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('32')) {
        WebUI.scrollToPosition(0, 0)

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '32') + Keys.chord(Keys.TAB))

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : '3']))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_caDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_cafDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vrcDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vriDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_tasaDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + iva) + Keys.chord(Keys.TAB))
    } else if ((uniquePlazo.isEmpty() == false) && uniquePlazo.equals('48')) {
        WebUI.scrollToPosition(0, 0)

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '48') + Keys.chord(Keys.TAB))

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : '4']))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_caDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_cafDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vrcDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '15') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vriDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '15') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_tasaDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))
    } else if (uniquePlazo.isEmpty() == false) {
		
		def ca = "3"
		def vrc = "20"
		def vri = "20"
		def tasa = "12"
		
		if (plan.contains('ARRENDAMIENTO AGRICOLA')) {
			ca = "3"
			vrc = "15"
			vri = "16"
			tasa = "12"
			
		}else if(plan.contains('ARRENDAMIENTO PURO')) {
			tasa = "20"
		}
		
        WebUI.scrollToPosition(0, 0)

        WebUI.click(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/check_plazoDYN', [('idx') : '5']))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_plazoPersonalizado'), Keys.chord(Keys.CONTROL + 'A') + 
            uniquePlazo)
		
		WebUI.delay(2)

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + '25') + Keys.chord(Keys.TAB))
		
        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_caDYN', [('idx') : '9']), (Keys.chord(Keys.CONTROL + 
                'A') + ca) + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_cafDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vrcDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + vrc) + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_vriDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + vri) + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_tasaDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + tasa) + Keys.chord(Keys.TAB))
    }
}

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_rentasDeposito'), noRentasDeposito.toString())

WebUI.sendKeys(findTestObject('COTIZADOR_SEGURO/DatosCondiciones/input_rentasAnticipadas'), noRentasAnticipadas.toString() + Keys.chord(
        Keys.TAB))

WebUI.click(findTestObject('COTIZADOR_SEGURO/Globales/button_siguiente'))