import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N;
	public static int[] A;
	public static int[] B;
	public static int ans_i;
	public static int ans_j;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		A = new int[N];
		B = new int[N];
		for (int i = 0;i < N ;i++ ) {
			A[i] =  Integer.parseInt(scan.next());
		}
		for (int j = 0;j < N ;j++ ) {
			B[j] =  Integer.parseInt(scan.next());
		}
		scan.close();

		counter();

		System.out.println(ans_i);
		System.out.println(ans_j);

	}

	public static void counter(){
		for (int i = 0;i < N ;i++ ) {
			for (int j = 0;j < N ;j++ ) {
				if(A[i] == B[j]) {
					if(i == j){
						ans_i++;
					} else {
						ans_j++;
					}
				}
			}
		}
	}

}
