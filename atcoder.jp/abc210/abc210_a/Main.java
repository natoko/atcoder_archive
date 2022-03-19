import java.util.Scanner;
public class Main {
	public static int n,a,x,y;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Integer.parseInt(scan.next());
		a = Integer.parseInt(scan.next());
		x = Integer.parseInt(scan.next());
		y = Integer.parseInt(scan.next());
		scan.close();

		System.out.println(n>a?a*x + (n - a)*y:n*x);
	}

}
