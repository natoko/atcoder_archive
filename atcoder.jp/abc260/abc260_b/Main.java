import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
	int N,X,Y,Z;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		X = nextInt();
		Y = nextInt();
		Z = nextInt();
		int[][] ab = new int[N][4];
		for (int i = 0;i < 2;i++) {
			for (int j = 0;j < N;j++) {
				if (i == 0) {
					ab[j][0] = nextInt();
				} else {
					ab[j][1] = nextInt();
					ab[j][2] = ab[j][0] + ab[j][1];
					ab[j][3] = j + 1;
				}
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();

		Arrays.sort(ab,(aa, bb) -> Integer.compare(bb[0], aa[0]));
		for (int i=0;i<N;i++) {
			if(X <= 0) break;
			if (ab[i][3] == -1) {
				continue;
			}
			ans.add(ab[i][3]);
			ab[i][3] = -1;
			X--;
		}

		Arrays.sort(ab,(aa, bb) -> Integer.compare(aa[3], bb[3]));
		Arrays.sort(ab,(aa, bb) -> Integer.compare(bb[1], aa[1]));
		for (int i=0;i<N;i++) {
			if(Y <= 0) break;
			if (ab[i][3] == -1) {
				continue;
			}
			ans.add(ab[i][3]);
			ab[i][3] = -1;
			Y--;
		}

		Arrays.sort(ab,(aa, bb) -> Integer.compare(aa[3], bb[3]));	
		Arrays.sort(ab,(aa, bb) -> Integer.compare(bb[2], aa[2]));
		for (int i=0;i<N;i++) {
			if(Z <= 0) break;
			if (ab[i][3] == -1) {
				continue;
			}
			ans.add(ab[i][3]);
			ab[i][3] = -1;
			Z--;
		}

		Collections.sort(ans);

		for (int an : ans) {
			System.out.println(an);
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
