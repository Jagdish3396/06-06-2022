package com.BikkadIt.HomeController;

import java.util.Scanner;

import com.BikkadIt.Service.ServiceImpl;

public class Controller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceImpl s = new ServiceImpl();
		boolean b = true;
		while (b) {
			System.out.println("press 1 for save Data");
			System.out.println("press 2 for copy Data to new table");
			System.out.println("press 3 for show data for perticular ID");
			System.out.println("press 4 for show all Data from Table");
			System.out.println("press 5 for update");
			System.out.println("press 6 for delete one row from Database");
			System.out.println("press 7 for Delete all Data from Database");
			System.out.println("press 8 for exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				s.save();
				break;
			case 2:
				s.copy();

				break;
			case 3:
				s.show();

				break;
			case 4:
				s.showAll();

				break;
			case 5:
				s.update();

				break;
			case 6:
				s.delete();

				break;
			case 7:
				s.deleteAll();
				break;

			case 8:
				b = false;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}
}
