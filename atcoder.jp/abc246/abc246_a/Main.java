import java.util.Scanner;
import java.util.*;
public class Main {
	public static int[] X = new int[3];
	public static int[] Y = new int[3];
	public static int x;
	public static int y;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0;i < 3 ;i++ ) {
			X[i] = Integer.parseInt(scan.next());
			Y[i] = Integer.parseInt(scan.next());
		}
		scan.close();

		if (X[0] == X[1]) {
			x = X[2];
		} else if(X[1] == X[2]) {
			x = X[0];
		} else if(X[2] == X[0]){
			x = X[1];
		}
		if (Y[0] == Y[1]) {
			y = Y[2];
		} else if(Y[1] == Y[2]) {
			y = Y[0];
		} else if(Y[2] == Y[0]){
			y = Y[1];
		}

		System.out.println(x + " " + y);

	}

}
