import java.util.Scanner;
import java.util.*;
public class Main {
	public static int v,a,b,c;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		v = Integer.parseInt(scan.next());
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		scan.close();
		
		v%=(a+b+c);
		
		if (v < a) {
		  System.out.println("F");
		} else if (v < (a+b)) {
		  System.out.println("M");
		} else {
		  System.out.println("T");
		} 

	}

}
