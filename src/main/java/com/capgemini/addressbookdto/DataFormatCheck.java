package com.capgemini.addressbookdto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataFormatCheck {
	static boolean checkFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}+$");
		Matcher matcher = pattern.matcher(firstName);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkLastName(String lastName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}+$");
		Matcher matcher = pattern.matcher(lastName);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkAddress(String address) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{5,}+$");
		Matcher matcher = pattern.matcher(address);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkState(String state) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}+$");
		Matcher matcher = pattern.matcher(state);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkCity(String city) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}+$");
		Matcher matcher = pattern.matcher(city);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkZip(String zip) {
		Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{5}$");
		Matcher matcher = pattern.matcher(zip);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkEmail(String email) {
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		return matchFound;
	}

	static boolean checkPhone(String phoneNo) {
		Pattern pattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean matchFound = matcher.find();
		return matchFound;
	}
}
