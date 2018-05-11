package com.test;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("12345"));
	}
	public static String reverse(String s) {
		  int length = s.length();
		  if (length <= 1)
		   return s;
		  String left = s.substring(0, length / 2);
		  String right = s.substring(length / 2, length);
		  return reverse(right) + reverse(left);
		 }
}
