package by.htp.simple.bean;

public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private String adress;
	private int creditCardNumber;
	private int bankCardNumber;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String surname, String patronymic, String adress, int creditCardNumber,
			int bankCardNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankCardNumber = bankCardNumber;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(int bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + bankCardNumber;
		result = prime * result + creditCardNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (bankCardNumber != other.bankCardNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", patronymic=" + patronymic
				+ ", adress=" + adress + ", creditCardNumber=" + creditCardNumber + ", bankCardNumber=" + bankCardNumber
				+ "]";
	}

	@Override
	public int compareTo(Customer customer) {
		int result = this.name.compareTo(customer.name);
		if(result == 0) {
			result = this.surname.compareTo(customer.surname);
		}
		if(result == 0) {
			result = this.patronymic.compareTo(customer.patronymic);
		}
		
		
		return result;
		
	}

	
	
	
	

}
