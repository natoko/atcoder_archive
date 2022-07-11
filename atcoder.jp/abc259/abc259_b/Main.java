import java.util.*;
public class Main {
	Double a,b,d;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		a = nextDouble();
		b = nextDouble();
		d = nextDouble();

		Double X,Y;

		X = (a*Math.cos(Math.toRadians(d))) - (b*Math.sin(Math.toRadians(d)));
		Y = (b*Math.cos(Math.toRadians(d))) + (a*Math.sin(Math.toRadians(d)));

		System.out.print(String.format("%f %f", X,Y));	
		
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
