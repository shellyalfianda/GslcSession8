package main;

import java.util.Date;

abstract public class Teacher extends Worker {

	public Teacher(String name, Integer age, String address, String phone, String position, String room, String shift, int salary,
			Date recruitedDate) {
		super(name, age, address, phone, position, room, shift, salary, recruitedDate);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("Name: "+name+" Phone: "+this.phone +" room: "+this.room + " Shift: "+this.shift);
	}


}
