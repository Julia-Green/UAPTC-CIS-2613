// Author: Julia Green
// This program stores and displays the time in both 12-hour and military format.

class Time {
    private int milHour;
	private int hour;
	private int minute;
	private int seconds;	
	
    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = 0;
    }

	protected int getHour() {
        return hour;
    }

	protected void setHour(int hour) {
        if (hour == 0) {
            this.hour = 12;
        } else if (hour > 12) {
            this.hour = hour - 12;
        } else if (hour < 0) {
            this.hour = hour + 12; 
        } else {
            this.hour = hour;
        }	
    }
	
    protected int getMinute() {
        return minute;
    }

    protected void setMinute(int minute) {
        if (minute > 59) {
			int temp = this.minute;
			int repeat = 0;
			while (temp > 59) {
				temp = temp - 60;
				repeat++;
			}
			this.minute = temp;
			this.hour = hour + repeat;
		} else if (minute < 0) {
			int temp = this.minute;
			int repeat = 0;
			while (temp < 0) {
				temp = temp + 60;
				repeat++;
			}
			this.minute = temp;
			this.hour = hour - repeat;
		} else {
			this.minute = minute;
		}
    }

    protected int getSeconds() {
        return seconds;
    }

    protected void setSeconds(int seconds) {
        if (this.seconds > 59) {
			int temp = this.seconds;
			int repeat = 0;
			while (temp > 59) {
				temp = temp - 60;
				repeat++;
			}
			this.seconds = temp;
			if (repeat > 59) {
				int temp2 = repeat;
				int repeat2 = 0;
				while (temp2 > 59) {
					temp2 = temp2 - 60;
					repeat2++;
				}
				this.minute = minute + temp2;
				this.hour = hour + repeat2;	
			} else {
				this.minute = minute + repeat;
			}
	    } else if (this.seconds < 0) {
            int temp = this.seconds;
			int repeat = 0;
			while (temp < 0) {
				temp = temp + 60;
				repeat++;
			}
			this.seconds = temp;
			if (repeat < 0) {
				int temp2 = repeat;
				int repeat2 = 0;
				while (temp2 < 0) {
					temp2 = temp2 + 60;
					repeat2++;
				}
				this.minute = minute - temp2;
				this.hour = hour - repeat2;	
			} else {
				this.minute = minute - repeat;
			}
    	} else {
    		this.seconds = seconds;
    	}
    }

	// Displays Time
	public void displayTime() {
	    setSeconds(seconds);	    
	    setMinute(minute);
	    setHour(hour);
		System.out.println("The time is " + getHour() + ":" + getMinute() + ":" + getSeconds() + ".");
		System.out.println();
	}
} // class Time end

class MilTime extends Time {
    public int milHour;
    public MilTime(int hour, int minute, int seconds) {
        super(hour, minute, seconds);
    }
    
    public int getMilHour() {
        return milHour;
    }

    public void setMilHour(int hour) {
		if (hour > 24) {
			milHour = hour - 24;
		} else if (hour < 0) {
			milHour = hour + 24; 
		} else {
			milHour = hour;
		}		
    }

    // Displays Military Time
	public void displayMilTime() {
	    int hour = getHour();
        int minute = getMinute();
        int seconds = getSeconds();
	    setSeconds(seconds);	    
	    setMinute(minute);   
	    setMilHour(hour);
		System.out.println("The time is " + getMilHour() + ":" + getMinute() + ":" + getSeconds() + ".");
		System.out.println();
	}
} // end MilTime class

public class TestClass {
    public static void main(String[] args) {
        // Test Civilian Time
		System.out.println("Civilian Time:");
		Time time1 = new Time(12, 49, 25);         
		time1.displayTime();
		Time time2 = new Time(6, 27, -76);         
		time2.displayTime();
		Time time3 = new Time(9, 50, -3627);         
		time3.displayTime();
		Time time4 = new Time(13, 400, 76);         
		time4.displayTime();
		Time time5 = new Time(10, 249, 305);         
		time5.displayTime();
		
        // Test Military time
 		System.out.println("Military Time:");       
        MilTime milTime1 = new MilTime(23, 16, 9);
        milTime1.displayMilTime();
        MilTime milTime2 = new MilTime(27, 52, 49);
        milTime2.displayMilTime();
        MilTime milTime3 = new MilTime(-10, 27, 33);
        milTime3.displayMilTime();
        MilTime milTime4 = new MilTime(5, 195, 57);
        milTime4.displayMilTime();
        MilTime milTime5 = new MilTime(-17, 42, 367);
        milTime5.displayMilTime();
	} // end Main
} // end TestClass class