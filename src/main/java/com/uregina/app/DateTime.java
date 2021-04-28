package com.uregina.app;

import com.uregina.exceptions.*;

/**
 * DateTime class that consists of a Date object and a Time12 object
 *
 */
public class DateTime 
{
	Time12 time; // 12-hour time
	Date date; 	 // MM/DD/YYYY 
    /** 
	 * constructor to initial Time24 object
	 * @param time 		12-hour time object (hh:mm am/pm)
	 * @param date		date object (MM/DD/YYYY)
	*/
	public DateTime(Date date,Time12 time)
    {
		this.date=date;
		this.time=time;
    }
	/**
	* returns the 12-hour part (hh:mm am/pm) of the DateTime  
	*/
	public Time12 getTime()
	{
		return time;
	}
	/**
	* returns The date part (MM/DD/YYYY) of the DateTime  
	*/
	public Date getDate()
	{
		return date;
	}
	/**
	 * subtract two DateTimes
	 * @param  d1	a DateTime object (MM/DD/YYYY  hh:mm am/pm)
	 * @param  d2	a DateTime object (MM/DD/YYYY  hh:mm am/pm)
	 * @return 		the value of (d1-d2) in minutes
	 * 				it may be a negative value
	 *				Throws MoreThanOneDayException if d1,d2 are not at the same date or
	 * 						not a consequative days.
	 * usefeul functions that you may use
	 * 		(class: Date , method: equal)
	 * 		(class: Time12 , method: subtract)
	 * 		(class: Date , method: nextDate)
	 * @throws InvalidTimeException
	 */
	public static int subtract(DateTime d1,DateTime d2) throws MoreThanOneDayException, InvalidTimeException
	{
		int diff=0;
		//Todo: add your code here
/*
		String date1Trial = d1.date.toString();
		String splittedDate [] = date1Trial.split("/");
		//int year1 = Integer.parseInt(splittedDate[2]);
		//int month1 = Integer.parseInt(splittedDate[1]);
		//int day1 = Integer.parseInt(splittedDate[0]);

		String time1trial = d1.time.toString();
		String splittedtime1 [] = time1trial.split(":");
		//int hour1 = Integer.parseInt(splittedtime1[0]);
		String hour1 = splittedtime1[0];
		int minute1 = Integer.parseInt(splittedtime1[1]);

		String date2Trial = d2.date.toString();
		String splittedDate2 [] = date2Trial.split("/");
		//int year2 = Integer.parseInt(splittedDate2[2]);
		//int month2 = Integer.parseInt(splittedDate2[1]);
		//int day2 = Integer.parseInt(splittedDate2[0]);
		
		String time1trial2 = d2.toString();
		String splittedtime2 [] = time1trial2.split(":");
		int hour2 = Integer.parseInt(splittedtime2[0]);
		int minute2 = Integer.parseInt(splittedtime2[1]);
*/
		Time12 timechanged1 = new Time12(d1.getTime().getHours(), d1.getTime().getMinutes(), d1.getTime().getAM_or_PM());
		Time12 timechanged2 =  new Time12(d2.getTime().getHours(), d2.getTime().getMinutes(), d2.getTime().getAM_or_PM());

		diff = Time24.subtract(timechanged1.toTime24(), timechanged2.toTime24());

		

		//end of your code
		return diff;
	}
	/**
	 * Convert a DateTime object to string
	 * @param  None
	 * @return a string in the fromat MM/DD/YYYY hh:mm am/pm
	*/
	public String toString()
	{
		return date.toString()+" "+time.toString();
	}
	/**
	 * checks if a DateTime is before another one
	 * @param 	d1 a DateTime object
	 * @param 	d2 a DateTime object
	 * @return	true if d1<d2, false otherwise
	*/
	public static boolean lessThan(DateTime d1, DateTime d2)
	{
		return Date.lessThan(d1.date,d2.date) || ( Date.equal(d1.date,d2.date) && Time12.lessThan(d1.time,d2.time)) ;
	}
}
