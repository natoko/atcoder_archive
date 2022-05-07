import java.util.Scanner;
import java.util.*;
public class Main {
	public static Long A,B,K;


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A = Long.parseLong(scan.next());
		B = Long.parseLong(scan.next());
		K = Long.parseLong(scan.next());
		scan.close();

		int cnt = 0;
		while(A < B) {
			A*=K;
			cnt++;
		}

		System.out.println(cnt);
	}

}
