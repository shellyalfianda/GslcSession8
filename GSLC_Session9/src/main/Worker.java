package main;

import java.util.Date;

abstract public class Worker extends Data {
	protected String position;
	protected String room;
	protected String shift;
	protected int salary;
	protected Date recruitedDate;

	public Worker(String name, Integer age, String address, String phone, String position, String room, String shift, int salary, Date recruitedDate) {
		super(name, age, address, phone);
		// TODO Auto-generated constructor stub
		this.position = position;
		this.room = room;
		this.shift = shift;
		this.salary = salary;
		this.recruitedDate = recruitedDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getRecruitedDate() {
		return recruitedDate;
	}

	public void setRecruitedDate(Date recruitedDate) {
		this.recruitedDate = recruitedDate;
	}
	
	abstract public void print();

}
