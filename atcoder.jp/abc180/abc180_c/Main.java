import java.util.Scanner;
import java.util.*;
public class Main {
	public static Long N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Long.parseLong(scan.next());
			// for (int i=1;i <= N ;i++ ) {
			// 	if (N%i == 0) {
			// 		System.out.println(i);
			// 	}
			SortedSet<Long> ans = new TreeSet<Long>();
			for (long i=1;i*i <= N ;i++ ) {
				if (N%i == 0) {
					ans.add((long)i);
					ans.add((long)N/i);
				}
			}
			for (long a: ans ) {
				System.out.println(a);
			}
		}

	}
