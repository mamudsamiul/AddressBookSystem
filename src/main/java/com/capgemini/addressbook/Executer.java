package com.capgemini.addressbook;

import java.util.Scanner;

import com.capgemini.addressbookdto.AddressBook;
import com.capgemini.addressbookdto.ContactDetails;
import com.capgemini.addressbookdto.TakeInput;

public class Executer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("!! Welcome to Address Book System !!");
		System.out.println("=====================================");
		ContactDetails contactDetails = new ContactDetails();
		AddressBook addressBook = new AddressBook("first");
		TakeInput takeInput = new TakeInput();
		takeInput.takeInput(contactDetails, scan);
		addressBook.AddContact(contactDetails);
		System.out.println("Contact is Added to the addressbook!!");
	}
}
