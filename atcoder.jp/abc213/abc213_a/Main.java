import java.util.Scanner;
public class Main {
	public static int a,b,c;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		scan.close();

		c = a^b;
		System.out.println(c);

	}

}
