import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int H,W;
		H = nextInt();
		W = nextInt();
		char[][] G = new char[H][W];

		for (int i = 0;i < H;i++) {
			G[i]=next().toCharArray();
		} 

		boolean move = true;
		int cnt = 0;
		int X = 0;
		int Y = 0;
		while (move) {
			if (cnt > (H*W) + 1) break;
			switch (G[X][Y]){
			case 'U':
				if ((X-1) >= 0) {
					X--;
				} else {
					move = false;
				}
			break;
			case 'D':
				if ((X+1) < H) {
					X++;
				} else {
					move = false;
				}
			break;
			case 'L':
				if ((Y-1) >= 0) {
					Y--;
				} else {
					move = false;
				}
			break;
			case 'R':
				if ((Y+1) < W) {
					Y++;
				} else {
					move = false;
				}
			break;
			}
			cnt++;
		}
		X++;
		Y++;
		System.out.print(move?"-1":X + " " + Y);

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
