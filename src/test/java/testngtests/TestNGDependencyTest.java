package testngtests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencyTest {
	
	
  @Test
  public void launchDriver(){
	  System.out.println("Launching driver");
	  Assert.assertTrue(true);   //fail();
	
  }
  
  @Test(dependsOnMethods={"launchDriver"})
  public void login(){
	  System.out.println("Logging in");
  }
  
  
  @Test (dependsOnMethods={"login"})
  public void alogout(){
	  System.out.println("Logging out");
	
  }
  
  
}
