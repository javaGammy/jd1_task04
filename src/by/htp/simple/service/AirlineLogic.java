package by.htp.simple.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.simple.bean.Airline;
import by.htp.simple.bean.DayOfWeek;
import by.htp.simple.bean.Time;

public class AirlineLogic {
	public List<Airline> find(List<Airline> airline, String destination){
		List<Airline> newAirline = new ArrayList<Airline>();
		for(Airline al : airline) {
			if(al.getDestination().equals(destination)) {
				newAirline.add(al);
			}
		}
		return newAirline;
				
	}
	
	
	
	public List<Airline> find(List<Airline> airline, DayOfWeek dayOfWeek){
		List<Airline> newAirline = new ArrayList<Airline>();
		for(Airline al : airline) {
			if(al.getDayOfWeek().equals(dayOfWeek)) {
				newAirline.add(al);
			}
		}
		return newAirline;
				
	}
	
	public List<Airline> find(List<Airline> airline, DayOfWeek dayOfWeek, Time time){
		List<Airline> newAirline = new ArrayList<Airline>();
		for(Airline al : airline) {
			if(al.getDestination().equals(dayOfWeek)) {
				if(al.getTime().compareTo(time) < 0)
					newAirline.add(al);{
					
				}
			}
		}
		return newAirline;
				
	}
	

}
