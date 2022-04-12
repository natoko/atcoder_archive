import java.util.Scanner;
import java.util.*;
public class Main {
	public static int[] A;
	public static int ans;
	public static int pointer;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A = new int[10];
		for (int i = 0;i < 10 ;i++ ) {
			A[i] =  Integer.parseInt(scan.next());
		}
		scan.close();

		ans = 0;
		for (int i = 0;i < 3 ;i++ ) {
			ans = A[ans];
		}

		System.out.println(ans);

	}


}
