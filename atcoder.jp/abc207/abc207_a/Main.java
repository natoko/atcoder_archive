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
		scan.close();

		System.out.println(Math.max(a + b,Math.max(b + c,c + a)));
	}

}
