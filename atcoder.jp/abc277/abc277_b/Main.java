import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int N = nextInt();
		char[][] S = new char[N][2];
		boolean ans = true;
		HashMap<String,Integer> map = new HashMap<>();

		for (int i =0;i < N;i++) {
			S[i] = next().toCharArray();
		}		

		for (int i =0;i < N;i++) {
			if(!ans) break;
			if (!((S[i][0] == 'H') || (S[i][0] == 'D') || (S[i][0] == 'C') || (S[i][0] == 'S'))) {
				ans = false;
			}
			if (!((S[i][1] == 'A') || (S[i][1] == '2') || (S[i][1] == '3') || (S[i][1] == '4') ||
				(S[i][1] == '5') || (S[i][1] == '6') || (S[i][1] == '7') || (S[i][1] == '8') ||
				(S[i][1] == '9') || (S[i][1] == 'T') || (S[i][1] == 'J') || (S[i][1] == 'Q') || (S[i][1] == 'K'))) {
				ans = false;
			}
			String SN = String.valueOf(S[i][0]) + String.valueOf(S[i][1]);
			if(map.get(SN)!= null) {
				ans = false;
			} else {
				map.put(SN,i);
			}
		}
		
		System.out.println(ans?"Yes":"No");
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
