import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Utilidades {

	@Keyword
	def CustomSelect(TestObject select, String optionLabel, boolean selectInIframe) {

		WebUI.delay(1)

		WebUI.click(select)

		WebUI.delay(2)
		
		if(selectInIframe) {
			WebUI.scrollToElement(findTestObject('COTIZADOR_SEGURO/Globales/option_selectFrameDYN', [('optionLabel') : optionLabel]),0)
			WebUI.enhancedClick(findTestObject('COTIZADOR_SEGURO/Globales/option_selectFrameDYN', [('optionLabel') : optionLabel]))
		}else {
			WebUI.enhancedClick(findTestObject('COTIZADOR_SEGURO/Globales/option_selectDYN', [('optionLabel') : optionLabel]))
		}
	}

	@Keyword
	def EscribirExcel(String nombreExcel, String nombreHoja, int fila, int columna, String dato) {

		def routeFile = RunConfiguration.getProjectDir() + "\\Data Files\\" + nombreExcel

		def workBook = com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook(routeFile)

		def sheet = com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet(workBook, nombreHoja)

		com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex(sheet, fila, columna, dato)

		com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook(routeFile, workBook)
	}


	@Keyword
	def ObtenerValorExcel(String nombreExcel, String nombreHoja, int fila, int columna) {

		def routeFile = RunConfiguration.getProjectDir() + "\\Data Files\\" + nombreExcel

		def workBook = com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook(routeFile)

		def sheet = com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet(workBook, nombreHoja)

		def dato = com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex(sheet, fila, columna)

		com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook(routeFile, workBook)

		return dato
	}

	@Keyword
	def ObtenerIndexUltimoRegistro(String nombreExcel, String nombreHoja, int columna) {

		def routeFile = RunConfiguration.getProjectDir() + "\\Data Files\\" + nombreExcel

		def workBook = com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook(routeFile)

		def sheet = com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet(workBook, nombreHoja)

		int x = 1;

		def dato = null;

		List<String> ultimoRegistro = new ArrayList<String>();

		while(dato != "") {
			try {
				dato = com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex(sheet, x, columna)
				x++;
			}catch(Exception e) {
				x--;
				break;
			}
		}

		ultimoRegistro.add(dato)
		ultimoRegistro.add(x.toString())

		com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook(routeFile, workBook)

		return ultimoRegistro;
	}

	@Keyword
	def obtenerDatosEscenario(String nombreEscenario) {
		Map<String, String> datos = new HashMap<String, String>();

		datos.put("clienteRegistrado", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 0))
		datos.put("plan", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 1))
		datos.put("tipoOperacion", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 2))
		datos.put("tipoCompra", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 3))
		datos.put("cotizacion", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 4))
		datos.put("moneda", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 5))
		datos.put("importeAuto", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 6))
		datos.put("nuevo", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 7))
		datos.put("accesorio", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 8))
		datos.put("formaPagoAccesorio", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 9))
		datos.put("adaptacion", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 10))
		datos.put("formaPagoAdaptacion", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 11))
		datos.put("plazos", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 12))
		datos.put("noRentasAnticipadas", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 13))
		datos.put("noRentasDeposito", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 14))
		datos.put("tipoPago", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 15))
		datos.put("seguroCliente", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 16))
		datos.put("observaciones", ObtenerValorExcel(GlobalVariable.DATA_SET, nombreEscenario, 1, 17))

		return datos
	}
}
