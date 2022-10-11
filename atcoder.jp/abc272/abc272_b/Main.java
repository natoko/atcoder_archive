import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int N = nextInt();
		int M = nextInt();
		
		boolean[][] x = new boolean[N][N];
		boolean ans = true;

		for(int i = 0;i<M;i++) {
			int k = nextInt();
			int[] visit = new int[k];
			for (int j = 0;j < k;j++) {
				visit[j] =  nextInt()-1;
			}
			for (int j = 0;j < k;j++) {
				for (int l = 0;l < k;l++) {
					x[visit[j]][visit[l]] = true;
				}
			}
		}

		for(int i = 0;i<N;i++) {
			for (int j = 0;j < N;j++) {
				if(!x[i][j]) {
					ans = false;
					break;
				}
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
