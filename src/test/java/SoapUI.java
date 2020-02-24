import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SoapUI {

    @Test(groups = "soapuiTests")
    public void testTestCaseRunner() throws Exception
    {
        WsdlProject project = new WsdlProject( "/Users/Naren/Desktop/Project-1-soapui-project.xml" );
        TestSuite testSuite = project.getTestSuiteByName( "Swagger Petstore TestSuite" );
        TestCase testCase = testSuite.getTestCaseByName( "/user/login TestCase" );

        // create empty properties and run synchronously
        TestRunner runner = testCase.run( null, false );
        assertEquals( TestRunner.Status.FINISHED, runner.getStatus() );
    }
}
