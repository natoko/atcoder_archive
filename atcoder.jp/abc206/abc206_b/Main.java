import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		scan.close();

		int total = 0;
		int count = 0;
		for (int i = 1;i <= 1000000000 ; i++) {
			total+=i;
			count++;
			if (total>=N) {
				break;
			}
		}

		System.out.println(count);
	}

}
