import java.util.*;
public class Main {
	int N;
	int[][] A;
	private static final int[] X = {1, 1, 0, -1, -1, -1, 0, 1};
    private static final int[] Y = {0, -1, -1, -1, 0, 1, 1, 1};

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		A = new int[N][N];
		for (int i = 0;i < N;i++) {
			String in = next();
			for(int j=0;j<N;j++) {
				A[i][j]=in.charAt(j)-'0';
			}
		}

		long ans = 0;
		long now;

		for (int i = 0;i < N;i++) {
			for(int j=0;j<N;j++) {
				int x=i;
				int y=j;
				for (int k=0;k<8;k++){
					now=(long)0;
					for(int l=0;l<N;l++) {
						now*=(long)10;
						now+=(long)A[x][y];
						x+=(N+X[k]);
						y+=(N+Y[k]);
						x%=N;
						y%=N;
					}
					ans = Math.max(ans, now);
				}
			}
		}

		System.out.print(ans);	
		
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
