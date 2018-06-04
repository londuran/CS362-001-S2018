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
    Appt appt3 = new Appt(17, 15, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
    Appt appt4 = new Appt(10, 45, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	GregorianCalendar cal = new GregorianCalendar(2018, 11, 9);
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
	  assertEquals(null, calday1.iterator());
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
	  String string1 = calday1.toString();
	  String string0 = calday0.toString();
  }
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
	  LinkedList<Appt> apptList = new LinkedList<Appt>();
	  appt2.setValid();
	  apptList.add(appt0);
	  apptList.add(appt1);
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt1);
	  calday0.addAppt(appt2);
	  LinkedList<Appt> otherList = calday0.getAppts();
	  assertEquals(apptList.get(1), otherList.get(0));
	  assertEquals(apptList.get(0), otherList.get(1));
	  assertEquals(2, otherList.size());
	  String string0 = calday0.getFullInfomrationApp(calday0);
  }
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt1);
	  String string0 = calday0.getFullInfomrationApp(calday0);
	  assertEquals("12-9-2018 \n\t12:30PM Birthday Party This is my birthday party \n\t3:30PM Birthday Party This is my birthday party ", string0);
  }
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
	  assertEquals(9, calday0.getDay());
	  assertEquals(12, calday0.getMonth());
	  assertEquals(2018, calday0.getYear());
  }
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
	  LinkedList<Appt> apptList = new LinkedList<Appt>();
	  apptList.add(appt4);
	  apptList.add(appt1);
	  apptList.add(appt0);
	  apptList.add(appt3);
	  calday0.addAppt(appt4);
	  calday0.addAppt(appt1);
	  calday0.addAppt(appt0);
	  calday0.addAppt(appt3);
	  LinkedList<Appt> otherList = calday0.getAppts();
	  assertEquals(apptList.get(0), otherList.get(0));
	  assertEquals(apptList.get(1), otherList.get(1));
	  assertEquals(apptList.get(2), otherList.get(2));
	  assertEquals(apptList.get(3), otherList.get(3));
  }
  
}
