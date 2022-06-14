import java.util.*;
public class Main {
	public int i,j;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int R = Integer.parseInt(scan.next());
		int C = Integer.parseInt(scan.next());
		int[][] A = new int[2][2];
		for (int i =0;i < 2 ;i++ ) {
			for (int j =0;j < 2 ;j++ ) {
				A[i][j] = Integer.parseInt(scan.next());
			}
		}
		scan.close();

		System.out.print(A[R-1][C-1]);

	}


}
