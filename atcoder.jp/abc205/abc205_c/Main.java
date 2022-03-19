import java.util.Scanner;
public class Main {
	public static int a,b,c;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		scan.close();

		if (c%2 == 0) {
			check((long)a*(long)a,(long)b*(long)b);
		} else {
			check(a,b);
		}

	}

	public static void check(long aa,long bb) {
		if (aa < bb) {
			System.out.println("<");
		} else if(aa > bb) {
			System.out.println(">");
		} else if(aa == bb) {
			System.out.println("=");
		}

	}

}
