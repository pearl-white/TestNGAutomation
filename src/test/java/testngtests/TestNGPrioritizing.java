package testngtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPrioritizing  {
	
  @Test(priority=0)
  @Parameters({"userName"})
  public void one (String arg){
	  System.out.println("one-"+arg);
	  //fail();
  }
 
  
  @Test(priority=1,dependsOnMethods={"one"})
  public void two (){
	  System.out.println("two");
  }
  
  
  @Test (priority=2,enabled=false)
  public void three (){
	  System.out.println("three");
  }
  
  @Test (priority=3)
  public void four (){
	  System.out.println("four");
  }
  
  
  
  
  
}
