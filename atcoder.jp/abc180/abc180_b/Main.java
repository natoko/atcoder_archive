import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] x;
	public static long Mdis = 0;
	public static long Ydis = 0;
	public static long Chdis = Long.MIN_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());
		x = new int[N];
		for (int n=0;n < N ;n++ ) {
			x[n] =  Integer.parseInt(scan.next());
		}

		for (int i = 0;i < N ;i++ ) {
			int xabs = Math.abs(x[i]);
			//マンハッタン距離
			Mdis += xabs;
			//ユークリッド距離
			Ydis += Math.pow(xabs,2);
			//チェビシェフ距離
			Chdis = Math.max(Chdis,xabs);
		}

			System.out.println(Mdis);
			System.out.println(Math.sqrt(Ydis));
			System.out.println(Chdis);
		}

	}
