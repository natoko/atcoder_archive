import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		ArrayList<Integer> a = new ArrayList<>();
		for (int i=0;i < N ;i++ ) {
			a.add(Integer.parseInt(scan.next()));
		}
		scan.close();

		System.out.println(check(a));

	}

	public static String check(ArrayList<Integer> a) {
		String ans = "Yes";
		Collections.sort(a);

		for (int i = 1;i <= N ;i++ ) {
			if (i != a.get(i - 1)) {
				ans = "No";
				continue;
			}
		}

		return ans;

	}


}
