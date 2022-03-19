import java.util.Scanner;
public class Main {
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());

		System.out.println(count());
		}

		public static long count() {
			long ans = 0;
			for (int a = 1;a < N ;a++ ) {
				ans+=(N - 1)/a;
			}
			return ans;
		}

	}
