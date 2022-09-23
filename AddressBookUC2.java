package day_9_assignments.com;

import java.util.Scanner;

public class AddressBookUC2 {

	void display(Scanner sc) {
		System.out.println("Enter First Name:");
		String str = sc.nextLine();
		System.out.println("Enter Last name:");
		String str1=sc.nextLine();
		System.out.println("Enter Address:");
		String str2=sc.nextLine();
		System.out.println("Enter City name:");
		String str3=sc.nextLine();
		System.out.println("Enter State name:");
		String str4=sc.nextLine();
		System.out.println("Enter Email ID:");
		String str6= sc.nextLine();
		System.out.println("Enter Zip code:");
		int i=sc.nextInt();
		System.out.println("Enter Phone Number:");
		long l=sc.nextLong();
		sc.nextLine();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AddressBookUC2 obj1= new AddressBookUC2();
		obj1.display(sc);
		AddressBookUC2 obj2= new AddressBookUC2();
		obj2.display(sc);
	}
}
