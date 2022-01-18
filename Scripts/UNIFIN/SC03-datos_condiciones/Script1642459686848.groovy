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

def plazo = '12,24,32,48,6'

def lPlazo = plazo.split(',')

WebUI.scrollToPosition(0, 0)

for (def uniquePlazo : lPlazo) {
	
    if (uniquePlazo.equals('12')) {
		WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_plazoDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL +
			'A') + '12') + Keys.chord(Keys.TAB))
		
        WebUI.click(findTestObject('UNIFIN/DatosCondiciones/check_plazoDYN', [('idx') : '1']))
		
        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_segAutoDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 
                'A') + '15000') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_caDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 'A') + 
            '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_cafDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 'A') + 
            '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vrcDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vriDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_tasaDYN', [('idx') : '1']), (Keys.chord(Keys.CONTROL + 'A') + 
            '40') + Keys.chord(Keys.TAB))
    } else if (uniquePlazo.equals('24')) {
        WebUI.scrollToPosition(0, 0)

		WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_plazoDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL +
			'A') + '24') + Keys.chord(Keys.TAB))
		
        WebUI.click(findTestObject('UNIFIN/DatosCondiciones/check_plazoDYN', [('idx') : '2']))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_segAutoDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 
                'A') + '15000') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_caDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 'A') + 
            '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_cafDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 'A') + 
            '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vrcDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vriDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_tasaDYN', [('idx') : '2']), (Keys.chord(Keys.CONTROL + 'A') + 
            '40') + Keys.chord(Keys.TAB))
    } else if (uniquePlazo.equals('32')) {
        WebUI.scrollToPosition(0, 0)

		WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_plazoDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL +
			'A') + '32') + Keys.chord(Keys.TAB))
		
        WebUI.click(findTestObject('UNIFIN/DatosCondiciones/check_plazoDYN', [('idx') : '3']))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_segAutoDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 
                'A') + '15000') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_caDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 'A') + 
            '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_cafDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 'A') + 
            '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vrcDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vriDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_tasaDYN', [('idx') : '3']), (Keys.chord(Keys.CONTROL + 'A') + 
            '40') + Keys.chord(Keys.TAB))
    } else if (uniquePlazo.equals('48')) {
        WebUI.scrollToPosition(0, 0)

		WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_plazoDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL +
			'A') + '48') + Keys.chord(Keys.TAB))
		
        WebUI.click(findTestObject('UNIFIN/DatosCondiciones/check_plazoDYN', [('idx') : '4']))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_segAutoDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 
                'A') + '15000') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_caDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 'A') + 
            '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_cafDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 'A') + 
            '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vrcDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vriDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_tasaDYN', [('idx') : '4']), (Keys.chord(Keys.CONTROL + 'A') + 
            '40') + Keys.chord(Keys.TAB))
    } else {
        WebUI.scrollToPosition(0, 0)	
		
        WebUI.click(findTestObject('UNIFIN/DatosCondiciones/check_plazoDYN', [('idx') : '5']))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_plazoPersonalizado'), Keys.chord(Keys.CONTROL + 'A') + uniquePlazo)

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_pagoUnicoDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + '40') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_segAutoDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 
                'A') + '15000') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_caDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 'A') + 
            '3') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_cafDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 'A') + 
            '2') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vrcDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_vriDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 'A') + 
            '25') + Keys.chord(Keys.TAB))

        WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_tasaDYN', [('idx') : '5']), (Keys.chord(Keys.CONTROL + 'A') + 
            '40') + Keys.chord(Keys.TAB))
    }
}

WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_rentasDeposito'), '3')

WebUI.sendKeys(findTestObject('UNIFIN/DatosCondiciones/input_rentasAnticipadas'), '1' + Keys.chord(Keys.TAB))

WebUI.click(findTestObject('UNIFIN/Globales/button_siguiente'))