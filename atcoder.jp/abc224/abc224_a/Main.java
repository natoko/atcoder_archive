import java.util.Scanner;
import java.util.*;
public class Main {
	public static String n;
	public static String nn;
	public static String nnn;
	public static int len;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.next();
		scan.close();
		
		len = n.length();
		nn = n.substring(len-2,len);
		if (len > 2) {
		nnn = n.substring(len-3,len);
		}
		if (nn.equals("er")) {
		  System.out.println(nn);
		} else if (nnn.equals("ist")) {
		  System.out.println(nnn);
		}

	}

}
