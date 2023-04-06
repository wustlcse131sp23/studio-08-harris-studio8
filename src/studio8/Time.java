package studio8;

import java.util.Objects;

public class Time {
    	
		public int hour; 
		public int minute; 
		public boolean format;

		/*
		 * constructor method
		 * set method, day, and year
		 */
			public void setHour(int x) {
		    	this.hour = x;
		    }
		    	public void setMinute(int x) {
		        	this.minute = x;
		        }
		    	 public int getHour() {
		    	   	 return hour;
		    	   }
		    	    public int getMinute() {
		    	      	 return minute;
		    	      }
		    	    public boolean getFormat() {
		    	      	 return format;
		    	      }
		    	    @Override
					public int hashCode() {
						return Objects.hash(format, hour, minute);
					}
					@Override
					public boolean equals(Object obj) {
						if (this == obj)
							return true;
						if (obj == null)
							return false;
						if (getClass() != obj.getClass())
							return false;
						Time other = (Time) obj;
						return hour%12 == other.hour%12 && minute == other.minute;}
						
			    	    			
			    	    			
								
					public Time(int hour, int minute, boolean format) { 
		    			 this.hour = hour;
		    			 this.minute = minute;
		    			 this.format = format;
		    			 
		    		 }
		    	    public String toString () {
		    	    	if (format = true) {
		    	    		if (hour > 12) {
		    	    			return hour - 12 + ": " + minute;}
		    	    		else {
		    	    			return hour + ":" + minute;
		    	    		}}
		    	    	else {
		    	    		return hour + ":" + minute;}
		    		}
		    	    
		    public static void main(String[] args) {
		    	Time a = new Time (23, 25, false);
		    	Time b = new Time(11, 25, true);
		    	System.out.println(a);
		    	System.out.println(a);
		    	System.out.println(a.equals(b));
		    	}}