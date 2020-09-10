package com.vn.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.vn.entitis.EmPloyee;

public class Main {

	public static void main(String[] args) {

		try {
			File fileEmployee = new File("EmPloyee.csv");
			Scanner myReader = new Scanner(fileEmployee);
			while (myReader.hasNextLine()) {
				// 2.Read theo tung line
				String data = myReader.nextLine();
//				System.out.println(data);
				// 3.Cat chuoi -> EmPloyee
				String[] cutString = data.split("\\,");
				// 4.1 Format OLD
				EmPloyee empl = new EmPloyee();
				empl.setId(Integer.parseInt(cutString[0]));
				empl.setName(cutString[1]);
				empl.setAge(Integer.parseInt(cutString[2]));
				empl.setSalary(Integer.parseInt(cutString[3]));
				empl.setBirthDay(cutString[4]);
				System.out.println(empl.toString());

				// 4.2 Format NEW
				String newBirthDay = empl.reFormat(cutString[4]);
				empl.setBirthDay(newBirthDay);
				System.out.println(empl.toString());
				System.out.println();

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
