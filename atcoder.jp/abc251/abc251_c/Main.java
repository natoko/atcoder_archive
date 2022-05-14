import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static HashSet<String> S;
	public static int[] T;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		HashSet<String> S = new HashSet<>();
		T = new int[N];

		int max = 0;
		int ans = 0;

		for (int i=0;i<N ;i++ ) {
			String ori = scan.next();
			int poi = Integer.parseInt(scan.next());
			if (!S.contains(ori)) {
				S.add(ori);
				T[i] = poi;
				if(T[i] > max) {
					max = T[i];
					ans = i + 1;
				}
			}
		}
		scan.close();

		System.out.println(ans);

	}


}
