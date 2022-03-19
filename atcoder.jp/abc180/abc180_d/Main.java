import java.util.Scanner;
import java.util.*;
public class Main {
	public static Long X;
	public static Long Y;
	public static Long A;
	public static Long B;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		X =  Long.parseLong(scan.next());
		Y =  Long.parseLong(scan.next());
		A =  Long.parseLong(scan.next());
		B =  Long.parseLong(scan.next());
		scan.close();

		Long ans = (long)0;
		while ((X < Y/A) && (X*A <= X+B)) {
			X*=A;
			ans++;
		}
		System.out.println(ans + (Y - X - 1)/B);
		}

	}
