import java.util.*;
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve(args);

	}

	public void solve(String[] args){
		boolean[] nums= new boolean[8];
		int ans = 0;

		for (int i = 0;i < 2;i++) {
			int num = nextInt();
			switch (num) {
				case 1:
					nums[num] = true; 
				break;
				case 2:
					nums[num] = true; 
				break;
				case 3:
					nums[1] = true; 
					nums[2] = true; 
				break;
				case 4:
					nums[num] = true; 
				break;
				case 5:
					nums[1] = true; 
					nums[4] = true; 
				break;
				case 6:
					nums[2] = true; 
					nums[4] = true; 
				break;
				case 7:
					nums[1] = true; 
					nums[2] = true; 
					nums[4] = true; 
				break;
			}
		}
		for (int i = 1;i < 8;i++) {
			if(nums[i]) ans+=i;

		}
		System.out.println(ans);
		
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
