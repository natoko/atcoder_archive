import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static Deque<Integer> stack = new ArrayDeque<Integer>();

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N=nextInt();
		int[] A = nextIntArray(N);
		Arrays.sort(A);
		int mina = Integer.MAX_VALUE;
		for (int i = 0;i < N;i++) {
			stack.push(A[i]);
			mina = Math.min(mina,A[i]);
		}
		
						
		long ans = 0;

		while (stack.size() > 1) {
			ans++;
			int maxa = stack.pop();
			int newa = maxa%mina;
			if(newa == 0) continue;
			stack.addLast(newa);
			mina = newa;
		}

		System.out.println(ans);

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
