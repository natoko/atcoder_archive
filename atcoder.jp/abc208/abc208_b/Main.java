import java.util.Scanner;
import java.util.*;
public class Main {
	public static int p;
	public static int[] coin = new int[11];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		p = Integer.parseInt(scan.next());
		scan.close();

		coin[0] = 1;
		for (int c = 1;c <= 10 ;c++ ) {
			coin[c]=coin[c - 1]*(c + 1);
		}

		int ans = 0;

		for (int i = 10;i > 0; i--) {
			while(p >= coin[i - 1]) {
				p-=coin[i - 1];
				ans++;
			}
		}

		System.out.println(ans);
	}

}
