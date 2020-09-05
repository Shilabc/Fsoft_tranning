package database;

import java.io.Serializable;

public class Classroom extends Object implements Serializable {
	private static final long serialVersionUID = -3136680274753091813L;
	private int id;
	private String teacher;
	private int soHocSinh;
	private int soHocSinhNam;
	private int soHocSinhNu;
	private String phone_number;
	
	public Classroom() {
		super();
	}

	public Classroom(int id, String teacher, int soHocSinh, int soHocSinhNam, int soHocSinhNu, String phone_number) {
		super();
		this.id = id;
		this.teacher = teacher;
		this.soHocSinh = soHocSinh;
		this.soHocSinhNam = soHocSinhNam;
		this.soHocSinhNu = soHocSinhNu;
		this.phone_number = phone_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public int getSoHocSinh() {
		return soHocSinh;
	}

	public void setSoHocSinh(int soHocSinh) {
		this.soHocSinh = soHocSinh;
	}

	public int getSoHocSinhNam() {
		return soHocSinhNam;
	}

	public void setSoHocSinhNam(int soHocSinhNam) {
		this.soHocSinhNam = soHocSinhNam;
	}

	public int getSoHocSinhNu() {
		return soHocSinhNu;
	}

	public void setSoHocSinhNu(int soHocSinhNu) {
		this.soHocSinhNu = soHocSinhNu;
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
