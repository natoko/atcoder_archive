import java.util.Scanner;
public class Main {
	public static int a;
	public static int b;
	public static int c;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());

		if (a == b) {
			System.out.println(c);
		} else if (b == c) {
			System.out.println(a);
		} else if (c == a) {
			System.out.println(b);
		} else {
			System.out.println(0);
		}

	}

}
