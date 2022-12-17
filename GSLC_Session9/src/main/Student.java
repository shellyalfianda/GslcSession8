package main;

public class Student extends Data {
	
	protected String status;
	protected int score;

	public Student(String name, int age, String address, String phone, String status) {
		super(name, age, address, phone);
		// TODO Auto-generated constructor stub
		this.status=status;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+" Score: "+this.score +" Status: "+this.status );
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
