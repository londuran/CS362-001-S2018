
/** A JUnit test class to test the class DataHandler. */


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;
	

public class DataHandlerTest{
	Appt appt0 = new Appt(15, 30, 9, 12, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
	Appt appt1 = new Appt(25, 65, 35, 12, -1, null, null, null);
	
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  String fileName = "test";
	  boolean autoSave = true;
	  DataHandler datahandler1 = new DataHandler(fileName);
	  DataHandler datahandler2 = new DataHandler(fileName, autoSave);
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
	  DataHandler datahandler0 = new DataHandler();
	  GregorianCalendar firstDay = new GregorianCalendar(2018, 6, 3);
	  GregorianCalendar lastDay = new GregorianCalendar(2018, 7, 3);
	  datahandler0.getApptRange(firstDay, lastDay);
  }
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
	  String fileName = "test";
	  boolean autoSave = true;
	  DataHandler datahandler0 = new DataHandler(fileName, autoSave);
	  datahandler0.saveAppt(appt0);
	  datahandler0.saveAppt(appt1);
	  autoSave = false;
	  DataHandler datahandler1 = new DataHandler(fileName, autoSave);
	  datahandler1.saveAppt(appt0);
  }
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
	  String fileName = "test";
	  boolean autoSave = true;
	  DataHandler datahandler0 = new DataHandler(fileName, autoSave);
	  datahandler0.deleteAppt(appt0);
	  datahandler0.deleteAppt(appt1);
	  autoSave = false;
	  DataHandler datahandler1 = new DataHandler(fileName, autoSave);
	  datahandler1.deleteAppt(appt0);
  }
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
	  DataHandler datahandler0 = new DataHandler();
	  datahandler0.save();
  }

}
