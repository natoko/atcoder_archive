import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static String[] s;
	public static String[] t;
	public static int[] s_cnt;
	public static int[] t_cnt;
	public static String ans;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		s = new String[N];
		t = new String[N];
		s_cnt = new int[N];
		t_cnt = new int[N];
		for (int i = 0;i < N ;i++ ) {
			s[i] = scan.next();
			t[i] = scan.next();
		}
		scan.close();

		naming();
		System.out.println(ans);
	}

	public static String naming() {
		ans ="Yes";
		for (int i = 0;i < N ;i++ ) {
			for (int j = 0;j < N ;j++ ) {
				if (i == j) continue;
				if (s[i].equals(s[j])) s_cnt[i] = 1;
				if (s[i].equals(t[j])) s_cnt[i] = 1;
				if (t[i].equals(s[j])) t_cnt[i] = 1;
				if (t[i].equals(t[j])) t_cnt[i] = 1;
			}
			if (s_cnt[i] + t_cnt[i] == 2) {
				ans ="No";
			}
		}
		return ans;
	}

}
