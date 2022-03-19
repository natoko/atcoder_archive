import java.util.Scanner;
public class Main {
	public static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());

		System.out.println(N%2 == 0?"White":"Black");
	}

}
