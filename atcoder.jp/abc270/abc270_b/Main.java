import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int X = nextInt();
		int Y = nextInt();
		int Z = nextInt();

		int ans = 0;

		if (Math.abs(Y) < Math.abs(X)) {
			if((0<Y) && (0<X)) {
				if(Z<Y) {
					ans = X;
					if (Z < 0) ans+= Math.abs(Z)*2;
				} else {
					ans = -1;
				}
			} else if(((0>Y) && (0<X)) || ((0<Y) && (0>X))){
				ans = Math.abs(X);
			} else {
				if(Y<Z) {
					ans = Math.abs(X);
					if (Z > 0) ans+= Math.abs(Z)*2;
				} else {
					ans = -1;
				}
			}
		} else {
			ans = Math.abs(X);
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
