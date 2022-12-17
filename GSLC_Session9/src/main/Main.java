package main;

import java.util.Scanner;
import java.text.DateFormat;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	Vector<Data> datas = new Vector<>();
	int mainMenu() {
		int a;
		while(true) {
			System.out.println("Infinite School");
			System.out.println("1. View Data");
			System.out.println("2. Insert Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				a=sc.nextInt();
				sc.nextLine();
				if(a>=1 && a<=4) {
					return a;
				}
				//warning jika input tidak sesuai pilihan
				else {
					System.out.println("Input must be between [ 1 - 4 ]");
				}
			//catch untuk menghindari error jika user menginput character atau string agar tidak terjadi error input mismatch
			} catch (Exception e) {
				System.out.println("You must input number");
				sc.nextLine();
			}
		}
	}
	
	void view() {
		int a=1;
		for (var i : datas) {
			System.out.println(a + " "+i);
		}
	}
	
	int mainMenu2() {
		int a;
		while(true) {
			System.out.println("1. Student");
			System.out.println("2. Teacher");
			System.out.println("3. Admin");
			System.out.println("4. Student Council");
			System.out.println("5. Return to main menu");
			System.out.print(">> ");
			try {
				a=sc.nextInt();
				sc.nextLine();
				if(a>=1 && a<=5) {
					return a;
				}
				//warning jika input tidak sesuai pilihan
				else {
					System.out.println("Input must be between [ 1 - 5 ]");
				}
			//catch untuk menghindari error jika user menginput character atau string agar tidak terjadi error input mismatch
			} catch (Exception e) {
				System.out.println("You must input number");
				sc.nextLine();
			}
		}
	}
	
	public Main() {
		int menu;
		mainMenuLoop:
		while(true) {
			menu=mainMenu();
			if(menu==1) {
				if(datas.isEmpty()) {
					System.out.println("There is no data");
				}
				else {
					view();
				}
			}
			else if(menu==2) {
				int menu2;
				while(true) {
					System.out.println("1. Student");
					System.out.println("2. Teacher");
					System.out.println("3. Admin");
					System.out.println("4. Student Council");
					System.out.println("5. Return to main menu");
					menu2=mainMenu2();
					//Insert student
					if(menu2==1) {
						String name,address,phone,status;
						int age;
						System.out.print("Input student name: ");
						name=sc.nextLine();
						System.out.println("Input student age: ");
						age=sc.nextInt();
						sc.nextLine();
						System.out.print("Input student address: ");
						address=sc.nextLine();
						System.out.print("Input student phone: ");
						phone=sc.nextLine();
						System.out.print("Input student status [ Active | non-Active ]: ");
						status=sc.nextLine();
						datas.add(new Student(name, age, address, phone, status));
					}
					//Insert Teacher 
					else if(menu2==2) {
						String name, address, phone,room, shift, position;
						Date recruitedDate;
						int age;
						int salary;
						System.out.print("Input teacher name: ");
						name=sc.nextLine();
						System.out.println("Input teacher age: ");
						age=sc.nextInt();
						sc.nextLine();
						System.out.print("Input teacher address: ");
						address=sc.nextLine();
						System.out.print("Input teacher phone: ");
						phone=sc.nextLine();
						System.out.print("Input teacher position: ");
						position=sc.nextLine();
						System.out.print("Input teacher room: ");
						room=sc.nextLine();
						System.out.print("Input teacher shift : ");
						shift=sc.nextLine();
						System.out.print("Input teacher salary: ");
						salary=sc.nextInt();sc.nextLine();
						System.out.print("Input teacher recruited date: ");
						recruitedDate= new Date(sc.nextLine());
						datas.add(new Admin(name, age, address, phone, position, room, shift, salary, recruitedDate));
					}
					//Insert admin 
					else if(menu2==3) {
						String name, address, phone,room, shift, position;
						Date recruitedDate;
						int age;
						int salary;
						System.out.print("Input admin name: ");
						name=sc.nextLine();
						System.out.println("Input admin age: ");
						age=sc.nextInt();
						sc.nextLine();
						System.out.print("Input admin address: ");
						address=sc.nextLine();
						System.out.print("Input admin phone: ");
						phone=sc.nextLine();
						System.out.print("Input admin position: ");
						position=sc.nextLine();
						System.out.print("Input admin room: ");
						room=sc.nextLine();
						System.out.print("Input admin shift : ");
						shift=sc.nextLine();
						System.out.print("Input admin salary: ");
						salary=sc.nextInt();sc.nextLine();
						System.out.print("Input admin recruited date: ");
						recruitedDate= new Date(sc.nextLine());
						datas.add(new Admin(name, age, address, phone, position, room, shift, salary, recruitedDate));
					}
					//Insert Student Council
					else if(menu2==4) {
						String name,address,phone,status;
						int age;
						System.out.print("Input studentCouncil name: ");
						name=sc.nextLine();
						System.out.println("Input studentCouncil age: ");
						age=sc.nextInt();
						sc.nextLine();
						System.out.print("Input studentCouncil address: ");
						address=sc.nextLine();
						System.out.print("Input studentCouncil phone: ");
						phone=sc.nextLine();
						System.out.print("Input studentCouncil status [ Active | non-Active ]: ");
						status=sc.nextLine();
						datas.add(new StudentCouncil(name, age, address, phone, status));
					}
					//return to main menu
					else if(menu2==5) {
						continue mainMenuLoop;
					}
				}
			}
			//DELETE DATA
			else if(menu==3) {
				if(datas.isEmpty()) {
					System.out.println("There is no data");
				}
				else {
					view();
					int deleteIdx;
					while(true) {
						System.out.print("Update Data [ 1 - "+datas.size()+" ], choose '0' to go back to main menu: ");
						deleteIdx=sc.nextInt();sc.nextLine();
						if(deleteIdx>=0 && deleteIdx<=datas.size()) {
							if(deleteIdx==0) {
								continue mainMenuLoop;
							}
							else {
								System.out.println("Successfully delete "+datas.get(deleteIdx-1).getName()+" data");
								datas.remove(deleteIdx-1);
								break;
							}
						}
					}
				}
			}
			//EXIT
			if(menu==4) {
				System.out.println("bye");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
