import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int AH,AW,BH,BW;
		int[][] A,B;
		AH = nextInt();
		AW = nextInt();
		A = nextIntIntArray(AH,AW);
		BH = nextInt();
		BW = nextInt();
		B = nextIntIntArray(BH,BW);

		boolean ans = false;

		for (int i = 0;i < (1<<AH); i++) {
			for (int j = 0;j < (1<<AW); j++) {
				if (ans) break;

				//残す行列番号を配列にセット
				ArrayList<Integer> hlist = new ArrayList<>();
				ArrayList<Integer> wlist = new ArrayList<>();
				for (int s = 1;s <= AH;s++) {
					if ((i & (1<<(s-1))) == (1<<(s-1))) {
						hlist.add(s);
					}
				}
				for (int t = 1;t <= AW;t++) {
					if ((j & (1<<(t-1))) == (1<<(t-1))) {
						wlist.add(t);
					}
				}
				//行列サイズがBと一致しなかったらcontinue
				if ((hlist.size() != BH)||(wlist.size() != BW)) continue;

				boolean match = true;
				//bと一致するかチェック
				for (int s = 0;s < BH;s++) {
					for (int t = 0;t < BW;t++) {
						if(B[s][t] != A[hlist.get(s)-1][wlist.get(t)-1]) match = false;
					}
				}

				if (match) ans = true;

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
