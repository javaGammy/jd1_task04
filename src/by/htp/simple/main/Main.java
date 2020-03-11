package by.htp.simple.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Airline;
import by.htp.simple.bean.DayOfWeek;
import by.htp.simple.bean.Time;
import by.htp.simple.service.AirlineLogic;
import by.htp.simple.view.AirlineConsoleInput;
import by.htp.simple.view.AirlineView;

public class Main {

	public static void main(String[] args) {
		AirlineLogic logic = new AirlineLogic();
		AirlineView view = new AirlineView();
		AirlineConsoleInput input = new AirlineConsoleInput();
		List<Airline> airline = new ArrayList<Airline>();
		
		airline = input.create();
		view.print(airline);
		
		airline = logic.find(airline, DayOfWeek.Friday);
		view.print(airline);
		
		airline = logic.find(airline, DayOfWeek.Friday, new Time(18, 30, 00));
		view.print(airline);
		

	}

}
