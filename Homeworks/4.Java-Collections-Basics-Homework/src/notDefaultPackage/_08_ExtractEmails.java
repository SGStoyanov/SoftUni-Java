/* Problem 8.	Extract Emails
Write a program to extract all email addresses from given text. The text comes at the first input line. 
Print the emails in the output, each at a separate line. Emails are considered to be in format <user>@<host>, where:
�	<user> is a sequence of letters and digits, where '.', '-' and '_' can appear between them. Examples of valid users: "stephan", 
"mike03", "s.johnson", "st_steward", "softuni-bulgaria", "12345". Examples of invalid users: ''--123", ".....", "nakov_-", "_
steve", ".info".
�	<host> is a sequence of at least two words, separated by dots '.'. 
Each word is sequence of letters and can have hyphens '-' between the letters. Examples of hosts: "softuni.bg", 
"software-university.com", "intoprogramming.info", "mail.softuni.org". Examples of invalid hosts: "helloworld", ".unknown.soft.", 
"invalid-host-", "invalid-".
�	Example of valid emails: info@softuni-bulgaria.org, kiki@hotmail.co.uk, no-reply@github.com, s.peterson@mail.uu.net, 
info-bg@software-university.software.academy.*/

package notDefaultPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08_ExtractEmails {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        Pattern regex = Pattern.compile("\\w+([.-_]+\\w+)*@\\w+([.]\\w+)+");
        Matcher matcher = regex.matcher(input);

        while(matcher.find()){
                System.out.println(matcher.group());
        }
	}
}
