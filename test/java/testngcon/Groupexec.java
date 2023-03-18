package testngcon;

import org.testng.annotations.Test;

public class Groupexec{


  @Test(groups={"smoke"})

  public void f() {
	  
	  System.out.println("hi f my smoke method");
  }
  
  
  @Test(groups={"smoke"})
  public void g1() {
	  System.out.println("hi g my smoke method");
  }
  
  
  
  @Test(groups={"function"})
  public void h() {
	  System.out.println("hi g my function method");
  }
  
  
  
  @Test(groups={"menu"})
  public void k() {
	  System.out.println("hi g my menu method");
  }
}
