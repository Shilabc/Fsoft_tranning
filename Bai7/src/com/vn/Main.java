package com.vn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

	static final String FILE_PATH = "C:\\Users\\Shil\\eclipse-workspace\\FileJava\\20200917";
	static final String FILE_TXT = ".txt";
	static final String FILE_INPUT = "C:\\Users\\Shil\\eclipse-workspace\\FileJava\\20200917\\DamBD\\DamBD2\\Test3.txt";
	static final String CREAT_FODER = "C:\\Users\\Shil\\eclipse-workspace\\FileJava\\20200917\\DamBD\\DamBD2\\DAMBD3";

	public static void main(String[] args) throws IOException {
		FindFile(FILE_PATH, FILE_TXT);

		ReadFile(FILE_INPUT);

		File dir2 = new File(CREAT_FODER);
		dir2.mkdir();
		System.out.println(dir2.getAbsolutePath());

	}

	private static void ReadFile(String fileInput) throws IOException {
		File file = new java.io.File(fileInput);
		FileInputStream inputStream = new FileInputStream(file);
		int element = inputStream.read();
		System.out.println(element);
	}

	public static void FindFile(String dir, String endSwish) {
		File file = new File(dir);
		if (file.isDirectory()) {
			if (file.exists()) {
				try {
					String[] list = file.list(new FilenameFilter() {
						@Override
						public boolean accept(File file, String nameFindFile1) {
							return nameFindFile1.endsWith(endSwish);
						}
					});

					for (String list1 : list) {
						System.out.println(list1);

					}
					String[] newlist = file.list(new FilenameFilter() {
						@Override
						public boolean accept(File file, String nameFindFile2) {
							return nameFindFile2.endsWith("");
						}
					});

					String[] dir2 = new String[newlist.length];
					for (int i = 0; i < newlist.length; i++) {
						dir2[i] = dir + "\\" + newlist[i];
						FindFile(dir2[i], FILE_TXT);
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		}

	}
}
