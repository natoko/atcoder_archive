import java.util.Scanner;
import java.util.*;
public class Main {
	public static int N = 1;
	public static ArrayList<Integer> A = new ArrayList<>();
	public static ArrayList<Integer> A_sort = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = Integer.parseInt(scan.next());
		for (int i = 0;i < N ;i++ ) {
			A.add(Integer.parseInt(scan.next()));
			A_sort.add(A.get(i));
		}
		scan.close();

		Collections.sort(A_sort);

		System.out.println(A.indexOf(A_sort.get(A_sort.size() - 2)) + 1);

	}

}
