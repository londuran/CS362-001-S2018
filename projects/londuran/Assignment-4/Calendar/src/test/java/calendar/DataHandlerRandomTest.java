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
	private static final int NUM_TESTS=100;

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
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, 0, 23);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 59);
				 startDay=ValuesGenerator.getRandomIntBetween(random, 1, 30);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
	
				 //Construct a new Appointment object with the initial data	 
		         Appt appt3 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);
		         
		         dataHandler.saveAppt(appt3);

				 GregorianCalendar firstDay = new GregorianCalendar(500, 5, 20);
				 GregorianCalendar lastDay = new GregorianCalendar(5000, 5, 20);
		         
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("deleteAppt")){
							dataHandler.deleteAppt(appt1);					   
						}
					   else if (methodName.equals("getApptRange")){
						   dataHandler.getApptRange(firstDay, lastDay);
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
