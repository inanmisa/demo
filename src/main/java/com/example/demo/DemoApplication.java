package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication {
	/*
		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
			int x=0;

			x = x++ + x;

			System.out.println("y= "+x);
		}
	*/
	public static String StringChallenge(String str) {
		String[] strArray = str.split(" ");
		String newStr = "";
		for (int j = 0; j < strArray.length; j++) {
			newStr += strArray[j].trim();
		}
		str = newStr;
		for (int i = 0; i <= str.length() / 2; i++) {
			if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i))) {
				return "false";
			}
		}
		return "true";
	}

	public static void main(String[] args) {

		//System.out.print(StringChallenge("never odd olr even"));
		System.out.println(StringChallenge2("turkey90AAA="));
	}

	public static boolean hasUpperCase(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;

	}

	public static boolean hasNumber(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		}
		return false;

	}

	public static String StringChallenge2(String str) {
		if(!hasUpperCase(str)){
			return "false";
		}else if(!hasNumber(str)){
			return "false";
		}else if(str.toLowerCase().contains("password")){
			return "false";
		}else if(!(str.length()>7||str.length()<31)){
			return "false";
		}
		else if(!hasPunc(str)){
			return "false";
		}
		return "true";
	}
	public static boolean hasPunc(String str){
		if(!Pattern.matches("\\p{Punct}",str)){
			return false;
		}
		return true;
	}
}
