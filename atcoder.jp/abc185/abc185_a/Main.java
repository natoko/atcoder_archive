import java.util.Scanner;
public class Main {
	public static int a,b,c,d;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		d = Integer.parseInt(scan.next());

		System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
	}

}
