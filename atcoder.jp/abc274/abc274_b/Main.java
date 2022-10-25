import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int H = nextInt();
		int W = nextInt();
		char[][] line = new char[H][W];
		for (int i = 0;i < H;i++) {
			line[i] = next().toCharArray();
		}
		
		int[] ans =new int[W];
		for (int i=0;i < W;i++) {
			int cnt = 0;
			for (int j=0;j < H;j++) {
				if(line[j][i] == '#') cnt++;
			}
			ans[i] = cnt;
		}

		StringJoiner sj = new StringJoiner(" ");
        for (int s : ans)
        {
            sj.add(String.valueOf(s));
        }
        System.out.println(sj.toString());   
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
