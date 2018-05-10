/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {
    Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt1 = new Appt(9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt2 = new Appt(15, 30, 9, 12, 2018, null, null, null);
    
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals(0, appt0.getRecurIncrement());
  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      appt2.setValid();
	  assertTrue(appt2.getValid());
	  
	  appt2.setStartMonth(1);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
	  appt2.setStartMonth(13);
      appt2.setValid();
	  assertFalse(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
	  appt2.setStartMonth(0);
      appt2.setValid();
	  assertFalse(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
	  appt2.setStartHour(24);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartHour(23);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
	  appt2.setStartHour(-1);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartHour(0);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
	  appt2.setStartMinute(60);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartMinute(59);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
	  appt2.setStartMinute(-1);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartMinute(0);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
	  appt2.setStartYear(0);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartYear(1);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
	  appt2.setStartDay(0);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartDay(1);
      appt2.setValid();
	  assertTrue(appt2.getValid());
	  
	  appt2.setStartDay(32);
      appt2.setValid();
	  assertFalse(appt2.getValid());
	  
	  appt2.setStartDay(31);
      appt2.setValid();
	  assertTrue(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
	  appt2.setStartDay(-1);
      appt2.setValid();
	  assertFalse(appt2.getValid());
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
	  appt0.setStartHour(11);
      appt0.setValid();
      String string0 = appt0.toString();
	  assertEquals("\t14/9/2018 at 11:30am ,Birthday Party, This is my birthday party\n", string0);
	  
	  appt0.setStartHour(12);
      appt0.setValid();
      string0 = appt0.toString();
	  assertEquals("\t14/9/2018 at 12:30pm ,Birthday Party, This is my birthday party\n", string0);
	  
	  appt0.setStartHour(13);
      appt0.setValid();
      string0 = appt0.toString();
	  assertEquals("\t14/9/2018 at 1:30pm ,Birthday Party, This is my birthday party\n", string0);
  
  }
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
	  assertEquals(null, appt0.getXmlElement());
	  assertEquals(15, appt0.getStartHour());
	  assertEquals(30, appt0.getStartMinute());
	  assertEquals(2018, appt0.getStartYear());
	  assertEquals("Birthday Party", appt0.getTitle());
	  assertEquals("This is my birthday party", appt0.getDescription());
	  assertEquals("xyz@gmail.com", appt0.getEmailAddress());
	  assertEquals(0, appt0.getRecurNumber());
	  assertTrue(appt0.hasTimeSet());
}
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
	  assertEquals(9, appt0.getStartDay());	  
}
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {  
	  assertEquals(14, appt0.getStartMonth());
}
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
	  assertTrue(appt0.isOn(9, 14, 2018));
}
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
	  assertFalse(appt0.isOn(8, 15, 2018));
}
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
	  assertFalse(appt0.isOn(8, 15, 2019));
}
  
}
