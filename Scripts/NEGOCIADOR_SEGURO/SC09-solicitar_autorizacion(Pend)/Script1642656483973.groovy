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



WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Informacin Cotizacion'))

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Condiciones Financieras'))

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Activo'))

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/cantidad_unidades'),GlobalVariable.SHORT_TIME_OUT )
String numActivos= WebUI.getText(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/cantidad_unidades'))

WebUI.setText(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/rama_descripcion'),'Transmicion Automatica')

CustomKeywords.'Utilidades.CustomSelect'(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/backlog_mes'), "Febrero", false)

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/entrega_nuevo'))

WebUI.sendKeys(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/entrega_cantidad'),(Keys.chord(Keys.CONTROL +
	'A') + numActivos ) + Keys.chord(Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/entrega_punto'),
	'1', true)

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/entrega_domicilio'))

WebUI.setText(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/entrega_responsable'),'Gerardo Perez')

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/colores_agregar'))

WebUI.sendKeys(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/colores_cantidad'),(Keys.chord(Keys.CONTROL +
	'A') + numActivos ) + Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/colores_exterior'),'Rojo')

WebUI.setText(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/colores_interior'),'Azul')

WebUI.sendKeys(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/monto_operacion_precio_activo'), (Keys.chord(Keys.CONTROL +
	'A') + '550000') + Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/monto_operacion_IVA'), (Keys.chord(Keys.CONTROL +
		'A') + '16') + Keys.chord(Keys.TAB))

WebUI.selectOptionByValue(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/monto_operacion_moneda'),
	'2', true)

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/btn_guardar'))

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Seguros'),GlobalVariable.SHORT_TIME_OUT )

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Expediente'),GlobalVariable.SHORT_TIME_OUT )

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Firmantes'),GlobalVariable.SHORT_TIME_OUT )

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Placas'),GlobalVariable.SHORT_TIME_OUT)

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/chkboxConPlacas'))

WebUI.selectOptionByValue(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/placasEstado'),'2',true)

WebUI.selectOptionByValue(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/placasTipo'),'2', true)

WebUI.selectOptionByValue(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/placasMes'),'2', true)

WebUI.selectOptionByValue(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/placasUso'),'2', true)

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/inputGuardarPlacas'))

WebUI.waitForElementPresent(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/div_Pago Inicial'),GlobalVariable.SHORT_TIME_OUT)

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/btnPagoInicialNuevo'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/inputArea'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/inputComentario'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/btnGuardarComentario'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/inputMonto'))

WebUI.click(findTestObject('NEGOCIADOR_SEGURO/DivPlaca/Page_Negociador/btnSolicitudAutorizacion'))

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/Semaforos/Page_Negociador/div_Activo'))

WebUI.click(findTestObject('Object Repository/NEGOCIADOR_SEGURO/DivActivo/Page_Negociador/btn_guardar'))
