import java.util.Scanner;
import java.util.*;
public class Main {
	public static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		scan.close();
		
		System.out.println(String.format("%04d", n));

	}

}
