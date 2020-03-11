package by.htp.simple.view;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Airline;
import by.htp.simple.bean.DayOfWeek;
import by.htp.simple.bean.Time;

public class AirlineConsoleInput {
	public List<Airline> create(){
		List<Airline> airline = new ArrayList<Airline>();
		Airline al = new Airline("Moscow", 345, "Boing 747", new Time(18, 00, 00), DayOfWeek.Friday);
		airline.add(al);
		
		al = new Airline("Minsk", 345, "Too 154", new Time(20, 00, 00), DayOfWeek.Monday);
		airline.add(al);
		
		al = new Airline("London", 345, "Too 134", new Time(16, 30, 00), DayOfWeek.Sunday);
		airline.add(al);
		
		al = new Airline("Paris", 345, "Il 96", new Time(19, 00, 00), DayOfWeek.Friday);
		airline.add(al);
		
		al = new Airline("Saint-Petersburg", 345, "Airbus", new Time(14, 30, 00), DayOfWeek.Tuesday);
		airline.add(al);
			
		return airline;
	}

}
