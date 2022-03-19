import java.util.Scanner;
import java.util.*;
public class Main {
	public static int n;
	public static ArrayList<Integer> a = new ArrayList<>();
	public static ArrayList<Integer> asort = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		for (int b = 0;b < n ;b++ ) {
			a.add(Integer.parseInt(scan.next()));
		}
		scan.close();

		long cnt = (long)n*((long)n-1)/2;
		long target = 0;
		long target_cnt = 0;
		asort.addAll(a);
		Collections.sort(asort);

		for (int i = 0;i < n ;i++ ) {
			if (asort.get(i) != target) {
				cnt-=target_cnt*(target_cnt-1)/2;
				target = asort.get(i);
				target_cnt = 1;
			} else {
				target_cnt++;
			}
		}
		cnt-=target_cnt*(target_cnt-1)/2;

		System.out.println(cnt);

	}


}
