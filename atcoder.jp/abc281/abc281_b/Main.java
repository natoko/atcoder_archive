import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		char[] Schar = next().toCharArray();
		int len = Schar.length;
		boolean ans = true;

		if(len == 8) {
			for (int i = 0;i<len;i++) {
				if(!ans) continue;
				if((i == 0) || (i == 7)) {
					if (!Character.isAlphabetic(Schar[i])) ans = false;
				} else if(i == 1){
					if (((Schar[i] - '0') == 0)) ans = false;
				} else {	
					if(!Character.isDigit​(Schar[i])) ans = false;
				}
			}
		} else {
			ans = false;
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
