import java.util.*;
public class Main {
	int N;
	long X,Y;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		X = nextLong();
		Y = nextLong();

		long ans = calc(N,true);

		System.out.println(ans);
		
	}

	public long calc(int level,boolean is_red){
		if (level == 1) {
			return is_red == true?(long)0:(long)1;
		}else {
			if (is_red) {
				return calc(level-1,true) + calc(level,false)*X;
			} else {
				return calc(level-1,true) + calc(level-1,false)*Y;
			}
		}
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
