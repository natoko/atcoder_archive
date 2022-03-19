import java.util.Scanner;
public class Main {
	public static int a,b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		scan.close();

		if ((0 < a) && (b == 0)) {
			System.out.println("Gold");
		} else if((0 == a) && (0 < b)) {
			System.out.println("Silver");
		} else if((0 < a) && (0 < b)) {
			System.out.println("Alloy");
		}

	}

}
