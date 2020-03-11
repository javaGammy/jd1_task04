package by.htp.les15.view;

import java.util.List;

import by.htp.les15.bean.Train;

public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: number" + train.getNumber() + "\n\t" + train.getDestinationStation() + "\n" + train.getDate() + "\n");
	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}

}
