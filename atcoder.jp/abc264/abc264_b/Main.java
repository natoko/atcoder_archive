import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int R,C;
		R = nextInt();
		C = nextInt();

		if (R > 8) {
			R = 8-(R-8);
		}
		if (C > 8) {
			C = 8-(C-8);
		}
		String ans= "black";

		if(R%2 == 0) {
			if(C%2 == 0) {
				ans= "white";
			} else if(R < C) {
				ans= "white";
			}
		} else if((C%2 == 0) && (R > C)) {
				ans= "white";
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
