import java.util.Scanner;
public class Main {
	public static int a;
	public static int b;
	public static int c;
	public static int d;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		d = Integer.parseInt(scan.next());

		System.out.println(a*d - b*c);
	}

}
