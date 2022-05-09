import java.util.Scanner;
import java.util.*;
public class Main {
	public static int H,W,R,C;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		H = Integer.parseInt(scan.next());
		W = Integer.parseInt(scan.next());
		R = Integer.parseInt(scan.next());
		C = Integer.parseInt(scan.next());
		scan.close();

		int ans = 0;

		if (H != 1) {
			if ((R == 1)||(R == H)) {
				ans++;
			}else {
				ans=ans+2;
			}
		}
		if (W != 1 ) {
			if ((C == 1)||(C == W)) {
				ans++;
			}else {
				ans=ans+2;
			}
		}

		System.out.println(ans);

	}


}
