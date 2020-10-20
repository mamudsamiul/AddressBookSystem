package com.capgemini.addressbookdto;

import java.util.Scanner;

public class TakeInput {
	public void takeInput(ContactDetails contactDetails, Scanner scan) {
		while (true) {
			System.out.print("\nPlease enter your First name :");
			String firstName = scan.nextLine();
			if (DataFormatCheck.checkFirstName(firstName)) {
				contactDetails.setFirstName(firstName);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your Last name :");
			String lastName = scan.nextLine();
			if (DataFormatCheck.checkLastName(lastName)) {
				contactDetails.setLastName(lastName);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your Address :");
			String address = scan.nextLine();
			if (DataFormatCheck.checkAddress(address)) {
				contactDetails.setAddress(address);
				break;
			}
			System.out.println("Invalid input Given");
		}

		while (true) {
			System.out.print("\nPlease enter your City name :");
			String city = scan.nextLine();
			if (DataFormatCheck.checkCity(city)) {
				contactDetails.setCity(city);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your State name :");
			String state = scan.nextLine();
			if (DataFormatCheck.checkState(state)) {
				contactDetails.setState(state);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your Zip code :");
			String zip = scan.nextLine();
			if (DataFormatCheck.checkZip(zip)) {
				contactDetails.setZip(zip);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your Phone Number :");
			String phone = scan.nextLine();
			if (DataFormatCheck.checkPhone(phone)) {
				contactDetails.setPhoneNo(phone);
				break;
			}
			System.out.println("Invalid input Given");
		}
		while (true) {
			System.out.print("\nPlease enter your email address :");
			String email = scan.nextLine();
			if (DataFormatCheck.checkEmail(email)) {
				contactDetails.setEmailAddress(email);
				break;
			}
			System.out.println("Invalid input Given");
		}
	}
}
