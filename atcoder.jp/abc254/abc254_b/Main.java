import java.util.Scanner;
import java.util.*;
public class Main {
	public int i,j;
	public static int N;
	public static int[][] box;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		scan.close();

		box = new int[N][N];

		for (int i = 0;i < N ;i++ ) {
			for (int j = 0;j < i+1 ;j++ ) {
				if (i == 0) {
					box[i][j] = 1;
					continue;
				}
				if ((j == 0)||(j == i)) {
					box[i][j] = 1;
					continue;

				}
				box[i][j] = box[i-1][j-1]+box[i-1][j];
			}
		}

		for (int i = 0;i < N ;i++ ) {
			for (int j = 0;j < i+1 ;j++ ) {
				if (j != i) {
					System.out.print(box[i][j] + " ");
				} else {
					System.out.println(box[i][j]);
				}
			}
		}

	}


}
