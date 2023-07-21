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
    public static Object eWalletApk
     
    /**
     * <p></p>
     */
    public static Object phoneNumber
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object adminPortalPath
     
    /**
     * <p></p>
     */
    public static Object adminPortalUser
     
    /**
     * <p></p>
     */
    public static Object adminUserPassword
     
    /**
     * <p></p>
     */
    public static Object inSwitchPath
     
    /**
     * <p></p>
     */
    public static Object inSwtichUser
     
    /**
     * <p></p>
     */
    public static Object inSwitchPassword
     
    /**
     * <p></p>
     */
    public static Object confluentPath
     
    /**
     * <p></p>
     */
    public static Object confluentUser
     
    /**
     * <p></p>
     */
    public static Object confluentPasswrod
     
    /**
     * <p></p>
     */
    public static Object e2eSDvalue
     
    /**
     * <p></p>
     */
    public static Object e2eCvalue
     
    /**
     * <p></p>
     */
    public static Object e2eSDname
     
    /**
     * <p></p>
     */
    public static Object e2eSDStatus
     
    /**
     * <p></p>
     */
    public static Object reconCode
     
    /**
     * <p></p>
     */
    public static Object reconCodeMPos
     
    /**
     * <p></p>
     */
    public static Object reconDesc
     
    /**
     * <p></p>
     */
    public static Object reconDescMPos
     
    /**
     * <p></p>
     */
    public static Object mambuPath
     
    /**
     * <p></p>
     */
    public static Object mambuUser
     
    /**
     * <p></p>
     */
    public static Object mambuPassword
     
    /**
     * <p></p>
     */
    public static Object dbServer
     
    /**
     * <p></p>
     */
    public static Object dbName
     
    /**
     * <p></p>
     */
    public static Object dbPort
     
    /**
     * <p></p>
     */
    public static Object dbUsername
     
    /**
     * <p></p>
     */
    public static Object dbPassword
     
    /**
     * <p></p>
     */
    public static Object adminPortalTopUpAmount
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            eWalletApk = selectedVariables['eWalletApk']
            phoneNumber = selectedVariables['phoneNumber']
            password = selectedVariables['password']
            userName = selectedVariables['userName']
            adminPortalPath = selectedVariables['adminPortalPath']
            adminPortalUser = selectedVariables['adminPortalUser']
            adminUserPassword = selectedVariables['adminUserPassword']
            inSwitchPath = selectedVariables['inSwitchPath']
            inSwtichUser = selectedVariables['inSwtichUser']
            inSwitchPassword = selectedVariables['inSwitchPassword']
            confluentPath = selectedVariables['confluentPath']
            confluentUser = selectedVariables['confluentUser']
            confluentPasswrod = selectedVariables['confluentPasswrod']
            e2eSDvalue = selectedVariables['e2eSDvalue']
            e2eCvalue = selectedVariables['e2eCvalue']
            e2eSDname = selectedVariables['e2eSDname']
            e2eSDStatus = selectedVariables['e2eSDStatus']
            reconCode = selectedVariables['reconCode']
            reconCodeMPos = selectedVariables['reconCodeMPos']
            reconDesc = selectedVariables['reconDesc']
            reconDescMPos = selectedVariables['reconDescMPos']
            mambuPath = selectedVariables['mambuPath']
            mambuUser = selectedVariables['mambuUser']
            mambuPassword = selectedVariables['mambuPassword']
            dbServer = selectedVariables['dbServer']
            dbName = selectedVariables['dbName']
            dbPort = selectedVariables['dbPort']
            dbUsername = selectedVariables['dbUsername']
            dbPassword = selectedVariables['dbPassword']
            adminPortalTopUpAmount = selectedVariables['adminPortalTopUpAmount']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
