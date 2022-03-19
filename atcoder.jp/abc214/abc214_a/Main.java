import java.util.Scanner;
public class Main {
	public static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		scan.close();

		if ((1 <= n) && (125 >= n)) {
			System.out.println(4);
		} else if ((126 <= n) && (211 >= n)) {
			System.out.println(6);
		} else if ((212 <= n) && (214 >= n)) {
			System.out.println(8);
		}

	}

}
