import java.util.Scanner;
import java.util.*;

public class Main {
        public static int N,K;
        public static int[] a,b;
        public static boolean[] dp;
        public static boolean[] ep;

         public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);
                 N = Integer.parseInt(scan.next());
								 K = Integer.parseInt(scan.next());
                  a = new int[N];
                  b = new int[N];
                  dp = new boolean[N];
                  ep = new boolean[N];

              		for (int i=0;i<N ;i++ ) {
              			a[i]= Integer.parseInt(scan.next());
              		}
              		for (int j=0;j<N ;j++ ) {
              			b[j]= Integer.parseInt(scan.next());
              		}
                 scan.close();
                dp();

         }
        public static void dp(){
					dp[0] = true;
					ep[0] = true;
            for(int i=1;i<N;i++){
							if(dp[i-1]){
								if (Math.abs(a[i]-a[i-1])<=K){
									dp[i]=true;
								}
								if (Math.abs(b[i]-a[i-1])<=K){
									ep[i]=true;
								}
							}
							if(ep[i-1]){
								if (Math.abs(a[i]-b[i-1])<=K){
									dp[i]=true;
								}
								if (Math.abs(b[i]-b[i-1])<=K){
									ep[i]=true;
								}
							}
            }
            if((dp[N-1])||(ep[N-1])){
                 System.out.println("Yes");
            } else {
                 System.out.println("No");

            }
          }

 }
