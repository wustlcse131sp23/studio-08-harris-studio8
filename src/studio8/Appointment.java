package studio8;

import java.util.Objects;

public class Appointment {
	
	private Date D; 
	private Time t;
	
	
	public Date getD() {
		return D;
	}
	public void setD(Date d) {
		D = d;
	}
	public Time getT() {
		return t;
	}
	public void setT(Time t) {
		this.t = t;
	}
	
	  public Appointment(Date D, Time t) { 
			 this.D = D;
			 this.t = t;
			 
		 }
	  
	@Override
	public int hashCode() {
		return Objects.hash(D, t);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(D, other.D) && Objects.equals(t, other.t);
	}
	 public static void main(String[] args) {
	    	
	    	Date b = new Date (6, 6, 2023);
	    	Time c = new Time(12, 22, true);
	    	Appointment a =  new Appointment (b, c);
	    	System.out.println(a);
	    	}
	 public String toString () {
 			return D + " " + t + " ";
 		}
	 }
	 


