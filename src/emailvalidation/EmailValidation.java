package emailvalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	 private static final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	   public static void main(String args[]) {
	       //adding  emails to an array list
	       List<String> emails = new ArrayList<String>();
	       //valid email addresses
	       emails.add("deepak@example.com");
	       emails.add("deepak@example.co.in");
	       emails.add("deepak.bob@example.com");
	       emails.add("deepak_verma@example.com");
	       emails.add("deepak@example.company.in");
	       //invalid email addresses
	       emails.add(".deepak@example.com");
	       emails.add("deepak@example.com.");
	       emails.add("deepak@example.c");
	       emails.add("deepak@example.company");
	       //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       //searching for occurrences of regex
	       for (String value : emails) {
	           Matcher matcher = pattern.matcher(value);
	           System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
	       }
	   }
}
