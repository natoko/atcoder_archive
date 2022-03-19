import java.util.Scanner;
public class Main {
	public static Double a;
	public static Double b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Double.parseDouble(scan.next());
		b = Double.parseDouble(scan.next());

		System.out.println(a*b/100);
	}

}
