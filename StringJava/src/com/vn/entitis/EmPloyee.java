package com.vn.entitis;
//1.Tao doi tuong EmPloyee
public class EmPloyee {
	private int Id;
	private String Name;
	private int Age;
	private int Salary;
	private String BirthDay;
	
	public EmPloyee() {
		super();
	}

	public EmPloyee(int id, String name, int age, int salary, String birthDay) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Salary = salary;
		BirthDay = birthDay;
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	@Override
	public String toString() {
		return "EmPloyee [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Salary=" + Salary + ", BirthDay="
				+ BirthDay + "]";
	}

	public String reFormat(String string) {
		return string.replace('/', '-');
	}
	
	
	
}
