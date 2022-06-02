import java.util.Scanner;
import java.util.*;
public class Main {
	public static int a[];
	public static int b;

	public static void main(String[] args) {
		a = new int[3];
		Scanner scan = new Scanner(System.in);
		a[0] = Integer.parseInt(scan.next());
		a[1] = Integer.parseInt(scan.next());
		a[2] = Integer.parseInt(scan.next());
		scan.close();

		b = a[1];
		Arrays.sort(a);

		if (a[1] == b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}


}
