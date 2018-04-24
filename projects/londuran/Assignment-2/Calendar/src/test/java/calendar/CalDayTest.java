/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;

import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import java.util.*;


public class CalDayTest{
    Appt appt0 = new Appt(15, 30, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt1 = new Appt(12, 30, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt2 = new Appt(25, 65, 35, 12, -1, null, null, null);
	GregorianCalendar cal = new GregorianCalendar();
	CalDay calday0 = new CalDay(cal);
	CalDay calday1 = new CalDay();
	
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt1);
	  calday0.addAppt(appt2);
	  assertTrue(calday0.isValid());
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
	  assertEquals(null, calday0.iterator());
  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
	  assertEquals(calday0.appts, calday0.getAppts());
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
	  assertEquals(calday0.appts.size(), calday0.getSizeAppts());
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
	  assertEquals(calday0.day, calday0.getDay());
  }
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
	  assertEquals(calday0.month, calday0.getMonth());
  }
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
	  assertEquals(calday0.year, calday0.getYear());
  }
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt1);
	  String string0 = calday0.toString();
  }
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
	  String string0 = calday1.toString();
  }
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt1);
	  String string0 = calday0.getFullInfomrationApp(calday0);
  }

}
