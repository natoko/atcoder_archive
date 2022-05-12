import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N,A,B;
	public static String[][] board;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		A = Integer.parseInt(scan.next());
		B = Integer.parseInt(scan.next());
		board = new String[N*A][N*B];
		scan.close();

		String[][] tile = new String[N][N];
		for (int i=0;i < N ;i++ ) {
			if (i%2 == 0) {
				for (int j=0;j < N ;j++ ) {
					if (j%2 == 0) {
						tile[i][j] = ".";
					} else {
						tile[i][j] = "#";
					}
				}
			}else {
				for (int j2=0;j2 < N ;j2++ ) {
					if (j2%2 == 0) {
						tile[i][j2] = "#";
					} else {
						tile[i][j2] = ".";
					}
				}
			}
		}

		for (int y=0;y< A*N;y++ ) {
			for (int x=0;x< B*N;x++ ) {
				board[y][x] = tile[y/A][x/B];
			}
		}

		for (String[] b: board) {
			System.out.println(String.join("",b));
		}

	}


}
