package by.htp.les15.bean;

public class DecimalCounter {
	private int counterValue;	
	
	public DecimalCounter() {
		
	};
	
	public DecimalCounter(int counterValue) {
		super();
		this.counterValue = counterValue;
		
	}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {		
			this.counterValue = counterValue;		
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counterValue;
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
		DecimalCounter other = (DecimalCounter) obj;
		if (counterValue != other.counterValue)
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "DecimalCounter [counterValue=" + counterValue + "]";
	}

	public void increaseCounterCounter() {
		this.counterValue++;
	}
	
	public void decreaseCounterCounter() {
		this.counterValue--;
	}
	
	
	
	
	
	
	

}
