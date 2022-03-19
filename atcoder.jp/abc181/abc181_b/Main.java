import java.util.Scanner;
public class Main {
	public static int N;
	// public static int A;
	// public static int B;
	public static long Sum;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());

		for (int i = 0;i < N ;i++ ) {
			long A =  Integer.parseInt(scan.next());
			long B =  Integer.parseInt(scan.next());
			Sum+=(B*(B + 1))/2 - (A*(A - 1))/2;

		}

		System.out.println(Sum);

		}

	}
