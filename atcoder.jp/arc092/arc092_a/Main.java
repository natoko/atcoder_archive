import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int[][] red,blue;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N=nextInt();
		int[][] red = nextIntIntArray(N,2);
		int[][] blue = nextIntIntArray(N,2);
		
		Arrays.sort(blue,(x,y) -> {return Integer.valueOf(x[0]).compareTo(Integer.valueOf(y[0]));});
				
		boolean[] use = new boolean[N];
		int ans = 0;

		for (int i = 0;i < N;i++) {
			int ymax = -1;
			int max = -1;
			for (int j=0;j < N;j++) {
				if (use[j]) continue;
				if (red[j][0] >= blue[i][0]) continue;
				if (red[j][1] >= blue[i][1]) continue;
				if (red[j][1] > max) {
					max = red[j][1];
					ymax = j;
				}
			}
			if (ymax != -1) {
				use[ymax] = true;
				ans++;
			}
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
