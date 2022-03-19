import java.util.Scanner;
import java.util.*;
public class Main {
	public static int n,a,x,total;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());

		for (int i=1;i <= n ;i++ ) {
			a = Integer.parseInt(scan.next());
			if (i%2 == 0) {
				a-=1;
			}
			total+=a;
		}
		scan.close();

		System.out.println((total<=x)?"Yes":"No");
	}

}
