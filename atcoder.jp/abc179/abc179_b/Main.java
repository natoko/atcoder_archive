import java.util.Scanner;
public class Main {
	public static int N;
	public static int[] Dice = new int[2];

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		N =  Integer.parseInt(scan.next());
			for (int n=0;n < N ;n++ ) {
				Dice[0] =  Integer.parseInt(scan.next());
				Dice[1] =  Integer.parseInt(scan.next());
				if (Dice[0] == Dice[1]) {
					count++;
				} else {
					count = 0;
				}
				if (count == 3) break;
			}

			if (count >= 3) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
