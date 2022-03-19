import java.util.Scanner;
public class Main {
	public static int a,b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		scan.close();

		System.out.println((b-a+1)>=0?b-a+1:0);
	}

}
