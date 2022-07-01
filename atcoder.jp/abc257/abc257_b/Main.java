import java.util.*;
public class Main {
	int i,j;
	int N,K,Q;
	int[] A,L;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		N = nextInt();
		K = nextInt();
		Q = nextInt();
		A = nextIntArray(K);
		L = nextIntArray(Q);
		
		int[] box = new int[N];
		for (i = 0;i < K;i++) {
			int num = A[i]-1;
			box[num] = 1;
		}

		for (i = 0;i < Q;i++) {
			int num = L[i]-1;
			int num_2 = A[num]-1;
			// = N,i+1にあり　→何もしない
			if (A[num] == N) continue;
			if (box[num_2 + 1]==1) continue;
			A[num] +=1;
			box[num_2] = 0;
			box[num_2 + 1]= 1;
		}

		intArrayPrint(A,K);
		
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

	void intArrayPrint(int[] n,int m) {
		for (i = 0;i < m;i++) {
			if (i == m-1) {
				System.out.print(n[i]);
				break;
			}
			System.out.print(n[i] + " ");
		}
	} 


}
