package Background_Logic.DriverManager;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import Background_Logic.Core.MyLogger;
import Background_Logic.Core.Retry;
import Background_Logic.Core.TestInfo;

public class TestManager {

public static TestInfo testinfo=new TestInfo();

@Rule
public Retry retry=new Retry(3);

@Before

public void before(){
	
	testinfo.reset();
	
}

@Rule

public TestRule listen=new TestWatcher(){
	@Override
	public void failed(Throwable t,Description description){
		
		MyLogger.log.info("Test Failed");
		testinfo.printResults();
		
	}
	
	@Override
	public void succeeded(Description description){
		
		MyLogger.log.info("Test Passed");
		testinfo.printResults();
		
		
	}
	
};

}
