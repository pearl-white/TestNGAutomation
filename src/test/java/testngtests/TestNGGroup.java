package testngtests;

import org.testng.annotations.Test;

public class TestNGGroup {
	
	// Group of fruits
	
  @Test(groups={"fruits"})
  public void apples() {
  System.out.println("Apples");
  }
  
  @Test(groups={"fruits"})
  public void grapes() {
  System.out.println("grapes");
  }
  
  @Test(groups={"fruits"})
  public void oranges() {
  System.out.println("Oranges");
  }
  
  @Test(groups={"fruits"})
  public void cucumbers() {
  System.out.println("Cucumbers");
  }
  
  
  
  
  
  //Groups of animals//
  
  @Test(groups={"pets"})
  public void cats() {
  System.out.println("cats");
  }
  
  @Test(groups={"pets"})
  public void fish() {
  System.out.println("fish");
  }
  
  @Test(groups={"pets"})
  public void dogs() {
  System.out.println("dogs");
  }


}
