package by.htp.les15.main;

import java.util.Collections;
import java.util.List;

import by.htp.les15.bean.Time;
import by.htp.les15.bean.Train;
//import by.htp.les15.service.TrainLogic;
import by.htp.les15.view.TrainConsoleInput;
import by.htp.les15.view.TrainView;

public class Main {

	public static void main(String[] args) {
		TrainView view = new TrainView();
		TrainConsoleInput input = new TrainConsoleInput();

		//TrainLogic logic = new TrainLogic();

		List<Train> trains;
		
		trains = input.create();

		view.print(trains);

		System.out.println("--------------");

		Collections.sort(trains);
		view.print(trains);
		
		
		String number = "01";
		int result = Integer.parseInt(number);			
		System.out.println(result);
		
		Time time = new Time(20, 40, 50);
		
		System.out.println(time.getHour()+ ":" + time.getMinute() + ":" + time.getSecond());
		
		time.addTime(4, 1, 1);
		
		System.out.println(time.getHour()+ ":" + time.getMinute() + ":" + time.getSecond());
		
		
		
		/*logic.sortByNumber(trains);

		view.print(logic.find(trains, input.inputTrainNumber()));*/
		
		
		
		
		
		
		

	}

	/*
	 * public static void main(String[] args) { int[] mas = new int[15];
	 * 
	 * Random rand = new Random(); for (int i = 0; i < mas.length; i++) { mas[i] =
	 * rand.nextInt(1000); }
	 * 
	 * for (int i = 0; i < mas.length; i++) { System.out.print(mas[i] + " "); }
	 * System.out.println();
	 * 
	 * ////////////////////////////////////////////////////
	 * 
	 * for (int i = 0; i < mas.length - 1; i++) { int min = mas[i]; int minIndex =
	 * i;
	 * 
	 * for(int j = i + 1; j<mas.length; j++) { if(min > mas[j]) { min = mas[j];
	 * minIndex = j; }
	 * 
	 * }
	 * 
	 * mas[minIndex] = mas[i]; mas[i] = min;
	 * 
	 * for (int k = 0; k< mas.length;k++) { System.out.print(mas[k] + " "); }
	 * System.out.println();
	 * 
	 * }
	 * 
	 * ////////////////////////////////////////////////////
	 * 
	 * for (int i = 0; i < mas.length; i++) { System.out.print(mas[i] + " "); }
	 * System.out.println();
	 * 
	 * }
	 */
}
