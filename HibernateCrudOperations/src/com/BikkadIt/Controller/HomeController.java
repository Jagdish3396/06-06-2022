package com.BikkadIt.Controller;

import java.util.Scanner;

import com.BikkadIt.Service.ServiceImpl;

public class HomeController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceImpl s = new ServiceImpl();
		boolean b = true;
		while (b) {
			System.out.println("press 1 for save data");
			System.out.println("press 2 for show data");
			System.out.println("press 3 for update data");
			System.out.println("press 4 for delete data");
			System.out.println("press 5 for exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				s.save();

				break;
			case 2:
				s.showAll();
				break;
			case 3:
				s.update();
				break;
			case 4:
				s.delete();
				break;
			case 5:
				b = false;
				break;
			default:
				System.out.println("enter a valid choice");
				break;

			}
			System.out.println("--------THANKS FOR USING STUDENT MANAGEMENT APP---------");
		}

	}

}
