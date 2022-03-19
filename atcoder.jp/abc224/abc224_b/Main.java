import java.util.Scanner;
import java.util.*;
public class Main {
	public static String ans;
	public static int h;
	public static int w;
	public static int[][] HW;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		h = Integer.parseInt(scan.next());
		w = Integer.parseInt(scan.next());
		HW = new int[h][w];
		for (int i=0;i < h; i++) {
  		for (int j=0;j < w; j++) {
	    	HW[i][j] = Integer.parseInt(scan.next());
  		}
		}
		scan.close();
		ans = check();
	  System.out.println(ans);
	}
	public static String check() {
		for (int i=0;i < h-1; i++) {
  		for (int j=0;j < w-1; j++) {
	    	if (HW[i][j]+HW[i+1][j+1]>HW[i+1][j]+HW[i][j+1]) {
	    	  return "No";
	    	}
  		}
		}
	  return "Yes";
	}

}
