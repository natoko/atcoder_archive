import java.util.*;
public class Main {
	int L_1;
	int R_1;
	int L_2;
	int R_2;
	boolean[][] paint =new boolean[101][2];
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		L_1 = nextInt();
		R_1 = nextInt();
		L_2 = nextInt();
		R_2 = nextInt();
		int ans = 0;

		for (int i = L_1;i < R_1;i++) {
			paint[i][0] = true;
		}
		for (int i = L_2;i < R_2;i++) {
			paint[i][1] = true;
		}
		for (int i = 0;i < 100;i++) {
			if((paint[i][0]) && (paint[i][1])) ans++;
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
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}


}
