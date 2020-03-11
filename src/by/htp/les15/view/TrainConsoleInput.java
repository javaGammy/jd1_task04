package by.htp.les15.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.les15.bean.Date;
import by.htp.les15.bean.Train;

public class TrainConsoleInput {

	public List<Train> create() {
		List<Train> trains = new ArrayList<Train>();
		
		Train tr = new Train(123, "Minsk", new Date(2019,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(455, "Minsk", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		tr = new Train(12, "Minsk", new Date(2021,2,14,12,12));
		trains.add(tr);
		
		tr = new Train(346, "Minsk", new Date(2008,3,12,12,12));
		trains.add(tr);
		
		tr = new Train(498, "Minsk", new Date(2020,2,12,12,12));
		trains.add(tr);
		
		return trains;
		
	}
	public int inputTrainNumber() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int trainNumber;
		
		System.out.println("¬ведите номер поезда ");
		
		
		
		trainNumber = sc.nextInt();
		
		return trainNumber;

}
}
