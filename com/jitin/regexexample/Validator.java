package com.jitin.regexexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String PATTERN = "^[A-Za-z0-9_]{6,15}$";

	public static String validate(final String username) {
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(username);
		if (matcher.matches()) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}
}
