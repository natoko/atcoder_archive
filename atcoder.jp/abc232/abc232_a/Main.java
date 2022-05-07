import java.util.Scanner;

import java.util.*;

public class Main {

	public static String S;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		S = scan.next();

		scan.close();
		
		
		char[] charArray = S.toCharArray();
		int s1=charArray[0]-'0';
		int s2=charArray[2]-'0';
		
		int ans = s1*s2;

		System.out.println(ans);

	}

}