import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());

		// double ans;
		// ans = Math.pow(10,N) - Math.pow(9,N)*2 + Math.pow(8,N);
		Long ans;
		Long pow10 = 10;
		Long pow09 = 9;
		Long pow8 = 8;
		for (int i = 0; i < N ;i++ ) {
			pow10*=10;
			pow09*=9;
			pow8*=10;
		}
		ans = pow10 - pow09*2 + pow8;
		ans = ans%mod;
		System.out.println(ans);
	}


}
