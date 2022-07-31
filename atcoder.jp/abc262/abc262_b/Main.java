import java.util.*;
public class Main {
	int N,M;
	int[][] triangle = new int[101][101];

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		M = nextInt();
		for (int i = 0;i < M;i++) {
			int a = nextInt();
			int b = nextInt();
			triangle[a][b] = 1;
			triangle[b][a] = 1;
		}

		int ans = 0;

		for (int i=0;i<101;i++) {
			for (int j=i+1;j<101;j++) {
				for (int k=j+1;k<101;k++){
					if ((triangle[i][j] == 1) && (triangle[j][k] == 1) && (triangle[k][i] == 1)) ans++;
				}
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
