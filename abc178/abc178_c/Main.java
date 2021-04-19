import java.util.Scanner;

public class Main {
	public static int N;
	public static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());

		// double ans;
		// ans = Math.pow(10,N) - Math.pow(9,N)*2 + Math.pow(8,N);
		Long ans;
		Long pow10 = (long)1;
		Long pow09 = (long)1;
		Long pow08 = (long)1;
		for (int i = 0; i < N ;i++ ) {
			pow10=(pow10*10)%mod;
			pow09=(pow09*9)%mod;
			pow08=(pow08*8)%mod;
		}
		ans = pow10 - pow09*2 + pow08;
		ans = ans%mod;
		if (ans < 0) {
				ans+=mod;
		}
		System.out.println(ans);
	}


}
