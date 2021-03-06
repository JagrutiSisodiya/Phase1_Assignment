package Lockers;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner obj = new Scanner(System.in);

		// 1.sort in ascending order
		File fsort = new File("D:\\Demo\\");

		List<String> listFile1 = Arrays.asList(fsort.list());
		System.out.println("Listing files unsorted");
		for (String usort : listFile1) {
			System.out.println(usort);
		}
		Collections.sort(listFile1);
		System.out.println("---------------------------------------");
		List<String> listFile2 = Arrays.asList(fsort.list());
		System.out.println("Sorting by filename in ascending order");
		for (String sort : listFile2) {
			System.out.println(sort);

		}
		// 2.create file
		System.out.println("Enter the file name:- ");
		String filename1 = obj.nextLine();

		File fcreate = new File("D:\\Demo\\" + filename1 + ".txt");

		boolean value = fcreate.createNewFile();
		if (value) {
			System.out.println("New  File is created.");
		} else {
			System.out.println("The file already exists.");
		}

		// 3.delete file

		System.out.println("Enter the file name To Delete:- ");
		String filename2 = obj.nextLine();

		File fdelete = new File("D:\\Demo\\" + filename2 + ".txt");

		if (fdelete.delete()) {
			System.out.println("Deleted the file: " + fdelete.getName());
		} else {
			System.out.println("File not found");
		}

		// 4.search file
		System.out.println("Enter the file name To search:- ");
		String filename3 = obj.nextLine();

		File fsearch = new File("D:\\Demo\\");
		String[] children = fsearch.list();
		if (children == null) {
			System.out.println("file not found");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				if (filename.equals(filename3 + ".txt")) {
					System.out.println("Result of search file :" + filename3);
				} 
		
				
				

				
			}
			obj.close();
		}

	}

}
