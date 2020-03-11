package by.htp.simple.bean;



public class Time {
	private Integer hour;
	private Integer minute;
	private Integer second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 && hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}

	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 && minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 && second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	public void addTime(int hour, int minute, int second) {
		this.hour += hour;
		if (this.hour > 23) {
			this.hour %= 24;
		}

		this.minute += minute;
		if (this.minute > 59) {
			this.minute %= 60;
			this.hour += (this.minute / 60);
		}

		this.second += second;
		if (this.second > 59) {
			this.second %= 60;
			this.minute += (this.second / 60);
			if (this.minute > 59) {
				this.minute %= 60;
				this.hour += (this.minute / 60);
			}
		}
	}

	public void addHour(int hour) {
		this.hour = hour;
		if (hour < 0 && hour > 23) {
			this.hour %= 24;
		}
	}

	public void addMinute(int minute) {
		this.minute = minute;
		if (this.minute > 59) {
			this.minute %= 60;
			this.hour += (this.minute / 60);
		}
	}

	public void addSecond(int second) {
		this.second += second;
		if (this.second > 59) {
			this.second %= 60;
			this.minute += (this.second / 60);
			if (this.minute > 59) {
				this.minute %= 60;
				this.hour += (this.minute / 60);
			}
		}
	}

	public int compareTo(Time time) {
		int result = this.hour.compareTo(time.hour);
		if (result == 0) {
			this.minute.compareTo(time.minute);
		}
		if (result == 0) {
			this.minute.compareTo(time.second);
		}
		return result;
	}
}
