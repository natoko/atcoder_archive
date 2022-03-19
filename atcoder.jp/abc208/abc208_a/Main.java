import java.util.Scanner;
public class Main {
	public static int a,b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		scan.close();

		System.out.println(((a > b) || (a * 6 < b))?"No":"Yes");
	}

}
