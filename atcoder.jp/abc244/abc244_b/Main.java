import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static String T;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		T = scan.next();
		scan.close();

		char[] T_char = T.toCharArray();
		int[] stay = {0,0};
		int[] go = {1,0};

		for (int i = 0;i < N ;i++ ) {
			if (T_char[i] == 'S') {
				stay[0]+=go[0];
				stay[1]+=go[1];
			}else if (T_char[i] == 'R') {
				if ((go[0] == 1) && (go[1] == 0)) {
					go[0] = 0;
					go[1] = -1;
				}else if ((go[0] == 0) && (go[1] == -1))  {
					go[0] = -1;
					go[1] = 0;
				}else if ((go[0] == -1) && (go[1] == 0))  {
					go[0] = 0;
					go[1] = 1;
				}else if ((go[0] == 0) && (go[1] == 1))  {
					go[0] = 1;
					go[1] = 0;
				}
			}
		}
		System.out.println(stay[0] + " " + stay[1]);
	}


}
