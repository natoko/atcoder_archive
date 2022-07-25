import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
	int N;
	char[][] result;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		result = new char[N][N];
		for (int i = 0;i<N;i++) {
			result[i] = next().toCharArray();
		} 

		boolean correct = true;
		
		for (int i = 0;i<N;i++) {
			for (int j = i;j < N;j++) {
				if (correct == false) break;
				if(i==j) continue;
				if ((result[i][j] == 'D') && (result[i][j] != result[j][i])) {
					correct = false;
				} else if ((result[i][j] == 'W') && (result[j][i] != 'L')) {
					correct = false;
				} else if ((result[i][j] == 'L') && (result[j][i] != 'W')) {
					correct = false;
				}
			}
		} 

		System.out.println(correct == true?"correct":"incorrect");
			
		
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
