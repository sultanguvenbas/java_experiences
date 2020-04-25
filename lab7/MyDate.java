/**
 * Jan is represented by 0 and December is represented by 11
 * 
 *
 */

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	int[] max_days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMonth() {
		return month + 1;
		
	}
    public MyDate(int day,int month,int year) {
    	this.day = day;
    	this.month = month-1;
    	this.year = year;
    }

	public void incrementDay() {
		day++;
		
		if (day > max_days[month]) {
			if (month == 1 && inLeapyear())
				day = 29;
			else {
				day = 1;
				incrementMonth();
				
			}
			
		}
		
	}

	public void incrementYear(int i) {
		year += i;
		
		
	}

	public void decrementDay() {
		day--;	
		if(day==0) {
			decrementMonth();
			
		if (month == 1 && inLeapyear())
			day = 29;
		else { 
		    day = max_days[month];
		}
	  }
	}


	private boolean inLeapyear() {
		return year % 4 == 0;
	}
	public void decrementYear() {
		year--;
		
	}

	public void decrementMonth() {
		decrementMonth(1);
		
	}

	public void incrementDay(int i) {
		// TODO Auto-generated method stub
		
	}

	public void decrementMonth(int i) {
		incrementMonth(-i);
		
	}

	public void decrementDay(int i) {
		
	}

	public void incrementMonth(int i) {
		int newMonth = (month + i)%12;
		int yearDiff = 0;
		if (newMonth <0 ) {
			newMonth+=12;
			yearDiff = -1;
		}
		
		yearDiff = (month + i)/12;
		month = newMonth;
		incrementYear(yearDiff);
		
	}

	public void decrementYear(int i) {
		day --;
		if (day==0) {
			incrementMonth();
		}
		
	}

	public void incrementMonth() {
		incrementMonth(1);
		
	}

	public void incrementYear() {
		// TODO Auto-generated method stub
		
	}

	public boolean isBefore(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfter(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return false;
	}

	public int dayDifference(MyDate anotherDate) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString() {
		return "" +year +"-"+(month+1>9 ? "" : "0")+ (month+1) +"-"+ (day>9 ? "" : "0" )+day;
	}
}
    
