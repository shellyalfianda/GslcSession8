package main;


public class StudentCouncil extends Student implements Overtime {
	
	private String performance;

	public StudentCouncil(String name, int age, String address, String phone, String status) {
		super(name, age, address, phone, status);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void twoHoursOvertime() {
		// TODO Auto-generated method stub
		System.out.println("This student council do overtime for 2 hours");
	}

	@Override
	public void fourHoursOvertime() {
		// TODO Auto-generated method stub
		System.out.println("This student council do overtime for 3 hours");
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+" Score: "+this.score +" Status: "+this.status );
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	

}
