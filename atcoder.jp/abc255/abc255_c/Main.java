import java.util.Scanner;
import java.util.*;
public class Main {
	public int i,j;
	public static long X,A,D,N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		X = Long.parseLong(scan.next());
		A = Long.parseLong(scan.next());
		D = Long.parseLong(scan.next());
		N = Long.parseLong(scan.next());
		scan.close();

		long fi = A + D * (N-1);
		if (D < 0) {
			A = fi;
			D *=-1;
		}

		long ans = 0;
		fi = A + D * (N-1);

		if (D == 0) {
			ans = Math.abs(A - X);
		} else {
			if (X < A) {
				ans = (A - X);
			}else if (X > fi) {
				ans = X - fi;
			}else {
				ans = (X-A)%D;
				ans = Math.min(ans,D - ans);
			}
		}

		System.out.println(ans);
	}


}
