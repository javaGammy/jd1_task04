package by.htp.simple.view;

import java.util.List;

import by.htp.simple.bean.Airline;

public class AirlineView {
	public void print(Airline al) {
		System.out.println("����� ����� " + al.getNumberFlight() + " ��� �������� " + al.getAirplaneType() + "����� ������ " + al.getTime() + "���� ������ " + al.getDayOfWeek());
		}
	public void print(List<Airline> airline) {
		for (Airline al : airline) {
			print(al);
		}
	}

}
