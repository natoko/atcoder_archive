import java.util.Scanner;
public class Main {
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());

		int count = 0;
		for (int i=0;i < N ;i++ ) {
			int A = Integer.parseInt(scan.next());
			if (A >= 10) {
				count+=(A - 10);
			}
		}
		scan.close();

		System.out.println(count);
	}

}
