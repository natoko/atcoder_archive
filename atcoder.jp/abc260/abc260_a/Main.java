import java.util.*;
public class Main {
	String S;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		String ans = "-1";
		S = next();
		for (int i = 0;i < 3 ;i++) {
			if (!ans.equals("-1")) break;
			char s = S.charAt​(i);
			int check_1 = (i+1)%3;
			int check_2 = (i+2)%3;
			if (s != S.charAt​(check_1) && s != S.charAt​(check_2)) ans = String.valueOf(s);
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
