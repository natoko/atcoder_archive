import java.util.Scanner;
import java.util.*;
public class Main {
	public static ArrayList<String> S = new ArrayList<>();
	public static String[] cycle = {"2B","3B","H","HR"};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i=0;i < 4 ;i++ ) {
			S.add(scan.next());
		}
		scan.close();

		Collections.sort(S);

		for (int j = 0;j < 4 ;j++ ) {
			if (!S.get(j).equals(cycle[j])) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
