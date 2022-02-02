package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object BASE_URL
     
    /**
     * <p></p>
     */
    public static Object URL_QUANTICO
     
    /**
     * <p></p>
     */
    public static Object DATA_SET
     
    /**
     * <p></p>
     */
    public static Object SHORT_TIME_OUT
     
    /**
     * <p></p>
     */
    public static Object REGULAR_TIME_OUT
     
    /**
     * <p></p>
     */
    public static Object LONG_TIME_OUT
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            BASE_URL = selectedVariables['BASE_URL']
            URL_QUANTICO = selectedVariables['URL_QUANTICO']
            DATA_SET = selectedVariables['DATA_SET']
            SHORT_TIME_OUT = selectedVariables['SHORT_TIME_OUT']
            REGULAR_TIME_OUT = selectedVariables['REGULAR_TIME_OUT']
            LONG_TIME_OUT = selectedVariables['LONG_TIME_OUT']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
