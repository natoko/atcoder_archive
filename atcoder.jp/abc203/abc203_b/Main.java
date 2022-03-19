import java.util.Scanner;
public class Main {
	public static int N;
	public static int K;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		K = Integer.parseInt(scan.next());
		scan.close();

		int ans = 0;
		ans += (((1 + N)*N/2)*100)*K;
		ans += (((1 + K)*K/2))*N;
		System.out.println(ans);
	}

}
