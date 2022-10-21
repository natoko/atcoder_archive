import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		int N = nextInt();
		int[] A =  nextIntArray(N);
		
		List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> listAA = new ArrayList<Integer>(new LinkedHashSet<>(listA));
		Collections.sort(listAA); 
		Map map = new HashMap();
        // 1. listの要素をループで取得
        for(int i = 0; i < listAA.size(); i++) {
            Integer s = listAA.get(i);        // 2. 値を取得
            map.put(s,i);     // 3.マップへ値を追加
        }
		int[] ans = new int[N];
		for (int i = 0;i < N;i++) {
			Integer target = A[i];
			int position = Integer.parseInt(map.get(target).toString()) + 1;
			ans[map.size() - position]++;
		}
		for (int a:ans){
			System.out.println(a);
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
