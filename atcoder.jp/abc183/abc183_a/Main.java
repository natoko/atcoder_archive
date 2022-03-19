import java.util.Scanner;
public class Main {
	public static int X;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		X = Integer.parseInt(scan.next());

		System.out.println(X >= 0?X:0);
	}

}
