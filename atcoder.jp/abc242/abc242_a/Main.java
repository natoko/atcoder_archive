import java.util.Scanner;
import java.util.*;
public class Main {
	public static double a,b,c,x;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Double.parseDouble(scan.next());
		b = Double.parseDouble(scan.next());
		c = Double.parseDouble(scan.next());
		x = Double.parseDouble(scan.next());
		scan.close();
		
		if (x <= a) {
		  System.out.println(1);
		} else if (x <= b) {
		  System.out.println(c/(b-a));
		} else {
		  System.out.println(0);
		} 

	}

}
