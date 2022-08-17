import java.util.*;
public class Main {
	long[] A,B;
		
	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int N = nextInt();
		A =new long[N];
		B =new long[N];
		for (int i = 0;i < N;i++) {
			A[i] = nextLong();
			B[i] = nextLong();
		}

		long sum = 0;
		for (int i = N-1;i >=0;i--) {
			//前回までの捜査回数を加算
			A[i]+= sum;
			//a + d = b を満たすｄを決定する
			long mod = A[i]%B[i];
			long d = 0;
			if (mod != 0) d = B[i] -mod;
			//求めたdをsumに加算
			sum+=d;
		}

		System.out.print(sum);
		
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
