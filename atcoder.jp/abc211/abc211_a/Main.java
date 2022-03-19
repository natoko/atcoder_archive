import java.util.Scanner;
public class Main {
	public static Double a,b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Double.parseDouble(scan.next());
		b = Double.parseDouble(scan.next());
		scan.close();

		System.out.println((a - b)/3 + b);
	}

}
