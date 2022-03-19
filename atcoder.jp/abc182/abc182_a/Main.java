import java.util.Scanner;
public class Main {
	public static int A;
	public static int B;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A = Integer.parseInt(scan.next());
		B = Integer.parseInt(scan.next());

		System.out.println((2*A + 100) - B);
	}

}
