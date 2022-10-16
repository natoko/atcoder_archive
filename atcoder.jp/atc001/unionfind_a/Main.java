import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int N = nextInt();
		int Q = nextInt();

		UnionFind u = new UnionFind(N);

		for (int i = 0;i < Q;i++) {
			int p = nextInt();
			int a = nextInt();
			int b = nextInt();

			if(p == 0) {
				u.unite(a,b);
			} else {
				System.out.println(u.same(a,b)?"Yes":"No");
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

class UnionFind {
	public int[] parent;
	public int[] size;

	//最初はすべての頂点が根
	//ｎ要素で初期化
	UnionFind(int n){
		parent = new int[n];
		size = new int[n];
		for(int i =0;i<n;i++) {
			parent[i] = i;
			size[i] = 1;
		}
	}

	//木の根を求める
	int root(int x) {
		if (parent[x] == x) {
			return x;
		}else {
			return parent[x] = root(parent[x]);
		}
	}

	//xとyが同じ集合に属するか否か
	boolean same(int x,int y){
		return root(x) == root(y);
	}

	// xを含むグループとyを含むグループを併合する
	void unite(int x,int y) {
		//x,yをそれぞれ根まで移動する
		x = root(x);
		y = root(y);

		// すでに同じグループの時は何もしない
		if (x == y) return;

		// rankがえ
		if (size[x] < size[y]) {
			parent[x] = y;
		} else {
			parent[y] = x;
			if (size[x] == size[y]) size[x]++;
		}
		
	}

}
