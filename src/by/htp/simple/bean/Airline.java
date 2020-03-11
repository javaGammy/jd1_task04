package by.htp.simple.bean;


import by.htp.simple.bean.Time;
public class Airline implements Comparable<Airline> {	
	private String destination;
	private int numberFlight;
	private String airplaneType;
	private Time time;
	private DayOfWeek dayOfWeek;
	
	public Airline() {
		
	}

	public Airline(String destination, int numberFlight, String airplaneType, Time time, DayOfWeek dayOfWeek) {
		super();
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.airplaneType = airplaneType;
		this.time = time;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberFlight;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberFlight != other.numberFlight)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", airplaneType="
				+ airplaneType + ", time=" + time + ", dayOfWeek=" + dayOfWeek + "]";
	}
	
	@Override
	public int compareTo(Airline airline) {
		int result = this.time.compareTo(airline.time);
		
        return result;
    }

	

}
