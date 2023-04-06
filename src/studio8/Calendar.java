package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {

	private Set <Appointment> C; 
		
		public Calendar () {
			C = new HashSet <Appointment> ();
		}

		public Set<Appointment> getC() {
			return C;
		}

		public void setC(Set<Appointment> c) {
			C = c;
		}

		 public static void main(String[] args) {
		    	
		    	Date b = new Date (6, 6, 2023);
		    	Time c = new Time(10, 25, true);
		    	Date e = new Date (2, 6, 2021);
		    	Time f = new Time(1, 20, true);
		    	Date g = new Date (6, 7, 2023);
		    	Time h = new Time(12, 22, true);
		    	Appointment a =  new Appointment (b, c);
		    	Appointment a1 =  new Appointment (e, f);
		    	Appointment a2 =  new Appointment (g, h);
		    	HashSet<Appointment> set = new HashSet <Appointment> ();
		    	set.add(a);
		    	set.add(a1);
		    	set.add(a2);
		    	System.out.println(set);
		    	Calendar C = new Calendar ();
		    	C.setC(set);
		    	System.out.println(C.getC());
		    	}
}