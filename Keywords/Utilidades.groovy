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

		WebUI.delay(2)

		WebUI.click(select)

		if(selectInIframe) {
			WebUI.enhancedClick(findTestObject('UNIFIN/Globales/option_selectFrameDYN', [('optionLabel') : optionLabel]))
		}else {
			WebUI.enhancedClick(findTestObject('UNIFIN/Globales/option_selectDYN', [('optionLabel') : optionLabel]))
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
}
