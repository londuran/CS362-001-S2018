package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for DataHandler class.
 */

public class DataHandlerRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=10;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests DataHandler Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				DataHandler dataHandler = new DataHandler();
				DataHandler dataHandler2 = new DataHandler("test", false);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt1 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		         
		         dataHandler.saveAppt(appt1);
		         dataHandler2.saveAppt(appt1);
		         
		         appt1.setValid();
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt2 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		         
		         dataHandler.saveAppt(appt2);
		         dataHandler2.saveAppt(appt2);
		         
		         appt2.setValid();
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt3 = new Appt(25,
						 65,
						 35,
						 12,
						 -1,
						 null,
						 null,
						 null);
		         
		         dataHandler.saveAppt(appt3);
		         dataHandler2.saveAppt(appt3);
		         
		         appt3.setValid();
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt4 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		         
		         dataHandler.saveAppt(appt4);
		         dataHandler2.saveAppt(appt4);
		         
		         appt4.setValid();
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt5 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		         
		         dataHandler.saveAppt(appt5);
		         dataHandler2.saveAppt(appt5);
		         
		         appt5.setValid();
		        
				 GregorianCalendar firstDay = new GregorianCalendar(500, 5, 20);
				 GregorianCalendar lastDay = new GregorianCalendar(5000, 5, 20);
		         
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = DataHandlerRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("deleteAppt")){
							dataHandler.deleteAppt(appt1);
							dataHandler.deleteAppt(appt3);
							dataHandler2.deleteAppt(appt3);
							dataHandler2.deleteAppt(appt4);
						}
					   else if (methodName.equals("getApptRange")){
						   dataHandler.getApptRange(firstDay, lastDay);
						   dataHandler2.getApptRange(firstDay, lastDay);
						}
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
	 }


	
}
