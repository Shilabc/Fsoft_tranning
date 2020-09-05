package database;

import java.io.Serializable;

public class Student extends Object implements Serializable{
	private static final long serialVersionUID = 289499924213803054L;
	private int id;
	private String fullName;
	private String gender;
	private int age;
	private String email;
	private String phone_number;
	
	
	public Student() {
		super();
	}

	public Student(int id, String fullname, String gender, int age, String email, String phone_number) {
		super();
		this.id = id;
		this.fullName = fullname;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone_number = phone_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
