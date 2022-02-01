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

GlobalVariable.DATA_SET = "DataSetPRP2.xlsx"

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/iniciar_sesion_unifin'), [('usuario') : usuario], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/acceder_cotizador'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/SC01-datos_generales'), [('clienteRegistrado') : clienteRegistrado,
	('cliente') : cliente, ('plan') : plan, ('producto') : producto, ('tipoOperacion') : tipoOperacion,
	('tipoCompra') : tipoCompra, ('cotizacion') : cotizacion, ('moneda') : moneda], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/SC02-datos_activo'), [('importeAuto') : importeAuto, ('nuevo') : nuevo,
	('accesorio') : accesorio, ('adaptacion') : adaptacion, ('formaPagoAccesorio') : formaPagoAccesorio,
	('formaPagoAdaptacion') : formaPagoAdaptacion, ('tipoActivo') : tipoActivo], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/SC03-datos_condiciones'), [('plazos') : plazos,
	('noRentasAnticipadas') : noRentasAnticipadas, ('noRentasDeposito') : noRentasDeposito,
	('plan') : plan], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/SC04-datos_seguro'), [('tipoPago') : tipoPago, ('importeAuto') : importeAuto],
FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('COTIZADOR_SEGURO/SC05-cotizar_seguro'), [('observaciones') : observaciones,
	('nuevo') : nuevo, ('seguroCliente') : seguroCliente, ('plazos') : plazos, ('plan') : plan, ('tipoActivo') : tipoActivo], FailureHandling.STOP_ON_FAILURE)