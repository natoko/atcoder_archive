import java.util.*;
public class Main {
	public int i,j;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		Double N = nextDouble();
		System.out.print(Math.round(Math.pow((double)2,N)));
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
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}


}
