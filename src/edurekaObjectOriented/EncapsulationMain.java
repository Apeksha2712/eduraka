package edurekaObjectOriented;

class Account {
	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}

//a java class to test the encapsulated class Account
public class EncapsulationMain {
	public static void main(String[] args) {
	//creating instance of account class
		Account acc = new Account();
		//setting value through setter() method
		acc.setAcc_no(1376747800);
		acc.setName("Ravi");
		acc.setEmail("ravi123@gmail.com");
		acc.setAmount(3214123f);
		//getting value to getter() method
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
	}
}
