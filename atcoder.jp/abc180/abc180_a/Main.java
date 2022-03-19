import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int A;
	public static int B;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		A = Integer.parseInt(scan.next());
		B = Integer.parseInt(scan.next());

		System.out.println(N-A+B);
	}

}
