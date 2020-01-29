// Author: Julia Green
// This program stores the month, date, and year and diplays them according to their input.

class date {
	private int date;
	private int month;
	private int year;	
	
	date() { // Default Constructor
		month = 1;
		date = 1;
		year = 2019;
		System.out.println("The date is " + convertMonth(month) + " " + date + ", " + year + ".");
	}
	date(int m, int d, int y) { // Constructs with month, date, and year
		month = m;
		date = d;
		year = y; 
		System.out.println("The date is " + convertMonth(month) + " " + date + ", " + year + ".");
	}
	
	date(int m, int y) { // Constructs with month and year
		month = m;
		year = y;
		System.out.println("The date is " + convertMonth(month) + " " + year + ".");
	}
	
	date(int y) { // Constructs with year
		year = y;
		System.out.println("The year is " + year + ".");
	}
	
	public String convertMonth (int m) { // Converts the month integer into its string name
		String convert = "";
		switch(m) {
			case 1:
			convert = "January";
			break;

			case 2:
			convert = "February";
			break;
			
			case 3:
			convert = "March";
			break;
			
			case 4:
			convert = "April";
			break;
			
			case 5:
			convert = "May";
			break;
			
			case 6:
			convert = "June";
			break;
			
			case 7:
			convert = "July";
			break;
			
			case 8:
			convert = "August";
			break;
			
			case 9:
			convert = "September";
			break;
			
			case 10:
			convert = "October";
			break;		
			
			case 11:
			convert = "November";
			break;
			
			case 12:
			convert = "December";
			break;
		}
		return convert;	
	}
} // class date end

public class main {
	public static void main(String[] args) {
		date d1 = new date(6, 26, 2019);
		date d2 = new date();
		date d3 = new date(7, 2014);
		date d4 = new date(2016);
	} // main end
} // class main end