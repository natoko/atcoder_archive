import java.util.*;
public class Main {
	int N;
	String[] S;
	int[] cnt = new int[2*100000];

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		S = new String[N];
		Map<String,Integer> map = new HashMap<>();
		int num = 0;

		for (int i = 0;i < N;i++) {
			S[i] = next();
			if (Objects.isNull(map.get(S[i]))) {
				map.put(S[i],num);
				num++;
				System.out.println(S[i]);
			} else {
				int x = map.get(S[i]);
				cnt[x]++;
				System.out.println(S[i] + "(" + cnt[x] +")");
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
