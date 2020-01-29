// Author: Julia Green
// This program stores and displays the time in both 12-hour and military format.

class Time {
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

	public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
	    int set = 0;
		if (hour == 0) {
		    set = 12;
		    this.hour = set;
		} else if (this.hour > 12) {
			set %= hour/12;
			this.hour = set;
		} else if (this.hour < 0) {
			set = hour + 12; // maybe loop for numbers less than -12
			this.hour = set;
		} else {
			this.hour = hour;
		}		
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59) {
			int temp = this.minute;
			int repeat = 0;
			while (temp > 59) {
				temp = temp - 60;
				repeat++;
			}
			this.minute = temp;
			hour = hour + repeat;
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

    public int getSeconds() {
    return seconds;
    }

    public void setSeconds(int seconds) {
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
			if (repeat > 59) {
				int temp2 = repeat;
				int repeat2 = 0;
				while (temp2 > 59) {
					temp2 = temp2 - 60;
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

public class TestClass {
    public static void main(String[] args) {
		Time time;   
		time = new Time(0, 400, 76);         
		time.displayTime();
    
	} // end Main
} // end TestClass class

