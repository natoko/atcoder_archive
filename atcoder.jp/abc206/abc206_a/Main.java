import java.util.Scanner;
public class Main {
	public static Double n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = Double.parseDouble(scan.next());
		scan.close();

		n = n*1.08;
		int nn = (int)Math.floor(n);
		if (nn < 206) {
			System.out.println("Yay!");
		} else if (nn == 206) {
			System.out.println("so-so");
		} else {
			System.out.println(":(");
		}

	}

}
