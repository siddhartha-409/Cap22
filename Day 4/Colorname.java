package day4assignments;

import java.util.Scanner;

public class Colorname {

	public static void main(String[] args) {
		
		System.out.println("Enter color code:");
		
		Scanner s = new Scanner(System.in);
		
		char cc = s.next().charAt(0);
		
		s.close();
		
		switch(cc) {
		
		case 'R': System.out.println(cc+"->"+"Red");
		break;
		case 'B': System.out.println(cc+"->"+"Blue");
		break;
		case 'G': System.out.println(cc+"->"+"Green");
		break;
		case 'O': System.out.println(cc+"->"+"Orange");
		break;
		case 'Y': System.out.println(cc+"->"+"Yellow");
		break;
		case 'W': System.out.println(cc+"->"+"White");
		break;
		default : System.out.println("Invalid code");
		}
			

	}

}
