package com.capgemini.addressbook;

import java.util.Scanner;

import com.capgemini.addressbookdto.ContactDetails;
import com.capgemini.addressbookdto.TakeInput;

public class Executer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("!! Welcome to Address Book System !!");
		System.out.println("=====================================");
		ContactDetails contactDetails = new ContactDetails();
		TakeInput takeInput = new TakeInput();
		takeInput.takeInput(contactDetails, scan);
	}
}
