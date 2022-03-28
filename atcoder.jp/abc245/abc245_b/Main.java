import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static ArrayList<Integer> A = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		for (int i=0;i<N ;i++ ) {
			A.add(Integer.parseInt(scan.next()));
		}
		scan.close();

		boolean flg = false;
		int ans = 0;

			int target = 0;
			while(flg == false) {
			if (A.contains(target)) {
				target++;
			} else {
				ans = target;
				flg = true;
			}
		}

		System.out.println(ans);
	}


}
