import java.util.Scanner;
public class Main {
	public static int x;
	public static int y;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		x = Integer.parseInt(scan.next());
		y = Integer.parseInt(scan.next());

		if (x == y) {
			System.out.println(x);
		} else {
			System.out.println(3 - (x + y));
		}
	}

}
