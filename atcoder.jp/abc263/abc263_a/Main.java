import java.util.*;
public class Main {
	int[] cards = new int[14];
		
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		for (int i = 0;i<5;i++) {
			int card = Integer.parseInt(next());
			cards[card]++;
		}

		boolean two =false;
		boolean three =false;

		for (int i = 1;i <=13 ;i++) {
			if(cards[i] == 2) two = true;
			if(cards[i] == 3) three = true;
		}

		System.out.print(((two == true)&&(three == true))?"Yes":"No");
		
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
