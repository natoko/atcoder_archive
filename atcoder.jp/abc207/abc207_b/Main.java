import java.util.Scanner;
import java.util.*;
public class Main {
	public static long a;
	public static long b;
	public static long c;
	public static long d;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Long.parseLong(scan.next());
		b = Long.parseLong(scan.next());
		c = Long.parseLong(scan.next());
		d = Long.parseLong(scan.next());
		scan.close();

		int cnt = 0;
		long blue = a;
		long red = 0;

		while(blue > red*d) {
			if (b >= c*d) {
				break;
			}
			cnt++;
			blue+=b;
			red+=c;
		}

		System.out.println(cnt != 0?cnt:-1);
	}

}
