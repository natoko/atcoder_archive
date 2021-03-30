import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();

		if (S.substring(S.length() - 1).equals("s")) {
			System.out.println(S + "es");
		} else {
			System.out.println(S + "s");
		}
	}

}
