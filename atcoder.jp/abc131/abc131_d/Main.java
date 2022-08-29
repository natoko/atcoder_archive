import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int[][] jobs;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N=nextInt();
		int[][] jobs = nextIntIntArray(N,2);
				
		Arrays.sort(jobs,(x,y) -> {return -Integer.valueOf(x[1]).compareTo(Integer.valueOf(y[1]));});
				
		boolean ans = true;
		int time = jobs[0][1];

		for (int i = 0;i < N;i++) {
			if(jobs[i][0]>time) {
				ans = false;
				break;
			}
			if(i < N-1){
				time = Math.min(time-jobs[i][0],jobs[i+1][1]);
			} 
		}

		System.out.println(ans?"Yes":"No");

	}

	Scanner scan = new Scanner(System.in);
	String next() { return scan.next(); }
	int nextInt() { return Integer.parseInt(next()); }
	long nextLong() { return Long.parseLong(next()); }
	double nextDouble() { return Double.parseDouble(next()); }
	int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++) { array[i] = nextInt(); }
			return array;
	}
	int[][] nextIntIntArray(int n,int m) {
			int[][] array = new int[n][m];
			for (int i = 0; i < n; i++) { 
				for (int j = 0; j < m; j++) { 
					array[i][j] = nextInt(); 
				}
			}
			return array;
	}
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}
}
