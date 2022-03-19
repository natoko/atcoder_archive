import java.util.Scanner;
import java.util.*;
public class Main {
	public static int[] ab = new int[2];
	public static int[] cd = new int[2];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ab[0] = scan.nextInt();
		ab[1] = scan.nextInt();
		cd[0] = scan.nextInt();
		cd[1] = scan.nextInt();
		System.out.println(productmax());
	}

	private static Long productmax() {
		Long ans = Long.MIN_VALUE;
		for(int n = 0; n < 2; n++) {
			ans = Math.max(ans,(long)ab[n]*cd[0]);
			ans = Math.max(ans,(long)ab[n]*cd[1]);
		}
		return ans;
	}

}
