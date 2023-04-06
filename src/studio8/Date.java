package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
public int month; 
public int day; 
public int year;

/*
 * constructor method
 * set method, day, and year
 */
	public void setMonth(int x) {
    	this.month = x;
    }
    	public void setDay(int x) {
        	this.day = x;
        }
    	public void setYear(int x) {
        	this.year = x;
        }
    	 public int getMonth() {
    	   	 return month;
    	   }
    	    public int getDay() {
    	      	 return day;
    	      }
    	    public int getYear() {
    	      	 return year;
    	      }
    	    public Date(int month, int day, int year) { 
    			 this.month = month;
    			 this.day = day;
    			 this.year = year;
    			 
    		 }
    	    public String toString () {
    			return month + " " + day + " " + year + " ";
    		}
    	    
    @Override
			public int hashCode() {
				return Objects.hash(day, month, year);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Date other = (Date) obj;
				return day == other.day && month == other.month && year == other.year;
			}
	public static void main(String[] args) {
    	Date a = new Date (3, 2, 2020);
    	System.out.println(a);
    	LinkedList<Date> list = new LinkedList <Date> ();
    	Date d1 = new Date (5, 14, 2020);
    	Date d2 = new Date (5, 14, 2020);
    	Date d3 = new Date (1, 9, 2004);
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	list.add(d1);
    	System.out.println(list);
    	HashSet<Date> set = new HashSet <Date> ();
    	Date s1 = new Date (5, 14, 2020);
    	Date s2 = new Date (5, 14, 2020);
    	Date s3 = new Date (1, 9, 2004);
    	set.add(s1);
    	set.add(s2);
    	set.add(s3);
    	set.add(s1);
    	System.out.println(set);
    	
    }
    }
   
   
  
