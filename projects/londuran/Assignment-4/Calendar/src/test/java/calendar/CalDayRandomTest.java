package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

    /**
     * Generate Random Tests that tests CalDay Class.
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
				
		 		CalDay calday1 = new CalDay();

				GregorianCalendar date = new GregorianCalendar(2018, 5, 20);
				CalDay calday2 = new CalDay(date);


				 int startHour=ValuesGenerator.getRandomIntBetween(random, 12, 14);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 1, 58);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 2, 26);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 3, 10);
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
			 if(!appt1.getValid())continue;

				Appt appt2 = new Appt(15,
					 30,
					 9,
					 12,
					 2018,
					 null,
					 null,
					 null);

			for (int i = 0; i < NUM_TESTS; i++) {
						   calday2.addAppt(appt1);
						   calday2.addAppt(appt2);						  
							for(int j = 0; j < 5; j++){
								int value = ValuesGenerator.getRandomIntBetween(random, 0, 25);
								appt2.setStartHour(value);
								calday2.addAppt(appt2);
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
