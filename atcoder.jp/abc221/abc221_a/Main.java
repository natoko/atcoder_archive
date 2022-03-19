import java.util.Scanner;

import java.util.*;

public class Main {

	public static int a;	public static int b;

	public static int ans=1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		a = Integer.parseInt(scan.next());

		b = Integer.parseInt(scan.next());

		scan.close();

		

		for (int i = a-b;i > 0;i-- ) {

			ans*=32;

		}

		System.out.println(ans);

	}

}