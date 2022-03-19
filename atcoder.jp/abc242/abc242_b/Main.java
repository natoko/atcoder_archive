import java.util.Scanner;
import java.util.*;
public class Main {
	public static String S;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		scan.close();
		
    char[] SS = S.toCharArray();
    Arrays.sort(SS);
    S = new String(SS);
    System.out.println(S);

	}

}
