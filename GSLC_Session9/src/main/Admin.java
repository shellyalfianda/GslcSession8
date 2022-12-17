package main;

import java.util.Date;

public class Admin extends Worker {

	public Admin(String name, Integer age, String address, String phone, String position, String room, String shift,
			int salary, Date recruitedDate) {
		super(name, age, address, phone, position, room, shift, salary, recruitedDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+" Phone: "+this.phone +" room: "+this.room + " Shift: "+this.shift);
	}

}
