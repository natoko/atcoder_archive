import java.util.Scanner;
public class Main {
	public static double X;
	public static double Sx;
	public static double Sy;
	public static double Gx;
	public static double Gy;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sx = Double.parseDouble(scan.next());
		Sy = Double.parseDouble(scan.next());
		Gx = Double.parseDouble(scan.next());
		Gy = Double.parseDouble(scan.next());

		X = ((Sy*Gx) + (Sx*Gy))/(Gy + Sy);

		System.out.println(X);
	}

}
