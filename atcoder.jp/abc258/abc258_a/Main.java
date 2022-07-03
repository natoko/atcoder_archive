import java.util.*;
public class Main {
	int i,j;
	int HH,MM;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int K = nextInt();
		HH = 21;
		MM = 00;
		if (K >= 60) {
			HH +=1;
			MM +=(K-60);
			System.out.print(String.format("%02d:%02d", HH,MM));
			
		} else {
			MM +=K;
			System.out.print(String.format("%02d:%02d", HH,MM));
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
	long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) { array[i] = nextLong(); }
			return array;
	}


}
